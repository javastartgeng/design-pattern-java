package proxybymyself;

import proxybymyself.impl.ProxyPictureExtend;
import proxybymyself.impl.ProxyPictureImplements;
import proxybymyself.impl.RealPicture;

public class PictureProxyTest {
    public static void main(String[] args) {
        //接口实现代理模式
        ProxyPictureImplements picture = new ProxyPictureImplements(new RealPicture());
        picture.draw();
        System.out.println("===========================");
        //继承实现代理模式
        ProxyPictureExtend proxyPictureExtend = new ProxyPictureExtend();
        proxyPictureExtend.draw();
    }
}
