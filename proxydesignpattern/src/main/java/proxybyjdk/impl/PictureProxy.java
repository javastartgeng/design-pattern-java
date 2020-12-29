package proxybyjdk.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PictureProxy implements InvocationHandler {

    private Object target;

    public PictureProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("准备A4纸");
        method.invoke(target,args);
        System.out.println("装订画框");
        return null;
    }

    public <T>T getProxy(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
