package proxybymyself.impl;

import proxybymyself.Picture;

public class ProxyPictureImplements implements Picture {

    private Picture image;

    public ProxyPictureImplements(Picture image) {
        this.image = image;
    }

    @Override
    public void draw() {
        System.out.println("代理1：准备A4纸");
        image.draw();
        System.out.println("代理1：装订画框");
    }
}
