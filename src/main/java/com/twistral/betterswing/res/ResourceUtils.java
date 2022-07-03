package com.twistral.betterswing.res;

import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;


public class ResourceUtils {

    public static Cursor createCursor(Image cursorImage, Point hotSpot, String cursorName){
        return Toolkit.getDefaultToolkit().createCustomCursor(cursorImage, hotSpot, cursorName);
    }


    public static BufferedImage getBufferedImage(URL bufferedImageURL){
        try { return ImageIO.read( bufferedImageURL ); }
        catch (IOException e) { e.printStackTrace(); }
        return null;
    }


    public static Image getImage(URL imgURL){
        try { return ImageIO.read( imgURL ); }
        catch (IOException e) { e.printStackTrace(); }
        return null;
    }


    public static ImageIcon getImageIcon(URL imgIconURL){
        try { return new ImageIcon(ImageIO.read(imgIconURL)); }
        catch (IOException e) { e.printStackTrace(); }
        return null;
    }


    public static Font getFont(URL fontURL, float size){
        Font font = null;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, fontURL.openStream()).deriveFont(size);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
        }
        catch(Exception e) {e.getStackTrace();}
        return font;
    }



    public static Clip getClip(URL soundURL) {
        try{
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundURL);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            return clip;
        }
        catch (UnsupportedAudioFileException e) { e.printStackTrace(); }
        catch (LineUnavailableException e) { e.printStackTrace(); }
        catch (IOException e) { e.printStackTrace(); }
        return null;
    }

}
