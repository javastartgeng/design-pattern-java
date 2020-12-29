package proxybyjdk;

import proxybyjdk.impl.PictureProxy;
import proxybyjdk.impl.RealPicture;

public class PictureProxyTest {
    public static void main(String[] args) {
        // 保存生成的代理类的字节码文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Picture picture = new PictureProxy(new RealPicture()).getProxy();
        picture.draw();
    }
}
