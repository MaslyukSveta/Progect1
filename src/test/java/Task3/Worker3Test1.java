package Task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Worker3Test1 {

    Worker3 worker = new Worker3();

    @Test
    void test1Gcd() {

        assertEquals(5, worker.gcd(10, 15, 5, 20));
    }

    @Test
    void test2Gcd() {

        assertEquals(5, worker.gcd(10, 15, 5, -20));
    }
    @Test
    void test3Gcd() {
        assertEquals(5, worker.gcd(10, 15, 5, -20));
    }



    int minValue = Integer.MIN_VALUE + 1;

    int maxValue = Integer.MAX_VALUE;



    void gcdTest(int test, int a, int b, int c, int d) {
        int s = worker.gcd(a, b, c, d);
        assertEquals(test, s);
    }


    /**
     * gcd(MAX, MAX, MAX, MAX)
     */
    @Test
    void gcdTest1() {

        gcdTest(maxValue, maxValue, maxValue, maxValue, maxValue);

        gcdTest(1, maxValue, maxValue, maxValue, maxValue - 1);
        gcdTest(1, maxValue, maxValue, maxValue - 1, maxValue);
        gcdTest(1, maxValue, maxValue - 1, maxValue, maxValue);
        gcdTest(1, maxValue - 1, maxValue, maxValue, maxValue);


        //region граничные значения класса, MAX && 0
        gcdTest(2147483647,maxValue,maxValue,maxValue,maxValue);

        gcdTest(1,maxValue,maxValue,maxValue,maxValue-1);
        gcdTest(2147483647,maxValue,maxValue,maxValue,minValue);
        gcdTest(1,maxValue,maxValue,maxValue,minValue+1);


        gcdTest(1,maxValue,maxValue,maxValue-1,maxValue);
        gcdTest(1,maxValue,maxValue,maxValue-1,maxValue-1);
        gcdTest(1,maxValue,maxValue,maxValue-1,minValue);
        gcdTest(1,maxValue,maxValue,maxValue-1,minValue+1);


        gcdTest(2147483647,maxValue,maxValue,minValue,maxValue);
        gcdTest(1,maxValue,maxValue,minValue,maxValue-1);
        gcdTest(2147483647,maxValue,maxValue,minValue,minValue);
        gcdTest(1,maxValue,maxValue,minValue,minValue+1);

        gcdTest(1,maxValue,maxValue,minValue+1,maxValue);
        gcdTest(1,maxValue,maxValue,minValue+1,maxValue-1);
        gcdTest(1,maxValue,maxValue,minValue+1,minValue);
        gcdTest(1,maxValue,maxValue,minValue+1,minValue+1);

        gcdTest(1,maxValue,maxValue-1,maxValue,maxValue);
        gcdTest(1,maxValue,maxValue-1,maxValue,maxValue-1);
        gcdTest(1,maxValue,maxValue-1,maxValue,minValue);
        gcdTest(1,maxValue,maxValue-1,maxValue,minValue+1);

        gcdTest(1,maxValue,maxValue-1,maxValue-1,maxValue);
        gcdTest(1,maxValue,maxValue-1,maxValue-1,maxValue-1);
        gcdTest(1,maxValue,maxValue-1,maxValue-1,minValue);
        gcdTest(1,maxValue,maxValue-1,maxValue-1,minValue+1);

        gcdTest(1,maxValue,maxValue-1,minValue,maxValue);
        gcdTest(1,maxValue,maxValue-1,minValue,maxValue-1);
        gcdTest(1,maxValue,maxValue-1,minValue,minValue);
        gcdTest(1,maxValue,maxValue-1,minValue,minValue+1);
        ;
        gcdTest(1,maxValue,maxValue-1,minValue+1,maxValue);
        gcdTest(1,maxValue,maxValue-1,minValue+1,maxValue-1);
        gcdTest(1,maxValue,maxValue-1,minValue+1,minValue);
        gcdTest(1,maxValue,maxValue-1,minValue+1,minValue+1);

        gcdTest(2147483647,maxValue,minValue,maxValue,maxValue);
        gcdTest(1,maxValue,minValue,maxValue,maxValue-1);
        gcdTest(2147483647,maxValue,minValue,maxValue,minValue);
        gcdTest(1,maxValue,minValue,maxValue,minValue+1);

        gcdTest(1,maxValue,minValue,maxValue-1,maxValue);
        gcdTest(1,maxValue,minValue,maxValue-1,maxValue-1);
        gcdTest(1,maxValue,minValue,maxValue-1,minValue);
        gcdTest(1,maxValue,minValue,maxValue-1,minValue+1);

        gcdTest(2147483647,maxValue,minValue,minValue,maxValue);
        gcdTest(1,maxValue,minValue,minValue,maxValue-1);
        gcdTest(2147483647,maxValue,minValue,minValue,minValue);
        gcdTest(1,maxValue,minValue,minValue,minValue+1);

        gcdTest(1,maxValue,minValue,minValue+1,maxValue);
        gcdTest(1,maxValue,minValue,minValue+1,maxValue-1);
        gcdTest(1,maxValue,minValue,minValue+1,minValue);
        gcdTest(1,maxValue,minValue,minValue+1,minValue+1);

        gcdTest(1,maxValue,minValue+1,maxValue,maxValue);
        gcdTest(1,maxValue,minValue+1,maxValue,maxValue-1);
        gcdTest(1,maxValue,minValue+1,maxValue,minValue);
        gcdTest(1,maxValue,minValue+1,maxValue,minValue+1);

        gcdTest(1,maxValue,minValue+1,maxValue-1,maxValue);
        gcdTest(1,maxValue,minValue+1,maxValue-1,maxValue-1);
        gcdTest(1,maxValue,minValue+1,maxValue-1,minValue);
        gcdTest(1,maxValue,minValue+1,maxValue-1,minValue+1);

        gcdTest(1,maxValue,minValue+1,minValue,maxValue);
        gcdTest(1,maxValue,minValue+1,minValue,maxValue-1);
        gcdTest(1,maxValue,minValue+1,minValue,minValue);
        gcdTest(1,maxValue,minValue+1,minValue,minValue+1);

        gcdTest(1,maxValue,minValue+1,minValue+1,maxValue);
        gcdTest(1,maxValue,minValue+1,minValue+1,maxValue-1);
        gcdTest(1,maxValue,minValue+1,minValue+1,minValue);
        gcdTest(1,maxValue,minValue+1,minValue+1,minValue+1);

        //endregion

        //region граничные значения класса, MAX && 0



        gcdTest(1,maxValue-1,maxValue,maxValue,maxValue);
        gcdTest(1,maxValue-1,maxValue,maxValue,maxValue-1);
        gcdTest(1,maxValue-1,maxValue,maxValue,minValue);
        gcdTest(1,maxValue-1,maxValue,maxValue,minValue+1);

        gcdTest(1,maxValue-1,maxValue,maxValue-1,maxValue);
        gcdTest(1,maxValue-1,maxValue,maxValue-1,maxValue-1);
        gcdTest(1,maxValue-1,maxValue,maxValue-1,minValue);
        gcdTest(1,maxValue-1,maxValue,maxValue-1,minValue+1);


        gcdTest(1,maxValue-1,maxValue,minValue,maxValue);
        gcdTest(1,maxValue-1,maxValue,minValue,maxValue-1);
        gcdTest(1,maxValue-1,maxValue,minValue,minValue);
        gcdTest(1,maxValue-1,maxValue,minValue,minValue+1);


        gcdTest(1,maxValue-1,maxValue,minValue+1,maxValue);
        gcdTest(1,maxValue-1,maxValue,minValue+1,maxValue-1);
        gcdTest(1,maxValue-1,maxValue,minValue+1,minValue);
        gcdTest(1,maxValue-1,maxValue,minValue+1,minValue+1);




        gcdTest(1,maxValue-1,maxValue-1,maxValue,maxValue);
        gcdTest(1,maxValue-1,maxValue-1,maxValue,maxValue-1);
        gcdTest(1,maxValue-1,maxValue-1,maxValue,minValue);
        gcdTest(1,maxValue-1,maxValue-1,maxValue,minValue+1);
        gcdTest(1,maxValue-1,maxValue-1,maxValue-1,-1);


        gcdTest(1,maxValue-1,maxValue-1,maxValue-1,maxValue);
        gcdTest(2147483646,maxValue-1,maxValue-1,maxValue-1,maxValue-1);
        gcdTest(1,maxValue-1,maxValue-1,maxValue-1,minValue);
        gcdTest(2147483646,maxValue-1,maxValue-1,maxValue-1,minValue+1);


        gcdTest(1,maxValue-1,maxValue-1,minValue,maxValue);
        gcdTest(1,maxValue-1,maxValue-1,minValue,maxValue-1);
        gcdTest(1,maxValue-1,maxValue-1,minValue,minValue);
        gcdTest(1,maxValue-1,maxValue-1,minValue,minValue+1);


        gcdTest(1,maxValue-1,maxValue-1,minValue+1,maxValue);
        gcdTest(2147483646,maxValue-1,maxValue-1,minValue+1,maxValue-1);
        gcdTest(1,maxValue-1,maxValue-1,minValue+1,minValue);
        gcdTest(2147483646,maxValue-1,maxValue-1,minValue+1,minValue+1);


        gcdTest(1,maxValue-1,minValue,maxValue,maxValue);
        gcdTest(1,maxValue-1,minValue,maxValue,maxValue-1);
        gcdTest(1,maxValue-1,minValue,maxValue,minValue);
        gcdTest(1,maxValue-1,minValue,maxValue,minValue+1);


        gcdTest(1,maxValue-1,minValue,maxValue-1,maxValue);
        gcdTest(1,maxValue-1,minValue,maxValue-1,maxValue-1);
        gcdTest(1,maxValue-1,minValue,maxValue-1,minValue);
        gcdTest(1,maxValue-1,minValue,maxValue-1,minValue+1);

        gcdTest(1,maxValue-1,minValue,minValue,maxValue);
        gcdTest(1,maxValue-1,minValue,minValue,maxValue-1);
        gcdTest(1,maxValue-1,minValue,minValue,minValue);
        gcdTest(1,maxValue-1,minValue,minValue,minValue+1);

        gcdTest(1,maxValue-1,minValue,minValue+1,maxValue);
        gcdTest(1,maxValue-1,minValue,minValue+1,maxValue-1);
        gcdTest(1,maxValue-1,minValue,minValue+1,minValue);
        gcdTest(1,maxValue-1,minValue,minValue+1,minValue+1);

        gcdTest(1,maxValue-1,minValue+1,0,maxValue);
        gcdTest(2147483646,maxValue-1,minValue+1,0,maxValue-1);
        gcdTest(1,maxValue-1,minValue+1,0,minValue);
        gcdTest(2147483646,maxValue-1,minValue+1,0,minValue+1);



        gcdTest(1,maxValue-1,minValue+1,maxValue,maxValue);
        gcdTest(1,maxValue-1,minValue+1,maxValue,maxValue-1);
        gcdTest(1,maxValue-1,minValue+1,maxValue,minValue);
        gcdTest(1,maxValue-1,minValue+1,maxValue,minValue+1);

        gcdTest(1,maxValue-1,minValue+1,maxValue-1,maxValue);
        gcdTest(2147483646,maxValue-1,minValue+1,maxValue-1,maxValue-1);
        gcdTest(1,maxValue-1,minValue+1,maxValue-1,minValue);
        gcdTest(2147483646,maxValue-1,minValue+1,maxValue-1,minValue+1);


        gcdTest(1,maxValue-1,minValue+1,minValue,maxValue);
        gcdTest(1,maxValue-1,minValue+1,minValue,maxValue-1);
        gcdTest(1,maxValue-1,minValue+1,minValue,minValue);
        gcdTest(1,maxValue-1,minValue+1,minValue,minValue+1);


        gcdTest(1,maxValue-1,minValue+1,minValue+1,maxValue);
        gcdTest(2147483646,maxValue-1,minValue+1,minValue+1,maxValue-1);
        gcdTest(1,maxValue-1,minValue+1,minValue+1,minValue);
        gcdTest(2147483646,maxValue-1,minValue+1,minValue+1,minValue+1);
        //endregion

        //region граничные значения класса, MAX && 0
        gcdTest(2147483647,minValue,maxValue,maxValue,maxValue);
        gcdTest(1,minValue,maxValue,maxValue,maxValue-1);
        gcdTest(2147483647,minValue,maxValue,maxValue,minValue);
        gcdTest(1,minValue,maxValue,maxValue,minValue+1);

        gcdTest(1,minValue,maxValue,maxValue-1,maxValue);
        gcdTest(1,minValue,maxValue,maxValue-1,maxValue-1);
        gcdTest(1,minValue,maxValue,maxValue-1,minValue);
        gcdTest(1,minValue,maxValue,maxValue-1,minValue+1);


        gcdTest(2147483647,minValue,maxValue,minValue,maxValue);
        gcdTest(1,minValue,maxValue,minValue,maxValue-1);
        gcdTest(2147483647,minValue,maxValue,minValue,minValue);
        gcdTest(1,minValue,maxValue,minValue,minValue+1);

        gcdTest(1,minValue,maxValue,minValue+1,maxValue);
        gcdTest(1,minValue,maxValue,minValue+1,maxValue-1);
        gcdTest(1,minValue,maxValue,minValue+1,minValue);
        gcdTest(1,minValue,maxValue,minValue+1,minValue+1);


        gcdTest(1,minValue,maxValue-1,-1,maxValue);
        gcdTest(1,minValue,maxValue-1,-1,maxValue-1);
        gcdTest(1,minValue,maxValue-1,-1,minValue);
        gcdTest(1,minValue,maxValue-1,-1,minValue+1);


        gcdTest(1,minValue,maxValue-1,0,maxValue);
        gcdTest(1,minValue,maxValue-1,0,maxValue-1);
        gcdTest(1,minValue,maxValue-1,0,minValue);
        gcdTest(1,minValue,maxValue-1,0,minValue+1);


        gcdTest(1,minValue,maxValue-1,1,maxValue);
        gcdTest(1,minValue,maxValue-1,1,maxValue-1);
        gcdTest(1,minValue,maxValue-1,1,minValue);
        gcdTest(1,minValue,maxValue-1,1,minValue+1);


        gcdTest(1,minValue,maxValue-1,maxValue,maxValue);
        gcdTest(1,minValue,maxValue-1,maxValue,maxValue-1);
        gcdTest(1,minValue,maxValue-1,maxValue,minValue);
        gcdTest(1,minValue,maxValue-1,maxValue,minValue+1);


        gcdTest(1,minValue,maxValue-1,maxValue-1,maxValue);
        gcdTest(1,minValue,maxValue-1,maxValue-1,maxValue-1);
        gcdTest(1,minValue,maxValue-1,maxValue-1,minValue);
        gcdTest(1,minValue,maxValue-1,maxValue-1,minValue+1);

        gcdTest(1,minValue,maxValue-1,minValue,maxValue);
        gcdTest(1,minValue,maxValue-1,minValue,maxValue-1);
        gcdTest(1,minValue,maxValue-1,minValue,minValue);
        gcdTest(1,minValue,maxValue-1,minValue,minValue+1);


        gcdTest(1,minValue,maxValue-1,minValue+1,maxValue);
        gcdTest(1,minValue,maxValue-1,minValue+1,maxValue-1);
        gcdTest(1,minValue,maxValue-1,minValue+1,minValue);
        gcdTest(1,minValue,maxValue-1,minValue+1,minValue+1);


        gcdTest(1,minValue,minValue,-1,maxValue);
        gcdTest(1,minValue,minValue,-1,maxValue-1);
        gcdTest(1,minValue,minValue,-1,minValue);
        gcdTest(1,minValue,minValue,-1,minValue+1);


        gcdTest(2147483647,minValue,minValue,0,maxValue);
        gcdTest(1,minValue,minValue,0,maxValue-1);
        gcdTest(2147483647,minValue,minValue,0,minValue);
        gcdTest(1,minValue,minValue,0,minValue+1);

        gcdTest(1,minValue,minValue,1,maxValue);
        gcdTest(1,minValue,minValue,1,maxValue-1);
        gcdTest(1,minValue,minValue,1,minValue);
        gcdTest(1,minValue,minValue,1,minValue+1);


        gcdTest(2147483647,minValue,minValue,maxValue,maxValue);
        gcdTest(1,minValue,minValue,maxValue,maxValue-1);
        gcdTest(2147483647,minValue,minValue,maxValue,minValue);
        gcdTest(1,minValue,minValue,maxValue,minValue+1);


        gcdTest(1,minValue,minValue,maxValue-1,maxValue);
        gcdTest(1,minValue,minValue,maxValue-1,maxValue-1);
        gcdTest(1,minValue,minValue,maxValue-1,minValue);
        gcdTest(1,minValue,minValue,maxValue-1,minValue+1);


        gcdTest(2147483647,minValue,minValue,minValue,maxValue);
        gcdTest(1,minValue,minValue,minValue,maxValue-1);
        gcdTest(2147483647,minValue,minValue,minValue,minValue);
        gcdTest(1,minValue,minValue,minValue,minValue+1);

        gcdTest(1,minValue,minValue,minValue+1,maxValue);
        gcdTest(1,minValue,minValue,minValue+1,maxValue-1);
        gcdTest(1,minValue,minValue,minValue+1,minValue);
        gcdTest(1,minValue,minValue,minValue+1,minValue+1);


        gcdTest(1,minValue,minValue+1,maxValue,-1);
        gcdTest(1,minValue,minValue+1,maxValue,0);
        gcdTest(1,minValue,minValue+1,maxValue,1);
        gcdTest(1,minValue,minValue+1,maxValue,maxValue);
        gcdTest(1,minValue,minValue+1,maxValue,maxValue-1);
        gcdTest(1,minValue,minValue+1,maxValue,minValue);
        gcdTest(1,minValue,minValue+1,maxValue,minValue+1);



        gcdTest(1,minValue,minValue+1,maxValue-1,maxValue);
        gcdTest(1,minValue,minValue+1,maxValue-1,maxValue-1);
        gcdTest(1,minValue,minValue+1,maxValue-1,minValue);
        gcdTest(1,minValue,minValue+1,maxValue-1,minValue+1);

        gcdTest(1,minValue,minValue+1,minValue,maxValue);
        gcdTest(1,minValue,minValue+1,minValue,maxValue-1);
        gcdTest(1,minValue,minValue+1,minValue,minValue);
        gcdTest(1,minValue,minValue+1,minValue,minValue+1);

        gcdTest(1,minValue,minValue+1,minValue+1,maxValue);
        gcdTest(1,minValue,minValue+1,minValue+1,maxValue-1);
        gcdTest(1,minValue,minValue+1,minValue+1,minValue);
        gcdTest(1,minValue,minValue+1,minValue+1,minValue+1);
        //endregion

        //region граничные значения класса

        gcdTest(1,minValue+1,0,minValue+1,-1);
        gcdTest(2147483646,minValue+1,0,minValue+1,0);
        gcdTest(1,minValue+1,0,minValue+1,1);
        gcdTest(1,minValue+1,0,minValue+1,maxValue);
        gcdTest(2147483646,minValue+1,0,minValue+1,maxValue-1);
        gcdTest(1,minValue+1,0,minValue+1,minValue);
        gcdTest(2147483646,minValue+1,0,minValue+1,minValue+1);


        gcdTest(1,minValue+1,1,-1,-1);
        gcdTest(1,minValue+1,1,-1,0);
        gcdTest(1,minValue+1,1,-1,1);
        gcdTest(1,minValue+1,1,-1,maxValue);
        gcdTest(1,minValue+1,1,-1,maxValue-1);
        gcdTest(1,minValue+1,1,-1,minValue);
        gcdTest(1,minValue+1,1,-1,minValue+1);


        gcdTest(1,minValue+1,1,0,-1);
        gcdTest(1,minValue+1,1,0,0);
        gcdTest(1,minValue+1,1,0,1);
        gcdTest(1,minValue+1,1,0,maxValue);
        gcdTest(1,minValue+1,1,0,maxValue-1);
        gcdTest(1,minValue+1,1,0,minValue);
        gcdTest(1,minValue+1,1,0,minValue+1);


        gcdTest(1,minValue+1,1,1,-1);
        gcdTest(1,minValue+1,1,1,0);
        gcdTest(1,minValue+1,1,1,1);
        gcdTest(1,minValue+1,1,1,maxValue);
        gcdTest(1,minValue+1,1,1,maxValue-1);
        gcdTest(1,minValue+1,1,1,minValue);
        gcdTest(1,minValue+1,1,1,minValue+1);


        gcdTest(1,minValue+1,1,maxValue,-1);
        gcdTest(1,minValue+1,1,maxValue,0);
        gcdTest(1,minValue+1,1,maxValue,1);
        gcdTest(1,minValue+1,1,maxValue,maxValue);
        gcdTest(1,minValue+1,1,maxValue,maxValue-1);
        gcdTest(1,minValue+1,1,maxValue,minValue);
        gcdTest(1,minValue+1,1,maxValue,minValue+1);


        gcdTest(1,minValue+1,1,maxValue-1,-1);
        gcdTest(1,minValue+1,1,maxValue-1,0);
        gcdTest(1,minValue+1,1,maxValue-1,1);
        gcdTest(1,minValue+1,1,maxValue-1,maxValue);
        gcdTest(1,minValue+1,1,maxValue-1,maxValue-1);
        gcdTest(1,minValue+1,1,maxValue-1,minValue);
        gcdTest(1,minValue+1,1,maxValue-1,minValue+1);


        gcdTest(1,minValue+1,1,minValue,-1);
        gcdTest(1,minValue+1,1,minValue,0);
        gcdTest(1,minValue+1,1,minValue,1);
        gcdTest(1,minValue+1,1,minValue,maxValue);
        gcdTest(1,minValue+1,1,minValue,maxValue-1);
        gcdTest(1,minValue+1,1,minValue,minValue);
        gcdTest(1,minValue+1,1,minValue,minValue+1);


        gcdTest(1,minValue+1,1,minValue+1,-1);
        gcdTest(1,minValue+1,1,minValue+1,0);
        gcdTest(1,minValue+1,1,minValue+1,1);
        gcdTest(1,minValue+1,1,minValue+1,maxValue);
        gcdTest(1,minValue+1,1,minValue+1,maxValue-1);
        gcdTest(1,minValue+1,1,minValue+1,minValue);
        gcdTest(1,minValue+1,1,minValue+1,minValue+1);


        gcdTest(1,minValue+1,maxValue,-1,-1);
        gcdTest(1,minValue+1,maxValue,-1,0);
        gcdTest(1,minValue+1,maxValue,-1,1);
        gcdTest(1,minValue+1,maxValue,-1,maxValue);
        gcdTest(1,minValue+1,maxValue,-1,maxValue-1);
        gcdTest(1,minValue+1,maxValue,-1,minValue);
        gcdTest(1,minValue+1,maxValue,-1,minValue+1);


        gcdTest(1,minValue+1,maxValue,0,-1);
        gcdTest(1,minValue+1,maxValue,0,0);
        gcdTest(1,minValue+1,maxValue,0,1);
        gcdTest(1,minValue+1,maxValue,0,maxValue);
        gcdTest(1,minValue+1,maxValue,0,maxValue-1);
        gcdTest(1,minValue+1,maxValue,0,minValue);
        gcdTest(1,minValue+1,maxValue,0,minValue+1);


        gcdTest(1,minValue+1,maxValue,1,-1);
        gcdTest(1,minValue+1,maxValue,1,0);
        gcdTest(1,minValue+1,maxValue,1,1);
        gcdTest(1,minValue+1,maxValue,1,maxValue);
        gcdTest(1,minValue+1,maxValue,1,maxValue-1);
        gcdTest(1,minValue+1,maxValue,1,minValue);
        gcdTest(1,minValue+1,maxValue,1,minValue+1);


        gcdTest(1,minValue+1,maxValue,maxValue,-1);
        gcdTest(1,minValue+1,maxValue,maxValue,0);
        gcdTest(1,minValue+1,maxValue,maxValue,1);
        gcdTest(1,minValue+1,maxValue,maxValue,maxValue);
        gcdTest(1,minValue+1,maxValue,maxValue,maxValue-1);
        gcdTest(1,minValue+1,maxValue,maxValue,minValue);
        gcdTest(1,minValue+1,maxValue,maxValue,minValue+1);


        gcdTest(1,minValue+1,maxValue,maxValue-1,-1);
        gcdTest(1,minValue+1,maxValue,maxValue-1,0);
        gcdTest(1,minValue+1,maxValue,maxValue-1,1);
        gcdTest(1,minValue+1,maxValue,maxValue-1,maxValue);
        gcdTest(1,minValue+1,maxValue,maxValue-1,maxValue-1);
        gcdTest(1,minValue+1,maxValue,maxValue-1,minValue);
        gcdTest(1,minValue+1,maxValue,maxValue-1,minValue+1);


        gcdTest(1,minValue+1,maxValue,minValue,-1);
        gcdTest(1,minValue+1,maxValue,minValue,0);
        gcdTest(1,minValue+1,maxValue,minValue,1);
        gcdTest(1,minValue+1,maxValue,minValue,maxValue);
        gcdTest(1,minValue+1,maxValue,minValue,maxValue-1);
        gcdTest(1,minValue+1,maxValue,minValue,minValue);
        gcdTest(1,minValue+1,maxValue,minValue,minValue+1);


        gcdTest(1,minValue+1,maxValue,minValue+1,-1);
        gcdTest(1,minValue+1,maxValue,minValue+1,0);
        gcdTest(1,minValue+1,maxValue,minValue+1,1);
        gcdTest(1,minValue+1,maxValue,minValue+1,maxValue);
        gcdTest(1,minValue+1,maxValue,minValue+1,maxValue-1);
        gcdTest(1,minValue+1,maxValue,minValue+1,minValue);
        gcdTest(1,minValue+1,maxValue,minValue+1,minValue+1);


        gcdTest(1,minValue+1,maxValue-1,-1,-1);
        gcdTest(1,minValue+1,maxValue-1,-1,0);
        gcdTest(1,minValue+1,maxValue-1,-1,1);
        gcdTest(1,minValue+1,maxValue-1,-1,maxValue);
        gcdTest(1,minValue+1,maxValue-1,-1,maxValue-1);
        gcdTest(1,minValue+1,maxValue-1,-1,minValue);
        gcdTest(1,minValue+1,maxValue-1,-1,minValue+1);


        gcdTest(1,minValue+1,maxValue-1,0,-1);
        gcdTest(2147483646,minValue+1,maxValue-1,0,0);
        gcdTest(1,minValue+1,maxValue-1,0,1);
        gcdTest(1,minValue+1,maxValue-1,0,maxValue);
        gcdTest(2147483646,minValue+1,maxValue-1,0,maxValue-1);
        gcdTest(1,minValue+1,maxValue-1,0,minValue);
        gcdTest(2147483646,minValue+1,maxValue-1,0,minValue+1);


        gcdTest(1,minValue+1,maxValue-1,1,-1);
        gcdTest(1,minValue+1,maxValue-1,1,0);
        gcdTest(1,minValue+1,maxValue-1,1,1);
        gcdTest(1,minValue+1,maxValue-1,1,maxValue);
        gcdTest(1,minValue+1,maxValue-1,1,maxValue-1);
        gcdTest(1,minValue+1,maxValue-1,1,minValue);
        gcdTest(1,minValue+1,maxValue-1,1,minValue+1);


        gcdTest(1,minValue+1,maxValue-1,maxValue,-1);
        gcdTest(1,minValue+1,maxValue-1,maxValue,0);
        gcdTest(1,minValue+1,maxValue-1,maxValue,1);
        gcdTest(1,minValue+1,maxValue-1,maxValue,maxValue);
        gcdTest(1,minValue+1,maxValue-1,maxValue,maxValue-1);
        gcdTest(1,minValue+1,maxValue-1,maxValue,minValue);
        gcdTest(1,minValue+1,maxValue-1,maxValue,minValue+1);


        gcdTest(1,minValue+1,maxValue-1,maxValue-1,-1);
        gcdTest(2147483646,minValue+1,maxValue-1,maxValue-1,0);
        gcdTest(1,minValue+1,maxValue-1,maxValue-1,1);
        gcdTest(1,minValue+1,maxValue-1,maxValue-1,maxValue);
        gcdTest(2147483646,minValue+1,maxValue-1,maxValue-1,maxValue-1);
        gcdTest(1,minValue+1,maxValue-1,maxValue-1,minValue);
        gcdTest(2147483646,minValue+1,maxValue-1,maxValue-1,minValue+1);


        gcdTest(1,minValue+1,maxValue-1,minValue,-1);
        gcdTest(1,minValue+1,maxValue-1,minValue,0);
        gcdTest(1,minValue+1,maxValue-1,minValue,1);
        gcdTest(1,minValue+1,maxValue-1,minValue,maxValue);
        gcdTest(1,minValue+1,maxValue-1,minValue,maxValue-1);
        gcdTest(1,minValue+1,maxValue-1,minValue,minValue);
        gcdTest(1,minValue+1,maxValue-1,minValue,minValue+1);


        gcdTest(1,minValue+1,maxValue-1,minValue+1,-1);
        gcdTest(2147483646,minValue+1,maxValue-1,minValue+1,0);
        gcdTest(1,minValue+1,maxValue-1,minValue+1,1);
        gcdTest(1,minValue+1,maxValue-1,minValue+1,maxValue);
        gcdTest(2147483646,minValue+1,maxValue-1,minValue+1,maxValue-1);
        gcdTest(1,minValue+1,maxValue-1,minValue+1,minValue);
        gcdTest(2147483646,minValue+1,maxValue-1,minValue+1,minValue+1);


        gcdTest(1,minValue+1,minValue,-1,-1);
        gcdTest(1,minValue+1,minValue,-1,0);
        gcdTest(1,minValue+1,minValue,-1,1);
        gcdTest(1,minValue+1,minValue,-1,maxValue);
        gcdTest(1,minValue+1,minValue,-1,maxValue-1);
        gcdTest(1,minValue+1,minValue,-1,minValue);
        gcdTest(1,minValue+1,minValue,-1,minValue+1);


        gcdTest(1,minValue+1,minValue,0,-1);
        gcdTest(1,minValue+1,minValue,0,0);
        gcdTest(1,minValue+1,minValue,0,1);
        gcdTest(1,minValue+1,minValue,0,maxValue);
        gcdTest(1,minValue+1,minValue,0,maxValue-1);
        gcdTest(1,minValue+1,minValue,0,minValue);
        gcdTest(1,minValue+1,minValue,0,minValue+1);


        gcdTest(1,minValue+1,minValue,1,-1);
        gcdTest(1,minValue+1,minValue,1,0);
        gcdTest(1,minValue+1,minValue,1,1);
        gcdTest(1,minValue+1,minValue,1,maxValue);
        gcdTest(1,minValue+1,minValue,1,maxValue-1);
        gcdTest(1,minValue+1,minValue,1,minValue);
        gcdTest(1,minValue+1,minValue,1,minValue+1);


        gcdTest(1,minValue+1,minValue,maxValue,-1);
        gcdTest(1,minValue+1,minValue,maxValue,0);
        gcdTest(1,minValue+1,minValue,maxValue,1);
        gcdTest(1,minValue+1,minValue,maxValue,maxValue);
        gcdTest(1,minValue+1,minValue,maxValue,maxValue-1);
        gcdTest(1,minValue+1,minValue,maxValue,minValue);
        gcdTest(1,minValue+1,minValue,maxValue,minValue+1);


        gcdTest(1,minValue+1,minValue,maxValue-1,-1);
        gcdTest(1,minValue+1,minValue,maxValue-1,0);
        gcdTest(1,minValue+1,minValue,maxValue-1,1);
        gcdTest(1,minValue+1,minValue,maxValue-1,maxValue);
        gcdTest(1,minValue+1,minValue,maxValue-1,maxValue-1);
        gcdTest(1,minValue+1,minValue,maxValue-1,minValue);
        gcdTest(1,minValue+1,minValue,maxValue-1,minValue+1);


        gcdTest(1,minValue+1,minValue,minValue,-1);
        gcdTest(1,minValue+1,minValue,minValue,0);
        gcdTest(1,minValue+1,minValue,minValue,1);
        gcdTest(1,minValue+1,minValue,minValue,maxValue);
        gcdTest(1,minValue+1,minValue,minValue,maxValue-1);
        gcdTest(1,minValue+1,minValue,minValue,minValue);
        gcdTest(1,minValue+1,minValue,minValue,minValue+1);


        gcdTest(1,minValue+1,minValue,minValue+1,-1);
        gcdTest(1,minValue+1,minValue,minValue+1,0);
        gcdTest(1,minValue+1,minValue,minValue+1,1);
        gcdTest(1,minValue+1,minValue,minValue+1,maxValue);
        gcdTest(1,minValue+1,minValue,minValue+1,maxValue-1);
        gcdTest(1,minValue+1,minValue,minValue+1,minValue);
        gcdTest(1,minValue+1,minValue,minValue+1,minValue+1);


        gcdTest(1,minValue+1,minValue+1,-1,-1);
        gcdTest(1,minValue+1,minValue+1,-1,0);
        gcdTest(1,minValue+1,minValue+1,-1,1);
        gcdTest(1,minValue+1,minValue+1,-1,maxValue);
        gcdTest(1,minValue+1,minValue+1,-1,maxValue-1);
        gcdTest(1,minValue+1,minValue+1,-1,minValue);
        gcdTest(1,minValue+1,minValue+1,-1,minValue+1);


        gcdTest(1,minValue+1,minValue+1,0,-1);
        gcdTest(2147483646,minValue+1,minValue+1,0,0);
        gcdTest(1,minValue+1,minValue+1,0,1);
        gcdTest(1,minValue+1,minValue+1,0,maxValue);
        gcdTest(2147483646,minValue+1,minValue+1,0,maxValue-1);
        gcdTest(1,minValue+1,minValue+1,0,minValue);
        gcdTest(2147483646,minValue+1,minValue+1,0,minValue+1);


        gcdTest(1,minValue+1,minValue+1,1,-1);
        gcdTest(1,minValue+1,minValue+1,1,0);
        gcdTest(1,minValue+1,minValue+1,1,1);
        gcdTest(1,minValue+1,minValue+1,1,maxValue);
        gcdTest(1,minValue+1,minValue+1,1,maxValue-1);
        gcdTest(1,minValue+1,minValue+1,1,minValue);
        gcdTest(1,minValue+1,minValue+1,1,minValue+1);


        gcdTest(1,minValue+1,minValue+1,maxValue,-1);
        gcdTest(1,minValue+1,minValue+1,maxValue,0);
        gcdTest(1,minValue+1,minValue+1,maxValue,1);
        gcdTest(1,minValue+1,minValue+1,maxValue,maxValue);
        gcdTest(1,minValue+1,minValue+1,maxValue,maxValue-1);
        gcdTest(1,minValue+1,minValue+1,maxValue,minValue);
        gcdTest(1,minValue+1,minValue+1,maxValue,minValue+1);


        gcdTest(1,minValue+1,minValue+1,maxValue-1,-1);
        gcdTest(2147483646,minValue+1,minValue+1,maxValue-1,0);
        gcdTest(1,minValue+1,minValue+1,maxValue-1,1);
        gcdTest(1,minValue+1,minValue+1,maxValue-1,maxValue);
        gcdTest(2147483646,minValue+1,minValue+1,maxValue-1,maxValue-1);
        gcdTest(1,minValue+1,minValue+1,maxValue-1,minValue);
        gcdTest(2147483646,minValue+1,minValue+1,maxValue-1,minValue+1);


        gcdTest(1,minValue+1,minValue+1,minValue,-1);
        gcdTest(1,minValue+1,minValue+1,minValue,0);
        gcdTest(1,minValue+1,minValue+1,minValue,1);
        gcdTest(1,minValue+1,minValue+1,minValue,maxValue);
        gcdTest(1,minValue+1,minValue+1,minValue,maxValue-1);
        gcdTest(1,minValue+1,minValue+1,minValue,minValue);
        gcdTest(1,minValue+1,minValue+1,minValue,minValue+1);


        gcdTest(1,minValue+1,minValue+1,minValue+1,-1);
        gcdTest(2147483646,minValue+1,minValue+1,minValue+1,0);
        gcdTest(1,minValue+1,minValue+1,minValue+1,1);
        gcdTest(1,minValue+1,minValue+1,minValue+1,maxValue);
        gcdTest(2147483646,minValue+1,minValue+1,minValue+1,maxValue-1);
        gcdTest(1,minValue+1,minValue+1,minValue+1,minValue);
        gcdTest(2147483646,minValue+1,minValue+1,minValue+1,minValue+1);
        //endregion

    }

    /**
     * gcd(MIN, MIN, MIN, MIN)
     */
    @Test
    void gcdTest2() {


        gcdTest(2147483647, minValue, minValue, minValue, minValue);

        gcdTest(1, minValue, minValue, minValue, minValue + 1);
        gcdTest(1, minValue, minValue, minValue + 1, minValue);
        gcdTest(1, minValue, minValue + 1, minValue, minValue);
        gcdTest(1, minValue + 1, minValue, minValue, minValue);




    }

    /**
     * gcd(MAX, MAX, MAX, MIN)
     */
    @Test
    void gcdTest3() {
        gcdTest(2147483647, maxValue, maxValue, maxValue, minValue);

        gcdTest(1, maxValue, maxValue, maxValue, minValue + 1);
        gcdTest(1, maxValue, maxValue, maxValue - 1, minValue);
        gcdTest(1, maxValue, maxValue - 1, maxValue, minValue);
        gcdTest(1, maxValue - 1, maxValue, maxValue, minValue);
    }

    /**
     * gcd(MIN, MIN, MIN, MAX)
     */
    @Test
    void gcdTest4() {

        gcdTest(2147483647, minValue, minValue, minValue, maxValue);

        gcdTest(1, minValue, minValue, minValue, maxValue - 1);
        gcdTest(1, minValue, minValue, minValue + 1, maxValue);
        gcdTest(1, minValue, minValue + 1, minValue, maxValue);
        gcdTest(1, minValue + 1, minValue, minValue, maxValue);

    }

    /**
     * gcd(MAX, MAX, MIN, MAX)
     */
    @Test
    void gcdTest5() {

        gcdTest(2147483647, maxValue, maxValue, minValue, maxValue);

        gcdTest(1, maxValue, maxValue, minValue, maxValue - 1);
        gcdTest(2147483647, maxValue, maxValue, minValue + 1, maxValue);
        gcdTest(1, maxValue, maxValue - 1, minValue, maxValue);
        gcdTest(1, maxValue - 1, maxValue, minValue, maxValue);
    }

    /**
     * gcd(MIN, MIN, MAX, MIN)
     */
    @Test
    void gcdTest6() {
        gcdTest(1, minValue, minValue, maxValue, minValue);

        gcdTest(1, minValue, minValue, minValue, minValue + 1);
        gcdTest(1, minValue, minValue, maxValue - 1, minValue);
        gcdTest(1, minValue, minValue + 1, maxValue, minValue);
        gcdTest(1, minValue + 1, minValue, maxValue, minValue);

    }

    /**
     * gcd(MAX, MAX, MIN, MIN)
     */
    @Test
    void gcdTest7() {
        gcdTest(1, maxValue, maxValue, minValue, minValue);

        gcdTest(1, maxValue, maxValue, minValue, minValue + 1);
        gcdTest(1, maxValue, maxValue, minValue + 1, minValue);
        gcdTest(1, maxValue, maxValue - 1, minValue, minValue);
        gcdTest(1, maxValue - 1, maxValue, minValue, minValue);
    }

    /**
     * gcd(MIN, MIN, MAX, MAX)
     */
    @Test
    void gcdTest8() {
        gcdTest(1, minValue, minValue, maxValue, maxValue);

        gcdTest(1, minValue, minValue, maxValue, maxValue - 1);
        gcdTest(1, minValue, minValue, maxValue - 1, maxValue);
        gcdTest(1, minValue, minValue + 1, maxValue, maxValue);
        gcdTest(1, minValue + 1, minValue, maxValue, maxValue);

    }

    /**
     * gcd(MAX, MIN, MAX, MAX)
     */
    @Test
    void gcdTest9() {
        gcdTest(1, maxValue, minValue, maxValue, maxValue);

        gcdTest(1, maxValue, minValue, maxValue, maxValue - 1);
        gcdTest(1, maxValue, minValue, maxValue - 1, maxValue);
        gcdTest(2147483647, maxValue, minValue + 1, maxValue, maxValue);
        gcdTest(1, maxValue - 1, minValue, maxValue, maxValue);
    }

    /**
     * gcd(MAX, MIN, MAX, MIN)
     */
    @Test
    void gcdTest10() {

        gcdTest(1, minValue, maxValue, minValue, minValue);

        gcdTest(1, minValue, maxValue, minValue, minValue + 1);
        gcdTest(1, minValue, maxValue, minValue + 1, minValue);
        gcdTest(2, minValue, maxValue - 1, minValue, minValue);
        gcdTest(1, minValue + 1, maxValue, minValue, minValue);


    }

    /**
     * gcd(MAX, MAX, MAX, MAX)
     */
    @Test
    void gcdTest11() {

        gcdTest(1, maxValue, minValue, maxValue, minValue);

        gcdTest(1, maxValue, minValue, maxValue, minValue + 1);
        gcdTest(1, maxValue, minValue, maxValue - 1, maxValue);
        gcdTest(1, maxValue, minValue + 1, maxValue, minValue);
        gcdTest(1, maxValue - 1, minValue, maxValue, minValue);
    }

    /**
     * gcd(MIN, MAX, MIN, MAX)
     */
    @Test
    void gcdTest12() {

        gcdTest(1, minValue, maxValue, minValue, maxValue);

        gcdTest(1, minValue, maxValue, minValue, maxValue - 1);
        gcdTest(1, minValue, maxValue, minValue + 1, maxValue);
        gcdTest(1, minValue, maxValue - 1, minValue, maxValue);
        gcdTest(1, minValue + 1, maxValue, minValue, maxValue);

    }
    /**
     * gcd(MAX, MIN, MIN, MAX)
     */
    @Test
    void gcdTest13() {
        gcdTest(1, maxValue, minValue, minValue, maxValue);

        gcdTest(1, maxValue, minValue, minValue, maxValue - 1);
        gcdTest(1, maxValue, minValue, minValue + 1, maxValue);
        gcdTest(1, maxValue, minValue + 1, minValue, maxValue);
        gcdTest(1, maxValue - 1, minValue, minValue, maxValue);
    }

    /**
     * gcd(MIN, MAX, MAX, MIN)
     */
    @Test
    void gcdTest14() {
        gcdTest(1, minValue, maxValue, maxValue, minValue);

        gcdTest(1, minValue, maxValue, maxValue, minValue + 1);
        gcdTest(1, minValue, maxValue, maxValue - 1, minValue);
        gcdTest(1, minValue, maxValue - 1, maxValue, minValue);
        gcdTest(1, minValue + 1, maxValue, maxValue, minValue);


    }
    /**
     * gcd(MAX, MIN, MIN, MIN)
     */
    @Test
    void gcdTest15() {

        gcdTest(1, maxValue, minValue, minValue, minValue);

        gcdTest(1, maxValue, minValue, minValue, minValue + 1);
        gcdTest(1, maxValue, minValue, minValue + 1, minValue);
        gcdTest(1, maxValue, minValue + 1, minValue, minValue);
        gcdTest(2, maxValue - 1, minValue, minValue, minValue);
    }

    /**
     * gcd(MIN, MIN, MIN, MAX)
     */
    @Test
    void gcdTest16(){
        gcdTest(1, minValue, minValue, minValue, maxValue);

        gcdTest(2, minValue, minValue, minValue, maxValue - 1);
        gcdTest(1, minValue, minValue, minValue + 1, maxValue);
        gcdTest(1, minValue, minValue + 1, minValue, maxValue);
        gcdTest(1, minValue + 1, minValue, minValue, maxValue);





        //region граничные значения класса, MAX && 0
        gcdTest(1,-1,-1,-1,-1);
        gcdTest(1,-1,-1,-1,0);
        gcdTest(1,-1,-1,-1,1);
        gcdTest(1,-1,-1,-1,maxValue);
        gcdTest(1,-1,-1,-1,maxValue-1);
        gcdTest(1,-1,-1,-1,minValue);
        gcdTest(1,-1,-1,-1,minValue+1);


        gcdTest(1,-1,-1,0,-1);
        gcdTest(1,-1,-1,0,0);
        gcdTest(1,-1,-1,0,1);
        gcdTest(1,-1,-1,0,maxValue);
        gcdTest(1,-1,-1,0,maxValue-1);
        gcdTest(1,-1,-1,0,minValue);
        gcdTest(1,-1,-1,0,minValue+1);


        gcdTest(1,-1,-1,1,-1);
        gcdTest(1,-1,-1,1,0);
        gcdTest(1,-1,-1,1,1);
        gcdTest(1,-1,-1,1,maxValue);
        gcdTest(1,-1,-1,1,maxValue-1);
        gcdTest(1,-1,-1,1,minValue);
        gcdTest(1,-1,-1,1,minValue+1);


        gcdTest(1,-1,-1,maxValue,-1);
        gcdTest(1,-1,-1,maxValue,0);
        gcdTest(1,-1,-1,maxValue,1);
        gcdTest(1,-1,-1,maxValue,maxValue);
        gcdTest(1,-1,-1,maxValue,maxValue-1);
        gcdTest(1,-1,-1,maxValue,minValue);
        gcdTest(1,-1,-1,maxValue,minValue+1);


        gcdTest(1,-1,-1,maxValue-1,-1);
        gcdTest(1,-1,-1,maxValue-1,0);
        gcdTest(1,-1,-1,maxValue-1,1);
        gcdTest(1,-1,-1,maxValue-1,maxValue);
        gcdTest(1,-1,-1,maxValue-1,maxValue-1);
        gcdTest(1,-1,-1,maxValue-1,minValue);
        gcdTest(1,-1,-1,maxValue-1,minValue+1);


        gcdTest(1,-1,-1,minValue,-1);
        gcdTest(1,-1,-1,minValue,0);
        gcdTest(1,-1,-1,minValue,1);
        gcdTest(1,-1,-1,minValue,maxValue);
        gcdTest(1,-1,-1,minValue,maxValue-1);
        gcdTest(1,-1,-1,minValue,minValue);
        gcdTest(1,-1,-1,minValue,minValue+1);


        gcdTest(1,-1,-1,minValue+1,-1);
        gcdTest(1,-1,-1,minValue+1,0);
        gcdTest(1,-1,-1,minValue+1,1);
        gcdTest(1,-1,-1,minValue+1,maxValue);
        gcdTest(1,-1,-1,minValue+1,maxValue-1);
        gcdTest(1,-1,-1,minValue+1,minValue);
        gcdTest(1,-1,-1,minValue+1,minValue+1);


        gcdTest(1,-1,0,-1,-1);
        gcdTest(1,-1,0,-1,0);
        gcdTest(1,-1,0,-1,1);
        gcdTest(1,-1,0,-1,maxValue);
        gcdTest(1,-1,0,-1,maxValue-1);
        gcdTest(1,-1,0,-1,minValue);
        gcdTest(1,-1,0,-1,minValue+1);


        gcdTest(1,-1,0,0,-1);
        gcdTest(1,-1,0,0,0);
        gcdTest(1,-1,0,0,1);
        gcdTest(1,-1,0,0,maxValue);
        gcdTest(1,-1,0,0,maxValue-1);
        gcdTest(1,-1,0,0,minValue);
        gcdTest(1,-1,0,0,minValue+1);


        gcdTest(1,-1,0,1,-1);
        gcdTest(1,-1,0,1,0);
        gcdTest(1,-1,0,1,1);
        gcdTest(1,-1,0,1,maxValue);
        gcdTest(1,-1,0,1,maxValue-1);
        gcdTest(1,-1,0,1,minValue);
        gcdTest(1,-1,0,1,minValue+1);


        gcdTest(1,-1,0,maxValue,-1);
        gcdTest(1,-1,0,maxValue,0);
        gcdTest(1,-1,0,maxValue,1);
        gcdTest(1,-1,0,maxValue,maxValue);
        gcdTest(1,-1,0,maxValue,maxValue-1);
        gcdTest(1,-1,0,maxValue,minValue);
        gcdTest(1,-1,0,maxValue,minValue+1);


        gcdTest(1,-1,0,maxValue-1,-1);
        gcdTest(1,-1,0,maxValue-1,0);
        gcdTest(1,-1,0,maxValue-1,1);
        gcdTest(1,-1,0,maxValue-1,maxValue);
        gcdTest(1,-1,0,maxValue-1,maxValue-1);
        gcdTest(1,-1,0,maxValue-1,minValue);
        gcdTest(1,-1,0,maxValue-1,minValue+1);


        gcdTest(1,-1,0,minValue,-1);
        gcdTest(1,-1,0,minValue,0);
        gcdTest(1,-1,0,minValue,1);
        gcdTest(1,-1,0,minValue,maxValue);
        gcdTest(1,-1,0,minValue,maxValue-1);
        gcdTest(1,-1,0,minValue,minValue);
        gcdTest(1,-1,0,minValue,minValue+1);


        gcdTest(1,-1,0,minValue+1,-1);
        gcdTest(1,-1,0,minValue+1,0);
        gcdTest(1,-1,0,minValue+1,1);
        gcdTest(1,-1,0,minValue+1,maxValue);
        gcdTest(1,-1,0,minValue+1,maxValue-1);
        gcdTest(1,-1,0,minValue+1,minValue);
        gcdTest(1,-1,0,minValue+1,minValue+1);


        gcdTest(1,-1,1,-1,-1);
        gcdTest(1,-1,1,-1,0);
        gcdTest(1,-1,1,-1,1);
        gcdTest(1,-1,1,-1,maxValue);
        gcdTest(1,-1,1,-1,maxValue-1);
        gcdTest(1,-1,1,-1,minValue);
        gcdTest(1,-1,1,-1,minValue+1);


        gcdTest(1,-1,1,0,-1);
        gcdTest(1,-1,1,0,0);
        gcdTest(1,-1,1,0,1);
        gcdTest(1,-1,1,0,maxValue);
        gcdTest(1,-1,1,0,maxValue-1);
        gcdTest(1,-1,1,0,minValue);
        gcdTest(1,-1,1,0,minValue+1);


        gcdTest(1,-1,1,1,-1);
        gcdTest(1,-1,1,1,0);
        gcdTest(1,-1,1,1,1);
        gcdTest(1,-1,1,1,maxValue);
        gcdTest(1,-1,1,1,maxValue-1);
        gcdTest(1,-1,1,1,minValue);
        gcdTest(1,-1,1,1,minValue+1);


        gcdTest(1,-1,1,maxValue,-1);
        gcdTest(1,-1,1,maxValue,0);
        gcdTest(1,-1,1,maxValue,1);
        gcdTest(1,-1,1,maxValue,maxValue);
        gcdTest(1,-1,1,maxValue,maxValue-1);
        gcdTest(1,-1,1,maxValue,minValue);
        gcdTest(1,-1,1,maxValue,minValue+1);


        gcdTest(1,-1,1,maxValue-1,-1);
        gcdTest(1,-1,1,maxValue-1,0);
        gcdTest(1,-1,1,maxValue-1,1);
        gcdTest(1,-1,1,maxValue-1,maxValue);
        gcdTest(1,-1,1,maxValue-1,maxValue-1);
        gcdTest(1,-1,1,maxValue-1,minValue);
        gcdTest(1,-1,1,maxValue-1,minValue+1);


        gcdTest(1,-1,1,minValue,-1);
        gcdTest(1,-1,1,minValue,0);
        gcdTest(1,-1,1,minValue,1);
        gcdTest(1,-1,1,minValue,maxValue);
        gcdTest(1,-1,1,minValue,maxValue-1);
        gcdTest(1,-1,1,minValue,minValue);
        gcdTest(1,-1,1,minValue,minValue+1);


        gcdTest(1,-1,1,minValue+1,-1);
        gcdTest(1,-1,1,minValue+1,0);
        gcdTest(1,-1,1,minValue+1,1);
        gcdTest(1,-1,1,minValue+1,maxValue);
        gcdTest(1,-1,1,minValue+1,maxValue-1);
        gcdTest(1,-1,1,minValue+1,minValue);
        gcdTest(1,-1,1,minValue+1,minValue+1);


        gcdTest(1,-1,maxValue,-1,-1);
        gcdTest(1,-1,maxValue,-1,0);
        gcdTest(1,-1,maxValue,-1,1);
        gcdTest(1,-1,maxValue,-1,maxValue);
        gcdTest(1,-1,maxValue,-1,maxValue-1);
        gcdTest(1,-1,maxValue,-1,minValue);
        gcdTest(1,-1,maxValue,-1,minValue+1);


        gcdTest(1,-1,maxValue,0,-1);
        gcdTest(1,-1,maxValue,0,0);
        gcdTest(1,-1,maxValue,0,1);
        gcdTest(1,-1,maxValue,0,maxValue);
        gcdTest(1,-1,maxValue,0,maxValue-1);
        gcdTest(1,-1,maxValue,0,minValue);
        gcdTest(1,-1,maxValue,0,minValue+1);


        gcdTest(1,-1,maxValue,1,-1);
        gcdTest(1,-1,maxValue,1,0);
        gcdTest(1,-1,maxValue,1,1);
        gcdTest(1,-1,maxValue,1,maxValue);
        gcdTest(1,-1,maxValue,1,maxValue-1);
        gcdTest(1,-1,maxValue,1,minValue);
        gcdTest(1,-1,maxValue,1,minValue+1);


        gcdTest(1,-1,maxValue,maxValue,-1);
        gcdTest(1,-1,maxValue,maxValue,0);
        gcdTest(1,-1,maxValue,maxValue,1);
        gcdTest(1,-1,maxValue,maxValue,maxValue);
        gcdTest(1,-1,maxValue,maxValue,maxValue-1);
        gcdTest(1,-1,maxValue,maxValue,minValue);
        gcdTest(1,-1,maxValue,maxValue,minValue+1);


        gcdTest(1,-1,maxValue,maxValue-1,-1);
        gcdTest(1,-1,maxValue,maxValue-1,0);
        gcdTest(1,-1,maxValue,maxValue-1,1);
        gcdTest(1,-1,maxValue,maxValue-1,maxValue);
        gcdTest(1,-1,maxValue,maxValue-1,maxValue-1);
        gcdTest(1,-1,maxValue,maxValue-1,minValue);
        gcdTest(1,-1,maxValue,maxValue-1,minValue+1);


        gcdTest(1,-1,maxValue,minValue,-1);
        gcdTest(1,-1,maxValue,minValue,0);
        gcdTest(1,-1,maxValue,minValue,1);
        gcdTest(1,-1,maxValue,minValue,maxValue);
        gcdTest(1,-1,maxValue,minValue,maxValue-1);
        gcdTest(1,-1,maxValue,minValue,minValue);
        gcdTest(1,-1,maxValue,minValue,minValue+1);


        gcdTest(1,-1,maxValue,minValue+1,-1);
        gcdTest(1,-1,maxValue,minValue+1,0);
        gcdTest(1,-1,maxValue,minValue+1,1);
        gcdTest(1,-1,maxValue,minValue+1,maxValue);
        gcdTest(1,-1,maxValue,minValue+1,maxValue-1);
        gcdTest(1,-1,maxValue,minValue+1,minValue);
        gcdTest(1,-1,maxValue,minValue+1,minValue+1);


        gcdTest(1,-1,maxValue-1,-1,-1);
        gcdTest(1,-1,maxValue-1,-1,0);
        gcdTest(1,-1,maxValue-1,-1,1);
        gcdTest(1,-1,maxValue-1,-1,maxValue);
        gcdTest(1,-1,maxValue-1,-1,maxValue-1);
        gcdTest(1,-1,maxValue-1,-1,minValue);
        gcdTest(1,-1,maxValue-1,-1,minValue+1);


        gcdTest(1,-1,maxValue-1,0,-1);
        gcdTest(1,-1,maxValue-1,0,0);
        gcdTest(1,-1,maxValue-1,0,1);
        gcdTest(1,-1,maxValue-1,0,maxValue);
        gcdTest(1,-1,maxValue-1,0,maxValue-1);
        gcdTest(1,-1,maxValue-1,0,minValue);
        gcdTest(1,-1,maxValue-1,0,minValue+1);


        gcdTest(1,-1,maxValue-1,1,-1);
        gcdTest(1,-1,maxValue-1,1,0);
        gcdTest(1,-1,maxValue-1,1,1);
        gcdTest(1,-1,maxValue-1,1,maxValue);
        gcdTest(1,-1,maxValue-1,1,maxValue-1);
        gcdTest(1,-1,maxValue-1,1,minValue);
        gcdTest(1,-1,maxValue-1,1,minValue+1);


        gcdTest(1,-1,maxValue-1,maxValue,-1);
        gcdTest(1,-1,maxValue-1,maxValue,0);
        gcdTest(1,-1,maxValue-1,maxValue,1);
        gcdTest(1,-1,maxValue-1,maxValue,maxValue);
        gcdTest(1,-1,maxValue-1,maxValue,maxValue-1);
        gcdTest(1,-1,maxValue-1,maxValue,minValue);
        gcdTest(1,-1,maxValue-1,maxValue,minValue+1);


        gcdTest(1,-1,maxValue-1,maxValue-1,-1);
        gcdTest(1,-1,maxValue-1,maxValue-1,0);
        gcdTest(1,-1,maxValue-1,maxValue-1,1);
        gcdTest(1,-1,maxValue-1,maxValue-1,maxValue);
        gcdTest(1,-1,maxValue-1,maxValue-1,maxValue-1);
        gcdTest(1,-1,maxValue-1,maxValue-1,minValue);
        gcdTest(1,-1,maxValue-1,maxValue-1,minValue+1);


        gcdTest(1,-1,maxValue-1,minValue,-1);
        gcdTest(1,-1,maxValue-1,minValue,0);
        gcdTest(1,-1,maxValue-1,minValue,1);
        gcdTest(1,-1,maxValue-1,minValue,maxValue);
        gcdTest(1,-1,maxValue-1,minValue,maxValue-1);
        gcdTest(1,-1,maxValue-1,minValue,minValue);
        gcdTest(1,-1,maxValue-1,minValue,minValue+1);


        gcdTest(1,-1,maxValue-1,minValue+1,-1);
        gcdTest(1,-1,maxValue-1,minValue+1,0);
        gcdTest(1,-1,maxValue-1,minValue+1,1);
        gcdTest(1,-1,maxValue-1,minValue+1,maxValue);
        gcdTest(1,-1,maxValue-1,minValue+1,maxValue-1);
        gcdTest(1,-1,maxValue-1,minValue+1,minValue);
        gcdTest(1,-1,maxValue-1,minValue+1,minValue+1);


        gcdTest(1,-1,minValue,-1,-1);
        gcdTest(1,-1,minValue,-1,0);
        gcdTest(1,-1,minValue,-1,1);
        gcdTest(1,-1,minValue,-1,maxValue);
        gcdTest(1,-1,minValue,-1,maxValue-1);
        gcdTest(1,-1,minValue,-1,minValue);
        gcdTest(1,-1,minValue,-1,minValue+1);


        gcdTest(1,-1,minValue,0,-1);
        gcdTest(1,-1,minValue,0,0);
        gcdTest(1,-1,minValue,0,1);
        gcdTest(1,-1,minValue,0,maxValue);
        gcdTest(1,-1,minValue,0,maxValue-1);
        gcdTest(1,-1,minValue,0,minValue);
        gcdTest(1,-1,minValue,0,minValue+1);


        gcdTest(1,-1,minValue,1,-1);
        gcdTest(1,-1,minValue,1,0);
        gcdTest(1,-1,minValue,1,1);
        gcdTest(1,-1,minValue,1,maxValue);
        gcdTest(1,-1,minValue,1,maxValue-1);
        gcdTest(1,-1,minValue,1,minValue);
        gcdTest(1,-1,minValue,1,minValue+1);


        gcdTest(1,-1,minValue,maxValue,-1);
        gcdTest(1,-1,minValue,maxValue,0);
        gcdTest(1,-1,minValue,maxValue,1);
        gcdTest(1,-1,minValue,maxValue,maxValue);
        gcdTest(1,-1,minValue,maxValue,maxValue-1);
        gcdTest(1,-1,minValue,maxValue,minValue);
        gcdTest(1,-1,minValue,maxValue,minValue+1);


        gcdTest(1,-1,minValue,maxValue-1,-1);
        gcdTest(1,-1,minValue,maxValue-1,0);
        gcdTest(1,-1,minValue,maxValue-1,1);
        gcdTest(1,-1,minValue,maxValue-1,maxValue);
        gcdTest(1,-1,minValue,maxValue-1,maxValue-1);
        gcdTest(1,-1,minValue,maxValue-1,minValue);
        gcdTest(1,-1,minValue,maxValue-1,minValue+1);


        gcdTest(1,-1,minValue,minValue,-1);
        gcdTest(1,-1,minValue,minValue,0);
        gcdTest(1,-1,minValue,minValue,1);
        gcdTest(1,-1,minValue,minValue,maxValue);
        gcdTest(1,-1,minValue,minValue,maxValue-1);
        gcdTest(1,-1,minValue,minValue,minValue);
        gcdTest(1,-1,minValue,minValue,minValue+1);


        gcdTest(1,-1,minValue,minValue+1,-1);
        gcdTest(1,-1,minValue,minValue+1,0);
        gcdTest(1,-1,minValue,minValue+1,1);
        gcdTest(1,-1,minValue,minValue+1,maxValue);
        gcdTest(1,-1,minValue,minValue+1,maxValue-1);
        gcdTest(1,-1,minValue,minValue+1,minValue);
        gcdTest(1,-1,minValue,minValue+1,minValue+1);


        gcdTest(1,-1,minValue+1,-1,-1);
        gcdTest(1,-1,minValue+1,-1,0);
        gcdTest(1,-1,minValue+1,-1,1);
        gcdTest(1,-1,minValue+1,-1,maxValue);
        gcdTest(1,-1,minValue+1,-1,maxValue-1);
        gcdTest(1,-1,minValue+1,-1,minValue);
        gcdTest(1,-1,minValue+1,-1,minValue+1);


        gcdTest(1,-1,minValue+1,0,-1);
        gcdTest(1,-1,minValue+1,0,0);
        gcdTest(1,-1,minValue+1,0,1);
        gcdTest(1,-1,minValue+1,0,maxValue);
        gcdTest(1,-1,minValue+1,0,maxValue-1);
        gcdTest(1,-1,minValue+1,0,minValue);
        gcdTest(1,-1,minValue+1,0,minValue+1);


        gcdTest(1,-1,minValue+1,1,-1);
        gcdTest(1,-1,minValue+1,1,0);
        gcdTest(1,-1,minValue+1,1,1);
        gcdTest(1,-1,minValue+1,1,maxValue);
        gcdTest(1,-1,minValue+1,1,maxValue-1);
        gcdTest(1,-1,minValue+1,1,minValue);
        gcdTest(1,-1,minValue+1,1,minValue+1);


        gcdTest(1,-1,minValue+1,maxValue,-1);
        gcdTest(1,-1,minValue+1,maxValue,0);
        gcdTest(1,-1,minValue+1,maxValue,1);
        gcdTest(1,-1,minValue+1,maxValue,maxValue);
        gcdTest(1,-1,minValue+1,maxValue,maxValue-1);
        gcdTest(1,-1,minValue+1,maxValue,minValue);
        gcdTest(1,-1,minValue+1,maxValue,minValue+1);


        gcdTest(1,-1,minValue+1,maxValue-1,-1);
        gcdTest(1,-1,minValue+1,maxValue-1,0);
        gcdTest(1,-1,minValue+1,maxValue-1,1);
        gcdTest(1,-1,minValue+1,maxValue-1,maxValue);
        gcdTest(1,-1,minValue+1,maxValue-1,maxValue-1);
        gcdTest(1,-1,minValue+1,maxValue-1,minValue);
        gcdTest(1,-1,minValue+1,maxValue-1,minValue+1);


        gcdTest(1,-1,minValue+1,minValue,-1);
        gcdTest(1,-1,minValue+1,minValue,0);
        gcdTest(1,-1,minValue+1,minValue,1);



        gcdTest(1,-1,minValue+1,minValue,maxValue);
        gcdTest(1,-1,minValue+1,minValue,maxValue-1);
        gcdTest(1,-1,minValue+1,minValue,minValue);
        gcdTest(1,-1,minValue+1,minValue,minValue+1);


        gcdTest(1,-1,minValue+1,minValue+1,-1);
        gcdTest(1,-1,minValue+1,minValue+1,0);
        gcdTest(1,-1,minValue+1,minValue+1,1);
        gcdTest(1,-1,minValue+1,minValue+1,maxValue);
        gcdTest(1,-1,minValue+1,minValue+1,maxValue-1);
        gcdTest(1,-1,minValue+1,minValue+1,minValue);
        gcdTest(1,-1,minValue+1,minValue+1,minValue+1);
        //endregion

        //region граничные значения класса, MAX && 0
        gcdTest(1,0,-1,-1,-1);
        gcdTest(1,0,-1,-1,0);
        gcdTest(1,0,-1,-1,1);
        gcdTest(1,0,-1,-1,maxValue);
        gcdTest(1,0,-1,-1,maxValue-1);
        gcdTest(1,0,-1,-1,minValue);
        gcdTest(1,0,-1,-1,minValue+1);


        gcdTest(1,0,-1,0,-1);
        gcdTest(1,0,-1,0,0);
        gcdTest(1,0,-1,0,1);
        gcdTest(1,0,-1,0,maxValue);
        gcdTest(1,0,-1,0,maxValue-1);
        gcdTest(1,0,-1,0,minValue);
        gcdTest(1,0,-1,0,minValue+1);


        gcdTest(1,0,-1,1,-1);
        gcdTest(1,0,-1,1,0);
        gcdTest(1,0,-1,1,1);
        gcdTest(1,0,-1,1,maxValue);
        gcdTest(1,0,-1,1,maxValue-1);
        gcdTest(1,0,-1,1,minValue);
        gcdTest(1,0,-1,1,minValue+1);


        gcdTest(1,0,-1,maxValue,-1);
        gcdTest(1,0,-1,maxValue,0);
        gcdTest(1,0,-1,maxValue,1);
        gcdTest(1,0,-1,maxValue,maxValue);
        gcdTest(1,0,-1,maxValue,maxValue-1);
        gcdTest(1,0,-1,maxValue,minValue);
        gcdTest(1,0,-1,maxValue,minValue+1);


        gcdTest(1,0,-1,maxValue-1,-1);
        gcdTest(1,0,-1,maxValue-1,0);
        gcdTest(1,0,-1,maxValue-1,1);
        gcdTest(1,0,-1,maxValue-1,maxValue);
        gcdTest(1,0,-1,maxValue-1,maxValue-1);
        gcdTest(1,0,-1,maxValue-1,minValue);
        gcdTest(1,0,-1,maxValue-1,minValue+1);


        gcdTest(1,0,-1,minValue,-1);
        gcdTest(1,0,-1,minValue,0);
        gcdTest(1,0,-1,minValue,1);
        gcdTest(1,0,-1,minValue,maxValue);
        gcdTest(1,0,-1,minValue,maxValue-1);
        gcdTest(1,0,-1,minValue,minValue);
        gcdTest(1,0,-1,minValue,minValue+1);


        gcdTest(1,0,-1,minValue+1,-1);
        gcdTest(1,0,-1,minValue+1,0);
        gcdTest(1,0,-1,minValue+1,1);
        gcdTest(1,0,-1,minValue+1,maxValue);
        gcdTest(1,0,-1,minValue+1,maxValue-1);
        gcdTest(1,0,-1,minValue+1,minValue);
        gcdTest(1,0,-1,minValue+1,minValue+1);


        gcdTest(1,0,0,-1,-1);
        gcdTest(1,0,0,-1,0);
        gcdTest(1,0,0,-1,1);
        gcdTest(1,0,0,-1,maxValue);
        gcdTest(1,0,0,-1,maxValue-1);
        gcdTest(1,0,0,-1,minValue);
        gcdTest(1,0,0,-1,minValue+1);


        gcdTest(1,0,0,0,-1);
        gcdTest(0,0,0,0,0);
        gcdTest(1,0,0,0,1);
        gcdTest(2147483647,0,0,0,maxValue);
        gcdTest(2147483646,0,0,0,maxValue-1);
        gcdTest(2147483647,0,0,0,minValue);
        gcdTest(2147483646,0,0,0,minValue+1);


        gcdTest(1,0,0,1,-1);
        gcdTest(1,0,0,1,0);
        gcdTest(1,0,0,1,1);
        gcdTest(1,0,0,1,maxValue);
        gcdTest(1,0,0,1,maxValue-1);
        gcdTest(1,0,0,1,minValue);
        gcdTest(1,0,0,1,minValue+1);


        gcdTest(1,0,0,maxValue,-1);
        gcdTest(2147483647,0,0,maxValue,0);
        gcdTest(1,0,0,maxValue,1);
        gcdTest(2147483647,0,0,maxValue,maxValue);
        gcdTest(1,0,0,maxValue,maxValue-1);
        gcdTest(2147483647,0,0,maxValue,minValue);
        gcdTest(1,0,0,maxValue,minValue+1);


        gcdTest(1,0,0,maxValue-1,-1);
        gcdTest(2147483646,0,0,maxValue-1,0);
        gcdTest(1,0,0,maxValue-1,1);
        gcdTest(1,0,0,maxValue-1,maxValue);
        gcdTest(2147483646,0,0,maxValue-1,maxValue-1);
        gcdTest(1,0,0,maxValue-1,minValue);
        gcdTest(2147483646,0,0,maxValue-1,minValue+1);


        gcdTest(1,0,0,minValue,-1);
        gcdTest(2147483647,0,0,minValue,0);
        gcdTest(1,0,0,minValue,1);
        gcdTest(2147483647,0,0,minValue,maxValue);
        gcdTest(1,0,0,minValue,maxValue-1);
        gcdTest(2147483647,0,0,minValue,minValue);
        gcdTest(1,0,0,minValue,minValue+1);


        gcdTest(1,0,0,minValue+1,-1);
        gcdTest(2147483646,0,0,minValue+1,0);
        gcdTest(1,0,0,minValue+1,1);
        gcdTest(1,0,0,minValue+1,maxValue);
        gcdTest(2147483646,0,0,minValue+1,maxValue-1);
        gcdTest(1,0,0,minValue+1,minValue);
        gcdTest(2147483646,0,0,minValue+1,minValue+1);


        gcdTest(1,0,1,-1,-1);
        gcdTest(1,0,1,-1,0);
        gcdTest(1,0,1,-1,1);
        gcdTest(1,0,1,-1,maxValue);
        gcdTest(1,0,1,-1,maxValue-1);
        gcdTest(1,0,1,-1,minValue);
        gcdTest(1,0,1,-1,minValue+1);


        gcdTest(1,0,1,0,-1);
        gcdTest(1,0,1,0,0);
        gcdTest(1,0,1,0,1);
        gcdTest(1,0,1,0,maxValue);
        gcdTest(1,0,1,0,maxValue-1);
        gcdTest(1,0,1,0,minValue);
        gcdTest(1,0,1,0,minValue+1);


        gcdTest(1,0,1,1,-1);
        gcdTest(1,0,1,1,0);
        gcdTest(1,0,1,1,1);
        gcdTest(1,0,1,1,maxValue);
        gcdTest(1,0,1,1,maxValue-1);
        gcdTest(1,0,1,1,minValue);
        gcdTest(1,0,1,1,minValue+1);


        gcdTest(1,0,1,maxValue,-1);
        gcdTest(1,0,1,maxValue,0);
        gcdTest(1,0,1,maxValue,1);
        gcdTest(1,0,1,maxValue,maxValue);
        gcdTest(1,0,1,maxValue,maxValue-1);
        gcdTest(1,0,1,maxValue,minValue);
        gcdTest(1,0,1,maxValue,minValue+1);


        gcdTest(1,0,1,maxValue-1,-1);
        gcdTest(1,0,1,maxValue-1,0);
        gcdTest(1,0,1,maxValue-1,1);
        gcdTest(1,0,1,maxValue-1,maxValue);
        gcdTest(1,0,1,maxValue-1,maxValue-1);
        gcdTest(1,0,1,maxValue-1,minValue);
        gcdTest(1,0,1,maxValue-1,minValue+1);


        gcdTest(1,0,1,minValue,-1);
        gcdTest(1,0,1,minValue,0);
        gcdTest(1,0,1,minValue,1);
        gcdTest(1,0,1,minValue,maxValue);
        gcdTest(1,0,1,minValue,maxValue-1);
        gcdTest(1,0,1,minValue,minValue);
        gcdTest(1,0,1,minValue,minValue+1);


        gcdTest(1,0,1,minValue+1,-1);
        gcdTest(1,0,1,minValue+1,0);
        gcdTest(1,0,1,minValue+1,1);
        gcdTest(1,0,1,minValue+1,maxValue);
        gcdTest(1,0,1,minValue+1,maxValue-1);
        gcdTest(1,0,1,minValue+1,minValue);
        gcdTest(1,0,1,minValue+1,minValue+1);


        gcdTest(1,0,maxValue,-1,-1);
        gcdTest(1,0,maxValue,-1,0);
        gcdTest(1,0,maxValue,-1,1);
        gcdTest(1,0,maxValue,-1,maxValue);
        gcdTest(1,0,maxValue,-1,maxValue-1);
        gcdTest(1,0,maxValue,-1,minValue);
        gcdTest(1,0,maxValue,-1,minValue+1);


        gcdTest(1,0,maxValue,0,-1);
        gcdTest(2147483647,0,maxValue,0,0);
        gcdTest(1,0,maxValue,0,1);
        gcdTest(2147483647,0,maxValue,0,maxValue);
        gcdTest(1,0,maxValue,0,maxValue-1);
        gcdTest(2147483647,0,maxValue,0,minValue);
        gcdTest(1,0,maxValue,0,minValue+1);


        gcdTest(1,0,maxValue,1,-1);
        gcdTest(1,0,maxValue,1,0);
        gcdTest(1,0,maxValue,1,1);
        gcdTest(1,0,maxValue,1,maxValue);
        gcdTest(1,0,maxValue,1,maxValue-1);
        gcdTest(1,0,maxValue,1,minValue);
        gcdTest(1,0,maxValue,1,minValue+1);


        gcdTest(1,0,maxValue,maxValue,-1);
        gcdTest(2147483647,0,maxValue,maxValue,0);
        gcdTest(1,0,maxValue,maxValue,1);
        gcdTest(2147483647,0,maxValue,maxValue,maxValue);
        gcdTest(1,0,maxValue,maxValue,maxValue-1);
        gcdTest(2147483647,0,maxValue,maxValue,minValue);
        gcdTest(1,0,maxValue,maxValue,minValue+1);


        gcdTest(1,0,maxValue,maxValue-1,-1);
        gcdTest(1,0,maxValue,maxValue-1,0);
        gcdTest(1,0,maxValue,maxValue-1,1);
        gcdTest(1,0,maxValue,maxValue-1,maxValue);
        gcdTest(1,0,maxValue,maxValue-1,maxValue-1);
        gcdTest(1,0,maxValue,maxValue-1,minValue);
        gcdTest(1,0,maxValue,maxValue-1,minValue+1);


        gcdTest(1,0,maxValue,minValue,-1);
        gcdTest(2147483647,0,maxValue,minValue,0);
        gcdTest(1,0,maxValue,minValue,1);
        gcdTest(2147483647,0,maxValue,minValue,maxValue);
        gcdTest(1,0,maxValue,minValue,maxValue-1);
        gcdTest(2147483647,0,maxValue,minValue,minValue);
        gcdTest(1,0,maxValue,minValue,minValue+1);


        gcdTest(1,0,maxValue,minValue+1,-1);
        gcdTest(1,0,maxValue,minValue+1,0);
        gcdTest(1,0,maxValue,minValue+1,1);
        gcdTest(1,0,maxValue,minValue+1,maxValue);
        gcdTest(1,0,maxValue,minValue+1,maxValue-1);
        gcdTest(1,0,maxValue,minValue+1,minValue);
        gcdTest(1,0,maxValue,minValue+1,minValue+1);


        gcdTest(1,0,maxValue-1,-1,-1);
        gcdTest(1,0,maxValue-1,-1,0);
        gcdTest(1,0,maxValue-1,-1,1);
        gcdTest(1,0,maxValue-1,-1,maxValue);
        gcdTest(1,0,maxValue-1,-1,maxValue-1);
        gcdTest(1,0,maxValue-1,-1,minValue);
        gcdTest(1,0,maxValue-1,-1,minValue+1);


        gcdTest(1,0,maxValue-1,0,-1);
        gcdTest(2147483646,0,maxValue-1,0,0);
        gcdTest(1,0,maxValue-1,0,1);
        gcdTest(1,0,maxValue-1,0,maxValue);
        gcdTest(2147483646,0,maxValue-1,0,maxValue-1);
        gcdTest(1,0,maxValue-1,0,minValue);
        gcdTest(2147483646,0,maxValue-1,0,minValue+1);


        gcdTest(1,0,maxValue-1,1,-1);
        gcdTest(1,0,maxValue-1,1,0);
        gcdTest(1,0,maxValue-1,1,1);
        gcdTest(1,0,maxValue-1,1,maxValue);
        gcdTest(1,0,maxValue-1,1,maxValue-1);
        gcdTest(1,0,maxValue-1,1,minValue);
        gcdTest(1,0,maxValue-1,1,minValue+1);


        gcdTest(1,0,maxValue-1,maxValue,-1);
        gcdTest(1,0,maxValue-1,maxValue,0);
        gcdTest(1,0,maxValue-1,maxValue,1);
        gcdTest(1,0,maxValue-1,maxValue,maxValue);
        gcdTest(1,0,maxValue-1,maxValue,maxValue-1);
        gcdTest(1,0,maxValue-1,maxValue,minValue);
        gcdTest(1,0,maxValue-1,maxValue,minValue+1);


        gcdTest(1,0,maxValue-1,maxValue-1,-1);
        gcdTest(2147483646,0,maxValue-1,maxValue-1,0);
        gcdTest(1,0,maxValue-1,maxValue-1,1);
        gcdTest(1,0,maxValue-1,maxValue-1,maxValue);
        gcdTest(2147483646,0,maxValue-1,maxValue-1,maxValue-1);
        gcdTest(1,0,maxValue-1,maxValue-1,minValue);
        gcdTest(2147483646,0,maxValue-1,maxValue-1,minValue+1);


        gcdTest(1,0,maxValue-1,minValue,-1);
        gcdTest(1,0,maxValue-1,minValue,0);
        gcdTest(1,0,maxValue-1,minValue,1);
        gcdTest(1,0,maxValue-1,minValue,maxValue);
        gcdTest(1,0,maxValue-1,minValue,maxValue-1);
        gcdTest(1,0,maxValue-1,minValue,minValue);
        gcdTest(1,0,maxValue-1,minValue,minValue+1);
        gcdTest(1,0,maxValue-1,minValue+1,-1);


        gcdTest(2147483646,0,maxValue-1,minValue+1,0);
        gcdTest(1,0,maxValue-1,minValue+1,1);
        gcdTest(1,0,maxValue-1,minValue+1,maxValue);
        gcdTest(2147483646,0,maxValue-1,minValue+1,maxValue-1);
        gcdTest(1,0,maxValue-1,minValue+1,minValue);
        gcdTest(2147483646,0,maxValue-1,minValue+1,minValue+1);


        gcdTest(1,0,minValue,-1,-1);
        gcdTest(1,0,minValue,-1,0);
        gcdTest(1,0,minValue,-1,1);
        gcdTest(1,0,minValue,-1,maxValue);
        gcdTest(1,0,minValue,-1,maxValue-1);
        gcdTest(1,0,minValue,-1,minValue);
        gcdTest(1,0,minValue,-1,minValue+1);


        gcdTest(1,0,minValue,0,-1);
        gcdTest(2147483647,0,minValue,0,0);
        gcdTest(1,0,minValue,0,1);
        gcdTest(2147483647,0,minValue,0,maxValue);
        gcdTest(1,0,minValue,0,maxValue-1);
        gcdTest(2147483647,0,minValue,0,minValue);
        gcdTest(1,0,minValue,0,minValue+1);


        gcdTest(1,0,minValue,1,-1);
        gcdTest(1,0,minValue,1,0);
        gcdTest(1,0,minValue,1,1);
        gcdTest(1,0,minValue,1,maxValue);
        gcdTest(1,0,minValue,1,maxValue-1);
        gcdTest(1,0,minValue,1,minValue);
        gcdTest(1,0,minValue,1,minValue+1);


        gcdTest(1,0,minValue,maxValue,-1);
        gcdTest(2147483647,0,minValue,maxValue,0);
        gcdTest(1,0,minValue,maxValue,1);
        gcdTest(2147483647,0,minValue,maxValue,maxValue);
        gcdTest(1,0,minValue,maxValue,maxValue-1);
        gcdTest(2147483647,0,minValue,maxValue,minValue);
        gcdTest(1,0,minValue,maxValue,minValue+1);


        gcdTest(1,0,minValue,maxValue-1,-1);
        gcdTest(1,0,minValue,maxValue-1,0);
        gcdTest(1,0,minValue,maxValue-1,1);
        gcdTest(1,0,minValue,maxValue-1,maxValue);
        gcdTest(1,0,minValue,maxValue-1,maxValue-1);
        gcdTest(1,0,minValue,maxValue-1,minValue);
        gcdTest(1,0,minValue,maxValue-1,minValue+1);


        gcdTest(1,0,minValue,minValue,-1);
        gcdTest(2147483647,0,minValue,minValue,0);
        gcdTest(1,0,minValue,minValue,1);
        gcdTest(2147483647,0,minValue,minValue,maxValue);
        gcdTest(1,0,minValue,minValue,maxValue-1);
        gcdTest(2147483647,0,minValue,minValue,minValue);
        gcdTest(1,0,minValue,minValue,minValue+1);


        gcdTest(1,0,minValue,minValue+1,-1);
        gcdTest(1,0,minValue,minValue+1,0);
        gcdTest(1,0,minValue,minValue+1,1);
        gcdTest(1,0,minValue,minValue+1,maxValue);
        gcdTest(1,0,minValue,minValue+1,maxValue-1);
        gcdTest(1,0,minValue,minValue+1,minValue);
        gcdTest(1,0,minValue,minValue+1,minValue+1);


        gcdTest(1,0,minValue+1,-1,-1);
        gcdTest(1,0,minValue+1,-1,0);
        gcdTest(1,0,minValue+1,-1,1);
        gcdTest(1,0,minValue+1,-1,maxValue);
        gcdTest(1,0,minValue+1,-1,maxValue-1);
        gcdTest(1,0,minValue+1,-1,minValue);
        gcdTest(1,0,minValue+1,-1,minValue+1);


        gcdTest(1,0,minValue+1,0,-1);
        gcdTest(2147483646,0,minValue+1,0,0);
        gcdTest(1,0,minValue+1,0,1);
        gcdTest(1,0,minValue+1,0,maxValue);
        gcdTest(2147483646,0,minValue+1,0,maxValue-1);
        gcdTest(1,0,minValue+1,0,minValue);
        gcdTest(2147483646,0,minValue+1,0,minValue+1);


        gcdTest(1,0,minValue+1,1,-1);
        gcdTest(1,0,minValue+1,1,0);
        gcdTest(1,0,minValue+1,1,1);
        gcdTest(1,0,minValue+1,1,maxValue);
        gcdTest(1,0,minValue+1,1,maxValue-1);
        gcdTest(1,0,minValue+1,1,minValue);
        gcdTest(1,0,minValue+1,1,minValue+1);


        gcdTest(1,0,minValue+1,maxValue,-1);
        gcdTest(1,0,minValue+1,maxValue,0);
        gcdTest(1,0,minValue+1,maxValue,1);
        gcdTest(1,0,minValue+1,maxValue,maxValue);
        gcdTest(1,0,minValue+1,maxValue,maxValue-1);
        gcdTest(1,0,minValue+1,maxValue,minValue);
        gcdTest(1,0,minValue+1,maxValue,minValue+1);
        gcdTest(1,0,minValue+1,maxValue-1,-1);


        gcdTest(2147483646,0,minValue+1,maxValue-1,0);
        gcdTest(1,0,minValue+1,maxValue-1,1);
        gcdTest(1,0,minValue+1,maxValue-1,maxValue);
        gcdTest(2147483646,0,minValue+1,maxValue-1,maxValue-1);
        gcdTest(1,0,minValue+1,maxValue-1,minValue);
        gcdTest(2147483646,0,minValue+1,maxValue-1,minValue+1);


        gcdTest(1,0,minValue+1,minValue,-1);
        gcdTest(1,0,minValue+1,minValue,0);
        gcdTest(1,0,minValue+1,minValue,1);
        gcdTest(1,0,minValue+1,minValue,maxValue);
        gcdTest(1,0,minValue+1,minValue,maxValue-1);
        gcdTest(1,0,minValue+1,minValue,minValue);
        gcdTest(1,0,minValue+1,minValue,minValue+1);


        gcdTest(1,0,minValue+1,minValue+1,-1);
        gcdTest(2147483646,0,minValue+1,minValue+1,0);
        gcdTest(1,0,minValue+1,minValue+1,1);
        gcdTest(1,0,minValue+1,minValue+1,maxValue);
        gcdTest(2147483646,0,minValue+1,minValue+1,maxValue-1);
        gcdTest(1,0,minValue+1,minValue+1,minValue);
        gcdTest(2147483646,0,minValue+1,minValue+1,minValue+1);
        //endregion

        //region граничные значения класса, MAX && 0
        gcdTest(1,1,-1,-1,-1);
        gcdTest(1,1,-1,-1,0);
        gcdTest(1,1,-1,-1,1);
        gcdTest(1,1,-1,-1,maxValue);
        gcdTest(1,1,-1,-1,maxValue-1);
        gcdTest(1,1,-1,-1,minValue);
        gcdTest(1,1,-1,-1,minValue+1);


        gcdTest(1,1,-1,0,-1);
        gcdTest(1,1,-1,0,0);
        gcdTest(1,1,-1,0,1);
        gcdTest(1,1,-1,0,maxValue);
        gcdTest(1,1,-1,0,maxValue-1);
        gcdTest(1,1,-1,0,minValue);
        gcdTest(1,1,-1,0,minValue+1);


        gcdTest(1,1,-1,1,-1);
        gcdTest(1,1,-1,1,0);
        gcdTest(1,1,-1,1,1);
        gcdTest(1,1,-1,1,maxValue);
        gcdTest(1,1,-1,1,maxValue-1);
        gcdTest(1,1,-1,1,minValue);
        gcdTest(1,1,-1,1,minValue+1);


        gcdTest(1,1,-1,maxValue,-1);
        gcdTest(1,1,-1,maxValue,0);
        gcdTest(1,1,-1,maxValue,1);
        gcdTest(1,1,-1,maxValue,maxValue);
        gcdTest(1,1,-1,maxValue,maxValue-1);
        gcdTest(1,1,-1,maxValue,minValue);
        gcdTest(1,1,-1,maxValue,minValue+1);


        gcdTest(1,1,-1,maxValue-1,-1);
        gcdTest(1,1,-1,maxValue-1,0);
        gcdTest(1,1,-1,maxValue-1,1);
        gcdTest(1,1,-1,maxValue-1,maxValue);
        gcdTest(1,1,-1,maxValue-1,maxValue-1);
        gcdTest(1,1,-1,maxValue-1,minValue);
        gcdTest(1,1,-1,maxValue-1,minValue+1);


        gcdTest(1,1,-1,minValue,-1);
        gcdTest(1,1,-1,minValue,0);
        gcdTest(1,1,-1,minValue,1);
        gcdTest(1,1,-1,minValue,maxValue);
        gcdTest(1,1,-1,minValue,maxValue-1);
        gcdTest(1,1,-1,minValue,minValue);
        gcdTest(1,1,-1,minValue,minValue+1);


        gcdTest(1,1,-1,minValue+1,-1);
        gcdTest(1,1,-1,minValue+1,0);
        gcdTest(1,1,-1,minValue+1,1);
        gcdTest(1,1,-1,minValue+1,maxValue);
        gcdTest(1,1,-1,minValue+1,maxValue-1);
        gcdTest(1,1,-1,minValue+1,minValue);
        gcdTest(1,1,-1,minValue+1,minValue+1);


        gcdTest(1,1,0,-1,-1);
        gcdTest(1,1,0,-1,0);
        gcdTest(1,1,0,-1,1);
        gcdTest(1,1,0,-1,maxValue);
        gcdTest(1,1,0,-1,maxValue-1);
        gcdTest(1,1,0,-1,minValue);
        gcdTest(1,1,0,-1,minValue+1);


        gcdTest(1,1,0,0,-1);
        gcdTest(1,1,0,0,0);
        gcdTest(1,1,0,0,1);
        gcdTest(1,1,0,0,maxValue);
        gcdTest(1,1,0,0,maxValue-1);
        gcdTest(1,1,0,0,minValue);
        gcdTest(1,1,0,0,minValue+1);


        gcdTest(1,1,0,1,-1);
        gcdTest(1,1,0,1,0);
        gcdTest(1,1,0,1,1);
        gcdTest(1,1,0,1,maxValue);
        gcdTest(1,1,0,1,maxValue-1);
        gcdTest(1,1,0,1,minValue);
        gcdTest(1,1,0,1,minValue+1);


        gcdTest(1,1,0,maxValue,-1);
        gcdTest(1,1,0,maxValue,0);
        gcdTest(1,1,0,maxValue,1);
        gcdTest(1,1,0,maxValue,maxValue);
        gcdTest(1,1,0,maxValue,maxValue-1);
        gcdTest(1,1,0,maxValue,minValue);
        gcdTest(1,1,0,maxValue,minValue+1);


        gcdTest(1,1,0,maxValue-1,-1);
        gcdTest(1,1,0,maxValue-1,0);
        gcdTest(1,1,0,maxValue-1,1);
        gcdTest(1,1,0,maxValue-1,maxValue);
        gcdTest(1,1,0,maxValue-1,maxValue-1);
        gcdTest(1,1,0,maxValue-1,minValue);
        gcdTest(1,1,0,maxValue-1,minValue+1);


        gcdTest(1,1,0,minValue,-1);
        gcdTest(1,1,0,minValue,0);
        gcdTest(1,1,0,minValue,1);
        gcdTest(1,1,0,minValue,maxValue);
        gcdTest(1,1,0,minValue,maxValue-1);
        gcdTest(1,1,0,minValue,minValue);
        gcdTest(1,1,0,minValue,minValue+1);


        gcdTest(1,1,0,minValue+1,-1);
        gcdTest(1,1,0,minValue+1,0);
        gcdTest(1,1,0,minValue+1,1);
        gcdTest(1,1,0,minValue+1,maxValue);
        gcdTest(1,1,0,minValue+1,maxValue-1);
        gcdTest(1,1,0,minValue+1,minValue);
        gcdTest(1,1,0,minValue+1,minValue+1);


        gcdTest(1,1,1,-1,-1);
        gcdTest(1,1,1,-1,0);
        gcdTest(1,1,1,-1,1);
        gcdTest(1,1,1,-1,maxValue);
        gcdTest(1,1,1,-1,maxValue-1);
        gcdTest(1,1,1,-1,minValue);
        gcdTest(1,1,1,-1,minValue+1);


        gcdTest(1,1,1,0,-1);
        gcdTest(1,1,1,0,0);
        gcdTest(1,1,1,0,1);
        gcdTest(1,1,1,0,maxValue);
        gcdTest(1,1,1,0,maxValue-1);
        gcdTest(1,1,1,0,minValue);
        gcdTest(1,1,1,0,minValue+1);


        gcdTest(1,1,1,1,-1);
        gcdTest(1,1,1,1,0);
        gcdTest(1,1,1,1,1);
        gcdTest(1,1,1,1,maxValue);
        gcdTest(1,1,1,1,maxValue-1);
        gcdTest(1,1,1,1,minValue);
        gcdTest(1,1,1,1,minValue+1);


        gcdTest(1,1,1,maxValue,-1);
        gcdTest(1,1,1,maxValue,0);
        gcdTest(1,1,1,maxValue,1);
        gcdTest(1,1,1,maxValue,maxValue);
        gcdTest(1,1,1,maxValue,maxValue-1);
        gcdTest(1,1,1,maxValue,minValue);
        gcdTest(1,1,1,maxValue,minValue+1);


        gcdTest(1,1,1,maxValue-1,-1);
        gcdTest(1,1,1,maxValue-1,0);
        gcdTest(1,1,1,maxValue-1,1);
        gcdTest(1,1,1,maxValue-1,maxValue);
        gcdTest(1,1,1,maxValue-1,maxValue-1);
        gcdTest(1,1,1,maxValue-1,minValue);
        gcdTest(1,1,1,maxValue-1,minValue+1);


        gcdTest(1,1,1,minValue,-1);
        gcdTest(1,1,1,minValue,0);
        gcdTest(1,1,1,minValue,1);
        gcdTest(1,1,1,minValue,maxValue);
        gcdTest(1,1,1,minValue,maxValue-1);
        gcdTest(1,1,1,minValue,minValue);
        gcdTest(1,1,1,minValue,minValue+1);


        gcdTest(1,1,1,minValue+1,-1);
        gcdTest(1,1,1,minValue+1,0);
        gcdTest(1,1,1,minValue+1,1);
        gcdTest(1,1,1,minValue+1,maxValue);
        gcdTest(1,1,1,minValue+1,maxValue-1);
        gcdTest(1,1,1,minValue+1,minValue);
        gcdTest(1,1,1,minValue+1,minValue+1);


        gcdTest(1,1,maxValue,-1,-1);
        gcdTest(1,1,maxValue,-1,0);
        gcdTest(1,1,maxValue,-1,1);
        gcdTest(1,1,maxValue,-1,maxValue);
        gcdTest(1,1,maxValue,-1,maxValue-1);
        gcdTest(1,1,maxValue,-1,minValue);
        gcdTest(1,1,maxValue,-1,minValue+1);


        gcdTest(1,1,maxValue,0,-1);
        gcdTest(1,1,maxValue,0,0);
        gcdTest(1,1,maxValue,0,1);
        gcdTest(1,1,maxValue,0,maxValue);
        gcdTest(1,1,maxValue,0,maxValue-1);
        gcdTest(1,1,maxValue,0,minValue);
        gcdTest(1,1,maxValue,0,minValue+1);


        gcdTest(1,1,maxValue,1,-1);
        gcdTest(1,1,maxValue,1,0);
        gcdTest(1,1,maxValue,1,1);
        gcdTest(1,1,maxValue,1,maxValue);
        gcdTest(1,1,maxValue,1,maxValue-1);
        gcdTest(1,1,maxValue,1,minValue);
        gcdTest(1,1,maxValue,1,minValue+1);



        gcdTest(1,1,maxValue,maxValue,-1);
        gcdTest(1,1,maxValue,maxValue,0);
        gcdTest(1,1,maxValue,maxValue,1);
        gcdTest(1,1,maxValue,maxValue,maxValue);
        gcdTest(1,1,maxValue,maxValue,maxValue-1);
        gcdTest(1,1,maxValue,maxValue,minValue);
        gcdTest(1,1,maxValue,maxValue,minValue+1);


        gcdTest(1,1,maxValue,maxValue-1,-1);
        gcdTest(1,1,maxValue,maxValue-1,0);
        gcdTest(1,1,maxValue,maxValue-1,1);
        gcdTest(1,1,maxValue,maxValue-1,maxValue);
        gcdTest(1,1,maxValue,maxValue-1,maxValue-1);
        gcdTest(1,1,maxValue,maxValue-1,minValue);
        gcdTest(1,1,maxValue,maxValue-1,minValue+1);


        gcdTest(1,1,maxValue,minValue,-1);
        gcdTest(1,1,maxValue,minValue,0);
        gcdTest(1,1,maxValue,minValue,1);
        gcdTest(1,1,maxValue,minValue,maxValue);
        gcdTest(1,1,maxValue,minValue,maxValue-1);
        gcdTest(1,1,maxValue,minValue,minValue);
        gcdTest(1,1,maxValue,minValue,minValue+1);


        gcdTest(1,1,maxValue,minValue+1,-1);
        gcdTest(1,1,maxValue,minValue+1,0);
        gcdTest(1,1,maxValue,minValue+1,1);
        gcdTest(1,1,maxValue,minValue+1,maxValue);
        gcdTest(1,1,maxValue,minValue+1,maxValue-1);
        gcdTest(1,1,maxValue,minValue+1,minValue);
        gcdTest(1,1,maxValue,minValue+1,minValue+1);


        gcdTest(1,1,maxValue-1,-1,-1);
        gcdTest(1,1,maxValue-1,-1,0);
        gcdTest(1,1,maxValue-1,-1,1);
        gcdTest(1,1,maxValue-1,-1,maxValue);
        gcdTest(1,1,maxValue-1,-1,maxValue-1);
        gcdTest(1,1,maxValue-1,-1,minValue);
        gcdTest(1,1,maxValue-1,-1,minValue+1);


        gcdTest(1,1,maxValue-1,0,-1);
        gcdTest(1,1,maxValue-1,0,0);
        gcdTest(1,1,maxValue-1,0,1);
        gcdTest(1,1,maxValue-1,0,maxValue);
        gcdTest(1,1,maxValue-1,0,maxValue-1);
        gcdTest(1,1,maxValue-1,0,minValue);
        gcdTest(1,1,maxValue-1,0,minValue+1);


        gcdTest(1,1,maxValue-1,1,-1);
        gcdTest(1,1,maxValue-1,1,0);
        gcdTest(1,1,maxValue-1,1,1);
        gcdTest(1,1,maxValue-1,1,maxValue);
        gcdTest(1,1,maxValue-1,1,maxValue-1);
        gcdTest(1,1,maxValue-1,1,minValue);
        gcdTest(1,1,maxValue-1,1,minValue+1);


        gcdTest(1,1,maxValue-1,maxValue,-1);
        gcdTest(1,1,maxValue-1,maxValue,0);
        gcdTest(1,1,maxValue-1,maxValue,1);
        gcdTest(1,1,maxValue-1,maxValue,maxValue);
        gcdTest(1,1,maxValue-1,maxValue,maxValue-1);
        gcdTest(1,1,maxValue-1,maxValue,minValue);
        gcdTest(1,1,maxValue-1,maxValue,minValue+1);


        gcdTest(1,1,maxValue-1,maxValue-1,-1);
        gcdTest(1,1,maxValue-1,maxValue-1,0);
        gcdTest(1,1,maxValue-1,maxValue-1,1);
        gcdTest(1,1,maxValue-1,maxValue-1,maxValue);
        gcdTest(1,1,maxValue-1,maxValue-1,maxValue-1);
        gcdTest(1,1,maxValue-1,maxValue-1,minValue);
        gcdTest(1,1,maxValue-1,maxValue-1,minValue+1);


        gcdTest(1,1,maxValue-1,minValue,-1);
        gcdTest(1,1,maxValue-1,minValue,0);
        gcdTest(1,1,maxValue-1,minValue,1);
        gcdTest(1,1,maxValue-1,minValue,maxValue);
        gcdTest(1,1,maxValue-1,minValue,maxValue-1);
        gcdTest(1,1,maxValue-1,minValue,minValue);
        gcdTest(1,1,maxValue-1,minValue,minValue+1);


        gcdTest(1,1,maxValue-1,minValue+1,-1);
        gcdTest(1,1,maxValue-1,minValue+1,0);
        gcdTest(1,1,maxValue-1,minValue+1,1);
        gcdTest(1,1,maxValue-1,minValue+1,maxValue);
        gcdTest(1,1,maxValue-1,minValue+1,maxValue-1);
        gcdTest(1,1,maxValue-1,minValue+1,minValue);
        gcdTest(1,1,maxValue-1,minValue+1,minValue+1);


        gcdTest(1,1,minValue,-1,-1);
        gcdTest(1,1,minValue,-1,0);
        gcdTest(1,1,minValue,-1,1);
        gcdTest(1,1,minValue,-1,maxValue);
        gcdTest(1,1,minValue,-1,maxValue-1);
        gcdTest(1,1,minValue,-1,minValue);
        gcdTest(1,1,minValue,-1,minValue+1);


        gcdTest(1,1,minValue,0,-1);
        gcdTest(1,1,minValue,0,0);
        gcdTest(1,1,minValue,0,1);
        gcdTest(1,1,minValue,0,maxValue);
        gcdTest(1,1,minValue,0,maxValue-1);
        gcdTest(1,1,minValue,0,minValue);
        gcdTest(1,1,minValue,0,minValue+1);


        gcdTest(1,1,minValue,1,-1);
        gcdTest(1,1,minValue,1,0);
        gcdTest(1,1,minValue,1,1);
        gcdTest(1,1,minValue,1,maxValue);
        gcdTest(1,1,minValue,1,maxValue-1);
        gcdTest(1,1,minValue,1,minValue);
        gcdTest(1,1,minValue,1,minValue+1);


        gcdTest(1,1,minValue,maxValue,-1);
        gcdTest(1,1,minValue,maxValue,0);
        gcdTest(1,1,minValue,maxValue,1);
        gcdTest(1,1,minValue,maxValue,maxValue);
        gcdTest(1,1,minValue,maxValue,maxValue-1);
        gcdTest(1,1,minValue,maxValue,minValue);
        gcdTest(1,1,minValue,maxValue,minValue+1);


        gcdTest(1,1,minValue,maxValue-1,-1);
        gcdTest(1,1,minValue,maxValue-1,0);
        gcdTest(1,1,minValue,maxValue-1,1);
        gcdTest(1,1,minValue,maxValue-1,maxValue);
        gcdTest(1,1,minValue,maxValue-1,maxValue-1);
        gcdTest(1,1,minValue,maxValue-1,minValue);
        gcdTest(1,1,minValue,maxValue-1,minValue+1);


        gcdTest(1,1,minValue,minValue,-1);
        gcdTest(1,1,minValue,minValue,0);
        gcdTest(1,1,minValue,minValue,1);
        gcdTest(1,1,minValue,minValue,maxValue);
        gcdTest(1,1,minValue,minValue,maxValue-1);
        gcdTest(1,1,minValue,minValue,minValue);
        gcdTest(1,1,minValue,minValue,minValue+1);


        gcdTest(1,1,minValue,minValue+1,-1);
        gcdTest(1,1,minValue,minValue+1,0);
        gcdTest(1,1,minValue,minValue+1,1);
        gcdTest(1,1,minValue,minValue+1,maxValue);
        gcdTest(1,1,minValue,minValue+1,maxValue-1);
        gcdTest(1,1,minValue,minValue+1,minValue);
        gcdTest(1,1,minValue,minValue+1,minValue+1);


        gcdTest(1,1,minValue+1,-1,-1);
        gcdTest(1,1,minValue+1,-1,0);
        gcdTest(1,1,minValue+1,-1,1);
        gcdTest(1,1,minValue+1,-1,maxValue);
        gcdTest(1,1,minValue+1,-1,maxValue-1);
        gcdTest(1,1,minValue+1,-1,minValue);
        gcdTest(1,1,minValue+1,-1,minValue+1);


        gcdTest(1,1,minValue+1,0,-1);
        gcdTest(1,1,minValue+1,0,0);
        gcdTest(1,1,minValue+1,0,1);
        gcdTest(1,1,minValue+1,0,maxValue);
        gcdTest(1,1,minValue+1,0,maxValue-1);
        gcdTest(1,1,minValue+1,0,minValue);
        gcdTest(1,1,minValue+1,0,minValue+1);


        gcdTest(1,1,minValue+1,1,-1);
        gcdTest(1,1,minValue+1,1,0);
        gcdTest(1,1,minValue+1,1,1);
        gcdTest(1,1,minValue+1,1,maxValue);
        gcdTest(1,1,minValue+1,1,maxValue-1);
        gcdTest(1,1,minValue+1,1,minValue);
        gcdTest(1,1,minValue+1,1,minValue+1);


        gcdTest(1,1,minValue+1,maxValue,-1);
        gcdTest(1,1,minValue+1,maxValue,0);
        gcdTest(1,1,minValue+1,maxValue,1);
        gcdTest(1,1,minValue+1,maxValue,maxValue);
        gcdTest(1,1,minValue+1,maxValue,maxValue-1);
        gcdTest(1,1,minValue+1,maxValue,minValue);
        gcdTest(1,1,minValue+1,maxValue,minValue+1);


        gcdTest(1,1,minValue+1,maxValue-1,-1);
        gcdTest(1,1,minValue+1,maxValue-1,0);
        gcdTest(1,1,minValue+1,maxValue-1,1);
        gcdTest(1,1,minValue+1,maxValue-1,maxValue);
        gcdTest(1,1,minValue+1,maxValue-1,maxValue-1);
        gcdTest(1,1,minValue+1,maxValue-1,minValue);
        gcdTest(1,1,minValue+1,maxValue-1,minValue+1);


        gcdTest(1,1,minValue+1,minValue,-1);
        gcdTest(1,1,minValue+1,minValue,0);
        gcdTest(1,1,minValue+1,minValue,1);
        gcdTest(1,1,minValue+1,minValue,maxValue);
        gcdTest(1,1,minValue+1,minValue,maxValue-1);
        gcdTest(1,1,minValue+1,minValue,minValue);
        gcdTest(1,1,minValue+1,minValue,minValue+1);


        gcdTest(1,1,minValue+1,minValue+1,-1);
        gcdTest(1,1,minValue+1,minValue+1,0);
        gcdTest(1,1,minValue+1,minValue+1,1);
        gcdTest(1,1,minValue+1,minValue+1,maxValue);
        gcdTest(1,1,minValue+1,minValue+1,maxValue-1);
        gcdTest(1,1,minValue+1,minValue+1,minValue);
        gcdTest(1,1,minValue+1,minValue+1,minValue+1);

        //endregion

        //region граничные значения класса, MAX && 0
        gcdTest(1,maxValue,-1,-1,-1);
        gcdTest(1,maxValue,-1,-1,0);
        gcdTest(1,maxValue,-1,-1,1);
        gcdTest(1,maxValue,-1,-1,maxValue);
        gcdTest(1,maxValue,-1,-1,maxValue-1);
        gcdTest(1,maxValue,-1,-1,minValue);
        gcdTest(1,maxValue,-1,-1,minValue+1);


        gcdTest(1,maxValue,-1,0,-1);
        gcdTest(1,maxValue,-1,0,0);
        gcdTest(1,maxValue,-1,0,1);
        gcdTest(1,maxValue,-1,0,maxValue);
        gcdTest(1,maxValue,-1,0,maxValue-1);
        gcdTest(1,maxValue,-1,0,minValue);
        gcdTest(1,maxValue,-1,0,minValue+1);


        gcdTest(1,maxValue,-1,1,-1);
        gcdTest(1,maxValue,-1,1,0);
        gcdTest(1,maxValue,-1,1,1);
        gcdTest(1,maxValue,-1,1,maxValue);
        gcdTest(1,maxValue,-1,1,maxValue-1);
        gcdTest(1,maxValue,-1,1,minValue);
        gcdTest(1,maxValue,-1,1,minValue+1);


        gcdTest(1,maxValue,-1,maxValue,-1);
        gcdTest(1,maxValue,-1,maxValue,0);
        gcdTest(1,maxValue,-1,maxValue,1);
        gcdTest(1,maxValue,-1,maxValue,maxValue);
        gcdTest(1,maxValue,-1,maxValue,maxValue-1);
        gcdTest(1,maxValue,-1,maxValue,minValue);
        gcdTest(1,maxValue,-1,maxValue,minValue+1);


        gcdTest(1,maxValue,-1,maxValue-1,-1);
        gcdTest(1,maxValue,-1,maxValue-1,0);
        gcdTest(1,maxValue,-1,maxValue-1,1);
        gcdTest(1,maxValue,-1,maxValue-1,maxValue);
        gcdTest(1,maxValue,-1,maxValue-1,maxValue-1);
        gcdTest(1,maxValue,-1,maxValue-1,minValue);
        gcdTest(1,maxValue,-1,maxValue-1,minValue+1);


        gcdTest(1,maxValue,-1,minValue,-1);
        gcdTest(1,maxValue,-1,minValue,0);
        gcdTest(1,maxValue,-1,minValue,1);
        gcdTest(1,maxValue,-1,minValue,maxValue);
        gcdTest(1,maxValue,-1,minValue,maxValue-1);
        gcdTest(1,maxValue,-1,minValue,minValue);
        gcdTest(1,maxValue,-1,minValue,minValue+1);


        gcdTest(1,maxValue,-1,minValue+1,-1);
        gcdTest(1,maxValue,-1,minValue+1,0);
        gcdTest(1,maxValue,-1,minValue+1,1);
        gcdTest(1,maxValue,-1,minValue+1,maxValue);
        gcdTest(1,maxValue,-1,minValue+1,maxValue-1);
        gcdTest(1,maxValue,-1,minValue+1,minValue);
        gcdTest(1,maxValue,-1,minValue+1,minValue+1);


        gcdTest(1,maxValue,0,-1,-1);
        gcdTest(1,maxValue,0,-1,0);
        gcdTest(1,maxValue,0,-1,1);
        gcdTest(1,maxValue,0,-1,maxValue);
        gcdTest(1,maxValue,0,-1,maxValue-1);
        gcdTest(1,maxValue,0,-1,minValue);
        gcdTest(1,maxValue,0,-1,minValue+1);


        gcdTest(1,maxValue,0,0,-1);
        gcdTest(2147483647,maxValue,0,0,0);
        gcdTest(1,maxValue,0,0,1);
        gcdTest(2147483647,maxValue,0,0,maxValue);
        gcdTest(1,maxValue,0,0,maxValue-1);
        gcdTest(2147483647,maxValue,0,0,minValue);
        gcdTest(1,maxValue,0,0,minValue+1);


        gcdTest(1,maxValue,0,1,-1);
        gcdTest(1,maxValue,0,1,0);
        gcdTest(1,maxValue,0,1,1);
        gcdTest(1,maxValue,0,1,maxValue);
        gcdTest(1,maxValue,0,1,maxValue-1);
        gcdTest(1,maxValue,0,1,minValue);
        gcdTest(1,maxValue,0,1,minValue+1);


        gcdTest(1,maxValue,0,maxValue,-1);
        gcdTest(2147483647,maxValue,0,maxValue,0);
        gcdTest(1,maxValue,0,maxValue,1);
        gcdTest(2147483647,maxValue,0,maxValue,maxValue);
        gcdTest(1,maxValue,0,maxValue,maxValue-1);
        gcdTest(2147483647,maxValue,0,maxValue,minValue);
        gcdTest(1,maxValue,0,maxValue,minValue+1);


        gcdTest(1,maxValue,0,maxValue-1,-1);
        gcdTest(1,maxValue,0,maxValue-1,0);
        gcdTest(1,maxValue,0,maxValue-1,1);
        gcdTest(1,maxValue,0,maxValue-1,maxValue);
        gcdTest(1,maxValue,0,maxValue-1,maxValue-1);
        gcdTest(1,maxValue,0,maxValue-1,minValue);
        gcdTest(1,maxValue,0,maxValue-1,minValue+1);


        gcdTest(1,maxValue,0,minValue,-1);
        gcdTest(2147483647,maxValue,0,minValue,0);
        gcdTest(1,maxValue,0,minValue,1);
        gcdTest(2147483647,maxValue,0,minValue,maxValue);
        gcdTest(1,maxValue,0,minValue,maxValue-1);
        gcdTest(2147483647,maxValue,0,minValue,minValue);
        gcdTest(1,maxValue,0,minValue,minValue+1);


        gcdTest(1,maxValue,0,minValue+1,-1);
        gcdTest(1,maxValue,0,minValue+1,0);
        gcdTest(1,maxValue,0,minValue+1,1);
        gcdTest(1,maxValue,0,minValue+1,maxValue);
        gcdTest(1,maxValue,0,minValue+1,maxValue-1);
        gcdTest(1,maxValue,0,minValue+1,minValue);
        gcdTest(1,maxValue,0,minValue+1,minValue+1);


        gcdTest(1,maxValue,1,-1,-1);
        gcdTest(1,maxValue,1,-1,0);
        gcdTest(1,maxValue,1,-1,1);
        gcdTest(1,maxValue,1,-1,maxValue);
        gcdTest(1,maxValue,1,-1,maxValue-1);
        gcdTest(1,maxValue,1,-1,minValue);
        gcdTest(1,maxValue,1,-1,minValue+1);


        gcdTest(1,maxValue,1,0,-1);
        gcdTest(1,maxValue,1,0,0);
        gcdTest(1,maxValue,1,0,1);
        gcdTest(1,maxValue,1,0,maxValue);
        gcdTest(1,maxValue,1,0,maxValue-1);
        gcdTest(1,maxValue,1,0,minValue);
        gcdTest(1,maxValue,1,0,minValue+1);


        gcdTest(1,maxValue,1,1,-1);
        gcdTest(1,maxValue,1,1,0);
        gcdTest(1,maxValue,1,1,1);
        gcdTest(1,maxValue,1,1,maxValue);
        gcdTest(1,maxValue,1,1,maxValue-1);
        gcdTest(1,maxValue,1,1,minValue);
        gcdTest(1,maxValue,1,1,minValue+1);


        gcdTest(1,maxValue,1,maxValue,-1);
        gcdTest(1,maxValue,1,maxValue,0);
        gcdTest(1,maxValue,1,maxValue,1);
        gcdTest(1,maxValue,1,maxValue,maxValue);
        gcdTest(1,maxValue,1,maxValue,maxValue-1);
        gcdTest(1,maxValue,1,maxValue,minValue);
        gcdTest(1,maxValue,1,maxValue,minValue+1);


        gcdTest(1,maxValue,1,maxValue-1,-1);
        gcdTest(1,maxValue,1,maxValue-1,0);
        gcdTest(1,maxValue,1,maxValue-1,1);
        gcdTest(1,maxValue,1,maxValue-1,maxValue);
        gcdTest(1,maxValue,1,maxValue-1,maxValue-1);
        gcdTest(1,maxValue,1,maxValue-1,minValue);
        gcdTest(1,maxValue,1,maxValue-1,minValue+1);


        gcdTest(1,maxValue,1,minValue,-1);
        gcdTest(1,maxValue,1,minValue,0);
        gcdTest(1,maxValue,1,minValue,1);
        gcdTest(1,maxValue,1,minValue,maxValue);
        gcdTest(1,maxValue,1,minValue,maxValue-1);
        gcdTest(1,maxValue,1,minValue,minValue);
        gcdTest(1,maxValue,1,minValue,minValue+1);


        gcdTest(1,maxValue,1,minValue+1,-1);
        gcdTest(1,maxValue,1,minValue+1,0);
        gcdTest(1,maxValue,1,minValue+1,1);
        gcdTest(1,maxValue,1,minValue+1,maxValue);
        gcdTest(1,maxValue,1,minValue+1,maxValue-1);
        gcdTest(1,maxValue,1,minValue+1,minValue);
        gcdTest(1,maxValue,1,minValue+1,minValue+1);


        gcdTest(1,maxValue,maxValue,-1,-1);
        gcdTest(1,maxValue,maxValue,-1,0);
        gcdTest(1,maxValue,maxValue,-1,1);
        gcdTest(1,maxValue,maxValue,-1,maxValue);
        gcdTest(1,maxValue,maxValue,-1,maxValue-1);
        gcdTest(1,maxValue,maxValue,-1,minValue);
        gcdTest(1,maxValue,maxValue,-1,minValue+1);


        gcdTest(1,maxValue,maxValue,0,-1);
        gcdTest(2147483647,maxValue,maxValue,0,0);
        gcdTest(1,maxValue,maxValue,0,1);
        gcdTest(2147483647,maxValue,maxValue,0,maxValue);
        gcdTest(1,maxValue,maxValue,0,maxValue-1);
        gcdTest(2147483647,maxValue,maxValue,0,minValue);
        gcdTest(1,maxValue,maxValue,0,minValue+1);


        gcdTest(1,maxValue,maxValue,1,-1);
        gcdTest(1,maxValue,maxValue,1,0);
        gcdTest(1,maxValue,maxValue,1,1);
        gcdTest(1,maxValue,maxValue,1,maxValue);
        gcdTest(1,maxValue,maxValue,1,maxValue-1);
        gcdTest(1,maxValue,maxValue,1,minValue);
        gcdTest(1,maxValue,maxValue,1,minValue+1);


        gcdTest(1,maxValue,maxValue,maxValue,-1);
        gcdTest(2147483647,maxValue,maxValue,maxValue,0);
        gcdTest(1,maxValue,maxValue,maxValue,1);
        gcdTest(2147483647,maxValue,maxValue,maxValue,maxValue);
        gcdTest(1,maxValue,maxValue,maxValue,maxValue-1);
        gcdTest(2147483647,maxValue,maxValue,maxValue,minValue);
        gcdTest(1,maxValue,maxValue,maxValue,minValue+1);


        gcdTest(1,maxValue,maxValue,maxValue-1,-1);
        gcdTest(1,maxValue,maxValue,maxValue-1,0);
        gcdTest(1,maxValue,maxValue,maxValue-1,1);
        gcdTest(1,maxValue,maxValue,maxValue-1,maxValue);
        gcdTest(1,maxValue,maxValue,maxValue-1,maxValue-1);
        gcdTest(1,maxValue,maxValue,maxValue-1,minValue);
        gcdTest(1,maxValue,maxValue,maxValue-1,minValue+1);


        gcdTest(1,maxValue,maxValue,minValue,-1);
        gcdTest(2147483647,maxValue,maxValue,minValue,0);
        gcdTest(1,maxValue,maxValue,minValue,1);
        gcdTest(2147483647,maxValue,maxValue,minValue,maxValue);
        gcdTest(1,maxValue,maxValue,minValue,maxValue-1);
        gcdTest(2147483647,maxValue,maxValue,minValue,minValue);
        gcdTest(1,maxValue,maxValue,minValue,minValue+1);


        gcdTest(1,maxValue,maxValue,minValue+1,-1);
        gcdTest(1,maxValue,maxValue,minValue+1,0);
        gcdTest(1,maxValue,maxValue,minValue+1,1);
        gcdTest(1,maxValue,maxValue,minValue+1,maxValue);
        gcdTest(1,maxValue,maxValue,minValue+1,maxValue-1);
        gcdTest(1,maxValue,maxValue,minValue+1,minValue);
        gcdTest(1,maxValue,maxValue,minValue+1,minValue+1);


        gcdTest(1,maxValue,maxValue-1,-1,-1);
        gcdTest(1,maxValue,maxValue-1,-1,0);
        gcdTest(1,maxValue,maxValue-1,-1,1);
        gcdTest(1,maxValue,maxValue-1,-1,maxValue);
        gcdTest(1,maxValue,maxValue-1,-1,maxValue-1);
        gcdTest(1,maxValue,maxValue-1,-1,minValue);
        gcdTest(1,maxValue,maxValue-1,-1,minValue+1);


        gcdTest(1,maxValue,maxValue-1,0,-1);
        gcdTest(1,maxValue,maxValue-1,0,0);
        gcdTest(1,maxValue,maxValue-1,0,1);
        gcdTest(1,maxValue,maxValue-1,0,maxValue);
        gcdTest(1,maxValue,maxValue-1,0,maxValue-1);
        gcdTest(1,maxValue,maxValue-1,0,minValue);
        gcdTest(1,maxValue,maxValue-1,0,minValue+1);


        gcdTest(1,maxValue,maxValue-1,1,-1);
        gcdTest(1,maxValue,maxValue-1,1,0);
        gcdTest(1,maxValue,maxValue-1,1,1);
        gcdTest(1,maxValue,maxValue-1,1,maxValue);
        gcdTest(1,maxValue,maxValue-1,1,maxValue-1);
        gcdTest(1,maxValue,maxValue-1,1,minValue);
        gcdTest(1,maxValue,maxValue-1,1,minValue+1);


        gcdTest(1,maxValue,maxValue-1,maxValue,-1);
        gcdTest(1,maxValue,maxValue-1,maxValue,0);
        gcdTest(1,maxValue,maxValue-1,maxValue,1);
        gcdTest(1,maxValue,maxValue-1,maxValue,maxValue);
        gcdTest(1,maxValue,maxValue-1,maxValue,maxValue-1);
        gcdTest(1,maxValue,maxValue-1,maxValue,minValue);
        gcdTest(1,maxValue,maxValue-1,maxValue,minValue+1);


        gcdTest(1,maxValue,maxValue-1,maxValue-1,-1);
        gcdTest(1,maxValue,maxValue-1,maxValue-1,0);
        gcdTest(1,maxValue,maxValue-1,maxValue-1,1);
        gcdTest(1,maxValue,maxValue-1,maxValue-1,maxValue);
        gcdTest(1,maxValue,maxValue-1,maxValue-1,maxValue-1);
        gcdTest(1,maxValue,maxValue-1,maxValue-1,minValue);
        gcdTest(1,maxValue,maxValue-1,maxValue-1,minValue+1);


        gcdTest(1,maxValue,maxValue-1,minValue,-1);
        gcdTest(1,maxValue,maxValue-1,minValue,0);
        gcdTest(1,maxValue,maxValue-1,minValue,1);
        gcdTest(1,maxValue,maxValue-1,minValue,maxValue);
        gcdTest(1,maxValue,maxValue-1,minValue,maxValue-1);
        gcdTest(1,maxValue,maxValue-1,minValue,minValue);
        gcdTest(1,maxValue,maxValue-1,minValue,minValue+1);


        gcdTest(1,maxValue,maxValue-1,minValue+1,-1);
        gcdTest(1,maxValue,maxValue-1,minValue+1,0);
        gcdTest(1,maxValue,maxValue-1,minValue+1,1);
        gcdTest(1,maxValue,maxValue-1,minValue+1,maxValue);
        gcdTest(1,maxValue,maxValue-1,minValue+1,maxValue-1);
        gcdTest(1,maxValue,maxValue-1,minValue+1,minValue);
        gcdTest(1,maxValue,maxValue-1,minValue+1,minValue+1);


        gcdTest(1,maxValue,minValue,-1,-1);
        gcdTest(1,maxValue,minValue,-1,0);
        gcdTest(1,maxValue,minValue,-1,1);
        gcdTest(1,maxValue,minValue,-1,maxValue);
        gcdTest(1,maxValue,minValue,-1,maxValue-1);
        gcdTest(1,maxValue,minValue,-1,minValue);
        gcdTest(1,maxValue,minValue,-1,minValue+1);


        gcdTest(1,maxValue,minValue,0,-1);
        gcdTest(2147483647,maxValue,minValue,0,0);
        gcdTest(1,maxValue,minValue,0,1);
        gcdTest(2147483647,maxValue,minValue,0,maxValue);
        gcdTest(1,maxValue,minValue,0,maxValue-1);
        gcdTest(2147483647,maxValue,minValue,0,minValue);
        gcdTest(1,maxValue,minValue,0,minValue+1);


        gcdTest(1,maxValue,minValue,1,-1);
        gcdTest(1,maxValue,minValue,1,0);
        gcdTest(1,maxValue,minValue,1,1);
        gcdTest(1,maxValue,minValue,1,maxValue);
        gcdTest(1,maxValue,minValue,1,maxValue-1);
        gcdTest(1,maxValue,minValue,1,minValue);
        gcdTest(1,maxValue,minValue,1,minValue+1);


        gcdTest(1,maxValue,minValue,maxValue,-1);
        gcdTest(2147483647,maxValue,minValue,maxValue,0);
        gcdTest(1,maxValue,minValue,maxValue,1);
        gcdTest(2147483647,maxValue,minValue,maxValue,maxValue);
        gcdTest(1,maxValue,minValue,maxValue,maxValue-1);
        gcdTest(2147483647,maxValue,minValue,maxValue,minValue);
        gcdTest(1,maxValue,minValue,maxValue,minValue+1);


        gcdTest(1,maxValue,minValue,maxValue-1,-1);
        gcdTest(1,maxValue,minValue,maxValue-1,0);
        gcdTest(1,maxValue,minValue,maxValue-1,1);
        gcdTest(1,maxValue,minValue,maxValue-1,maxValue);
        gcdTest(1,maxValue,minValue,maxValue-1,maxValue-1);
        gcdTest(1,maxValue,minValue,maxValue-1,minValue);
        gcdTest(1,maxValue,minValue,maxValue-1,minValue+1);


        gcdTest(1,maxValue,minValue,minValue,-1);
        gcdTest(2147483647,maxValue,minValue,minValue,0);
        gcdTest(1,maxValue,minValue,minValue,1);
        gcdTest(2147483647,maxValue,minValue,minValue,maxValue);
        gcdTest(1,maxValue,minValue,minValue,maxValue-1);
        gcdTest(2147483647,maxValue,minValue,minValue,minValue);
        gcdTest(1,maxValue,minValue,minValue,minValue+1);


        gcdTest(1,maxValue,minValue,minValue+1,-1);
        gcdTest(1,maxValue,minValue,minValue+1,0);
        gcdTest(1,maxValue,minValue,minValue+1,1);
        gcdTest(1,maxValue,minValue,minValue+1,maxValue);
        gcdTest(1,maxValue,minValue,minValue+1,maxValue-1);
        gcdTest(1,maxValue,minValue,minValue+1,minValue);
        gcdTest(1,maxValue,minValue,minValue+1,minValue+1);


        gcdTest(1,maxValue,minValue+1,-1,-1);
        gcdTest(1,maxValue,minValue+1,-1,0);
        gcdTest(1,maxValue,minValue+1,-1,1);
        gcdTest(1,maxValue,minValue+1,-1,maxValue);
        gcdTest(1,maxValue,minValue+1,-1,maxValue-1);
        gcdTest(1,maxValue,minValue+1,-1,minValue);
        gcdTest(1,maxValue,minValue+1,-1,minValue+1);


        gcdTest(1,maxValue,minValue+1,0,-1);
        gcdTest(1,maxValue,minValue+1,0,0);
        gcdTest(1,maxValue,minValue+1,0,1);
        gcdTest(1,maxValue,minValue+1,0,maxValue);
        gcdTest(1,maxValue,minValue+1,0,maxValue-1);
        gcdTest(1,maxValue,minValue+1,0,minValue);
        gcdTest(1,maxValue,minValue+1,0,minValue+1);


        gcdTest(1,maxValue,minValue+1,1,-1);
        gcdTest(1,maxValue,minValue+1,1,0);
        gcdTest(1,maxValue,minValue+1,1,1);
        gcdTest(1,maxValue,minValue+1,1,maxValue);
        gcdTest(1,maxValue,minValue+1,1,maxValue-1);
        gcdTest(1,maxValue,minValue+1,1,minValue);
        gcdTest(1,maxValue,minValue+1,1,minValue+1);


        gcdTest(1,maxValue,minValue+1,maxValue,-1);
        gcdTest(1,maxValue,minValue+1,maxValue,0);
        gcdTest(1,maxValue,minValue+1,maxValue,1);
        gcdTest(1,maxValue,minValue+1,maxValue,maxValue);
        gcdTest(1,maxValue,minValue+1,maxValue,maxValue-1);
        gcdTest(1,maxValue,minValue+1,maxValue,minValue);
        gcdTest(1,maxValue,minValue+1,maxValue,minValue+1);


        gcdTest(1,maxValue,minValue+1,maxValue-1,-1);
        gcdTest(1,maxValue,minValue+1,maxValue-1,0);
        gcdTest(1,maxValue,minValue+1,maxValue-1,1);
        gcdTest(1,maxValue,minValue+1,maxValue-1,maxValue);
        gcdTest(1,maxValue,minValue+1,maxValue-1,maxValue-1);
        gcdTest(1,maxValue,minValue+1,maxValue-1,minValue);
        gcdTest(1,maxValue,minValue+1,maxValue-1,minValue+1);


        gcdTest(1,maxValue,minValue+1,minValue,-1);
        gcdTest(1,maxValue,minValue+1,minValue,0);
        gcdTest(1,maxValue,minValue+1,minValue,1);
        gcdTest(1,maxValue,minValue+1,minValue,maxValue);
        gcdTest(1,maxValue,minValue+1,minValue,maxValue-1);
        gcdTest(1,maxValue,minValue+1,minValue,minValue);
        gcdTest(1,maxValue,minValue+1,minValue,minValue+1);


        gcdTest(1,maxValue,minValue+1,minValue+1,-1);
        gcdTest(1,maxValue,minValue+1,minValue+1,0);
        gcdTest(1,maxValue,minValue+1,minValue+1,1);
        gcdTest(1,maxValue,minValue+1,minValue+1,maxValue);
        gcdTest(1,maxValue,minValue+1,minValue+1,maxValue-1);
        gcdTest(1,maxValue,minValue+1,minValue+1,minValue);
        gcdTest(1,maxValue,minValue+1,minValue+1,minValue+1);

        //endregion

        //region граничные значения класса, MAX && 0
        gcdTest(1,maxValue-1,-1,-1,-1);
        gcdTest(1,maxValue-1,-1,-1,0);
        gcdTest(1,maxValue-1,-1,-1,1);
        gcdTest(1,maxValue-1,-1,-1,maxValue);
        gcdTest(1,maxValue-1,-1,-1,maxValue-1);
        gcdTest(1,maxValue-1,-1,-1,minValue);
        gcdTest(1,maxValue-1,-1,-1,minValue+1);


        gcdTest(1,maxValue-1,-1,0,-1);
        gcdTest(1,maxValue-1,-1,0,0);
        gcdTest(1,maxValue-1,-1,0,1);
        gcdTest(1,maxValue-1,-1,0,maxValue);
        gcdTest(1,maxValue-1,-1,0,maxValue-1);
        gcdTest(1,maxValue-1,-1,0,minValue);
        gcdTest(1,maxValue-1,-1,0,minValue+1);


        gcdTest(1,maxValue-1,-1,1,-1);
        gcdTest(1,maxValue-1,-1,1,0);
        gcdTest(1,maxValue-1,-1,1,1);
        gcdTest(1,maxValue-1,-1,1,maxValue);
        gcdTest(1,maxValue-1,-1,1,maxValue-1);
        gcdTest(1,maxValue-1,-1,1,minValue);
        gcdTest(1,maxValue-1,-1,1,minValue+1);


        gcdTest(1,maxValue-1,-1,maxValue,-1);
        gcdTest(1,maxValue-1,-1,maxValue,0);
        gcdTest(1,maxValue-1,-1,maxValue,1);
        gcdTest(1,maxValue-1,-1,maxValue,maxValue);
        gcdTest(1,maxValue-1,-1,maxValue,maxValue-1);
        gcdTest(1,maxValue-1,-1,maxValue,minValue);
        gcdTest(1,maxValue-1,-1,maxValue,minValue+1);


        gcdTest(1,maxValue-1,-1,maxValue-1,-1);
        gcdTest(1,maxValue-1,-1,maxValue-1,0);
        gcdTest(1,maxValue-1,-1,maxValue-1,1);
        gcdTest(1,maxValue-1,-1,maxValue-1,maxValue);
        gcdTest(1,maxValue-1,-1,maxValue-1,maxValue-1);
        gcdTest(1,maxValue-1,-1,maxValue-1,minValue);
        gcdTest(1,maxValue-1,-1,maxValue-1,minValue+1);


        gcdTest(1,maxValue-1,-1,minValue,-1);
        gcdTest(1,maxValue-1,-1,minValue,0);
        gcdTest(1,maxValue-1,-1,minValue,1);
        gcdTest(1,maxValue-1,-1,minValue,maxValue);
        gcdTest(1,maxValue-1,-1,minValue,maxValue-1);
        gcdTest(1,maxValue-1,-1,minValue,minValue);
        gcdTest(1,maxValue-1,-1,minValue,minValue+1);


        gcdTest(1,maxValue-1,-1,minValue+1,-1);
        gcdTest(1,maxValue-1,-1,minValue+1,0);
        gcdTest(1,maxValue-1,-1,minValue+1,1);
        gcdTest(1,maxValue-1,-1,minValue+1,maxValue);
        gcdTest(1,maxValue-1,-1,minValue+1,maxValue-1);
        gcdTest(1,maxValue-1,-1,minValue+1,minValue);
        gcdTest(1,maxValue-1,-1,minValue+1,minValue+1);


        gcdTest(1,maxValue-1,0,-1,-1);
        gcdTest(1,maxValue-1,0,-1,0);
        gcdTest(1,maxValue-1,0,-1,1);
        gcdTest(1,maxValue-1,0,-1,maxValue);
        gcdTest(1,maxValue-1,0,-1,maxValue-1);
        gcdTest(1,maxValue-1,0,-1,minValue);
        gcdTest(1,maxValue-1,0,-1,minValue+1);


        gcdTest(1,maxValue-1,0,0,-1);
        gcdTest(2147483646,maxValue-1,0,0,0);
        gcdTest(1,maxValue-1,0,0,1);
        gcdTest(1,maxValue-1,0,0,maxValue);
        gcdTest(2147483646,maxValue-1,0,0,maxValue-1);
        gcdTest(1,maxValue-1,0,0,minValue);
        gcdTest(2147483646,maxValue-1,0,0,minValue+1);


        gcdTest(1,maxValue-1,0,1,-1);
        gcdTest(1,maxValue-1,0,1,0);
        gcdTest(1,maxValue-1,0,1,1);
        gcdTest(1,maxValue-1,0,1,maxValue);
        gcdTest(1,maxValue-1,0,1,maxValue-1);
        gcdTest(1,maxValue-1,0,1,minValue);
        gcdTest(1,maxValue-1,0,1,minValue+1);


        gcdTest(1,maxValue-1,0,maxValue,-1);
        gcdTest(1,maxValue-1,0,maxValue,0);
        gcdTest(1,maxValue-1,0,maxValue,1);
        gcdTest(1,maxValue-1,0,maxValue,maxValue);
        gcdTest(1,maxValue-1,0,maxValue,maxValue-1);
        gcdTest(1,maxValue-1,0,maxValue,minValue);
        gcdTest(1,maxValue-1,0,maxValue,minValue+1);



        gcdTest(1,maxValue-1,0,maxValue-1,-1);
        gcdTest(2147483646,maxValue-1,0,maxValue-1,0);
        gcdTest(1,maxValue-1,0,maxValue-1,1);
        gcdTest(1,maxValue-1,0,maxValue-1,maxValue);
        gcdTest(2147483646,maxValue-1,0,maxValue-1,maxValue-1);
        gcdTest(1,maxValue-1,0,maxValue-1,minValue);
        gcdTest(2147483646,maxValue-1,0,maxValue-1,minValue+1);


        gcdTest(1,maxValue-1,0,minValue,-1);
        gcdTest(1,maxValue-1,0,minValue,0);
        gcdTest(1,maxValue-1,0,minValue,1);
        gcdTest(1,maxValue-1,0,minValue,maxValue);
        gcdTest(1,maxValue-1,0,minValue,maxValue-1);
        gcdTest(1,maxValue-1,0,minValue,minValue);
        gcdTest(1,maxValue-1,0,minValue,minValue+1);


        gcdTest(1,maxValue-1,0,minValue+1,-1);
        gcdTest(2147483646,maxValue-1,0,minValue+1,0);
        gcdTest(1,maxValue-1,0,minValue+1,1);
        gcdTest(1,maxValue-1,0,minValue+1,maxValue);
        gcdTest(2147483646,maxValue-1,0,minValue+1,maxValue-1);
        gcdTest(1,maxValue-1,0,minValue+1,minValue);
        gcdTest(2147483646,maxValue-1,0,minValue+1,minValue+1);


        gcdTest(1,maxValue-1,1,-1,-1);
        gcdTest(1,maxValue-1,1,-1,0);
        gcdTest(1,maxValue-1,1,-1,1);
        gcdTest(1,maxValue-1,1,-1,maxValue);
        gcdTest(1,maxValue-1,1,-1,maxValue-1);
        gcdTest(1,maxValue-1,1,-1,minValue);
        gcdTest(1,maxValue-1,1,-1,minValue+1);


        gcdTest(1,maxValue-1,1,0,-1);
        gcdTest(1,maxValue-1,1,0,0);
        gcdTest(1,maxValue-1,1,0,1);
        gcdTest(1,maxValue-1,1,0,maxValue);
        gcdTest(1,maxValue-1,1,0,maxValue-1);
        gcdTest(1,maxValue-1,1,0,minValue);
        gcdTest(1,maxValue-1,1,0,minValue+1);


        gcdTest(1,maxValue-1,1,1,-1);
        gcdTest(1,maxValue-1,1,1,0);
        gcdTest(1,maxValue-1,1,1,1);
        gcdTest(1,maxValue-1,1,1,maxValue);
        gcdTest(1,maxValue-1,1,1,maxValue-1);
        gcdTest(1,maxValue-1,1,1,minValue);
        gcdTest(1,maxValue-1,1,1,minValue+1);


        gcdTest(1,maxValue-1,1,maxValue,-1);
        gcdTest(1,maxValue-1,1,maxValue,0);
        gcdTest(1,maxValue-1,1,maxValue,1);
        gcdTest(1,maxValue-1,1,maxValue,maxValue);
        gcdTest(1,maxValue-1,1,maxValue,maxValue-1);
        gcdTest(1,maxValue-1,1,maxValue,minValue);
        gcdTest(1,maxValue-1,1,maxValue,minValue+1);


        gcdTest(1,maxValue-1,1,maxValue-1,-1);
        gcdTest(1,maxValue-1,1,maxValue-1,0);
        gcdTest(1,maxValue-1,1,maxValue-1,1);
        gcdTest(1,maxValue-1,1,maxValue-1,maxValue);
        gcdTest(1,maxValue-1,1,maxValue-1,maxValue-1);
        gcdTest(1,maxValue-1,1,maxValue-1,minValue);
        gcdTest(1,maxValue-1,1,maxValue-1,minValue+1);


        gcdTest(1,maxValue-1,1,minValue,-1);
        gcdTest(1,maxValue-1,1,minValue,0);
        gcdTest(1,maxValue-1,1,minValue,1);
        gcdTest(1,maxValue-1,1,minValue,maxValue);
        gcdTest(1,maxValue-1,1,minValue,maxValue-1);
        gcdTest(1,maxValue-1,1,minValue,minValue);
        gcdTest(1,maxValue-1,1,minValue,minValue+1);


        gcdTest(1,maxValue-1,1,minValue+1,-1);
        gcdTest(1,maxValue-1,1,minValue+1,0);
        gcdTest(1,maxValue-1,1,minValue+1,1);
        gcdTest(1,maxValue-1,1,minValue+1,maxValue);
        gcdTest(1,maxValue-1,1,minValue+1,maxValue-1);
        gcdTest(1,maxValue-1,1,minValue+1,minValue);
        gcdTest(1,maxValue-1,1,minValue+1,minValue+1);


        gcdTest(1,maxValue-1,maxValue,-1,-1);
        gcdTest(1,maxValue-1,maxValue,-1,0);
        gcdTest(1,maxValue-1,maxValue,-1,1);
        gcdTest(1,maxValue-1,maxValue,-1,maxValue);
        gcdTest(1,maxValue-1,maxValue,-1,maxValue-1);
        gcdTest(1,maxValue-1,maxValue,-1,minValue);
        gcdTest(1,maxValue-1,maxValue,-1,minValue+1);


        gcdTest(1,maxValue-1,maxValue,0,-1);
        gcdTest(1,maxValue-1,maxValue,0,0);
        gcdTest(1,maxValue-1,maxValue,0,1);
        gcdTest(1,maxValue-1,maxValue,0,maxValue);
        gcdTest(1,maxValue-1,maxValue,0,maxValue-1);
        gcdTest(1,maxValue-1,maxValue,0,minValue);
        gcdTest(1,maxValue-1,maxValue,0,minValue+1);


        gcdTest(1,maxValue-1,maxValue,1,-1);
        gcdTest(1,maxValue-1,maxValue,1,0);
        gcdTest(1,maxValue-1,maxValue,1,1);
        gcdTest(1,maxValue-1,maxValue,1,maxValue);
        gcdTest(1,maxValue-1,maxValue,1,maxValue-1);
        gcdTest(1,maxValue-1,maxValue,1,minValue);
        gcdTest(1,maxValue-1,maxValue,1,minValue+1);


        gcdTest(1,maxValue-1,maxValue,maxValue,-1);
        gcdTest(1,maxValue-1,maxValue,maxValue,0);
        gcdTest(1,maxValue-1,maxValue,maxValue,1);
        gcdTest(1,maxValue-1,maxValue,maxValue,maxValue);
        gcdTest(1,maxValue-1,maxValue,maxValue,maxValue-1);
        gcdTest(1,maxValue-1,maxValue,maxValue,minValue);
        gcdTest(1,maxValue-1,maxValue,maxValue,minValue+1);


        gcdTest(1,maxValue-1,maxValue,maxValue-1,-1);
        gcdTest(1,maxValue-1,maxValue,maxValue-1,0);
        gcdTest(1,maxValue-1,maxValue,maxValue-1,1);
        gcdTest(1,maxValue-1,maxValue,maxValue-1,maxValue);
        gcdTest(1,maxValue-1,maxValue,maxValue-1,maxValue-1);
        gcdTest(1,maxValue-1,maxValue,maxValue-1,minValue);
        gcdTest(1,maxValue-1,maxValue,maxValue-1,minValue+1);


        gcdTest(1,maxValue-1,maxValue,minValue,-1);
        gcdTest(1,maxValue-1,maxValue,minValue,0);
        gcdTest(1,maxValue-1,maxValue,minValue,1);
        gcdTest(1,maxValue-1,maxValue,minValue,maxValue);
        gcdTest(1,maxValue-1,maxValue,minValue,maxValue-1);
        gcdTest(1,maxValue-1,maxValue,minValue,minValue);
        gcdTest(1,maxValue-1,maxValue,minValue,minValue+1);


        gcdTest(1,maxValue-1,maxValue,minValue+1,-1);
        gcdTest(1,maxValue-1,maxValue,minValue+1,0);
        gcdTest(1,maxValue-1,maxValue,minValue+1,1);
        gcdTest(1,maxValue-1,maxValue,minValue+1,maxValue);
        gcdTest(1,maxValue-1,maxValue,minValue+1,maxValue-1);
        gcdTest(1,maxValue-1,maxValue,minValue+1,minValue);
        gcdTest(1,maxValue-1,maxValue,minValue+1,minValue+1);


        gcdTest(1,maxValue-1,maxValue-1,-1,-1);
        gcdTest(1,maxValue-1,maxValue-1,-1,0);
        gcdTest(1,maxValue-1,maxValue-1,-1,1);
        gcdTest(1,maxValue-1,maxValue-1,-1,maxValue);
        gcdTest(1,maxValue-1,maxValue-1,-1,maxValue-1);
        gcdTest(1,maxValue-1,maxValue-1,-1,minValue);
        gcdTest(1,maxValue-1,maxValue-1,-1,minValue+1);


        gcdTest(1,maxValue-1,maxValue-1,0,-1);
        gcdTest(2147483646,maxValue-1,maxValue-1,0,0);
        gcdTest(1,maxValue-1,maxValue-1,0,1);
        gcdTest(1,maxValue-1,maxValue-1,0,maxValue);
        gcdTest(2147483646,maxValue-1,maxValue-1,0,maxValue-1);
        gcdTest(1,maxValue-1,maxValue-1,0,minValue);
        gcdTest(2147483646,maxValue-1,maxValue-1,0,minValue+1);


        gcdTest(1,maxValue-1,maxValue-1,1,-1);
        gcdTest(1,maxValue-1,maxValue-1,1,0);
        gcdTest(1,maxValue-1,maxValue-1,1,1);
        gcdTest(1,maxValue-1,maxValue-1,1,maxValue);
        gcdTest(1,maxValue-1,maxValue-1,1,maxValue-1);
        gcdTest(1,maxValue-1,maxValue-1,1,minValue);
        gcdTest(1,maxValue-1,maxValue-1,1,minValue+1);


        gcdTest(1,maxValue-1,maxValue-1,maxValue,-1);
        gcdTest(1,maxValue-1,maxValue-1,maxValue,0);
        gcdTest(1,maxValue-1,maxValue-1,maxValue,1);
        gcdTest(1,maxValue-1,maxValue-1,maxValue,maxValue);
        gcdTest(1,maxValue-1,maxValue-1,maxValue,maxValue-1);
        gcdTest(1,maxValue-1,maxValue-1,maxValue,minValue);
        gcdTest(1,maxValue-1,maxValue-1,maxValue,minValue+1);
        gcdTest(1,maxValue-1,maxValue-1,maxValue-1,-1);


        gcdTest(2147483646,maxValue-1,maxValue-1,maxValue-1,0);
        gcdTest(1,maxValue-1,maxValue-1,maxValue-1,1);
        gcdTest(1,maxValue-1,maxValue-1,maxValue-1,maxValue);
        gcdTest(2147483646,maxValue-1,maxValue-1,maxValue-1,maxValue-1);
        gcdTest(1,maxValue-1,maxValue-1,maxValue-1,minValue);
        gcdTest(2147483646,maxValue-1,maxValue-1,maxValue-1,minValue+1);


        gcdTest(1,maxValue-1,maxValue-1,minValue,-1);
        gcdTest(1,maxValue-1,maxValue-1,minValue,0);
        gcdTest(1,maxValue-1,maxValue-1,minValue,1);
        gcdTest(1,maxValue-1,maxValue-1,minValue,maxValue);
        gcdTest(1,maxValue-1,maxValue-1,minValue,maxValue-1);
        gcdTest(1,maxValue-1,maxValue-1,minValue,minValue);
        gcdTest(1,maxValue-1,maxValue-1,minValue,minValue+1);


        gcdTest(1,maxValue-1,maxValue-1,minValue+1,-1);
        gcdTest(2147483646,maxValue-1,maxValue-1,minValue+1,0);
        gcdTest(1,maxValue-1,maxValue-1,minValue+1,1);
        gcdTest(1,maxValue-1,maxValue-1,minValue+1,maxValue);
        gcdTest(2147483646,maxValue-1,maxValue-1,minValue+1,maxValue-1);
        gcdTest(1,maxValue-1,maxValue-1,minValue+1,minValue);
        gcdTest(2147483646,maxValue-1,maxValue-1,minValue+1,minValue+1);


        gcdTest(1,maxValue-1,minValue,-1,-1);
        gcdTest(1,maxValue-1,minValue,-1,0);
        gcdTest(1,maxValue-1,minValue,-1,1);
        gcdTest(1,maxValue-1,minValue,-1,maxValue);
        gcdTest(1,maxValue-1,minValue,-1,maxValue-1);
        gcdTest(1,maxValue-1,minValue,-1,minValue);
        gcdTest(1,maxValue-1,minValue,-1,minValue+1);


        gcdTest(1,maxValue-1,minValue,0,-1);
        gcdTest(1,maxValue-1,minValue,0,0);
        gcdTest(1,maxValue-1,minValue,0,1);
        gcdTest(1,maxValue-1,minValue,0,maxValue);
        gcdTest(1,maxValue-1,minValue,0,maxValue-1);
        gcdTest(1,maxValue-1,minValue,0,minValue);
        gcdTest(1,maxValue-1,minValue,0,minValue+1);


        gcdTest(1,maxValue-1,minValue,1,-1);
        gcdTest(1,maxValue-1,minValue,1,0);
        gcdTest(1,maxValue-1,minValue,1,1);
        gcdTest(1,maxValue-1,minValue,1,maxValue);
        gcdTest(1,maxValue-1,minValue,1,maxValue-1);
        gcdTest(1,maxValue-1,minValue,1,minValue);
        gcdTest(1,maxValue-1,minValue,1,minValue+1);


        gcdTest(1,maxValue-1,minValue,maxValue,-1);
        gcdTest(1,maxValue-1,minValue,maxValue,0);
        gcdTest(1,maxValue-1,minValue,maxValue,1);
        gcdTest(1,maxValue-1,minValue,maxValue,maxValue);
        gcdTest(1,maxValue-1,minValue,maxValue,maxValue-1);
        gcdTest(1,maxValue-1,minValue,maxValue,minValue);
        gcdTest(1,maxValue-1,minValue,maxValue,minValue+1);


        gcdTest(1,maxValue-1,minValue,maxValue-1,-1);
        gcdTest(1,maxValue-1,minValue,maxValue-1,0);
        gcdTest(1,maxValue-1,minValue,maxValue-1,1);
        gcdTest(1,maxValue-1,minValue,maxValue-1,maxValue);
        gcdTest(1,maxValue-1,minValue,maxValue-1,maxValue-1);
        gcdTest(1,maxValue-1,minValue,maxValue-1,minValue);
        gcdTest(1,maxValue-1,minValue,maxValue-1,minValue+1);


        gcdTest(1,maxValue-1,minValue,minValue,-1);
        gcdTest(1,maxValue-1,minValue,minValue,0);
        gcdTest(1,maxValue-1,minValue,minValue,1);
        gcdTest(1,maxValue-1,minValue,minValue,maxValue);
        gcdTest(1,maxValue-1,minValue,minValue,maxValue-1);
        gcdTest(1,maxValue-1,minValue,minValue,minValue);
        gcdTest(1,maxValue-1,minValue,minValue,minValue+1);


        gcdTest(1,maxValue-1,minValue,minValue+1,-1);
        gcdTest(1,maxValue-1,minValue,minValue+1,0);
        gcdTest(1,maxValue-1,minValue,minValue+1,1);
        gcdTest(1,maxValue-1,minValue,minValue+1,maxValue);
        gcdTest(1,maxValue-1,minValue,minValue+1,maxValue-1);
        gcdTest(1,maxValue-1,minValue,minValue+1,minValue);
        gcdTest(1,maxValue-1,minValue,minValue+1,minValue+1);


        gcdTest(1,maxValue-1,minValue+1,-1,-1);
        gcdTest(1,maxValue-1,minValue+1,-1,0);
        gcdTest(1,maxValue-1,minValue+1,-1,1);
        gcdTest(1,maxValue-1,minValue+1,-1,maxValue);
        gcdTest(1,maxValue-1,minValue+1,-1,maxValue-1);
        gcdTest(1,maxValue-1,minValue+1,-1,minValue);
        gcdTest(1,maxValue-1,minValue+1,-1,minValue+1);


        gcdTest(1,maxValue-1,minValue+1,0,-1);
        gcdTest(2147483646,maxValue-1,minValue+1,0,0);
        gcdTest(1,maxValue-1,minValue+1,0,1);
        gcdTest(1,maxValue-1,minValue+1,0,maxValue);
        gcdTest(2147483646,maxValue-1,minValue+1,0,maxValue-1);
        gcdTest(1,maxValue-1,minValue+1,0,minValue);
        gcdTest(2147483646,maxValue-1,minValue+1,0,minValue+1);


        gcdTest(1,maxValue-1,minValue+1,1,-1);
        gcdTest(1,maxValue-1,minValue+1,1,0);
        gcdTest(1,maxValue-1,minValue+1,1,1);
        gcdTest(1,maxValue-1,minValue+1,1,maxValue);
        gcdTest(1,maxValue-1,minValue+1,1,maxValue-1);
        gcdTest(1,maxValue-1,minValue+1,1,minValue);
        gcdTest(1,maxValue-1,minValue+1,1,minValue+1);


        gcdTest(1,maxValue-1,minValue+1,maxValue,-1);
        gcdTest(1,maxValue-1,minValue+1,maxValue,0);
        gcdTest(1,maxValue-1,minValue+1,maxValue,1);
        gcdTest(1,maxValue-1,minValue+1,maxValue,maxValue);
        gcdTest(1,maxValue-1,minValue+1,maxValue,maxValue-1);
        gcdTest(1,maxValue-1,minValue+1,maxValue,minValue);
        gcdTest(1,maxValue-1,minValue+1,maxValue,minValue+1);


        gcdTest(1,maxValue-1,minValue+1,maxValue-1,-1);
        gcdTest(2147483646,maxValue-1,minValue+1,maxValue-1,0);
        gcdTest(1,maxValue-1,minValue+1,maxValue-1,1);
        gcdTest(1,maxValue-1,minValue+1,maxValue-1,maxValue);
        gcdTest(2147483646,maxValue-1,minValue+1,maxValue-1,maxValue-1);
        gcdTest(1,maxValue-1,minValue+1,maxValue-1,minValue);
        gcdTest(2147483646,maxValue-1,minValue+1,maxValue-1,minValue+1);


        gcdTest(1,maxValue-1,minValue+1,minValue,-1);
        gcdTest(1,maxValue-1,minValue+1,minValue,0);
        gcdTest(1,maxValue-1,minValue+1,minValue,1);
        gcdTest(1,maxValue-1,minValue+1,minValue,maxValue);
        gcdTest(1,maxValue-1,minValue+1,minValue,maxValue-1);
        gcdTest(1,maxValue-1,minValue+1,minValue,minValue);
        gcdTest(1,maxValue-1,minValue+1,minValue,minValue+1);


        gcdTest(1,maxValue-1,minValue+1,minValue+1,-1);
        gcdTest(2147483646,maxValue-1,minValue+1,minValue+1,0);
        gcdTest(1,maxValue-1,minValue+1,minValue+1,1);
        gcdTest(1,maxValue-1,minValue+1,minValue+1,maxValue);
        gcdTest(2147483646,maxValue-1,minValue+1,minValue+1,maxValue-1);
        gcdTest(1,maxValue-1,minValue+1,minValue+1,minValue);
        gcdTest(2147483646,maxValue-1,minValue+1,minValue+1,minValue+1);
        //endregion

        //region граничные значения класса, MAX && 0
        gcdTest(1,minValue,-1,-1,-1);
        gcdTest(1,minValue,-1,-1,0);
        gcdTest(1,minValue,-1,-1,1);
        gcdTest(1,minValue,-1,-1,maxValue);
        gcdTest(1,minValue,-1,-1,maxValue-1);
        gcdTest(1,minValue,-1,-1,minValue);
        gcdTest(1,minValue,-1,-1,minValue+1);


        gcdTest(1,minValue,-1,0,-1);
        gcdTest(1,minValue,-1,0,0);
        gcdTest(1,minValue,-1,0,1);
        gcdTest(1,minValue,-1,0,maxValue);
        gcdTest(1,minValue,-1,0,maxValue-1);
        gcdTest(1,minValue,-1,0,minValue);
        gcdTest(1,minValue,-1,0,minValue+1);


        gcdTest(1,minValue,-1,1,-1);
        gcdTest(1,minValue,-1,1,0);
        gcdTest(1,minValue,-1,1,1);
        gcdTest(1,minValue,-1,1,maxValue);
        gcdTest(1,minValue,-1,1,maxValue-1);
        gcdTest(1,minValue,-1,1,minValue);
        gcdTest(1,minValue,-1,1,minValue+1);


        gcdTest(1,minValue,-1,maxValue,-1);
        gcdTest(1,minValue,-1,maxValue,0);
        gcdTest(1,minValue,-1,maxValue,1);
        gcdTest(1,minValue,-1,maxValue,maxValue);
        gcdTest(1,minValue,-1,maxValue,maxValue-1);
        gcdTest(1,minValue,-1,maxValue,minValue);
        gcdTest(1,minValue,-1,maxValue,minValue+1);


        gcdTest(1,minValue,-1,maxValue-1,-1);
        gcdTest(1,minValue,-1,maxValue-1,0);
        gcdTest(1,minValue,-1,maxValue-1,1);
        gcdTest(1,minValue,-1,maxValue-1,maxValue);
        gcdTest(1,minValue,-1,maxValue-1,maxValue-1);
        gcdTest(1,minValue,-1,maxValue-1,minValue);
        gcdTest(1,minValue,-1,maxValue-1,minValue+1);


        gcdTest(1,minValue,-1,minValue,-1);
        gcdTest(1,minValue,-1,minValue,0);
        gcdTest(1,minValue,-1,minValue,1);
        gcdTest(1,minValue,-1,minValue,maxValue);
        gcdTest(1,minValue,-1,minValue,maxValue-1);
        gcdTest(1,minValue,-1,minValue,minValue);
        gcdTest(1,minValue,-1,minValue,minValue+1);


        gcdTest(1,minValue,-1,minValue+1,-1);
        gcdTest(1,minValue,-1,minValue+1,0);
        gcdTest(1,minValue,-1,minValue+1,1);
        gcdTest(1,minValue,-1,minValue+1,maxValue);
        gcdTest(1,minValue,-1,minValue+1,maxValue-1);
        gcdTest(1,minValue,-1,minValue+1,minValue);
        gcdTest(1,minValue,-1,minValue+1,minValue+1);


        gcdTest(1,minValue,0,-1,-1);
        gcdTest(1,minValue,0,-1,0);
        gcdTest(1,minValue,0,-1,1);
        gcdTest(1,minValue,0,-1,maxValue);
        gcdTest(1,minValue,0,-1,maxValue-1);
        gcdTest(1,minValue,0,-1,minValue);
        gcdTest(1,minValue,0,-1,minValue+1);


        gcdTest(1,minValue,0,0,-1);
        gcdTest(2147483647,minValue,0,0,0);
        gcdTest(1,minValue,0,0,1);
        gcdTest(2147483647,minValue,0,0,maxValue);
        gcdTest(1,minValue,0,0,maxValue-1);
        gcdTest(2147483647,minValue,0,0,minValue);
        gcdTest(1,minValue,0,0,minValue+1);


        gcdTest(1,minValue,0,1,-1);
        gcdTest(1,minValue,0,1,0);
        gcdTest(1,minValue,0,1,1);
        gcdTest(1,minValue,0,1,maxValue);
        gcdTest(1,minValue,0,1,maxValue-1);
        gcdTest(1,minValue,0,1,minValue);
        gcdTest(1,minValue,0,1,minValue+1);


        gcdTest(1,minValue,0,maxValue,-1);
        gcdTest(2147483647,minValue,0,maxValue,0);
        gcdTest(1,minValue,0,maxValue,1);
        gcdTest(2147483647,minValue,0,maxValue,maxValue);
        gcdTest(1,minValue,0,maxValue,maxValue-1);
        gcdTest(2147483647,minValue,0,maxValue,minValue);
        gcdTest(1,minValue,0,maxValue,minValue+1);


        gcdTest(1,minValue,0,maxValue-1,-1);
        gcdTest(1,minValue,0,maxValue-1,0);
        gcdTest(1,minValue,0,maxValue-1,1);
        gcdTest(1,minValue,0,maxValue-1,maxValue);
        gcdTest(1,minValue,0,maxValue-1,maxValue-1);
        gcdTest(1,minValue,0,maxValue-1,minValue);
        gcdTest(1,minValue,0,maxValue-1,minValue+1);


        gcdTest(1,minValue,0,minValue,-1);
        gcdTest(2147483647,minValue,0,minValue,0);
        gcdTest(1,minValue,0,minValue,1);
        gcdTest(2147483647,minValue,0,minValue,maxValue);
        gcdTest(1,minValue,0,minValue,maxValue-1);
        gcdTest(2147483647,minValue,0,minValue,minValue);
        gcdTest(1,minValue,0,minValue,minValue+1);


        gcdTest(1,minValue,0,minValue+1,-1);
        gcdTest(1,minValue,0,minValue+1,0);
        gcdTest(1,minValue,0,minValue+1,1);
        gcdTest(1,minValue,0,minValue+1,maxValue);
        gcdTest(1,minValue,0,minValue+1,maxValue-1);
        gcdTest(1,minValue,0,minValue+1,minValue);
        gcdTest(1,minValue,0,minValue+1,minValue+1);


        gcdTest(1,minValue,1,-1,-1);
        gcdTest(1,minValue,1,-1,0);
        gcdTest(1,minValue,1,-1,1);
        gcdTest(1,minValue,1,-1,maxValue);
        gcdTest(1,minValue,1,-1,maxValue-1);
        gcdTest(1,minValue,1,-1,minValue);
        gcdTest(1,minValue,1,-1,minValue+1);



        gcdTest(1,minValue,1,0,-1);
        gcdTest(1,minValue,1,0,0);
        gcdTest(1,minValue,1,0,1);
        gcdTest(1,minValue,1,0,maxValue);
        gcdTest(1,minValue,1,0,maxValue-1);
        gcdTest(1,minValue,1,0,minValue);
        gcdTest(1,minValue,1,0,minValue+1);


        gcdTest(1,minValue,1,1,-1);
        gcdTest(1,minValue,1,1,0);
        gcdTest(1,minValue,1,1,1);
        gcdTest(1,minValue,1,1,maxValue);
        gcdTest(1,minValue,1,1,maxValue-1);
        gcdTest(1,minValue,1,1,minValue);
        gcdTest(1,minValue,1,1,minValue+1);



        gcdTest(1,minValue,1,maxValue,-1);
        gcdTest(1,minValue,1,maxValue,0);
        gcdTest(1,minValue,1,maxValue,1);
        gcdTest(1,minValue,1,maxValue,maxValue);
        gcdTest(1,minValue,1,maxValue,maxValue-1);
        gcdTest(1,minValue,1,maxValue,minValue);
        gcdTest(1,minValue,1,maxValue,minValue+1);


        gcdTest(1,minValue,1,maxValue-1,-1);
        gcdTest(1,minValue,1,maxValue-1,0);
        gcdTest(1,minValue,1,maxValue-1,1);
        gcdTest(1,minValue,1,maxValue-1,maxValue);
        gcdTest(1,minValue,1,maxValue-1,maxValue-1);
        gcdTest(1,minValue,1,maxValue-1,minValue);
        gcdTest(1,minValue,1,maxValue-1,minValue+1);


        gcdTest(1,minValue,1,minValue,-1);
        gcdTest(1,minValue,1,minValue,0);
        gcdTest(1,minValue,1,minValue,1);
        gcdTest(1,minValue,1,minValue,maxValue);
        gcdTest(1,minValue,1,minValue,maxValue-1);
        gcdTest(1,minValue,1,minValue,minValue);
        gcdTest(1,minValue,1,minValue,minValue+1);


        gcdTest(1,minValue,1,minValue+1,-1);
        gcdTest(1,minValue,1,minValue+1,0);
        gcdTest(1,minValue,1,minValue+1,1);
        gcdTest(1,minValue,1,minValue+1,maxValue);
        gcdTest(1,minValue,1,minValue+1,maxValue-1);
        gcdTest(1,minValue,1,minValue+1,minValue);
        gcdTest(1,minValue,1,minValue+1,minValue+1);


        gcdTest(1,minValue,maxValue,-1,-1);
        gcdTest(1,minValue,maxValue,-1,0);
        gcdTest(1,minValue,maxValue,-1,1);
        gcdTest(1,minValue,maxValue,-1,maxValue);
        gcdTest(1,minValue,maxValue,-1,maxValue-1);
        gcdTest(1,minValue,maxValue,-1,minValue);
        gcdTest(1,minValue,maxValue,-1,minValue+1);


        gcdTest(1,minValue,maxValue,0,-1);
        gcdTest(2147483647,minValue,maxValue,0,0);
        gcdTest(1,minValue,maxValue,0,1);
        gcdTest(2147483647,minValue,maxValue,0,maxValue);
        gcdTest(1,minValue,maxValue,0,maxValue-1);
        gcdTest(2147483647,minValue,maxValue,0,minValue);
        gcdTest(1,minValue,maxValue,0,minValue+1);


        gcdTest(1,minValue,maxValue,1,-1);
        gcdTest(1,minValue,maxValue,1,0);
        gcdTest(1,minValue,maxValue,1,1);
        gcdTest(1,minValue,maxValue,1,maxValue);
        gcdTest(1,minValue,maxValue,1,maxValue-1);
        gcdTest(1,minValue,maxValue,1,minValue);
        gcdTest(1,minValue,maxValue,1,minValue+1);


        gcdTest(1,minValue,maxValue,maxValue,-1);
        gcdTest(2147483647,minValue,maxValue,maxValue,0);
        gcdTest(1,minValue,maxValue,maxValue,1);
        gcdTest(2147483647,minValue,maxValue,maxValue,maxValue);
        gcdTest(1,minValue,maxValue,maxValue,maxValue-1);
        gcdTest(2147483647,minValue,maxValue,maxValue,minValue);
        gcdTest(1,minValue,maxValue,maxValue,minValue+1);


        gcdTest(1,minValue,maxValue,maxValue-1,-1);
        gcdTest(1,minValue,maxValue,maxValue-1,0);
        gcdTest(1,minValue,maxValue,maxValue-1,1);
        gcdTest(1,minValue,maxValue,maxValue-1,maxValue);
        gcdTest(1,minValue,maxValue,maxValue-1,maxValue-1);
        gcdTest(1,minValue,maxValue,maxValue-1,minValue);
        gcdTest(1,minValue,maxValue,maxValue-1,minValue+1);



        gcdTest(1,minValue,maxValue,minValue,-1);
        gcdTest(2147483647,minValue,maxValue,minValue,0);
        gcdTest(1,minValue,maxValue,minValue,1);
        gcdTest(2147483647,minValue,maxValue,minValue,maxValue);
        gcdTest(1,minValue,maxValue,minValue,maxValue-1);
        gcdTest(2147483647,minValue,maxValue,minValue,minValue);
        gcdTest(1,minValue,maxValue,minValue,minValue+1);


        gcdTest(1,minValue,maxValue,minValue+1,-1);
        gcdTest(1,minValue,maxValue,minValue+1,0);
        gcdTest(1,minValue,maxValue,minValue+1,1);
        gcdTest(1,minValue,maxValue,minValue+1,maxValue);
        gcdTest(1,minValue,maxValue,minValue+1,maxValue-1);
        gcdTest(1,minValue,maxValue,minValue+1,minValue);
        gcdTest(1,minValue,maxValue,minValue+1,minValue+1);


        gcdTest(1,minValue,maxValue-1,-1,-1);
        gcdTest(1,minValue,maxValue-1,-1,0);
        gcdTest(1,minValue,maxValue-1,-1,1);
        gcdTest(1,minValue,maxValue-1,-1,maxValue);
        gcdTest(1,minValue,maxValue-1,-1,maxValue-1);
        gcdTest(1,minValue,maxValue-1,-1,minValue);
        gcdTest(1,minValue,maxValue-1,-1,minValue+1);


        gcdTest(1,minValue,maxValue-1,0,-1);
        gcdTest(1,minValue,maxValue-1,0,0);
        gcdTest(1,minValue,maxValue-1,0,1);
        gcdTest(1,minValue,maxValue-1,0,maxValue);
        gcdTest(1,minValue,maxValue-1,0,maxValue-1);
        gcdTest(1,minValue,maxValue-1,0,minValue);
        gcdTest(1,minValue,maxValue-1,0,minValue+1);


        gcdTest(1,minValue,maxValue-1,1,-1);
        gcdTest(1,minValue,maxValue-1,1,0);
        gcdTest(1,minValue,maxValue-1,1,1);
        gcdTest(1,minValue,maxValue-1,1,maxValue);
        gcdTest(1,minValue,maxValue-1,1,maxValue-1);
        gcdTest(1,minValue,maxValue-1,1,minValue);
        gcdTest(1,minValue,maxValue-1,1,minValue+1);


        gcdTest(1,minValue,maxValue-1,maxValue,-1);
        gcdTest(1,minValue,maxValue-1,maxValue,0);
        gcdTest(1,minValue,maxValue-1,maxValue,1);
        gcdTest(1,minValue,maxValue-1,maxValue,maxValue);
        gcdTest(1,minValue,maxValue-1,maxValue,maxValue-1);
        gcdTest(1,minValue,maxValue-1,maxValue,minValue);
        gcdTest(1,minValue,maxValue-1,maxValue,minValue+1);


        gcdTest(1,minValue,maxValue-1,maxValue-1,-1);
        gcdTest(1,minValue,maxValue-1,maxValue-1,0);
        gcdTest(1,minValue,maxValue-1,maxValue-1,1);
        gcdTest(1,minValue,maxValue-1,maxValue-1,maxValue);
        gcdTest(1,minValue,maxValue-1,maxValue-1,maxValue-1);
        gcdTest(1,minValue,maxValue-1,maxValue-1,minValue);
        gcdTest(1,minValue,maxValue-1,maxValue-1,minValue+1);


        gcdTest(1,minValue,maxValue-1,minValue,-1);
        gcdTest(1,minValue,maxValue-1,minValue,0);
        gcdTest(1,minValue,maxValue-1,minValue,1);
        gcdTest(1,minValue,maxValue-1,minValue,maxValue);
        gcdTest(1,minValue,maxValue-1,minValue,maxValue-1);
        gcdTest(1,minValue,maxValue-1,minValue,minValue);
        gcdTest(1,minValue,maxValue-1,minValue,minValue+1);


        gcdTest(1,minValue,maxValue-1,minValue+1,-1);
        gcdTest(1,minValue,maxValue-1,minValue+1,0);
        gcdTest(1,minValue,maxValue-1,minValue+1,1);
        gcdTest(1,minValue,maxValue-1,minValue+1,maxValue);
        gcdTest(1,minValue,maxValue-1,minValue+1,maxValue-1);
        gcdTest(1,minValue,maxValue-1,minValue+1,minValue);
        gcdTest(1,minValue,maxValue-1,minValue+1,minValue+1);


        gcdTest(1,minValue,minValue,-1,-1);
        gcdTest(1,minValue,minValue,-1,0);
        gcdTest(1,minValue,minValue,-1,1);
        gcdTest(1,minValue,minValue,-1,maxValue);
        gcdTest(1,minValue,minValue,-1,maxValue-1);
        gcdTest(1,minValue,minValue,-1,minValue);
        gcdTest(1,minValue,minValue,-1,minValue+1);


        gcdTest(1,minValue,minValue,0,-1);
        gcdTest(2147483647,minValue,minValue,0,0);
        gcdTest(1,minValue,minValue,0,1);
        gcdTest(2147483647,minValue,minValue,0,maxValue);
        gcdTest(1,minValue,minValue,0,maxValue-1);
        gcdTest(2147483647,minValue,minValue,0,minValue);
        gcdTest(1,minValue,minValue,0,minValue+1);


        gcdTest(1,minValue,minValue,1,-1);
        gcdTest(1,minValue,minValue,1,0);
        gcdTest(1,minValue,minValue,1,1);
        gcdTest(1,minValue,minValue,1,maxValue);
        gcdTest(1,minValue,minValue,1,maxValue-1);
        gcdTest(1,minValue,minValue,1,minValue);
        gcdTest(1,minValue,minValue,1,minValue+1);


        gcdTest(1,minValue,minValue,maxValue,-1);
        gcdTest(2147483647,minValue,minValue,maxValue,0);
        gcdTest(1,minValue,minValue,maxValue,1);
        gcdTest(2147483647,minValue,minValue,maxValue,maxValue);
        gcdTest(1,minValue,minValue,maxValue,maxValue-1);
        gcdTest(2147483647,minValue,minValue,maxValue,minValue);
        gcdTest(1,minValue,minValue,maxValue,minValue+1);


        gcdTest(1,minValue,minValue,maxValue-1,-1);
        gcdTest(1,minValue,minValue,maxValue-1,0);
        gcdTest(1,minValue,minValue,maxValue-1,1);
        gcdTest(1,minValue,minValue,maxValue-1,maxValue);
        gcdTest(1,minValue,minValue,maxValue-1,maxValue-1);
        gcdTest(1,minValue,minValue,maxValue-1,minValue);
        gcdTest(1,minValue,minValue,maxValue-1,minValue+1);


        gcdTest(1,minValue,minValue,minValue,-1);
        gcdTest(2147483647,minValue,minValue,minValue,0);
        gcdTest(1,minValue,minValue,minValue,1);
        gcdTest(2147483647,minValue,minValue,minValue,maxValue);
        gcdTest(1,minValue,minValue,minValue,maxValue-1);
        gcdTest(2147483647,minValue,minValue,minValue,minValue);
        gcdTest(1,minValue,minValue,minValue,minValue+1);


        gcdTest(1,minValue,minValue,minValue+1,-1);
        gcdTest(1,minValue,minValue,minValue+1,0);
        gcdTest(1,minValue,minValue,minValue+1,1);
        gcdTest(1,minValue,minValue,minValue+1,maxValue);
        gcdTest(1,minValue,minValue,minValue+1,maxValue-1);
        gcdTest(1,minValue,minValue,minValue+1,minValue);
        gcdTest(1,minValue,minValue,minValue+1,minValue+1);


        gcdTest(1,minValue,minValue+1,-1,-1);
        gcdTest(1,minValue,minValue+1,-1,0);
        gcdTest(1,minValue,minValue+1,-1,1);
        gcdTest(1,minValue,minValue+1,-1,maxValue);
        gcdTest(1,minValue,minValue+1,-1,maxValue-1);
        gcdTest(1,minValue,minValue+1,-1,minValue);
        gcdTest(1,minValue,minValue+1,-1,minValue+1);


        gcdTest(1,minValue,minValue+1,0,-1);
        gcdTest(1,minValue,minValue+1,0,0);
        gcdTest(1,minValue,minValue+1,0,1);
        gcdTest(1,minValue,minValue+1,0,maxValue);
        gcdTest(1,minValue,minValue+1,0,maxValue-1);
        gcdTest(1,minValue,minValue+1,0,minValue);
        gcdTest(1,minValue,minValue+1,0,minValue+1);


        gcdTest(1,minValue,minValue+1,1,-1);
        gcdTest(1,minValue,minValue+1,1,0);
        gcdTest(1,minValue,minValue+1,1,1);
        gcdTest(1,minValue,minValue+1,1,maxValue);
        gcdTest(1,minValue,minValue+1,1,maxValue-1);
        gcdTest(1,minValue,minValue+1,1,minValue);
        gcdTest(1,minValue,minValue+1,1,minValue+1);


        gcdTest(1,minValue,minValue+1,maxValue,-1);
        gcdTest(1,minValue,minValue+1,maxValue,0);
        gcdTest(1,minValue,minValue+1,maxValue,1);
        gcdTest(1,minValue,minValue+1,maxValue,maxValue);
        gcdTest(1,minValue,minValue+1,maxValue,maxValue-1);
        gcdTest(1,minValue,minValue+1,maxValue,minValue);
        gcdTest(1,minValue,minValue+1,maxValue,minValue+1);


        gcdTest(1,minValue,minValue+1,maxValue-1,-1);
        gcdTest(1,minValue,minValue+1,maxValue-1,0);
        gcdTest(1,minValue,minValue+1,maxValue-1,1);
        gcdTest(1,minValue,minValue+1,maxValue-1,maxValue);
        gcdTest(1,minValue,minValue+1,maxValue-1,maxValue-1);
        gcdTest(1,minValue,minValue+1,maxValue-1,minValue);
        gcdTest(1,minValue,minValue+1,maxValue-1,minValue+1);


        gcdTest(1,minValue,minValue+1,minValue,-1);
        gcdTest(1,minValue,minValue+1,minValue,0);
        gcdTest(1,minValue,minValue+1,minValue,1);
        gcdTest(1,minValue,minValue+1,minValue,maxValue);
        gcdTest(1,minValue,minValue+1,minValue,maxValue-1);
        gcdTest(1,minValue,minValue+1,minValue,minValue);
        gcdTest(1,minValue,minValue+1,minValue,minValue+1);


        gcdTest(1,minValue,minValue+1,minValue+1,-1);
        gcdTest(1,minValue,minValue+1,minValue+1,0);
        gcdTest(1,minValue,minValue+1,minValue+1,1);
        gcdTest(1,minValue,minValue+1,minValue+1,maxValue);
        gcdTest(1,minValue,minValue+1,minValue+1,maxValue-1);
        gcdTest(1,minValue,minValue+1,minValue+1,minValue);
        gcdTest(1,minValue,minValue+1,minValue+1,minValue+1);
        //endregion

        //region граничные значения класса
        gcdTest(1,minValue+1,-1,-1,-1);
        gcdTest(1,minValue+1,-1,-1,0);
        gcdTest(1,minValue+1,-1,-1,1);
        gcdTest(1,minValue+1,-1,-1,maxValue);
        gcdTest(1,minValue+1,-1,-1,maxValue-1);
        gcdTest(1,minValue+1,-1,-1,minValue);
        gcdTest(1,minValue+1,-1,-1,minValue+1);

        gcdTest(1,minValue+1,-1,0,-1);
        gcdTest(1,minValue+1,-1,0,0);
        gcdTest(1,minValue+1,-1,0,1);
        gcdTest(1,minValue+1,-1,0,maxValue);
        gcdTest(1,minValue+1,-1,0,maxValue-1);
        gcdTest(1,minValue+1,-1,0,minValue);
        gcdTest(1,minValue+1,-1,0,minValue+1);


        gcdTest(1,minValue+1,-1,1,-1);
        gcdTest(1,minValue+1,-1,1,0);
        gcdTest(1,minValue+1,-1,1,1);
        gcdTest(1,minValue+1,-1,1,maxValue);
        gcdTest(1,minValue+1,-1,1,maxValue-1);
        gcdTest(1,minValue+1,-1,1,minValue);
        gcdTest(1,minValue+1,-1,1,minValue+1);


        gcdTest(1,minValue+1,-1,maxValue,-1);
        gcdTest(1,minValue+1,-1,maxValue,0);
        gcdTest(1,minValue+1,-1,maxValue,1);
        gcdTest(1,minValue+1,-1,maxValue,maxValue);
        gcdTest(1,minValue+1,-1,maxValue,maxValue-1);
        gcdTest(1,minValue+1,-1,maxValue,minValue);
        gcdTest(1,minValue+1,-1,maxValue,minValue+1);


        gcdTest(1,minValue+1,-1,maxValue-1,-1);
        gcdTest(1,minValue+1,-1,maxValue-1,0);
        gcdTest(1,minValue+1,-1,maxValue-1,1);
        gcdTest(1,minValue+1,-1,maxValue-1,maxValue);
        gcdTest(1,minValue+1,-1,maxValue-1,maxValue-1);
        gcdTest(1,minValue+1,-1,maxValue-1,minValue);
        gcdTest(1,minValue+1,-1,maxValue-1,minValue+1);


        gcdTest(1,minValue+1,-1,minValue,-1);
        gcdTest(1,minValue+1,-1,minValue,0);
        gcdTest(1,minValue+1,-1,minValue,1);
        gcdTest(1,minValue+1,-1,minValue,maxValue);
        gcdTest(1,minValue+1,-1,minValue,maxValue-1);
        gcdTest(1,minValue+1,-1,minValue,minValue);
        gcdTest(1,minValue+1,-1,minValue,minValue+1);


        gcdTest(1,minValue+1,-1,minValue+1,-1);
        gcdTest(1,minValue+1,-1,minValue+1,0);
        gcdTest(1,minValue+1,-1,minValue+1,1);
        gcdTest(1,minValue+1,-1,minValue+1,maxValue);
        gcdTest(1,minValue+1,-1,minValue+1,maxValue-1);
        gcdTest(1,minValue+1,-1,minValue+1,minValue);
        gcdTest(1,minValue+1,-1,minValue+1,minValue+1);


        gcdTest(1,minValue+1,0,-1,-1);
        gcdTest(1,minValue+1,0,-1,0);
        gcdTest(1,minValue+1,0,-1,1);
        gcdTest(1,minValue+1,0,-1,maxValue);
        gcdTest(1,minValue+1,0,-1,maxValue-1);
        gcdTest(1,minValue+1,0,-1,minValue);
        gcdTest(1,minValue+1,0,-1,minValue+1);


        gcdTest(1,minValue+1,0,0,-1);
        gcdTest(2147483646,minValue+1,0,0,0);
        gcdTest(1,minValue+1,0,0,1);
        gcdTest(1,minValue+1,0,0,maxValue);
        gcdTest(2147483646,minValue+1,0,0,maxValue-1);
        gcdTest(1,minValue+1,0,0,minValue);
        gcdTest(2147483646,minValue+1,0,0,minValue+1);


        gcdTest(1,minValue+1,0,1,-1);
        gcdTest(1,minValue+1,0,1,0);
        gcdTest(1,minValue+1,0,1,1);
        gcdTest(1,minValue+1,0,1,maxValue);
        gcdTest(1,minValue+1,0,1,maxValue-1);
        gcdTest(1,minValue+1,0,1,minValue);
        gcdTest(1,minValue+1,0,1,minValue+1);


        gcdTest(1,minValue+1,0,maxValue,-1);
        gcdTest(1,minValue+1,0,maxValue,0);
        gcdTest(1,minValue+1,0,maxValue,1);
        gcdTest(1,minValue+1,0,maxValue,maxValue);
        gcdTest(1,minValue+1,0,maxValue,maxValue-1);
        gcdTest(1,minValue+1,0,maxValue,minValue);
        gcdTest(1,minValue+1,0,maxValue,minValue+1);


        gcdTest(1,minValue+1,0,maxValue-1,-1);
        gcdTest(2147483646,minValue+1,0,maxValue-1,0);
        gcdTest(1,minValue+1,0,maxValue-1,1);
        gcdTest(1,minValue+1,0,maxValue-1,maxValue);
        gcdTest(2147483646,minValue+1,0,maxValue-1,maxValue-1);
        gcdTest(1,minValue+1,0,maxValue-1,minValue);
        gcdTest(2147483646,minValue+1,0,maxValue-1,minValue+1);


        gcdTest(1,minValue+1,0,minValue,-1);
        gcdTest(1,minValue+1,0,minValue,0);
        gcdTest(1,minValue+1,0,minValue,1);
        gcdTest(1,minValue+1,0,minValue,maxValue);
        gcdTest(1,minValue+1,0,minValue,maxValue-1);
        gcdTest(1,minValue+1,0,minValue,minValue);
        gcdTest(1,minValue+1,0,minValue,minValue+1);


        gcdTest(1,minValue+1,0,minValue+1,-1);
        gcdTest(2147483646,minValue+1,0,minValue+1,0);
        gcdTest(1,minValue+1,0,minValue+1,1);
        gcdTest(1,minValue+1,0,minValue+1,maxValue);
        gcdTest(2147483646,minValue+1,0,minValue+1,maxValue-1);
        gcdTest(1,minValue+1,0,minValue+1,minValue);
        gcdTest(2147483646,minValue+1,0,minValue+1,minValue+1);


        gcdTest(1,minValue+1,1,-1,-1);
        gcdTest(1,minValue+1,1,-1,0);
        gcdTest(1,minValue+1,1,-1,1);
        gcdTest(1,minValue+1,1,-1,maxValue);
        gcdTest(1,minValue+1,1,-1,maxValue-1);
        gcdTest(1,minValue+1,1,-1,minValue);
        gcdTest(1,minValue+1,1,-1,minValue+1);


        gcdTest(1,minValue+1,1,0,-1);
        gcdTest(1,minValue+1,1,0,0);
        gcdTest(1,minValue+1,1,0,1);
        gcdTest(1,minValue+1,1,0,maxValue);
        gcdTest(1,minValue+1,1,0,maxValue-1);
        gcdTest(1,minValue+1,1,0,minValue);
        gcdTest(1,minValue+1,1,0,minValue+1);


        gcdTest(1,minValue+1,1,1,-1);
        gcdTest(1,minValue+1,1,1,0);
        gcdTest(1,minValue+1,1,1,1);
        gcdTest(1,minValue+1,1,1,maxValue);
        gcdTest(1,minValue+1,1,1,maxValue-1);
        gcdTest(1,minValue+1,1,1,minValue);
        gcdTest(1,minValue+1,1,1,minValue+1);


        gcdTest(1,minValue+1,1,maxValue,-1);
        gcdTest(1,minValue+1,1,maxValue,0);
        gcdTest(1,minValue+1,1,maxValue,1);
        gcdTest(1,minValue+1,1,maxValue,maxValue);
        gcdTest(1,minValue+1,1,maxValue,maxValue-1);
        gcdTest(1,minValue+1,1,maxValue,minValue);
        gcdTest(1,minValue+1,1,maxValue,minValue+1);


        gcdTest(1,minValue+1,1,maxValue-1,-1);
        gcdTest(1,minValue+1,1,maxValue-1,0);
        gcdTest(1,minValue+1,1,maxValue-1,1);
        gcdTest(1,minValue+1,1,maxValue-1,maxValue);
        gcdTest(1,minValue+1,1,maxValue-1,maxValue-1);
        gcdTest(1,minValue+1,1,maxValue-1,minValue);
        gcdTest(1,minValue+1,1,maxValue-1,minValue+1);


        gcdTest(1,minValue+1,1,minValue,-1);
        gcdTest(1,minValue+1,1,minValue,0);
        gcdTest(1,minValue+1,1,minValue,1);
        gcdTest(1,minValue+1,1,minValue,maxValue);
        gcdTest(1,minValue+1,1,minValue,maxValue-1);
        gcdTest(1,minValue+1,1,minValue,minValue);
        gcdTest(1,minValue+1,1,minValue,minValue+1);


        gcdTest(1,minValue+1,1,minValue+1,-1);
        gcdTest(1,minValue+1,1,minValue+1,0);
        gcdTest(1,minValue+1,1,minValue+1,1);
        gcdTest(1,minValue+1,1,minValue+1,maxValue);
        gcdTest(1,minValue+1,1,minValue+1,maxValue-1);
        gcdTest(1,minValue+1,1,minValue+1,minValue);
        gcdTest(1,minValue+1,1,minValue+1,minValue+1);


        gcdTest(1,minValue+1,maxValue,-1,-1);
        gcdTest(1,minValue+1,maxValue,-1,0);
        gcdTest(1,minValue+1,maxValue,-1,1);
        gcdTest(1,minValue+1,maxValue,-1,maxValue);
        gcdTest(1,minValue+1,maxValue,-1,maxValue-1);
        gcdTest(1,minValue+1,maxValue,-1,minValue);
        gcdTest(1,minValue+1,maxValue,-1,minValue+1);


        gcdTest(1,minValue+1,maxValue,0,-1);
        gcdTest(1,minValue+1,maxValue,0,0);
        gcdTest(1,minValue+1,maxValue,0,1);
        gcdTest(1,minValue+1,maxValue,0,maxValue);
        gcdTest(1,minValue+1,maxValue,0,maxValue-1);
        gcdTest(1,minValue+1,maxValue,0,minValue);
        gcdTest(1,minValue+1,maxValue,0,minValue+1);


        gcdTest(1,minValue+1,maxValue,1,-1);
        gcdTest(1,minValue+1,maxValue,1,0);
        gcdTest(1,minValue+1,maxValue,1,1);
        gcdTest(1,minValue+1,maxValue,1,maxValue);
        gcdTest(1,minValue+1,maxValue,1,maxValue-1);
        gcdTest(1,minValue+1,maxValue,1,minValue);
        gcdTest(1,minValue+1,maxValue,1,minValue+1);


        gcdTest(1,minValue+1,maxValue,maxValue,-1);
        gcdTest(1,minValue+1,maxValue,maxValue,0);
        gcdTest(1,minValue+1,maxValue,maxValue,1);
        gcdTest(1,minValue+1,maxValue,maxValue,maxValue);
        gcdTest(1,minValue+1,maxValue,maxValue,maxValue-1);
        gcdTest(1,minValue+1,maxValue,maxValue,minValue);
        gcdTest(1,minValue+1,maxValue,maxValue,minValue+1);


        gcdTest(1,minValue+1,maxValue,maxValue-1,-1);
        gcdTest(1,minValue+1,maxValue,maxValue-1,0);
        gcdTest(1,minValue+1,maxValue,maxValue-1,1);
        gcdTest(1,minValue+1,maxValue,maxValue-1,maxValue);
        gcdTest(1,minValue+1,maxValue,maxValue-1,maxValue-1);
        gcdTest(1,minValue+1,maxValue,maxValue-1,minValue);
        gcdTest(1,minValue+1,maxValue,maxValue-1,minValue+1);


        gcdTest(1,minValue+1,maxValue,minValue,-1);
        gcdTest(1,minValue+1,maxValue,minValue,0);
        gcdTest(1,minValue+1,maxValue,minValue,1);
        gcdTest(1,minValue+1,maxValue,minValue,maxValue);
        gcdTest(1,minValue+1,maxValue,minValue,maxValue-1);
        gcdTest(1,minValue+1,maxValue,minValue,minValue);
        gcdTest(1,minValue+1,maxValue,minValue,minValue+1);


        gcdTest(1,minValue+1,maxValue,minValue+1,-1);
        gcdTest(1,minValue+1,maxValue,minValue+1,0);
        gcdTest(1,minValue+1,maxValue,minValue+1,1);
        gcdTest(1,minValue+1,maxValue,minValue+1,maxValue);
        gcdTest(1,minValue+1,maxValue,minValue+1,maxValue-1);
        gcdTest(1,minValue+1,maxValue,minValue+1,minValue);
        gcdTest(1,minValue+1,maxValue,minValue+1,minValue+1);


        gcdTest(1,minValue+1,maxValue-1,-1,-1);
        gcdTest(1,minValue+1,maxValue-1,-1,0);
        gcdTest(1,minValue+1,maxValue-1,-1,1);
        gcdTest(1,minValue+1,maxValue-1,-1,maxValue);
        gcdTest(1,minValue+1,maxValue-1,-1,maxValue-1);
        gcdTest(1,minValue+1,maxValue-1,-1,minValue);
        gcdTest(1,minValue+1,maxValue-1,-1,minValue+1);


        gcdTest(1,minValue+1,maxValue-1,0,-1);
        gcdTest(2147483646,minValue+1,maxValue-1,0,0);
        gcdTest(1,minValue+1,maxValue-1,0,1);
        gcdTest(1,minValue+1,maxValue-1,0,maxValue);
        gcdTest(2147483646,minValue+1,maxValue-1,0,maxValue-1);
        gcdTest(1,minValue+1,maxValue-1,0,minValue);
        gcdTest(2147483646,minValue+1,maxValue-1,0,minValue+1);


        gcdTest(1,minValue+1,maxValue-1,1,-1);
        gcdTest(1,minValue+1,maxValue-1,1,0);
        gcdTest(1,minValue+1,maxValue-1,1,1);
        gcdTest(1,minValue+1,maxValue-1,1,maxValue);
        gcdTest(1,minValue+1,maxValue-1,1,maxValue-1);
        gcdTest(1,minValue+1,maxValue-1,1,minValue);
        gcdTest(1,minValue+1,maxValue-1,1,minValue+1);


        gcdTest(1,minValue+1,maxValue-1,maxValue,-1);
        gcdTest(1,minValue+1,maxValue-1,maxValue,0);
        gcdTest(1,minValue+1,maxValue-1,maxValue,1);
        gcdTest(1,minValue+1,maxValue-1,maxValue,maxValue);
        gcdTest(1,minValue+1,maxValue-1,maxValue,maxValue-1);
        gcdTest(1,minValue+1,maxValue-1,maxValue,minValue);
        gcdTest(1,minValue+1,maxValue-1,maxValue,minValue+1);


        gcdTest(1,minValue+1,maxValue-1,maxValue-1,-1);
        gcdTest(2147483646,minValue+1,maxValue-1,maxValue-1,0);
        gcdTest(1,minValue+1,maxValue-1,maxValue-1,1);
        gcdTest(1,minValue+1,maxValue-1,maxValue-1,maxValue);
        gcdTest(2147483646,minValue+1,maxValue-1,maxValue-1,maxValue-1);
        gcdTest(1,minValue+1,maxValue-1,maxValue-1,minValue);
        gcdTest(2147483646,minValue+1,maxValue-1,maxValue-1,minValue+1);


        gcdTest(1,minValue+1,maxValue-1,minValue,-1);
        gcdTest(1,minValue+1,maxValue-1,minValue,0);
        gcdTest(1,minValue+1,maxValue-1,minValue,1);
        gcdTest(1,minValue+1,maxValue-1,minValue,maxValue);
        gcdTest(1,minValue+1,maxValue-1,minValue,maxValue-1);
        gcdTest(1,minValue+1,maxValue-1,minValue,minValue);
        gcdTest(1,minValue+1,maxValue-1,minValue,minValue+1);


        gcdTest(1,minValue+1,maxValue-1,minValue+1,-1);
        gcdTest(2147483646,minValue+1,maxValue-1,minValue+1,0);
        gcdTest(1,minValue+1,maxValue-1,minValue+1,1);
        gcdTest(1,minValue+1,maxValue-1,minValue+1,maxValue);
        gcdTest(2147483646,minValue+1,maxValue-1,minValue+1,maxValue-1);
        gcdTest(1,minValue+1,maxValue-1,minValue+1,minValue);
        gcdTest(2147483646,minValue+1,maxValue-1,minValue+1,minValue+1);


        gcdTest(1,minValue+1,minValue,-1,-1);
        gcdTest(1,minValue+1,minValue,-1,0);
        gcdTest(1,minValue+1,minValue,-1,1);
        gcdTest(1,minValue+1,minValue,-1,maxValue);
        gcdTest(1,minValue+1,minValue,-1,maxValue-1);
        gcdTest(1,minValue+1,minValue,-1,minValue);
        gcdTest(1,minValue+1,minValue,-1,minValue+1);


        gcdTest(1,minValue+1,minValue,0,-1);
        gcdTest(1,minValue+1,minValue,0,0);
        gcdTest(1,minValue+1,minValue,0,1);
        gcdTest(1,minValue+1,minValue,0,maxValue);
        gcdTest(1,minValue+1,minValue,0,maxValue-1);
        gcdTest(1,minValue+1,minValue,0,minValue);
        gcdTest(1,minValue+1,minValue,0,minValue+1);


        gcdTest(1,minValue+1,minValue,1,-1);
        gcdTest(1,minValue+1,minValue,1,0);
        gcdTest(1,minValue+1,minValue,1,1);
        gcdTest(1,minValue+1,minValue,1,maxValue);
        gcdTest(1,minValue+1,minValue,1,maxValue-1);
        gcdTest(1,minValue+1,minValue,1,minValue);
        gcdTest(1,minValue+1,minValue,1,minValue+1);


        gcdTest(1,minValue+1,minValue,maxValue,-1);
        gcdTest(1,minValue+1,minValue,maxValue,0);
        gcdTest(1,minValue+1,minValue,maxValue,1);
        gcdTest(1,minValue+1,minValue,maxValue,maxValue);
        gcdTest(1,minValue+1,minValue,maxValue,maxValue-1);
        gcdTest(1,minValue+1,minValue,maxValue,minValue);
        gcdTest(1,minValue+1,minValue,maxValue,minValue+1);


        gcdTest(1,minValue+1,minValue,maxValue-1,-1);
        gcdTest(1,minValue+1,minValue,maxValue-1,0);
        gcdTest(1,minValue+1,minValue,maxValue-1,1);
        gcdTest(1,minValue+1,minValue,maxValue-1,maxValue);
        gcdTest(1,minValue+1,minValue,maxValue-1,maxValue-1);
        gcdTest(1,minValue+1,minValue,maxValue-1,minValue);
        gcdTest(1,minValue+1,minValue,maxValue-1,minValue+1);


        gcdTest(1,minValue+1,minValue,minValue,-1);
        gcdTest(1,minValue+1,minValue,minValue,0);
        gcdTest(1,minValue+1,minValue,minValue,1);
        gcdTest(1,minValue+1,minValue,minValue,maxValue);
        gcdTest(1,minValue+1,minValue,minValue,maxValue-1);
        gcdTest(1,minValue+1,minValue,minValue,minValue);
        gcdTest(1,minValue+1,minValue,minValue,minValue+1);


        gcdTest(1,minValue+1,minValue,minValue+1,-1);
        gcdTest(1,minValue+1,minValue,minValue+1,0);
        gcdTest(1,minValue+1,minValue,minValue+1,1);
        gcdTest(1,minValue+1,minValue,minValue+1,maxValue);
        gcdTest(1,minValue+1,minValue,minValue+1,maxValue-1);
        gcdTest(1,minValue+1,minValue,minValue+1,minValue);
        gcdTest(1,minValue+1,minValue,minValue+1,minValue+1);


        gcdTest(1,minValue+1,minValue+1,-1,-1);
        gcdTest(1,minValue+1,minValue+1,-1,0);
        gcdTest(1,minValue+1,minValue+1,-1,1);
        gcdTest(1,minValue+1,minValue+1,-1,maxValue);
        gcdTest(1,minValue+1,minValue+1,-1,maxValue-1);
        gcdTest(1,minValue+1,minValue+1,-1,minValue);
        gcdTest(1,minValue+1,minValue+1,-1,minValue+1);


        gcdTest(1,minValue+1,minValue+1,0,-1);
        gcdTest(2147483646,minValue+1,minValue+1,0,0);
        gcdTest(1,minValue+1,minValue+1,0,1);
        gcdTest(1,minValue+1,minValue+1,0,maxValue);
        gcdTest(2147483646,minValue+1,minValue+1,0,maxValue-1);
        gcdTest(1,minValue+1,minValue+1,0,minValue);
        gcdTest(2147483646,minValue+1,minValue+1,0,minValue+1);


        gcdTest(1,minValue+1,minValue+1,1,-1);
        gcdTest(1,minValue+1,minValue+1,1,0);
        gcdTest(1,minValue+1,minValue+1,1,1);
        gcdTest(1,minValue+1,minValue+1,1,maxValue);
        gcdTest(1,minValue+1,minValue+1,1,maxValue-1);
        gcdTest(1,minValue+1,minValue+1,1,minValue);
        gcdTest(1,minValue+1,minValue+1,1,minValue+1);


        gcdTest(1,minValue+1,minValue+1,maxValue,-1);
        gcdTest(1,minValue+1,minValue+1,maxValue,0);
        gcdTest(1,minValue+1,minValue+1,maxValue,1);
        gcdTest(1,minValue+1,minValue+1,maxValue,maxValue);
        gcdTest(1,minValue+1,minValue+1,maxValue,maxValue-1);
        gcdTest(1,minValue+1,minValue+1,maxValue,minValue);
        gcdTest(1,minValue+1,minValue+1,maxValue,minValue+1);


        gcdTest(1,minValue+1,minValue+1,maxValue-1,-1);
        gcdTest(2147483646,minValue+1,minValue+1,maxValue-1,0);
        gcdTest(1,minValue+1,minValue+1,maxValue-1,1);
        gcdTest(1,minValue+1,minValue+1,maxValue-1,maxValue);
        gcdTest(2147483646,minValue+1,minValue+1,maxValue-1,maxValue-1);
        gcdTest(1,minValue+1,minValue+1,maxValue-1,minValue);
        gcdTest(2147483646,minValue+1,minValue+1,maxValue-1,minValue+1);


        gcdTest(1,minValue+1,minValue+1,minValue,-1);
        gcdTest(1,minValue+1,minValue+1,minValue,0);
        gcdTest(1,minValue+1,minValue+1,minValue,1);
        gcdTest(1,minValue+1,minValue+1,minValue,maxValue);
        gcdTest(1,minValue+1,minValue+1,minValue,maxValue-1);
        gcdTest(1,minValue+1,minValue+1,minValue,minValue);
        gcdTest(1,minValue+1,minValue+1,minValue,minValue+1);


        gcdTest(1,minValue+1,minValue+1,minValue+1,-1);
        gcdTest(2147483646,minValue+1,minValue+1,minValue+1,0);
        gcdTest(1,minValue+1,minValue+1,minValue+1,1);
        gcdTest(1,minValue+1,minValue+1,minValue+1,maxValue);
        gcdTest(2147483646,minValue+1,minValue+1,minValue+1,maxValue-1);
        gcdTest(1,minValue+1,minValue+1,minValue+1,minValue);
        gcdTest(2147483646,minValue+1,minValue+1,minValue+1,minValue+1);
        //endregion

    }

































}