package Task4;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;


public class Worker4 {


    public Object fibTxt(int N) {
        BigInteger[] dp = new BigInteger[1000001];
        try (FileWriter writer = new FileWriter("numbersFib1.txt", false)) {

            Arrays.fill(dp, BigInteger.ZERO);
            writer.write(String.valueOf(dp[0] = BigInteger.ZERO));
            writer.append(", ");
            writer.write(String.valueOf(dp[1] = BigInteger.ONE));
            writer.append(", ");
            writer.flush();
            for (int i = 2; i <= N; i++) {
                if (dp[i].equals(BigInteger.ZERO)) {
                    writer.write(String.valueOf(dp[i] = dp[i - 1].add(dp[i - 2])));
                    writer.append(", ");
                    writer.flush();
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return "\"" + dp[N].toString() + "\"";
    }

    public static Object fib(int N) {

        BigInteger[] dp1 = new BigInteger[100002];

        Arrays.fill(dp1, BigInteger.ZERO);

        dp1[0] = BigInteger.ZERO;
        dp1[1] = BigInteger.ONE;

        for (int i = 2; i <= N; i++) {
            if (dp1[i].equals(BigInteger.ZERO)) {
                dp1[i] = dp1[i - 1].add(dp1[i - 2]);

            }
        }

        return  dp1[N].toString();

    }


}
