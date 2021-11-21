package src.com.company;//package com.company;
//
//public class PhoneNumber {
////    private static String numType;
////    private static void num;
//
//
////
////           void saynum(){
////               System.out.printf("Введите номер %s, мне %d года\n", num, numType));
////           }
////    public static void main(String[] args) {
//
//
//    /*/
//    1.
//Создать класс PhoneNumber (в отдельном файле в пакете lesson4)
//2 поля:
//num целочисленного типа
//    (там будет храниться номер в виде числа, начинающегося с 8)
//numType строчного типа
//    (там будет храниться информация о типе номера, например "Рабочий" или "Личный")
//     /*/
//    int num;
//    String numType;
//
//    public PhoneNumber(String s) {
//    }
//
//    /*/
// 2.
//
// В класс PhoneNumber добавить два конструктора:
// первый - без аргументов, он задает значение numType = ""
// второй - с двумя аргументами таких же типов, что и поля, он передает значения аргументов в поля
//    */
//    PhoneNumber() {
//        numType = "";
//    }
//
//    PhoneNumber(String x, int c) {
//        num = c;
//        numType = x;
//    }
//
//    /*/
//3.
//Добавить в класс PhoneNumber три метода
//метод с именем print без аргументов и без возвращаемого значения,
//   print выводит объект в консоль с помощью форматированного вывода System.out.printf()
//   формат "Телефонный %s номер: %d", на первом месте должно быть поле numType, на втором - num
//метод с именем changeType с одной строкой как аргумент и без возвращаемого значения,
//   changeType изменяет значение поля numType на строку из аргумента
//метод с именем getNum без аргументов и с возвратом целочисленного значения,
//   getNum возвращает значение поля num
///*/
//    void print() {
//        System.out.printf("Телефонный %s номер: %d" + numType + num);
//    }
//
//    void changeType(String izmNumeType) {
//        numType = izmNumeType;
//
////       int getNum() {
////            return num;
////        }
////    }
//
//
//
//}
//
