package proxybymyself.impl;

public class ProxyPictureExtend extends RealPicture {

    @Override
    public void draw(){
        System.out.println("代理2：准备A4纸");
        super.draw();
        System.out.println("代理2：装订画框");
    }
}
