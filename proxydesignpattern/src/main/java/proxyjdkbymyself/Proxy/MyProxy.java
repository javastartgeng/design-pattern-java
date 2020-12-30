package proxyjdkbymyself.Proxy;

import proxyjdkbymyself.myinvocationhandler.MyInvocationHandler;
import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyProxy {

    private static final String ENTER = "\r\n";

    public static Object newProxyInstance(MyClassLoader classLoader,
                                          Class<?> interfaces,
                                          MyInvocationHandler h) throws ClassNotFoundException, IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //组装java文件
        String javaFile = packageJavaFile(interfaces);
        String filePath = MyProxy.class.getResource("").getPath()  + "$ProxyO.java";
        createJavaFile(filePath,javaFile);
        //生成class字节码文件
        changJavaToClass(filePath);
        //自定义加载器加载到内存中
        Class<?> proxyClass = classLoader.findClass("$ProxyO");
        Constructor<?> constructor = proxyClass.getConstructor(MyInvocationHandler.class);
        // 删掉虚拟代理类
        File file = new File(filePath);
        file.delete();
        // 返回字节码重组以后的代理对象
        return constructor.newInstance(h);
    }

    /**
     * 组装java文件
     * @param interfaces
     * @return
     */
    private static String packageJavaFile(Class<?> interfaces) {
        Method[] methods = interfaces.getMethods();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("package proxyjdkbymyself.Proxy;" + ENTER + ENTER);
        stringBuilder.append("import java.lang.reflect.Method;" + ENTER);
        stringBuilder.append("import proxyjdkbymyself.myinvocationhandler.MyInvocationHandler;" + ENTER);
        stringBuilder.append("public class $ProxyO implements " + interfaces.getName() + "{" + ENTER);
        stringBuilder.append("MyInvocationHandler h;" + ENTER);
        stringBuilder.append("public $ProxyO(MyInvocationHandler h) {" + ENTER);
        stringBuilder.append("this.h = h;" + ENTER);
        stringBuilder.append("}" + ENTER);

        for (Method method : methods) {
            stringBuilder.append("public " + method.getReturnType().getName() + " " + method.getName() + "() {" + ENTER);
                stringBuilder.append("try {" + ENTER);
                    stringBuilder.append("Method m = " + interfaces.getName() + ".class.getMethod(\"" + method.getName() + "\", new Class[]{});" + ENTER);
                    stringBuilder.append("this.h.invoke(this, m, null);" + ENTER);
                stringBuilder.append("} catch(Throwable able) {" + ENTER);
                stringBuilder.append("able.getMessage();" + ENTER);
                stringBuilder.append("}" + ENTER);
            stringBuilder.append("}" + ENTER + ENTER);
        }
        stringBuilder.append("}" + ENTER);
        return stringBuilder.toString();
    }

    /**
     * 生成java文件
     * @param filePath
     * @param javafile
     * @throws IOException
     */
    private static void createJavaFile(String filePath, String javafile) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write(javafile);
        fileWriter.flush();
        fileWriter.close();
    }

    /**
     * 将java文件转换为class文件
     * @param filePath
     * @throws IOException
     */
    private static void changJavaToClass(String filePath) throws IOException {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        Iterable iterable = fileManager.getJavaFileObjects(filePath);
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null, null, null, iterable);
        task.call();
        fileManager.close();
    }

}
