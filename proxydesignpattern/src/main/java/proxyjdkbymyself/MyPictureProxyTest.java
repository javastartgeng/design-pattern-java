package proxyjdkbymyself;

import proxyjdkbymyself.impl.RealPicture;
import proxyjdkbymyself.Proxy.MyClassLoader;
import proxyjdkbymyself.Proxy.MyProxy;
import proxyjdkbymyself.impl.PictureProxy;
import proxyjdkbymyself.picture.Picture;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class MyPictureProxyTest {
    public static void main(String[] args) {
        try {
           Picture picture = (Picture) MyProxy.newProxyInstance(new MyClassLoader(),Picture.class,new PictureProxy(new RealPicture()));
           picture.draw();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
