package Task3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Worker3Test {

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

        int s1 = worker.gcd(a, b, c, d);
        int s2 = worker.gcd(a, b, d, c);
        int s3 = worker.gcd(a, c, b, d);
        int s4 = worker.gcd(a, c, d, b);
        int s5 = worker.gcd(a, d, b, c);
        int s6 = worker.gcd(a, d, c, b);
        int s7 = worker.gcd(b, a, c, d);
        int s8 = worker.gcd(b, a, d, c);
        int s9 = worker.gcd(b, c, a, d);
        int s10 = worker.gcd(b, c, d, a);
        int s11 = worker.gcd(b, d, a, c);
        int s12 = worker.gcd(b, d, c, a);
        int s13 = worker.gcd(c, a, b, d);
        int s14 = worker.gcd(c, a, d, b);
        int s15 = worker.gcd(c, b, a, d);
        int s16 = worker.gcd(c, b, d, a);
        int s17 = worker.gcd(c, d, a, b);
        int s18 = worker.gcd(c, d, b, a);
        int s19 = worker.gcd(d, a, b, c);
        int s20 = worker.gcd(d, a, c, b);
        int s21 = worker.gcd(d, b, a, c);
        int s22 = worker.gcd(d, b, c, a);
        int s23 = worker.gcd(d, c, a, b);
        int s24 = worker.gcd(d, c, b, a);


        assertEquals(test, s1);
        assertEquals(test, s2);
        assertEquals(test, s3);
        assertEquals(test, s4);
        assertEquals(test, s5);
        assertEquals(test, s6);
        assertEquals(test, s7);
        assertEquals(test, s8);
        assertEquals(test, s9);
        assertEquals(test, s10);
        assertEquals(test, s11);
        assertEquals(test, s12);
        assertEquals(test, s13);
        assertEquals(test, s14);
        assertEquals(test, s15);
        assertEquals(test, s16);
        assertEquals(test, s17);
        assertEquals(test, s18);
        assertEquals(test, s19);
        assertEquals(test, s20);
        assertEquals(test, s21);
        assertEquals(test, s22);
        assertEquals(test, s23);
        assertEquals(test, s24);

    }

    void gcd1Test(int test, int a, int b, int c, int d) {

        if (a <= 0 && b <= 0 && c <= 0 && d <= 0) {
            gcdTest(test,a, b, c, d + 1);
        }

        if (a <= 0 && b <= 0 && c <= 0 && d >= 0) {
            assertEquals(test, worker.gcd(a, b, c, d - 1));
            assertEquals(test, worker.gcd(a, b, c + 1, d));
            assertEquals(test, worker.gcd(a, b + 1, c, d));
            assertEquals(test, worker.gcd(a + 1, b, c, d));
        }

        if (a <= 0 && b <= 0 && c >= 0 && d >= 0) {

            assertEquals(test, worker.gcd(a, b, c, d - 1));
            assertEquals(test, worker.gcd(a, b, c - 1, d));
            assertEquals(test, worker.gcd(a, b + 1, c, d));
            assertEquals(test, worker.gcd(a + 1, b, c, d));
        }

        if (a <= 0 && b >= 0 && c <= 0 && d <= 0) {

            assertEquals(test, worker.gcd(a, b, c, d + 1));
            assertEquals(test, worker.gcd(a, b, c + 1, d));
            assertEquals(test, worker.gcd(a, b - 1, c, d));
            assertEquals(test, worker.gcd(a + 1, b, c, d));
        }

        if (a <= 0 && b >= 0 && c <= 0 && d >= 0) {

            assertEquals(test, worker.gcd(a, b, c, d - 1));
            assertEquals(test, worker.gcd(a, b, c + 1, d));
            assertEquals(test, worker.gcd(a, b - 1, c, d));
            assertEquals(test, worker.gcd(a + 1, b, c, d));
        }

        if (a <= 0 && b >= 0 && c >= 0 && d <= 0) {
            assertEquals(test, worker.gcd(a, b, c, d + 1));
            assertEquals(test, worker.gcd(a, b, c - 1, d));
            assertEquals(test, worker.gcd(a, b - 1, c, d));
            assertEquals(test, worker.gcd(a + 1, b, c, d));
        }

        if (a <= 0 && b >= 0 && c >= 0 && d >= 0) {
            assertEquals(test, worker.gcd(a, b, c, d - 1));
            assertEquals(test, worker.gcd(a, b, c - 1, d));
            assertEquals(test, worker.gcd(a, b - 1, c, d));
            assertEquals(test, worker.gcd(a + 1, b, c, d));
        }

        if (a >= 0 && b <= 0 && c <= 0 && d >= 0) {

            assertEquals(test, worker.gcd(a, b, c, d - 1));
            assertEquals(test, worker.gcd(a, b, c + 1, d));
            assertEquals(test, worker.gcd(a, b + 1, c, d));
            assertEquals(test, worker.gcd(a - 1, b, c, d));
        }

        if (a >= 0 && b <= 0 && c >= 0 && d <= 0) {

            assertEquals(test, worker.gcd(a, b, c, d + 1));
            assertEquals(test, worker.gcd(a, b, c - 1, d));
            assertEquals(test, worker.gcd(a, b + 1, c, d));
            assertEquals(test, worker.gcd(a - 1, b, c, d));
        }

        if (a >= 0 && b <= 0 && c >= 0 && d >= 0) {
            assertEquals(test, worker.gcd(a, b, c, d - 1));
            assertEquals(test, worker.gcd(a, b, c - 1, d));
            assertEquals(test, worker.gcd(a, b + 1, c, d));
            assertEquals(test, worker.gcd(a - 1, b, c, d));
        }

        if (a >= 0 && b >= 0 && c <= 0 && d <= 0) {

            assertEquals(test, worker.gcd(a, b, c, d + 1));
            assertEquals(test, worker.gcd(a, b, c + 1, d));
            assertEquals(test, worker.gcd(a, b - 1, c, d));
            assertEquals(test, worker.gcd(a - 1, b, c, d));
        }

        if (a >= 0 && b >= 0 && c <= 0 && d >= 0) {

            assertEquals(test, worker.gcd(a, b, c, d - 1));
            assertEquals(test, worker.gcd(a, b, c + 1, d));
            assertEquals(test, worker.gcd(a, b - 1, c, d));
            assertEquals(test, worker.gcd(a - 1, b, c, d));
        }

        if (a >= 0 && b >= 0 && c >= 0 && d <= 0) {
            assertEquals(test, worker.gcd(a, b, c, d + 1));
            assertEquals(test, worker.gcd(a, b, c - 1, d));
            assertEquals(test, worker.gcd(a, b - 1, c, d));
            assertEquals(test, worker.gcd(a - 1, b, c, d));
        }

        if (a >= 0 && b >= 0 && c >= 0 && d >= 0) {
            gcdTest(test, a, b, c, d - 1);
        }


    }

    void gcd2Test(int test, int a, int b, int c, int d) {

        if (a <= 0 && b <= 0 && c <= 0 && d <= 0) {

            gcdTest(test, a, b, c, -5);
            gcdTest(test, a, b, c, -23);
            gcdTest(test, a, b, c, -237);
            gcdTest(test, a, b, c, -2349);
            gcdTest(test, a, b, c, -52947);
            gcdTest(test, a, b, c, -239997);
            gcdTest(test, a, b, c, -3409099);
            gcdTest(test, a, b, c, -23040949);
            gcdTest(test, a, b, c, -203909409);

        }

        if (a <= 0 && b <= 0 && c <= 0 && d >= 0) {

            assertEquals(test, worker.gcd(a, b, c, 5));
            assertEquals(test, worker.gcd(a, b, c, 243));
            assertEquals(test, worker.gcd(a, b, c, 456235));
            assertEquals(test, worker.gcd(a, b, c, 34523324));
            assertEquals(test, worker.gcd(a, b, c, 345142343));

            assertEquals(test, worker.gcd(a, b, -43, d));
            assertEquals(test, worker.gcd(a, b, -2983, d));
            assertEquals(test, worker.gcd(a, b, -349203, d));
            assertEquals(test, worker.gcd(a, b, -33948943, d));
            assertEquals(test, worker.gcd(a, b, -349839893, d));

            assertEquals(test, worker.gcd(a, -34, c, d));
            assertEquals(test, worker.gcd(a, -3498, c, d));
            assertEquals(test, worker.gcd(a, -398498, c, d));
            assertEquals(test, worker.gcd(a, -34983948, c, d));
            assertEquals(test, worker.gcd(a, -349893489, c, d));

            assertEquals(test, worker.gcd(-3, b, c, d));
            assertEquals(test, worker.gcd(-455, b, c, d));
            assertEquals(test, worker.gcd(-45084, b, c, d));
            assertEquals(test, worker.gcd(-5498495, b, c, d));
            assertEquals(test, worker.gcd(-459849589, b, c, d));
        }

        if (a <= 0 && b <= 0 && c >= 0 && d <= 0) {


            assertEquals(test, worker.gcd(a, b, c, -5));
            assertEquals(test, worker.gcd(a, b, c, -243));
            assertEquals(test, worker.gcd(a, b, c, -456235));
            assertEquals(test, worker.gcd(a, b, c, -34523324));
            assertEquals(test, worker.gcd(a, b, c, -345142343));

            assertEquals(test, worker.gcd(a, b, 43, d));
            assertEquals(test, worker.gcd(a, b, 2983, d));
            assertEquals(test, worker.gcd(a, b, 349203, d));
            assertEquals(test, worker.gcd(a, b, 33948943, d));
            assertEquals(test, worker.gcd(a, b, 349839893, d));

            assertEquals(test, worker.gcd(a, -34, c, d));
            assertEquals(test, worker.gcd(a, -3498, c, d));
            assertEquals(test, worker.gcd(a, -398498, c, d));
            assertEquals(test, worker.gcd(a, -34983948, c, d));
            assertEquals(test, worker.gcd(a, -349893489, c, d));

            assertEquals(test, worker.gcd(-3, b, c, d));
            assertEquals(test, worker.gcd(-455, b, c, d));
            assertEquals(test, worker.gcd(-45084, b, c, d));
            assertEquals(test, worker.gcd(-5498495, b, c, d));
            assertEquals(test, worker.gcd(-459849589, b, c, d));

        }

        if (a <= 0 && b <= 0 && c >= 0 && d >= 0) {

            assertEquals(test, worker.gcd(a, b, c, 5));
            assertEquals(test, worker.gcd(a, b, c, 243));
            assertEquals(test, worker.gcd(a, b, c, 456235));
            assertEquals(test, worker.gcd(a, b, c, 34523324));
            assertEquals(test, worker.gcd(a, b, c, 345142343));

            assertEquals(test, worker.gcd(a, b, 43, d));
            assertEquals(test, worker.gcd(a, b, 2983, d));
            assertEquals(test, worker.gcd(a, b, 349203, d));
            assertEquals(test, worker.gcd(a, b, 33948943, d));
            assertEquals(test, worker.gcd(a, b, 349839893, d));

            assertEquals(test, worker.gcd(a, -34, c, d));
            assertEquals(test, worker.gcd(a, -3498, c, d));
            assertEquals(test, worker.gcd(a, -398498, c, d));
            assertEquals(test, worker.gcd(a, -34983948, c, d));
            assertEquals(test, worker.gcd(a, -349893489, c, d));

            assertEquals(test, worker.gcd(-3, b, c, d));
            assertEquals(test, worker.gcd(-455, b, c, d));
            assertEquals(test, worker.gcd(-45084, b, c, d));
            assertEquals(test, worker.gcd(-5498495, b, c, d));
            assertEquals(test, worker.gcd(-459849589, b, c, d));

        }

        if (a <= 0 && b >= 0 && c <= 0 && d <= 0) {


            assertEquals(test, worker.gcd(a, b, c, -5));
            assertEquals(test, worker.gcd(a, b, c, -243));
            assertEquals(test, worker.gcd(a, b, c, -456235));
            assertEquals(test, worker.gcd(a, b, c, -34523324));
            assertEquals(test, worker.gcd(a, b, c, -345142343));

            assertEquals(test, worker.gcd(a, b, -43, d));
            assertEquals(test, worker.gcd(a, b, -2983, d));
            assertEquals(test, worker.gcd(a, b, -349203, d));
            assertEquals(test, worker.gcd(a, b, -33948943, d));
            assertEquals(test, worker.gcd(a, b, -349839893, d));

            assertEquals(test, worker.gcd(a, 34, c, d));
            assertEquals(test, worker.gcd(a, 3498, c, d));
            assertEquals(test, worker.gcd(a, 398498, c, d));
            assertEquals(test, worker.gcd(a, 34983948, c, d));
            assertEquals(test, worker.gcd(a, 349893489, c, d));

            assertEquals(test, worker.gcd(-3, b, c, d));
            assertEquals(test, worker.gcd(-455, b, c, d));
            assertEquals(test, worker.gcd(-45084, b, c, d));
            assertEquals(test, worker.gcd(-5498495, b, c, d));
            assertEquals(test, worker.gcd(-459849589, b, c, d));

        }

        if (a <= 0 && b >= 0 && c <= 0 && d >= 0) {


            assertEquals(test, worker.gcd(a, b, c, 5));
            assertEquals(test, worker.gcd(a, b, c, 243));
            assertEquals(test, worker.gcd(a, b, c, 456235));
            assertEquals(test, worker.gcd(a, b, c, 34523324));
            assertEquals(test, worker.gcd(a, b, c, 345142343));

            assertEquals(test, worker.gcd(a, b, -43, d));
            assertEquals(test, worker.gcd(a, b, -2983, d));
            assertEquals(test, worker.gcd(a, b, -349203, d));
            assertEquals(test, worker.gcd(a, b, -33948943, d));
            assertEquals(test, worker.gcd(a, b, -349839893, d));

            assertEquals(test, worker.gcd(a, 34, c, d));
            assertEquals(test, worker.gcd(a, 3498, c, d));
            assertEquals(test, worker.gcd(a, 398498, c, d));
            assertEquals(test, worker.gcd(a, 34983948, c, d));
            assertEquals(test, worker.gcd(a, 349893489, c, d));

            assertEquals(test, worker.gcd(-3, b, c, d));
            assertEquals(test, worker.gcd(-455, b, c, d));
            assertEquals(test, worker.gcd(-45084, b, c, d));
            assertEquals(test, worker.gcd(-5498495, b, c, d));
            assertEquals(test, worker.gcd(-459849589, b, c, d));
        }

        if (a <= 0 && b >= 0 && c >= 0 && d <= 0) {

            assertEquals(test, worker.gcd(a, b, c, -5));
            assertEquals(test, worker.gcd(a, b, c, -243));
            assertEquals(test, worker.gcd(a, b, c, -456235));
            assertEquals(test, worker.gcd(a, b, c, -34523324));
            assertEquals(test, worker.gcd(a, b, c, -345142343));

            assertEquals(test, worker.gcd(a, b, 43, d));
            assertEquals(test, worker.gcd(a, b, 2983, d));
            assertEquals(test, worker.gcd(a, b, 349203, d));
            assertEquals(test, worker.gcd(a, b, 33948943, d));
            assertEquals(test, worker.gcd(a, b, 349839893, d));

            assertEquals(test, worker.gcd(a, 34, c, d));
            assertEquals(test, worker.gcd(a, 3498, c, d));
            assertEquals(test, worker.gcd(a, 398498, c, d));
            assertEquals(test, worker.gcd(a, 34983948, c, d));
            assertEquals(test, worker.gcd(a, 349893489, c, d));

            assertEquals(test, worker.gcd(-3, b, c, d));
            assertEquals(test, worker.gcd(-455, b, c, d));
            assertEquals(test, worker.gcd(-45084, b, c, d));
            assertEquals(test, worker.gcd(-5498495, b, c, d));
            assertEquals(test, worker.gcd(-459849589, b, c, d));
        }

        if (a <= 0 && b >= 0 && c >= 0 && d >= 0) {


            assertEquals(test, worker.gcd(a, b, c, 5));
            assertEquals(test, worker.gcd(a, b, c, 243));
            assertEquals(test, worker.gcd(a, b, c, 456235));
            assertEquals(test, worker.gcd(a, b, c, 34523324));
            assertEquals(test, worker.gcd(a, b, c, 345142343));

            assertEquals(test, worker.gcd(a, b, 43, d));
            assertEquals(test, worker.gcd(a, b, 2983, d));
            assertEquals(test, worker.gcd(a, b, 349203, d));
            assertEquals(test, worker.gcd(a, b, 33948943, d));
            assertEquals(test, worker.gcd(a, b, 349839893, d));

            assertEquals(test, worker.gcd(a, 34, c, d));
            assertEquals(test, worker.gcd(a, 3498, c, d));
            assertEquals(test, worker.gcd(a, 398498, c, d));
            assertEquals(test, worker.gcd(a, 34983948, c, d));
            assertEquals(test, worker.gcd(a, 349893489, c, d));

            assertEquals(test, worker.gcd(-3, b, c, d));
            assertEquals(test, worker.gcd(-455, b, c, d));
            assertEquals(test, worker.gcd(-45084, b, c, d));
            assertEquals(test, worker.gcd(-5498495, b, c, d));
            assertEquals(test, worker.gcd(-459849589, b, c, d));
        }

        if (a >= 0 && b <= 0 && c <= 0 && d <= 0) {


            assertEquals(test, worker.gcd(a, b, c, -5));
            assertEquals(test, worker.gcd(a, b, c, -243));
            assertEquals(test, worker.gcd(a, b, c, -456235));
            assertEquals(test, worker.gcd(a, b, c, -34523324));
            assertEquals(test, worker.gcd(a, b, c, -345142343));

            assertEquals(test, worker.gcd(a, b, -43, d));
            assertEquals(test, worker.gcd(a, b, -2983, d));
            assertEquals(test, worker.gcd(a, b, -349203, d));
            assertEquals(test, worker.gcd(a, b, -33948943, d));
            assertEquals(test, worker.gcd(a, b, -349839893, d));

            assertEquals(test, worker.gcd(a, -34, c, d));
            assertEquals(test, worker.gcd(a, -3498, c, d));
            assertEquals(test, worker.gcd(a, -398498, c, d));
            assertEquals(test, worker.gcd(a, -34983948, c, d));
            assertEquals(test, worker.gcd(a, -349893489, c, d));

            assertEquals(test, worker.gcd(3, b, c, d));
            assertEquals(test, worker.gcd(455, b, c, d));
            assertEquals(test, worker.gcd(45084, b, c, d));
            assertEquals(test, worker.gcd(5498495, b, c, d));
            assertEquals(test, worker.gcd(459849589, b, c, d));
        }

        if (a >= 0 && b <= 0 && c <= 0 && d >= 0) {


            assertEquals(test, worker.gcd(a, b, c, 5));
            assertEquals(test, worker.gcd(a, b, c, 243));
            assertEquals(test, worker.gcd(a, b, c, 456235));
            assertEquals(test, worker.gcd(a, b, c, 34523324));
            assertEquals(test, worker.gcd(a, b, c, 345142343));

            assertEquals(test, worker.gcd(a, b, -43, d));
            assertEquals(test, worker.gcd(a, b, -2983, d));
            assertEquals(test, worker.gcd(a, b, -349203, d));
            assertEquals(test, worker.gcd(a, b, -33948943, d));
            assertEquals(test, worker.gcd(a, b, -849839893, d));

            assertEquals(test, worker.gcd(a, -34, c, d));
            assertEquals(test, worker.gcd(a, -3498, c, d));
            assertEquals(test, worker.gcd(a, -398498, c, d));
            assertEquals(test, worker.gcd(a, -34983948, c, d));
            assertEquals(test, worker.gcd(a, -349893489, c, d));

            assertEquals(test, worker.gcd(3, b, c, d));
            assertEquals(test, worker.gcd(455, b, c, d));
            assertEquals(test, worker.gcd(45084, b, c, d));
            assertEquals(test, worker.gcd(5498495, b, c, d));
            assertEquals(test, worker.gcd(459849589, b, c, d));
        }

        if (a >= 0 && b <= 0 && c >= 0 && d <= 0) {


            assertEquals(test, worker.gcd(a, b, c, -5));
            assertEquals(test, worker.gcd(a, b, c, -243));
            assertEquals(test, worker.gcd(a, b, c, -456235));
            assertEquals(test, worker.gcd(a, b, c, -34523324));
            assertEquals(test, worker.gcd(a, b, c, -345142343));

            assertEquals(test, worker.gcd(a, b, 43, d));
            assertEquals(test, worker.gcd(a, b, 2983, d));
            assertEquals(test, worker.gcd(a, b, 349203, d));
            assertEquals(test, worker.gcd(a, b, 33948943, d));
            assertEquals(test, worker.gcd(a, b, 849839893, d));

            assertEquals(test, worker.gcd(a, -34, c, d));
            assertEquals(test, worker.gcd(a, -3498, c, d));
            assertEquals(test, worker.gcd(a, -398498, c, d));
            assertEquals(test, worker.gcd(a, -34983948, c, d));
            assertEquals(test, worker.gcd(a, -349893489, c, d));

            assertEquals(test, worker.gcd(3, b, c, d));
            assertEquals(test, worker.gcd(455, b, c, d));
            assertEquals(test, worker.gcd(45084, b, c, d));
            assertEquals(test, worker.gcd(5498495, b, c, d));
            assertEquals(test, worker.gcd(459849589, b, c, d));
        }

        if (a >= 0 && b <= 0 && c >= 0 && d >= 0) {

            assertEquals(test, worker.gcd(a, b, c, 5));
            assertEquals(test, worker.gcd(a, b, c, 243));
            assertEquals(test, worker.gcd(a, b, c, 456235));
            assertEquals(test, worker.gcd(a, b, c, 34523324));
            assertEquals(test, worker.gcd(a, b, c, 345142343));

            assertEquals(test, worker.gcd(a, b, 43, d));
            assertEquals(test, worker.gcd(a, b, 2983, d));
            assertEquals(test, worker.gcd(a, b, 349203, d));
            assertEquals(test, worker.gcd(a, b, 33948943, d));
            assertEquals(test, worker.gcd(a, b, 849839893, d));

            assertEquals(test, worker.gcd(a, -34, c, d));
            assertEquals(test, worker.gcd(a, -3498, c, d));
            assertEquals(test, worker.gcd(a, -398498, c, d));
            assertEquals(test, worker.gcd(a, -34983948, c, d));
            assertEquals(test, worker.gcd(a, -349893489, c, d));

            assertEquals(test, worker.gcd(3, b, c, d));
            assertEquals(test, worker.gcd(455, b, c, d));
            assertEquals(test, worker.gcd(45084, b, c, d));
            assertEquals(test, worker.gcd(5498495, b, c, d));
            assertEquals(test, worker.gcd(459849589, b, c, d));
        }

        if (a >= 0 && b >= 0 && c <= 0 && d <= 0) {


            assertEquals(test, worker.gcd(a, b, c, -5));
            assertEquals(test, worker.gcd(a, b, c, -243));
            assertEquals(test, worker.gcd(a, b, c, -456235));
            assertEquals(test, worker.gcd(a, b, c, -34523324));
            assertEquals(test, worker.gcd(a, b, c, -345142343));

            assertEquals(test, worker.gcd(a, b, -43, d));
            assertEquals(test, worker.gcd(a, b, -2983, d));
            assertEquals(test, worker.gcd(a, b, -349203, d));
            assertEquals(test, worker.gcd(a, b, -33948943, d));
            assertEquals(test, worker.gcd(a, b, -849839893, d));

            assertEquals(test, worker.gcd(a, 34, c, d));
            assertEquals(test, worker.gcd(a, 3498, c, d));
            assertEquals(test, worker.gcd(a, 398498, c, d));
            assertEquals(test, worker.gcd(a, 34983948, c, d));
            assertEquals(test, worker.gcd(a, 349893489, c, d));

            assertEquals(test, worker.gcd(3, b, c, d));
            assertEquals(test, worker.gcd(455, b, c, d));
            assertEquals(test, worker.gcd(45084, b, c, d));
            assertEquals(test, worker.gcd(5498495, b, c, d));
            assertEquals(test, worker.gcd(459849589, b, c, d));
        }

        if (a >= 0 && b >= 0 && c <= 0 && d >= 0) {


            assertEquals(test, worker.gcd(a, b, c, 5));
            assertEquals(test, worker.gcd(a, b, c, 243));
            assertEquals(test, worker.gcd(a, b, c, 456235));
            assertEquals(test, worker.gcd(a, b, c, 34523324));
            assertEquals(test, worker.gcd(a, b, c, 345142343));

            assertEquals(test, worker.gcd(a, b, -43, d));
            assertEquals(test, worker.gcd(a, b, -2983, d));
            assertEquals(test, worker.gcd(a, b, -349203, d));
            assertEquals(test, worker.gcd(a, b, -33948943, d));
            assertEquals(test, worker.gcd(a, b, -849839893, d));

            assertEquals(test, worker.gcd(a, 34, c, d));
            assertEquals(test, worker.gcd(a, 3498, c, d));
            assertEquals(test, worker.gcd(a, 398498, c, d));
            assertEquals(test, worker.gcd(a, 34983948, c, d));
            assertEquals(test, worker.gcd(a, 349893489, c, d));

            assertEquals(test, worker.gcd(3, b, c, d));
            assertEquals(test, worker.gcd(455, b, c, d));
            assertEquals(test, worker.gcd(45084, b, c, d));
            assertEquals(test, worker.gcd(5498495, b, c, d));
            assertEquals(test, worker.gcd(459849589, b, c, d));
        }

        if (a >= 0 && b >= 0 && c >= 0 && d <= 0) {


            assertEquals(test, worker.gcd(a, b, c, -5));
            assertEquals(test, worker.gcd(a, b, c, -243));
            assertEquals(test, worker.gcd(a, b, c, -456235));
            assertEquals(test, worker.gcd(a, b, c, -34523324));
            assertEquals(test, worker.gcd(a, b, c, -345142343));

            assertEquals(test, worker.gcd(a, b, 43, d));
            assertEquals(test, worker.gcd(a, b, 2983, d));
            assertEquals(test, worker.gcd(a, b, 349203, d));
            assertEquals(test, worker.gcd(a, b, 33948943, d));
            assertEquals(test, worker.gcd(a, b, 849839893, d));

            assertEquals(test, worker.gcd(a, 34, c, d));
            assertEquals(test, worker.gcd(a, 3498, c, d));
            assertEquals(test, worker.gcd(a, 398498, c, d));
            assertEquals(test, worker.gcd(a, 34983948, c, d));
            assertEquals(test, worker.gcd(a, 349893489, c, d));

            assertEquals(test, worker.gcd(3, b, c, d));
            assertEquals(test, worker.gcd(455, b, c, d));
            assertEquals(test, worker.gcd(45084, b, c, d));
            assertEquals(test, worker.gcd(5498495, b, c, d));
            assertEquals(test, worker.gcd(459849589, b, c, d));
        }

        if (a >= 0 && b >= 0 && c >= 0 && d >= 0) {

            gcdTest(test, a, b, c, 5);
            gcdTest(test, a, b, c, 23);
            gcdTest(test, a, b, c, 230);
            gcdTest(test, a, b, c, 2349);
            gcdTest(test, a, b, c, 52940);
            gcdTest(test, a, b, c, 239990);
            gcdTest(test, a, b, c, 3409090);
            gcdTest(test, a, b, c, 23040949);
            gcdTest(test, a, b, c, 203909409);

        }


    }


    /**
     * gcd(MAX, MAX, MAX, MAX)
     */
    @Test
    void gcdTest1() {

        gcdTest(2147483647, maxValue, maxValue, maxValue, maxValue);


        gcd1Test(1, maxValue, maxValue, maxValue, maxValue);
        gcd2Test(1, maxValue, maxValue, maxValue, maxValue);


    }

    /**
     * gcd(MIN, MIN, MIN, MIN)
     */
    @Test
    void gcdTest2() {

        gcdTest(2147483647, minValue, minValue, minValue, minValue);

        gcd1Test(1, minValue, minValue, minValue, minValue);
        gcd2Test(1, minValue, minValue, minValue, minValue);
    }

    /**
     * gcd(MAX, MAX, MAX, MIN)
     */
    @Test
    void gcdTest3() {

        gcdTest(2147483647, maxValue, maxValue, maxValue, minValue);

        gcd1Test(1, maxValue, maxValue, maxValue, minValue);
        gcd2Test(1, maxValue, maxValue, maxValue, minValue);
    }

    /**
     * gcd(MIN, MIN, MIN, MAX)
     */
    @Test
    void gcdTest4() {

        gcdTest(2147483647, minValue, minValue, minValue, maxValue);

        gcd1Test(1, minValue, minValue, minValue, maxValue);
        gcd2Test(1, minValue, minValue, minValue, maxValue);
    }

    /**
     * gcd(MAX, MAX, MIN, MAX)
     */
    @Test
    void gcdTest5() {

        gcdTest(2147483647, maxValue, maxValue, minValue, maxValue);

        gcd1Test(1, maxValue, maxValue, minValue, maxValue);
        gcd2Test(1, maxValue, maxValue, minValue, maxValue);
    }

    /**
     * gcd(MIN, MIN, MAX, MIN)
     */
    @Test
    void gcdTest6() {

        gcdTest(2147483647, minValue, minValue, maxValue, minValue);

        gcd1Test(1, minValue, minValue, minValue, minValue);
        gcd2Test(1, minValue, minValue, minValue, minValue);
    }

    /**
     * gcd(MAX, MAX, MIN, MIN)
     */
    @Test
    void gcdTest7() {

        gcdTest(2147483647, maxValue, maxValue, minValue, minValue);

        gcd1Test(1, maxValue, maxValue, minValue, minValue);
        gcd2Test(1, maxValue, maxValue, minValue, minValue);

    }

    /**
     * gcd(MIN, MIN, MAX, MAX)
     */
    @Test
    void gcdTest8() {

        gcdTest(2147483647, minValue, minValue, maxValue, maxValue);

        gcd1Test(1, minValue, minValue, maxValue, maxValue);
        gcd2Test(1, minValue, minValue, maxValue, maxValue);

    }

    /**
     * gcd(MAX, MIN, MAX, MAX)
     */
    @Test
    void gcdTest9() {

        gcdTest(2147483647, maxValue, minValue, maxValue, maxValue);

        gcd1Test(1, maxValue, minValue, maxValue, maxValue);
        gcd2Test(1, maxValue, minValue, maxValue, maxValue);

    }

    /**
     * gcd(MIN, MAX, MIN, MIN)
     */
    @Test
    void gcdTest10() {

        gcdTest(2147483647, minValue, maxValue, minValue, minValue);

        gcd1Test(1, minValue, maxValue, minValue, minValue);
        gcd2Test(1, minValue, maxValue, minValue, minValue);

    }

    /**
     * gcd(MAX, MIN, MAX, MIN)
     */
    @Test
    void gcdTest11() {

        gcdTest(2147483647, maxValue, minValue, maxValue, minValue);

        gcd1Test(1, maxValue, minValue, maxValue, minValue);
        gcd2Test(1, maxValue, minValue, maxValue, minValue);

    }

    /**
     * gcd(MIN, MAX, MIN, MAX)
     */
    @Test
    void gcdTest12() {

        gcdTest(2147483647, minValue, maxValue, minValue, maxValue);

        gcd1Test(1, minValue, maxValue, minValue, maxValue);
        gcd2Test(1, minValue, maxValue, minValue, maxValue);

    }

    /**
     * gcd(MAX, MIN, MIN, MAX)
     */
    @Test
    void gcdTest13() {

        gcdTest(2147483647, maxValue, minValue, minValue, maxValue);

        gcd1Test(1, maxValue, minValue, minValue, maxValue);
        gcd2Test(1, maxValue, minValue, minValue, maxValue);
    }

    /**
     * gcd(MIN, MAX, MAX, MIN)
     */
    @Test
    void gcdTest14() {

        gcdTest(2147483647, minValue, maxValue, maxValue, minValue);

        gcd1Test(1, minValue, maxValue, maxValue, minValue);
        gcd2Test(1, minValue, maxValue, maxValue, minValue);


    }

    /**
     * gcd(MAX, MIN, MIN, MIN)
     */
    @Test
    void gcdTest15() {

        gcdTest(2147483647, maxValue, minValue, minValue, minValue);

        gcd1Test(1, maxValue, minValue, minValue, minValue);
        gcd2Test(1, maxValue, minValue, minValue, minValue);
    }

    /**
     * gcd(MIN, MAX, MAX, MAX)
     */
    @Test
    void gcdTest16() {

        gcdTest(2147483647, maxValue, minValue, minValue, minValue);

        gcd1Test(1, maxValue, minValue, minValue, minValue);
        gcd2Test(1, maxValue, minValue, minValue, minValue);


    }


    /**
     *
     */
    @Test
    void gcdTest1_1() {

        gcdTest(2147483647, maxValue, maxValue, maxValue, maxValue);

        gcd1Test(1, maxValue, maxValue, maxValue, maxValue);
        gcd2Test(1, maxValue, maxValue, maxValue, maxValue);


        gcdTest(0, 0, 0, 0, 0);

        gcd1Test(1, 0, 0, 0, 0);
       // gcd2Test(1, 0, 0, 0, 0);

    }

    /**
     * gcd(MIN, MIN, MIN, MIN)
     */
    @Test
    void gcdTest2_1() {

        gcdTest(2147483647, minValue, minValue, minValue, minValue);


        gcdTest(0, 0, 0, 0, 0);

        gcd1Test(1, 0, 0, 0, 0);


        gcdTest(2147483647, minValue, 0, minValue, 0);


        gcdTest(2147483647, 0, minValue, 0, minValue);


        gcdTest(2147483647, 0, 0, 0, minValue);


        gcdTest(2147483646, 0, 0, 0, minValue + 1);
        gcdTest(1, 0, 0, -1, minValue);
        gcdTest(1, 0, -1, 0, minValue);
        gcdTest(1, -1, 0, 0, minValue);

        gcdTest(2147483647, minValue, minValue, minValue, 0);
        gcd1Test(1, minValue, minValue, minValue, 0);

        gcdTest(2147483647, minValue, 0, minValue, minValue);
        gcd2Test(1, minValue, 0, minValue, minValue);

        gcdTest(2147483647, 0, minValue, 0, 0);

        gcdTest(1, 0, minValue, 0, -1);
        gcdTest(1, 0, minValue, -1, 0);
        gcdTest(2147483646, 0, minValue + 1, 0, 0);
        gcdTest(1, -1, minValue, 0, 0);

    }

    /**
     *
     */
    @Test
    void gcdTest3_1() {

        //region граничные значения класса
        gcdTest(2147483647, 0, maxValue, maxValue, maxValue);

        gcd2Test(1, 0, maxValue, maxValue, maxValue);
        //endregion

        //region граничные значения класса
        gcdTest(2147483647, maxValue, 0, 0, 0);

        gcdTest(1, maxValue, 0, 0, 1);
        gcdTest(1, maxValue, 0, 1, 0);
        gcdTest(1, maxValue, 1, 0, 0);
        gcdTest(2147483646, maxValue - 1, 0, 0, 0);
        //endregion

        //region граничные значения класса
        gcdTest(2147483647, maxValue, maxValue, 0, 0);
        gcd1Test(1, maxValue, maxValue, 0, 0);

        //endregion

        //region граничные значения класса
        gcdTest(2147483647, 0, 0, maxValue, maxValue);
        gcd1Test(1, 0, 0, maxValue, maxValue);
        //endregion

        //region граничные значения класса
        gcdTest(2147483647, maxValue, 0, 0, maxValue);
        gcd1Test(1, maxValue, 0, 0, maxValue);
        //endregion

        //region граничные значения класса
        gcdTest(2147483647, maxValue, maxValue, 0, maxValue);
        gcd1Test(1, maxValue, maxValue, 0, maxValue);
        //endregion

        //region граничные значения класса
        gcdTest(2147483647, maxValue, 0, 0, 0);

        gcdTest(1, maxValue, 0, 0, 1);
        gcdTest(1, maxValue, 0, 1, 0);
        gcdTest(1, maxValue, 1, 0, 0);
        gcdTest(2147483646, maxValue - 1, 0, 0, 0);
        //endregion

        //region граничные значения класса
        gcdTest(2147483647, maxValue, 0, 0, maxValue);
        gcd1Test(1, maxValue, 0, 0, maxValue);

        //endregion

        //region граничные значения класса
        gcdTest(2147483647, 0, maxValue, maxValue, 0);
        gcd1Test(1, 0, maxValue, maxValue, 0);
        //endregion

    }

    /**
     *
     */
    @Test
    void gcdTest4_1() {

        //region граничные значения класса
        gcdTest(2147483647, 0, minValue, minValue, maxValue);
        gcd1Test(1, 0, minValue, minValue, maxValue);
        //endregion

        //region граничные значения класса
        gcdTest(2147483647, maxValue, 0, 0, 0);

        gcdTest(1, maxValue, 0, 0, 1);
        gcdTest(1, maxValue, 0, 1, 0);
        gcdTest(1, maxValue, 1, 0, 0);
        gcdTest(2147483646, maxValue - 1, 0, 0, 0);
        //endregion

        //region граничные значения класса
        gcdTest(2147483647, 0, 0, maxValue, 0);

        gcdTest(1, 0, 0, maxValue, 1);
        gcdTest(2147483646, 0, 0, maxValue - 1, 0);
        gcdTest(1, 0, 1, maxValue, 0);
        gcdTest(1, 1, 0, maxValue, 0);
        //endregion

        //region граничные значения класса
        gcdTest(2147483647, maxValue, maxValue, 0, maxValue);
        gcd1Test(1, maxValue, maxValue, 0, maxValue);
        //endregion

        //region граничные значения класса
        gcdTest(2147483647, maxValue, 0, 0, maxValue);
        gcd1Test(1, maxValue, 0, 0, maxValue);
        //endregion

        //region граничные значения класса
        gcdTest(2147483647, 0, 0, maxValue, maxValue);
        gcd1Test(1, 0, 0, maxValue, maxValue);
        //endregion

        //region граничные значения класса
        gcdTest(2147483647, 0, maxValue, maxValue, 0);
        gcd1Test(1, 0, maxValue, maxValue, 0);
        //endregion

        //region граничные значения класса
        gcdTest(2147483647, maxValue, maxValue, 0, 0);
        gcd1Test(1, maxValue, maxValue, 0, 0);
        //endregion

    }



    /**
     * Класс эквевалентности простые числа
     */
    @Test
    void gcdTestClass_1() {

        gcdTest(2147483647, maxValue, minValue, minValue, maxValue);

        gcd1Test(1, maxValue, minValue, minValue, maxValue);
        gcd2Test(1, maxValue, minValue, minValue, maxValue);
    }
    /**
     * Предметная область (-1000;1000)
     */
    @Test
    void gcdTes1_2() {

        gcdTest(1000, -1000, 1000, -1000, 1000);
        gcdTest(3, 309, 306, 930, -909);
        gcdTest(1, -202, -303, -123, -930);
        gcdTest(1, 498, -1344, 355, 344);
        gcdTest(1, -144, 345, 234, 443);
        gcdTest(2, 434, 4354, 344, 454);
        gcdTest(2, -434, 438, 34, 344);
        gcdTest(1, 498, 503, 213, 349);
        gcdTest(1, 309, -485, 298, 394);
        gcdTest(1, -856, 409, 709, 609);

        gcdTest(3, 30, 39, 90, 15);
        gcdTest(1, 45, 55, 45, -34);
        gcdTest(1, 51, 23, -35, 54);
        gcdTest(2, 44, -66, 34, 54);
        gcdTest(1, -65, 67, 43, 44);
        gcdTest(2, 54, 46, 76, 56);
        gcdTest(1, 77, 65, 55, -66);
        gcdTest(1, 67, 68, -24, 56);
        gcdTest(1, 96, -82, 65, 67);
        gcdTest(1, -86, -37, -87, -23);

        gcdTest(1, 8, 3, 9, 2);
        gcdTest(1, 7, 4, 7, -1);
        gcdTest(1, 3, -2, -3, 5);
        gcdTest(1, 0, -1, 2, 3);
        gcdTest(1, -1, 3, 5, 6);
        gcdTest(1, 2, 5, 5, 4);
        gcdTest(1, 3, 4, 6, -4);
        gcdTest(1, 3, 2, -7, 5);
        gcdTest(1, 3, -4, 2, 0);
        gcdTest(1, -5, 5, 4, 4);


    }

    /**
     * Реализация
     */
    @Test
    void gcdTes1_3() {

        gcdTest(1, 1, 1, 0, 0);
        gcdTest(1, -1, -1, 0, 0);

        gcdTest(1, 0, 0, 0, -1);
        gcdTest(1, 0, 0, 0, 1);

        gcdTest(13, -13, 13, 13, 13);
        gcdTest(5, 55, 15, 15, 30);
        gcdTest(11, 11, 77, -77, 22);
        gcdTest(2, 78, 46, 56, 42);
        gcdTest(90, 180, 360, -90, 450);
        gcdTest(1, -1, 0, 490, 789);

        gcdTest(1, 3445, 34626, 5443, 26646);
        gcdTest(1, 344093, 34960, 30000, -1);
        gcdTest(1, 56, 938, -40503, 94598);
        gcdTest(2, 49020, -19432, 9294, 0);
        gcdTest(1, -4894, 294936, 3204, 4893);
        gcdTest(4, 403092, 398444, 3984892, 398492);
        gcdTest(20, 498399940, 940932240, 34989840, 3984840);
        gcdTest(1, 5488499, 349090909, 459, 49859);
        gcdTest(1, 9999, -29393, 309230, 2094039);
        gcdTest(1, -30940, 3489483, 4923849, 394848889);

        gcdTest(4, 0, 48748, 40940, 30940);
        gcdTest(1, -48757, 0, 48378, 3949);
        gcdTest(1, 49859, 3950, -3409, 30499);
        gcdTest(1, 0, -40930, 404950, 40399);
        gcdTest(30, -45300, 399990, 603900, 30);
        gcdTest(1, 4783, 49829, 39489, 89);
        gcdTest(1, 30940, 309400, 39049, 23984);
        gcdTest(1, 9849, 39958, 39848, 39);
        gcdTest(2, 0, -1344, 34, 2984);
        gcdTest(1, -445, 5093, 39483, 395785);


    }


    /**
     * Случайные значения
     */
    @Test
    void gcdTes1_4() {

        gcdTest(1, 209, 248, 293, 3982);
        gcdTest(1, 3893, 1092, 3489, 38);
        gcdTest(2, 308, 9834, 94, 2);
        gcdTest(1, 49093, -23094, 309239, 209);
        gcdTest(1, -1, 3983, -23094, 893);
        gcdTest(1, 8387, 9823, 39823, 9823948);
        gcdTest(1, 4589023, 239, 349203, -23390);
        gcdTest(1, 304, 9009, 4881999, 3833939);
        gcdTest(1, 84999, 3094, 309, 509);
        gcdTest(1, 489489, -487484, -2999, 7858);

        gcdTest(1, 487483, 939858, 388, 89573);
        gcdTest(1, 8498, 3984, -9839, -3);
        gcdTest(1, 3984, 30948, -4924, 39409);
        gcdTest(1, 83894, -39834, 9489834, 4982935);
        gcdTest(1, -38, 45, 654, 45);
        gcdTest(1, 484, 3985, 3984, 59);
        gcdTest(1, 94, 490, 39, 35);
        gcdTest(2, 40, 394, 404, 304);
        gcdTest(1, 94, -444, 33245, 434);
        gcdTest(1, -15345, 34, 567, 0);

        gcdTest(1, 567, 974, 6094, 5698);
        gcdTest(1, 5983, 598, 7538798, -604);
        gcdTest(1, 6009, 84587, -4985, 5698);
        gcdTest(2, 5698, -46, 46, 66);
        gcdTest(5, -55, 905, 55, 985);
        gcdTest(1, 5985, 5094059, 509, 28887);
        gcdTest(1, 340985, 399, 9349, 234);
        gcdTest(1, 344, 234, -46644, 355);
        gcdTest(1, 345, 345, -34897, 24356);
        gcdTest(5, -12895, 4585, 59385, 59845);


    }

    /**
     * Другие особые значегния
     */
    @Test
    void gcdTes1_5() {

        gcdTest(0, 0, 0, 0, 0);
        gcdTest(999, 999, 999, -999, -999);
        gcdTest(333, 333, 666, -333, 999);
        gcdTest(5, 555, 1110, -555, -55555);
        gcdTest(666, -666, 666, 666, -666);
        gcdTest(99, 9999, 999999, 99, 9999);
        gcdTest(1, 13, 13, 1313, -31);
        gcdTest(1, 123, 1234, -12345, 123456);
        gcdTest(2, 1778, -1768, 1768, 1778);
        gcdTest(8, -888, 888, 8, 88);
        gcdTest(64, 128, 256, 1024, 64);
        gcdTest(1, 257, 720, 67, 19);
        gcdTest(1, 67, 67, -67, 7);
        gcdTest(2, 242424242, -242424242, 42, 24);
        gcdTest(1, -56, 65, 5656, 656565);

    }

    /**
     * Класс взаимно простые числа
     */
    @Test
    void gcdTesClass1() {

        gcdTest(1, 2147483647,2147483646, 2147483645, 2147483643);
        gcdTest(1, 2147483647,2147483646, 2147483645, 2147483643);
        gcdTest(1, 2147483647,2147483646, 2147483645, 2147483643);






        gcdTest(1, 209, 248, 293, 3982);
        gcdTest(1, 3893, 1092, 3489, 38);
        gcdTest(2, 308, 9834, 94, 2);
        gcdTest(1, 49093, -23094, 309239, 209);
        gcdTest(1, -1, 3983, -23094, 893);
        gcdTest(1, 8387, 9823, 39823, 9823948);
        gcdTest(1, 4589023, 239, 349203, -23390);
        gcdTest(1, 304, 9009, 4881999, 3833939);
        gcdTest(1, 84999, 3094, 309, 509);
        gcdTest(1, 489489, -487484, -2999, 7858);
        gcdTest(1, 487483, 939858, 388, 89573);
        gcdTest(1, 8498, 3984, -9839, -3);
        gcdTest(1, 3984, 30948, -4924, 39409);
        gcdTest(1, 83894, -39834, 9489834, 4982935);
        gcdTest(1, -38, 45, 654, 45);
        gcdTest(1, 484, 3985, 3984, 59);
        gcdTest(1, 94, 490, 39, 35);
        gcdTest(1, 94, -444, 33245, 434);
        gcdTest(1, -15345, 34, 567, 0);
        gcdTest(1, 567, 974, 6094, 5698);
        gcdTest(1, 5983, 598, 7538798, -604);
        gcdTest(1, 6009, 84587, -4985, 5698);
        gcdTest(1, 5985, 5094059, 509, 28887);
        gcdTest(1, 340985, 399, 9349, 234);
        gcdTest(1, 344, 234, -46644, 355);
        gcdTest(1, 345, 345, -34897, 24356);
        gcdTest(1, 13, 13, 1313, -31);
        gcdTest(1, 123, 1234, -12345, 123456);
        gcdTest(1, 257, 720, 67, 19);
        gcdTest(1, 67, 67, -67, 7);
        gcdTest(2, 242424242, -242424242, 42, 24);
        gcdTest(1, -56, 65, 5656, 656565);

    }

    /**
     * Класс сложные числа
     */
    @Test
    void gcdTesClass2() {


        gcdTest(2, 308, 9834, 94, 2);
        gcdTest(2, 40, 394, 404, 304);
        gcdTest(2, 5698, -46, 46, 66);
        gcdTest(5, -55, 905, 55, 985);
        gcdTest(5, -12895, 4585, 59385, 59845);
        gcdTest(999, 999, 999, -999, -999);
        gcdTest(333, 333, 666, -333, 999);
        gcdTest(5, 555, 1110, -555, -55555);
        gcdTest(666, -666, 666, 666, -666);
        gcdTest(99, 9999, 999999, 99, 9999);
        gcdTest(2, 1778, -1768, 1768, 1778);
        gcdTest(8, -888, 888, 8, 88);
        gcdTest(64, 128, 256, 1024, 64);
        gcdTest(2, 242424242, -242424242, 42, 24);
        gcdTest(13, -13, 13, 13, 13);
        gcdTest(5, 55, 15, 15, 30);
        gcdTest(11, 11, 77, -77, 22);
        gcdTest(2, 78, 46, 56, 42);
        gcdTest(90, 180, 360, -90, 450);
        gcdTest(2, 49020, -19432, 9294, 0);
        gcdTest(4, 403092, 398444, 3984892, 398492);
        gcdTest(20, 498399940, 940932240, 34989840, 3984840);
        gcdTest(4, 0, 48748, 40940, 30940);
        gcdTest(30, -45300, 399990, 603900, 30);
        gcdTest(2, 0, -1344, 34, 2984);


    }



}