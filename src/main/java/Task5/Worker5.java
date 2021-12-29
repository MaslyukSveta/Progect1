package Task5;


import java.util.ArrayList;

/**
 *
 */
public class Worker5 {


    public Object printDayOfWeek;

    public int dayOfWeek1(int day, int month, int year) {

        int s;
        int[] M = {6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};

        if( aBoolean(day, month,year)) {
            s = 7;
        }else {
            if (year == 7) {
                year = 0;
            }
            s = ((day + M[(month - 1)] + year) % 7);
        }
        return s;

    }


    public boolean aBoolean(int day, int month, int year) {

        boolean data = false;

        if(year < 1 || year > 7 || month < 1 || month > 12 || day < 1 || day > 31) {
            data = true;
        } else if( month == 2 && day > 28) {
            data = true;
        }else if( (month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            data = true;
        }
       return data;
    }


    public String printDayOfWeek(int day, int month, int year) {

        ArrayList<String> S = new ArrayList<>();

        S.add("Воскресенье");
        S.add("Понедельник");
        S.add("Вторник");
        S.add("Среда");
        S.add("Четверг");
        S.add("Пятница");
        S.add("Суббота");
        S.add("Incorrect date");

        return S.get(dayOfWeek1(day,  month, year));
    }

}