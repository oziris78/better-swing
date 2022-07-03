package com.twistral.betterswing.image;

import javax.swing.ImageIcon;
import java.awt.Image;



public final class ImageIconUtils {


    /* No Constructor */
    private ImageIconUtils(){}

    /**
     * Resizes icon to width x height and returns a copy of that resized image.
     * @param icon and ImageIcon to resize
     * @param width new width of imageIcon
     * @param height new height of imageIcon
     * @return a resized icon
     */
    public static ImageIcon stretchedImage(ImageIcon icon, int width, int height) {
        return new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
    }



}
