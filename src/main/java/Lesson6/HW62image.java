package src.Les6;
import javax.imageio.ImageIO;
import java.awt.*;
import  java.awt.image.BufferedImage;
import java.io.*;
import  java.awt.Color;

public class HW62image {
    public static void streamsByte(String[] args) throws IOException {
        File hw = new File( "E:\\HW");
        BufferedImage image = ImageIO.read(hw);

    }
}



//        Color color= new Color(image.getRGB(555,333));
//        int blue = color.getBlue();
//        int red = color.getRed();
//        int green = color.getGreen();
//

