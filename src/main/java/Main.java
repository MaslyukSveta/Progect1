import Task2.Worker2;
import Task5.Worker5;


import java.io.BufferedInputStream;
import java.util.Scanner;

import static Task1.Worker1.swapString;
import static Task3.Worker3.gcd;
import static Task4.Worker4.fib;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String [] args) {

       menu();
    }

    public static void menu(){
        int x = 0;
        String s ="";

        while (!"0".equals(s)){
            System.out.println("1. Задание 1");
            System.out.println("2. Задание 2");
            System.out.println("3. Задание 3");
            System.out.println("4. Задание 4");
            System.out.println("5. Задание 5");
            System.out.println("6. Для выхода из приложения введите 0");

            s = scan.next();

            try {
                x = Integer.parseInt(s);

                switch (x) {
                    case 1:
                        System.out.println(task1());
                        break;
                    case 2:
                        System.out.println(task2());
                        break;
                    case 3:

                        System.out.println(task3());
                        break;
                    case 4:
                        System.out.println(task4());
                        break;
                    case 5:
                        System.out.println(task5());

                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }
        }
        System.out.println("До свидания!");
    }

    public static String task1(){
        System.out.println("Введите число 1");
        int a = Integer.parseInt(scan.next());
        System.out.println("Введите число 2");
        int b = Integer.parseInt(scan.next());
        return swapString (a,b);
    }

    public static String task2() {

        Worker2 worker2 = new Worker2();

        System.out.println("Введите количество этажей в доме");

        int a2 = Integer.parseInt(scan.next());

        System.out.println("Введите количество квартир на этаже");

        int b2 = Integer.parseInt(scan.next());

        System.out.println("Введите номер квартиры");


        int c2 = Integer.parseInt(scan.next());
        return "Вывод:" + worker2.print(a2, b2, c2);
    }
    public static int task3() {
        System.out.println("Введите число 1");
        int number1 = Integer.parseInt(scan.next());
        System.out.println("Введите число 2");
        int number2 = Integer.parseInt(scan.next());
        System.out.println("Введите число 3");
        int number3 = Integer.parseInt(scan.next());
        System.out.println("Введите число 4");
        int number4 = Integer.parseInt(scan.next());

        return gcd(number1, number2, number3, number4);
    }
    public static String task4() {
        System.out.println("Введите число");
        int number = Integer.parseInt(scan.nextLine());

        return String.valueOf(fib(number));
    }
    public static String task5() {

        Worker5 worker5 = new Worker5();

        System.out.println("Введите день");
        int day = Integer.parseInt(scan.next());
        System.out.println("Введите месяц");
        int month = Integer.parseInt(scan.next());
        System.out.println("Введите с какоего дня недели насчинается год");
        System.out.println("1 - Понедельник, а 7 - Воскрисенье");
        int year = Integer.parseInt(scan.next());

        return worker5.printDayOfWeek(day, month, year);
    }

}
