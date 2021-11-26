package lesson10;

public class HW10 {

    static void decorators(){
        String salaryRecords = "Имя,зарплата\nАнтон Комков,100000\n Иван Иванов,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
//                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt"))
//                )
                ;
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());

    }
    public static void main(String[] args) throws Exception {
         decorators();
    }
}
/*
По примеру метода decorators в классе Main
создать такой объект, который будет записывать/считывать из файла данные
при этом данные будут только сжаты (без шифрования)
Записать любую строку в файл с помощью этого объекта
Считать строку из файла и вывести в консоль
 */