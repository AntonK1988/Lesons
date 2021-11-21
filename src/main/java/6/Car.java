package src.Les6;
import java.util.Scanner;
public class Car implements Vehicle {
    Scanner sc = new Scanner(System.in);
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    double speed = sc.nextDouble();
    double w = sc.nextDouble();

public Car () {}

    public Car(double x, double y,double speed, double w ){
this.x = x;
        this.y = y;
        this.speed = speed;
        this.w = w;

    }
void move (){
     double new_x = x;
     double new_y = y;
    System.out.println( "x = " + x) ;
    System.out.println( "y = " + y );
}
void changeSpeed (){
    double inc = w;
    System.out.println( "speed + inc = " + (speed + w) );
    }

    }
/*/HW 61
Определить класс Car
    Три дробных поля x, y и speed
    Пустой конструктор, конструктор с тремя аргументами
    Реализация move - установить x и y равными значениям new_x и new_y
    Реализация changeSpeed - увеличить скорость на inc
/*/
