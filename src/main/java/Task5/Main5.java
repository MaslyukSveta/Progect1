package Task5;

import Task2.Worker2;

import java.util.Scanner;

import static Task1.Worker1.swapString;
import static Task3.Worker3.gcd;
import static Task4.Worker4.fib;

public class Main5 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String [] args) {

       Worker5 worker5 = new Worker5();

        System.out.println("Введите день");
        int day = Integer.parseInt(scan.next());
        System.out.println("Введите месяц");
        int month = Integer.parseInt(scan.next());
        System.out.println("Введите с какоего дня недели насчинается год");
        int year = Integer.parseInt(scan.next());

        System.out.println(worker5.printDayOfWeek(day, month, year));

    }



}
