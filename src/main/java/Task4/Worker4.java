package Task4;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;


public class Worker4 {


    public static Object fib(int place) {

        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");

        if(place == 0) {
            b = BigInteger.valueOf(0);
        }else {
            while (place-- > 1) {
                BigInteger t = b;
                b = a.add(b);
                a = t;
            }
        }
        return b.toString();
    }


}
