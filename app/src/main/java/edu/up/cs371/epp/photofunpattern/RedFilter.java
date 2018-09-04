package edu.up.cs371.epp.photofunpattern;

import android.graphics.Color;

public class RedFilter extends PhotoFilter {
    @Override
    protected int transformPixel(int inPixel) {
        final int redComponent = Color.red(inPixel);
        return Color.argb(Color.alpha(inPixel), redComponent,0,0);
    }
}
