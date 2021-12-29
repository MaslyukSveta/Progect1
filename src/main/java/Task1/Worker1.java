package Task1;

/**
 *
 */
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




}
