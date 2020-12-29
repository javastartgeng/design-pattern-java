package proxybycglib.impl;

import proxybycglib.Picture;

public class RealPicture implements Picture {
    @Override
    public void draw() {
        System.out.println("开始画画");
    }
}
