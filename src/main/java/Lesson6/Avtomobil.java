package src.Les6;
import java.util.Scanner;
public class Avtomobil {
    public static void main(String[] args) {
        System.out.println("Введите по очереди 4 параметра x, y, inc и speed");

        Car q = new Car();
        q.move();
        q.changeSpeed();
    }
}
/*/HW 61
В psvm создать автомобиль, проверить работу его методов move и changeSpeed
 */