package proxybycglib.impl;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class PictureProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("准备A4纸");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("装订画框");
        return result;
    }
}
