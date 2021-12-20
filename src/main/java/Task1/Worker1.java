package Task1;


import java.util.concurrent.atomic.AtomicReference;

public class Worker1 {

    /**
     * @param x
     * @param y
     */

    public static String swapString (int x, int y) {
        y += x;
        x = y - x;
        y -= x;
        return  x  + " " + y;
    }




    static void swap(AtomicReference<Integer> a, AtomicReference<Integer> b) {

        Integer c = a.get();
        a.set(b.get());
        b.set(c);

    }



}
