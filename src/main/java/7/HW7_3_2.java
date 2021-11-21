package src.Lesson7;

import java.util.Random;
import java.util.Scanner;

import static src.Lesson7.HW7_3.getRandomInt;

public class HW7_3_2<sum> {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i;
        int sum = 0;
        int count = 100;
        for (i = 0; i<100; i++){
            int delenie = getRandomInt (a,b);
           try {
               sum = sum + x / delenie;
           }catch (ArithmeticException e){
               count --;
           }
           }
                System.out.println(sum);
    }
}
