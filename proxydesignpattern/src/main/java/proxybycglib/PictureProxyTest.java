package proxybycglib;

import net.sf.cglib.proxy.Enhancer;
import proxybycglib.impl.PictureProxy;
import proxybycglib.impl.RealPicture;

public class PictureProxyTest {
    public static void main(String[] args) {
        PictureProxy proxy = new PictureProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealPicture.class);
        enhancer.setCallback(proxy);
        RealPicture picture = (RealPicture) enhancer.create();
        picture.draw();
    }
}
