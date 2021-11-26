package src.Les6;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class HW63 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        long z = 0;
        int x = 1 ;
        int a = 1;
        Scanner sc = new Scanner(new FileInputStream("story.txt"));
        while (sc.hasNext()) {
            if (sc.hasNextLong()) {
                long i = sc.nextLong();
                if ( i >= 8900000000L)
                    System.out.println("Число по тексту № " + (a++) + " Определен телефонный номер № " + (x++) + " " + i);
                    if(i<=8900000000L)
                        System.out.println("Число по тексту № " + (a++) + " Числопо тексту не является номером" );
            } else {
                String s = sc.next();
            }
        }
    }
}