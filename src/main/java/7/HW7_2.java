package src.Lesson7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW7_2 {
    static int readInput(Scanner sc) throws InputMismatchException {
        int i = sc.nextInt();
        if (i <= 0) {
            throw new InputMismatchException("Число неположительное, запустите программу заново");
        }
  return i;
    }
}
