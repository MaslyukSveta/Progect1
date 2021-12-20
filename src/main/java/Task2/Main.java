package Task2;

import java.math.BigInteger;

public class Main {
    public static void main(String [] args) {

        Worker2 worker2 = new Worker2();

        int maxValue =Integer.MAX_VALUE;

        int maxValue2 =46340*46340;
        int maxValue3 =46341*46341;
        int maxValue4 =2147483647*2147483647;
        int maxValue5 = worker2.entrance(Integer.MAX_VALUE/2,2, 2);
        System.out.println("maxValue5 = " + maxValue5);

        BigInteger maxValue1 = BigInteger.valueOf(2147483647L * 2147483647);

        System.out.println(worker2.entrance(1, maxValue, 1));
        System.out.println(worker2.entrance(9, 4, 37));




        System.out.println(worker2.floorSearch(9, 4, 36));

        System.out.println(maxValue2);
        System.out.println(maxValue3);
        System.out.println(maxValue4);
        System.out.println(maxValue5);


        System.out.println(worker2.entrance(1, maxValue, 1));
        System.out.println(worker2.entrance(1, maxValue, maxValue));
    }
}
