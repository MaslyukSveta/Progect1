package Task2;

import java.util.Scanner;

public class Main2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String [] args) {

        Worker2 worker2 = new Worker2();

        System.out.println("Введите количество этажей в доме");

        int a2 = Integer.parseInt(scan.next());

        System.out.println("Введите количество квартир на этаже");

        int b2 = Integer.parseInt(scan.next());

        System.out.println("Введите номер квартиры");


        int c2 = Integer.parseInt(scan.next());
        System.out.println("Вывод:" + worker2.print(a2, b2, c2));
    }
}
