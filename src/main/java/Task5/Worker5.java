package Task5;


import java.util.ArrayList;

public class Worker5 {

    public int dayOfWeek1(int day, int month, int year) throws DateException{

        int s = 0;

        if(year < 1 || year > 7 || month < 1 || month > 12 || day < 1 || day > 31) {
            s = 7;
        } else
        if( month == 2 && day > 28) {
            s = 7;
        }else
        if( (month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            s = 7;
        }else {
            int[] M = {6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};

            if (year == 7) {
                year = 0;
            }
            s = ((day + M[(month - 1)] + year) % 7);
        }
        return  s;

    }

    public boolean aBoolean(int day, int month, int year) throws DateException{

        if(year < 1 || year > 7 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if( month == 2 && day > 28) {
            return false;
        }
        if( (month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            return false;
        }
       return true;
    }

    public String printDayOfWeek(int day, int month, int year) throws DateException {

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
class   DateException extends Exception {

    private int day;
    private int month;
    private int year;

    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }


    public DateException(String message, int d, int m, int y){
        super(message);
        day = d;
        month = m;
        year = y;
    }

}

