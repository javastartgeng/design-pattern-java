package proxybymyself.impl;

import proxybymyself.Picture;

public class RealPicture implements Picture {
    @Override
    public void draw() {
        System.out.println("开始画画");
    }
}
