package proxybymyself.impl;

import proxybymyself.Picture;

public class ProxyPictureImplements implements Picture {

    private RealPicture picture;

    public ProxyPictureImplements(RealPicture picture) {
        this.picture = picture;
    }

    @Override
    public void draw() {
        System.out.println("代理1：准备A4纸");
        picture.draw();
        System.out.println("代理1：装订画框");
    }
}
