package src.Lesson7;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class HW7_1 {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner sc = new Scanner(new FileInputStream("nums.txt"));) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.printf("a + b = %d\n", a + b);
            System.out.printf("a - b = %d\n", a - b);
            System.out.printf("a * b = %d\n", a * b);
            System.out.printf("a / (b - 63) = %d\n", a / (b - 63));
        } catch (InputMismatchException d){
            System.out.println("Ошибка ввода");
        }catch (ArithmeticException d){
            System.out.println("деление на ноль");
        }
        }
    }
