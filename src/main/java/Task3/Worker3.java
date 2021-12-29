package Task3;

import java.util.Arrays;

import static java.lang.StrictMath.abs;

public class Worker3 {


    private static int gcd(int x, int y) {

        return Math.abs((y == 0) ? x : gcd(y, x % y));
    }


    public static int gcd(int numbers1, int numbers2, int numbers3, int numbers4) {

        return abs(Arrays.stream(new int[]{numbers1, numbers2, numbers3, numbers4}).reduce(0, (x, y) -> Math.abs(gcd(x, y))));

    }


}
