package src.Les6;
import java.io.*;
public class HW62 {
    public static void main(String[] args) throws IOException {


            OutputStream output = new FileOutputStream("HW62image");
            output.write(1);
            output.close();

            InputStream input = new FileInputStream("image out");
            int i = input.read();
            System.out.println(i);
            input.close();

//        FileInputStream inputi = new FileInputStream("HW62image");
//        FileOutputStream outputi = new FileOutputStream("HW62imageout");

        int q = 0;
        while ((q = input.read()) != -1) {
            output.write(q+1);
        }

              input.close();
        output.close();
    }
        }

