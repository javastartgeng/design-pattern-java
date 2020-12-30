package proxyjdkbymyself.impl;

import proxyjdkbymyself.myinvocationhandler.MyInvocationHandler;

import java.lang.reflect.Method;

public class PictureProxy implements MyInvocationHandler {

    private Object target;

    public PictureProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("准备A4纸");
        Object result = method.invoke(target,args);
        System.out.println("装订画框");
        return result;
    }
}
