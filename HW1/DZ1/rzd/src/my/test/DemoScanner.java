package my.test;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);//создали объект класса Scanner и теперь можно вызываеть методы класса Scanner
//        System.out.println("Введите свой возраст");
//        if(!sc.hasNextInt()){
//            System.out.println("Вы ввели не число");
//        }else {
//            int age = sc.nextInt();
//            System.out.println("Вы родились в " + (2022 - age));
//            sc.close();
//        }

        System.out.println("Введите ФИО");
        String fio = sc.nextLine();
        System.out.println("Привет, " + fio);
        sc.close();
    }
}

