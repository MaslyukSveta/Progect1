package Task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Worker5Test {


    Worker5 worker5 = new Worker5();

    public void testPrintDayOfWeek(String test,int day, int month, int year) throws DateException {

        String s = worker5.printDayOfWeek(day, month, year);

        assertEquals(test, s);

    }


    /**
     * границы области определения
     */
    @Test
    void test1() throws DateException {

            //region граничные значения
            testPrintDayOfWeek("Понедельник", 1, 1, 1);

            testPrintDayOfWeek("Incorrect date", 0, 1, 1);

            testPrintDayOfWeek("Incorrect date", 1, 0, 1);
            testPrintDayOfWeek("Incorrect date", 1, 1, 0);

            testPrintDayOfWeek("Вторник", 1, 1, 2);
            testPrintDayOfWeek("Вторник", 2, 1, 1);
            testPrintDayOfWeek("Четверг", 1, 2, 1);
            //endregion

            //region граничные значения
            testPrintDayOfWeek("Суббота", 1, 12, 1);

            testPrintDayOfWeek("Incorrect date", 0, 12, 2);
            testPrintDayOfWeek("Incorrect date", 1, 13, 1);
            testPrintDayOfWeek("Incorrect date", 2, 12, 0);

            testPrintDayOfWeek("Воскресенье", 1, 12, 2);
            testPrintDayOfWeek("Четверг", 1, 11, 1);
            testPrintDayOfWeek("Воскресенье", 2, 12, 1);
            //endregion

            //region граничные значения
            testPrintDayOfWeek("Вторник", 1, 12, 4);
            testPrintDayOfWeek("Среда", 1, 12, 5);
            //endregion

            //region граничные значения
            testPrintDayOfWeek("Пятница", 1, 12, 7);
/**

            testPrintDayOfWeek("", 0, 12, 7);
            testPrintDayOfWeek("", 1, 13, 7);
            testPrintDayOfWeek("", 1, 12, 8);
 */
            testPrintDayOfWeek("Суббота", 2, 12, 7);
            testPrintDayOfWeek("Среда", 1, 11, 7);
            testPrintDayOfWeek("Четверг", 1, 12, 6);
            //endregion

            //region граничные значения
            testPrintDayOfWeek("Вторник", 1, 8, 7);
            testPrintDayOfWeek("Среда", 1, 3, 7);
            //endregion


            //region граничные значения
            testPrintDayOfWeek("Среда", 1, 1, 3);
            testPrintDayOfWeek("Пятница", 1, 1, 5);
            //endregion

            //region граничные значения
            testPrintDayOfWeek("Воскресенье", 1, 1, 7);
/**
            testPrintDayOfWeek("", 2, 0, 7);
            testPrintDayOfWeek("", 0, 2, 7);
            testPrintDayOfWeek("", 1, 1, 8);
 */
            testPrintDayOfWeek("Понедельник", 2, 1, 7);
            testPrintDayOfWeek("Среда", 1, 2, 7);
            testPrintDayOfWeek("Суббота", 1, 1, 6);
            //endregion

            //region граничные значения
            testPrintDayOfWeek("Суббота", 1, 2, 3);
            testPrintDayOfWeek("Понедельник", 1, 3, 5);
            testPrintDayOfWeek("Понедельник", 1, 9, 3);
            testPrintDayOfWeek("Четверг", 1, 4, 5);
            testPrintDayOfWeek("Пятница", 1, 8, 3);
            testPrintDayOfWeek("Понедельник", 1, 3, 5);
            testPrintDayOfWeek("Суббота", 1, 11, 3);
            testPrintDayOfWeek("Вторник", 1, 6, 5);
            testPrintDayOfWeek("Среда", 1, 7, 4);
            testPrintDayOfWeek("Воскресенье", 1, 8, 5);


            //region граничные значения
            testPrintDayOfWeek("Вторник", 4, 12, 1);
            testPrintDayOfWeek("Воскресенье", 16, 12, 1);
            testPrintDayOfWeek("Суббота", 29, 12, 1);

            //endregion

            //region граничные значения
            testPrintDayOfWeek("Понедельник", 4, 12, 7);
            testPrintDayOfWeek("Суббота", 16, 12, 7);
            testPrintDayOfWeek("Пятница", 29, 12, 7);
            //endregion

            //region граничные значения
            testPrintDayOfWeek("Среда", 4, 1, 7);
            testPrintDayOfWeek("Понедельник", 16, 1, 7);
            testPrintDayOfWeek("Воскресенье", 29, 1, 7);
            //endregion

            //region граничные значения класса
            testPrintDayOfWeek("Четверг", 4, 1, 1);
            testPrintDayOfWeek("Вторник", 16, 1, 1);
            testPrintDayOfWeek("Понедельник", 29, 1, 1);
            //endregion


    }

    /**
     * 31
     */
    @Test
    void test2(){

        DateException thrown = Assertions.assertThrows(DateException.class, () -> {


            //region граничные значения
            testPrintDayOfWeek("Воскресенье", 31, 12, 7);

            testPrintDayOfWeek("", 32, 12, 7);
            testPrintDayOfWeek("", 31, 13, 7);
            testPrintDayOfWeek("", 31, 12, 8);
            testPrintDayOfWeek("", 31, 11, 7);

            testPrintDayOfWeek("Суббота", 30, 12, 7);
            testPrintDayOfWeek("Суббота", 31, 12, 6);
            //endregion
            //region граничные значения
            testPrintDayOfWeek("Понедельник", 31, 12, 1);

            testPrintDayOfWeek("", 32, 12, 1);
            testPrintDayOfWeek("", 31, 13, 1);
            testPrintDayOfWeek("", 31, 12, 0);
            testPrintDayOfWeek("", 31, 11, 1);

            testPrintDayOfWeek("Воскресенье", 30, 12, 1);
            testPrintDayOfWeek("Вторник", 31, 12, 2);

            //endregion

            //region граничные значения
            testPrintDayOfWeek("Воскресенье", 31, 10, 7);

            testPrintDayOfWeek("", 32, 10, 7);
            testPrintDayOfWeek("", 31, 11, 7);
            testPrintDayOfWeek("", 31, 10, 8);
            testPrintDayOfWeek("", 31, 9, 7);

            testPrintDayOfWeek("Суббота", 30, 10, 7);
            testPrintDayOfWeek("Суббота", 31, 10, 6);
            //endregion
            //region граничные значения
            testPrintDayOfWeek("Понедельник", 31, 10, 1);

            testPrintDayOfWeek("", 32, 10, 1);
            testPrintDayOfWeek("", 31, 11, 1);
            testPrintDayOfWeek("", 31, 10, 0);
            testPrintDayOfWeek("", 31, 9, 1);

            testPrintDayOfWeek("Воскресенье", 30, 10, 1);
            testPrintDayOfWeek("Вторник", 31, 10, 2);

            //endregion

            //region граничные значения
            testPrintDayOfWeek("Воскресенье", 31, 8, 7);

            testPrintDayOfWeek("", 32, 8, 7);
            testPrintDayOfWeek("", 31, 9, 7);
            testPrintDayOfWeek("", 31, 8, 8);

            testPrintDayOfWeek("Суббота", 30, 8, 7);
            testPrintDayOfWeek("Суббота", 31, 8, 6);
            testPrintDayOfWeek("Суббота", 31, 7, 7);
            //endregion
            //region граничные значения
            testPrintDayOfWeek("Понедельник", 31, 8, 1);

            testPrintDayOfWeek("", 32, 8, 1);
            testPrintDayOfWeek("", 31, 8, 0);
            testPrintDayOfWeek("", 31, 9, 1);

            testPrintDayOfWeek("Воскресенье", 30, 8, 1);
            testPrintDayOfWeek("Воскресенье", 30, 7, 1);
            testPrintDayOfWeek("Вторник", 31, 8, 2);

            //endregion

            //region граничные значения
            testPrintDayOfWeek("Понедельник", 31, 7, 1);

            testPrintDayOfWeek("", 32, 7, 1);
            testPrintDayOfWeek("", 31, 7, 0);
            testPrintDayOfWeek("", 31, 6, 1);


            testPrintDayOfWeek("Воскресенье", 31, 8, 1);
            testPrintDayOfWeek("Воскресенье", 30, 12, 1);
            testPrintDayOfWeek("Вторник", 31, 12, 2);

            //endregion
            //region граничные значения
            testPrintDayOfWeek("Воскресенье", 31, 7, 7);

            testPrintDayOfWeek("", 32, 7, 7);
            testPrintDayOfWeek("", 31, 7, 8);
            testPrintDayOfWeek("", 31, 6, 7);

            testPrintDayOfWeek("Суббота", 31, 7, 7);
            testPrintDayOfWeek("Суббота", 30, 7, 7);
            testPrintDayOfWeek("Суббота", 31, 8, 6);
            //endregion

            //region граничные значения
            testPrintDayOfWeek("Понедельник", 31, 5, 1);

            testPrintDayOfWeek("", 32, 5, 1);
            testPrintDayOfWeek("", 31, 6, 1);
            testPrintDayOfWeek("", 31, 5, 0);
            testPrintDayOfWeek("", 31, 4, 1);


            testPrintDayOfWeek("Воскресенье", 30, 5, 1);
            testPrintDayOfWeek("Вторник", 31, 5, 2);

            //endregion
            //region граничные значения
            testPrintDayOfWeek("Воскресенье", 31, 5, 7);

            testPrintDayOfWeek("", 32, 5, 7);
            testPrintDayOfWeek("", 31, 6, 7);
            testPrintDayOfWeek("", 31, 5, 8);
            testPrintDayOfWeek("Четверг", 31, 4, 7);

            testPrintDayOfWeek("Суббота", 30, 5, 7);
            testPrintDayOfWeek("Суббота", 31, 5, 6);
            //endregion

            //region граничные значения
            testPrintDayOfWeek("Понедельник", 31, 3, 1);

            testPrintDayOfWeek("", 32, 3, 1);
            testPrintDayOfWeek("", 31, 4, 1);
            testPrintDayOfWeek("", 31, 3, 0);
            testPrintDayOfWeek("", 31, 2, 1);

            testPrintDayOfWeek("Воскресенье", 30, 3, 1);
            testPrintDayOfWeek("Вторник", 31, 3, 2);

            //endregion
            //region граничные значения
            testPrintDayOfWeek("Воскресенье", 31, 3, 7);

            testPrintDayOfWeek("", 32, 3, 7);
            testPrintDayOfWeek("", 31, 4, 7);
            testPrintDayOfWeek("", 31, 3, 8);
            testPrintDayOfWeek("", 31, 2, 7);

            testPrintDayOfWeek("Суббота", 30, 3, 7);
            testPrintDayOfWeek("Суббота", 31, 3, 6);
            //endregion

            //region граничные значения
            testPrintDayOfWeek("Понедельник", 31, 1, 1);

            testPrintDayOfWeek("", 32, 1, 1);
            testPrintDayOfWeek("", 31, 2, 1);
            testPrintDayOfWeek("", 31, 1, 0);
            testPrintDayOfWeek("", 31, 0, 1);

            testPrintDayOfWeek("Воскресенье", 30, 1, 1);
            testPrintDayOfWeek("Вторник", 31, 1, 2);

            //endregion
            //region граничные значения
            testPrintDayOfWeek("Воскресенье", 31, 1, 7);

            testPrintDayOfWeek("", 32, 1, 7);
            testPrintDayOfWeek("", 31, 2, 7);
            testPrintDayOfWeek("", 31, 1, 8);
            testPrintDayOfWeek("", 31, 0, 7);

            testPrintDayOfWeek("Суббота", 30, 1, 7);
            testPrintDayOfWeek("Суббота", 31, 1, 6);
            //endregion

            testPrintDayOfWeek("Воскресенье", 31, 1, 3);
            testPrintDayOfWeek("Воскресенье", 31, 3, 4);
            testPrintDayOfWeek("Воскресенье", 31, 5, 5);
            testPrintDayOfWeek("Воскресенье", 31, 7, 3);
            testPrintDayOfWeek("Воскресенье", 31, 8, 4);
            testPrintDayOfWeek("Воскресенье", 31, 10, 5);
            testPrintDayOfWeek("Воскресенье", 31, 12, 3);


        });

        Assertions.assertEquals("Incorrect date", thrown.getMessage());

    }

    /**
     *
     */
    @Test
    void test3() throws DateException {


        testPrintDayOfWeek("", 29, 2, 5);


        //region граничные значения класса

        testPrintDayOfWeek("Вторник", 31, 1, 7);
        testPrintDayOfWeek("Пятница", 31, 3, 7);
        testPrintDayOfWeek("Среда", 31, 5, 7);
        testPrintDayOfWeek("Понедельник", 31, 7, 7);
        testPrintDayOfWeek("Четверг", 31, 8, 7);
        testPrintDayOfWeek("Вторник", 31, 10, 7);
        testPrintDayOfWeek("Воскресенье", 31, 12, 7);
        //endregion


        //region граничные значения класса

        testPrintDayOfWeek("Среда", 31, 1, 1);
        testPrintDayOfWeek("Суббота", 31, 3, 1);
        testPrintDayOfWeek("Четверг", 31, 5, 1);
        testPrintDayOfWeek("Вторник", 31, 7, 1);
        testPrintDayOfWeek("Пятница", 31, 8, 1);
        testPrintDayOfWeek("Среда", 31, 10, 1);
        testPrintDayOfWeek("Понедельник", 31, 12, 1);
        //endregion
        testPrintDayOfWeek("Понедельник", 30, 1, 7);
        testPrintDayOfWeek("Четверг", 30, 3, 7);
        testPrintDayOfWeek("Вторник", 30, 5, 7);
        testPrintDayOfWeek("Воскресенье", 30, 7, 7);
        testPrintDayOfWeek("Среда", 30, 8, 7);
        testPrintDayOfWeek("Понедельник", 30, 10, 7);
        testPrintDayOfWeek("Суббота", 30, 12, 7);
        //endregion

        //region граничные значения класса

        testPrintDayOfWeek("Вторник", 30, 1, 1);
        testPrintDayOfWeek("Пятница", 30, 3, 1);
        testPrintDayOfWeek("Среда", 30, 5, 1);
        testPrintDayOfWeek("Понедельник", 30, 7, 1);
        testPrintDayOfWeek("Четверг", 30, 8, 1);
        testPrintDayOfWeek("Вторник", 30, 10, 1);
        testPrintDayOfWeek("Воскресенье", 30, 12, 1);
        //endregion

        //region промежуточные
        testPrintDayOfWeek("Понедельник", 2, 1, 7);
        testPrintDayOfWeek("Суббота", 4, 3, 7);
        testPrintDayOfWeek("Воскресенье", 7, 5, 7);
        testPrintDayOfWeek("Вторник", 4, 7, 7);
        testPrintDayOfWeek("Суббота", 5, 8, 7);
        testPrintDayOfWeek("Воскресенье", 8, 10, 7);
        testPrintDayOfWeek("Суббота", 9, 12, 7);

        testPrintDayOfWeek("Воскресенье", 14, 1, 1);
        testPrintDayOfWeek("Пятница", 16, 3, 1);
        testPrintDayOfWeek("Воскресенье", 27, 5, 1);
        testPrintDayOfWeek("Вторник", 24, 7, 1);
        testPrintDayOfWeek("Суббота", 25, 8, 1);
        testPrintDayOfWeek("Пятница", 12, 10, 1);
        testPrintDayOfWeek("Воскресенье", 16, 12, 1);

        testPrintDayOfWeek("Вторник", 2, 1, 1);
        testPrintDayOfWeek("Воскресенье", 4, 3, 1);
        testPrintDayOfWeek("Понедельник", 7, 5, 1);
        testPrintDayOfWeek("Среда", 4, 7, 1);
        testPrintDayOfWeek("Воскресенье", 5, 8, 1);
        testPrintDayOfWeek("Понедельник", 8, 10, 1);
        testPrintDayOfWeek("Воскресенье", 9, 12, 1);

        testPrintDayOfWeek("Суббота", 14, 1, 7);
        testPrintDayOfWeek("Четверг", 16, 3, 7);
        testPrintDayOfWeek("Суббота", 27, 5, 7);
        testPrintDayOfWeek("Понедельник", 24, 7, 7);
        testPrintDayOfWeek("Пятница", 25, 8, 7);
        testPrintDayOfWeek("Четверг", 12, 10, 7);
        testPrintDayOfWeek("Суббота", 16, 12, 7);
        //endregion


    }


    /**
     *   Проверка, колличество дней в месяце 30
     */
    @Test
    void test4()  {

        DateException thrown = Assertions.assertThrows(DateException.class, () -> {


            //region граничные значения класса
            testPrintDayOfWeek("Воскресенье", 30, 4, 7);

            testPrintDayOfWeek("Суббота", 29, 4, 7);
            testPrintDayOfWeek("Суббота", 30, 4, 6);
            testPrintDayOfWeek("Суббота", 30, 3, 7);
            testPrintDayOfWeek("Суббота", 30, 5, 7);

            testPrintDayOfWeek("", 31, 4, 7);
            testPrintDayOfWeek("", 30, 4, 8);
            //endregion
            //region граничные значения класса
            testPrintDayOfWeek("Воскресенье", 30, 4, 1);

            testPrintDayOfWeek("Суббота", 29, 4, 1);
            testPrintDayOfWeek("Суббота", 30, 4, 2);
            testPrintDayOfWeek("Суббота", 30, 3, 1);
            testPrintDayOfWeek("Суббота", 30, 5, 1);

            testPrintDayOfWeek("", 31, 4, 1);
            testPrintDayOfWeek("", 30, 4, 0);
            //endregion



            //region граничные значения класса
            testPrintDayOfWeek("Воскресенье", 30, 6, 7);

            testPrintDayOfWeek("Суббота", 29, 6, 7);
            testPrintDayOfWeek("Суббота", 30, 6, 6);
            testPrintDayOfWeek("Суббота", 30, 7, 7);
            testPrintDayOfWeek("Суббота", 30, 5, 7);

            testPrintDayOfWeek("", 31, 6, 7);
            testPrintDayOfWeek("", 30, 6, 8);
            //endregion
            //region граничные значения класса
            testPrintDayOfWeek("Воскресенье", 30, 6, 1);

            testPrintDayOfWeek("Суббота", 29, 6, 1);
            testPrintDayOfWeek("Суббота", 30, 6, 2);
            testPrintDayOfWeek("Суббота", 30, 7, 1);
            testPrintDayOfWeek("Суббота", 30, 5, 1);

            testPrintDayOfWeek("", 31, 6, 1);
            testPrintDayOfWeek("", 30, 6, 0);
            //endregion



            //region граничные значения класса
            testPrintDayOfWeek("Воскресенье", 30, 9, 7);

            testPrintDayOfWeek("Суббота", 29, 9, 7);
            testPrintDayOfWeek("Суббота", 30, 9, 6);
            testPrintDayOfWeek("Суббота", 30, 8, 7);
            testPrintDayOfWeek("Суббота", 30, 10, 7);

            testPrintDayOfWeek("", 31, 9, 7);
            testPrintDayOfWeek("", 30, 9, 8);
            //endregion
            //region граничные значения класса
            testPrintDayOfWeek("Воскресенье", 30, 9, 1);

            testPrintDayOfWeek("Суббота", 29, 9, 1);
            testPrintDayOfWeek("Суббота", 30, 9, 2);
            testPrintDayOfWeek("Суббота", 30, 8, 1);
            testPrintDayOfWeek("Суббота", 30, 10, 1);

            testPrintDayOfWeek("", 31, 9, 1);
            testPrintDayOfWeek("", 30, 9, 0);
            //endregion



            //region граничные значения класса
            testPrintDayOfWeek("Воскресенье", 30, 11, 7);

            testPrintDayOfWeek("Суббота", 29, 11, 7);
            testPrintDayOfWeek("Суббота", 30, 11, 6);
            testPrintDayOfWeek("Суббота", 30, 10, 7);
            testPrintDayOfWeek("Суббота", 30, 12, 7);

            testPrintDayOfWeek("", 31, 11, 7);
            testPrintDayOfWeek("", 30, 1, 8);
            //endregion
            //region граничные значения класса
            testPrintDayOfWeek("Воскресенье", 30, 11, 1);

            testPrintDayOfWeek("Суббота", 29, 11, 1);
            testPrintDayOfWeek("Суббота", 30, 11, 2);
            testPrintDayOfWeek("Суббота", 30, 10, 1);
            testPrintDayOfWeek("Суббота", 30, 12, 1);

            testPrintDayOfWeek("", 31, 11, 1);
            testPrintDayOfWeek("", 30, 11, 0);
            //endregion


            //region граничные значения класса
            testPrintDayOfWeek("Пятница", 30, 6, 7);
            testPrintDayOfWeek("Суббота", 30, 9, 7);
            testPrintDayOfWeek("Четверг", 30, 11, 7);
            //endregion

            //region граничные значения класса
            testPrintDayOfWeek("Суббота", 29, 4, 7);
            testPrintDayOfWeek("Четверг", 29, 6, 7);
            testPrintDayOfWeek("Пятница", 29, 9, 7);
            testPrintDayOfWeek("Среда", 29, 11, 7);
            //endregion

            //region граничные значения класса

            testPrintDayOfWeek("Понедельник", 30, 4, 1);
            testPrintDayOfWeek("Суббота", 30, 6, 1);
            testPrintDayOfWeek("Воскресенье", 30, 9, 1);
            testPrintDayOfWeek("Пятница", 30, 11, 1);
            //endregion

            // region граничные значения класса

            testPrintDayOfWeek("Воскресенье", 29, 4, 1);
            testPrintDayOfWeek("Пятница", 29, 6, 1);
            testPrintDayOfWeek("Суббота", 29, 9, 1);
            testPrintDayOfWeek("Четверг", 29, 11, 1);
            //endregion

            //region граничные значения класса

            testPrintDayOfWeek("Среда", 4, 4, 1);
            testPrintDayOfWeek("Вторник", 5, 6, 1);
            testPrintDayOfWeek("Суббота", 8, 9, 1);
            testPrintDayOfWeek("Пятница", 9, 11, 1);

            testPrintDayOfWeek("Понедельник", 23, 4, 1);
            testPrintDayOfWeek("Понедельник", 25, 6, 1);
            testPrintDayOfWeek("Среда", 19, 9, 1);
            testPrintDayOfWeek("Пятница", 16, 11, 1);

            testPrintDayOfWeek("Среда", 5, 4, 7);
            testPrintDayOfWeek("Четверг", 8, 6, 7);
            testPrintDayOfWeek("Воскресенье", 3, 9, 7);
            testPrintDayOfWeek("Вторник", 7, 11, 7);

            testPrintDayOfWeek("Понедельник", 10, 4, 7);
            testPrintDayOfWeek("Воскресенье", 25, 6, 7);
            testPrintDayOfWeek("Четверг", 21, 9, 7);
            testPrintDayOfWeek("Суббота", 18, 11, 7);
            //endregion
            });

        Assertions.assertEquals("Incorrect date", thrown.getMessage());

    }
    /**
     *   Проверка, колличество дней в месяце 28
     */

    @Test
    void test5() throws DateException {


        DateException thrown = Assertions.assertThrows(DateException.class, () -> {


            //region граничные

            testPrintDayOfWeek("Среда", 28, 2, 1);

            testPrintDayOfWeek("", 29, 2, 1);
            testPrintDayOfWeek("", 28, 2, 0);

            testPrintDayOfWeek("Вторник", 28, 2, 2);
            testPrintDayOfWeek("Вторник", 27, 2, 1);
            testPrintDayOfWeek("Вторник", 28, 3, 1);
            testPrintDayOfWeek("Вторник", 28, 1, 1);
            //endregion

            //region граничные

            testPrintDayOfWeek("Вторник", 28, 2, 7);

            testPrintDayOfWeek("", 29, 2, 7);
            testPrintDayOfWeek("", 28, 2, 8);

            testPrintDayOfWeek("Вторник", 28, 2, 6);
            testPrintDayOfWeek("Вторник", 27, 2, 7);
            testPrintDayOfWeek("Вторник", 28, 3, 7);
            testPrintDayOfWeek("Вторник1", 28, 1, 7);

            //endregion

            //region граничные
            testPrintDayOfWeek("Воскресенье", 4, 2, 1);
            testPrintDayOfWeek("Суббота", 17, 2, 1);
            testPrintDayOfWeek("Вторник", 7, 2, 7);
            testPrintDayOfWeek("Среда", 22, 2, 7);

            testPrintDayOfWeek("Пятница", 5, 2, 5);
            testPrintDayOfWeek("Среда", 17, 2, 5);
            testPrintDayOfWeek("Суббота", 7, 2, 4);
            testPrintDayOfWeek("Суббота", 22, 2, 3);
            testPrintDayOfWeek("Пятница", 4, 2, 6);
            testPrintDayOfWeek("Воскресенье", 17, 2, 2);
            testPrintDayOfWeek("Понедельник", 7, 2, 6);
            testPrintDayOfWeek("Суббота", 22, 2, 3);
            //endregion
            });

            Assertions.assertEquals("Incorrect date", thrown.getMessage());
    }

    /**
     * предметная область
     */
    @Test
    void test6() throws DateException {

        testPrintDayOfWeek("Пятница", 30, 6, 7);
        testPrintDayOfWeek("Суббота", 30, 9, 7);
        testPrintDayOfWeek("Четверг", 30, 11, 7);
        testPrintDayOfWeek("Суббота", 29, 4, 7);
        testPrintDayOfWeek("Четверг", 29, 6, 7);
        testPrintDayOfWeek("Пятница", 29, 9, 7);
        testPrintDayOfWeek("Среда", 29, 11, 7);
        testPrintDayOfWeek("Понедельник", 30, 4, 1);
        testPrintDayOfWeek("Суббота", 30, 6, 1);
        testPrintDayOfWeek("Воскресенье", 30, 9, 1);
        testPrintDayOfWeek("Пятница", 30, 11, 1);
        testPrintDayOfWeek("Воскресенье", 29, 4, 1);
        testPrintDayOfWeek("Пятница", 29, 6, 1);
        testPrintDayOfWeek("Суббота", 29, 9, 1);
        testPrintDayOfWeek("Четверг", 29, 11, 1);
        testPrintDayOfWeek("Вторник", 31, 1, 7);
        testPrintDayOfWeek("Пятница", 31, 3, 7);
        testPrintDayOfWeek("Среда", 31, 5, 7);
        testPrintDayOfWeek("Понедельник", 31, 7, 7);
        testPrintDayOfWeek("Четверг", 31, 8, 7);
        testPrintDayOfWeek("Вторник", 31, 10, 7);
        testPrintDayOfWeek("Воскресенье", 31, 12, 7);
        testPrintDayOfWeek("Пятница", 30, 6, 7);
        testPrintDayOfWeek("Суббота", 30, 9, 7);
        testPrintDayOfWeek("Четверг", 30, 11, 7);
        testPrintDayOfWeek("Суббота", 29, 4, 7);
        testPrintDayOfWeek("Четверг", 29, 6, 7);
        testPrintDayOfWeek("Пятница", 29, 9, 7);
        testPrintDayOfWeek("Среда", 29, 11, 7);
        testPrintDayOfWeek("Понедельник", 30, 4, 1);
        testPrintDayOfWeek("Суббота", 30, 6, 1);
        testPrintDayOfWeek("Воскресенье", 30, 9, 1);
        testPrintDayOfWeek("Пятница", 30, 11, 1);
        testPrintDayOfWeek("Воскресенье", 29, 4, 1);
        testPrintDayOfWeek("Пятница", 29, 6, 1);
        testPrintDayOfWeek("Суббота", 29, 9, 1);
        testPrintDayOfWeek("Четверг", 29, 11, 1);
        testPrintDayOfWeek("Среда", 4, 4, 1);
        testPrintDayOfWeek("Вторник", 5, 6, 1);
        testPrintDayOfWeek("Суббота", 8, 9, 1);
        testPrintDayOfWeek("Пятница", 9, 11, 1);
        testPrintDayOfWeek("Понедельник", 23, 4, 1);
        testPrintDayOfWeek("Понедельник", 25, 6, 1);
        testPrintDayOfWeek("Среда", 19, 9, 1);
        testPrintDayOfWeek("Пятница", 16, 11, 1);
        testPrintDayOfWeek("Среда", 5, 4, 7);
        testPrintDayOfWeek("Четверг", 8, 6, 7);
        testPrintDayOfWeek("Воскресенье", 3, 9, 7);
        testPrintDayOfWeek("Вторник", 7, 11, 7);
        testPrintDayOfWeek("Понедельник", 10, 4, 7);
        testPrintDayOfWeek("Воскресенье", 25, 6, 7);
        testPrintDayOfWeek("Четверг", 21, 9, 7);
        testPrintDayOfWeek("Суббота", 18, 11, 7);

    }
    /**
     * на реализацию
     */
    @Test
    void test7() throws DateException {

        testPrintDayOfWeek("Воскресенье", 5, 2, 7);
        testPrintDayOfWeek("Четверг", 11, 5, 7);
        testPrintDayOfWeek("Среда", 9, 8, 7);
        testPrintDayOfWeek("Пятница", 29, 9, 7);
        testPrintDayOfWeek("Воскресенье", 17, 12, 7);

        testPrintDayOfWeek("Вторник", 5, 1, 5);
        testPrintDayOfWeek("Понедельник", 26, 1, 4);
        testPrintDayOfWeek("Среда", 23, 1, 2);
        testPrintDayOfWeek("Понедельник", 5, 1, 4);
        testPrintDayOfWeek("Среда", 19, 1, 6);
    }

    /**
     * случайные значения
     */
    @Test
    void test8() throws DateException {
        testPrintDayOfWeek("Пятница", 1, 1, 5);
        testPrintDayOfWeek("Четверг", 7, 1, 5);
        testPrintDayOfWeek("Понедельник", 8, 3, 5);
        testPrintDayOfWeek("Суббота", 7, 2, 4);
        testPrintDayOfWeek("Суббота", 22, 2, 3);
        testPrintDayOfWeek("Пятница", 4, 2, 6);
        testPrintDayOfWeek("Суббота", 1, 5, 5);
        testPrintDayOfWeek("Воскресенье", 9, 5, 5);
        testPrintDayOfWeek("Понедельник", 10, 5, 5);
        testPrintDayOfWeek("Понедельник", 28, 6, 5);
        testPrintDayOfWeek("Пятница", 5, 2, 5);
        testPrintDayOfWeek("Среда", 17, 2, 5);
    }

    /**
     * особые значения
     */
    @Test
    void test9() throws DateException{

        testPrintDayOfWeek("Пятница", 1, 1, 5);
        testPrintDayOfWeek("Четверг", 7, 1, 5);
        testPrintDayOfWeek("Понедельник", 8, 3, 5);
        testPrintDayOfWeek("Суббота", 1, 5, 5);
        testPrintDayOfWeek("Воскресенье", 9, 5, 5);
        testPrintDayOfWeek("Понедельник", 10, 5, 5);
        testPrintDayOfWeek("Понедельник", 28, 6, 5);
        testPrintDayOfWeek("Вторник", 24, 8, 5);
        testPrintDayOfWeek("Четверг", 14, 10, 5);
        testPrintDayOfWeek("Суббота", 25, 12, 5);
        testPrintDayOfWeek("Пятница", 13, 6, 3);
        testPrintDayOfWeek("Вторник", 29, 9, 4);


    }

    /**
     * класс эквевалентности Monday
     */
    @Test
    void testClassMo() throws DateException {

        testPrintDayOfWeek("Понедельник", 1, 1, 1);
        testPrintDayOfWeek("Понедельник", 8, 1, 1);

        testPrintDayOfWeek("Понедельник", 25, 12, 7);
        testPrintDayOfWeek("Понедельник", 18, 12, 7);


        testPrintDayOfWeek("Понедельник", 22, 1, 1);
        testPrintDayOfWeek("Понедельник", 12, 2, 1);
        testPrintDayOfWeek("Понедельник", 11, 6, 1);
        testPrintDayOfWeek("Понедельник", 3, 9, 1);
        testPrintDayOfWeek("Понедельник", 8, 10, 1);

        testPrintDayOfWeek("Понедельник", 21, 1, 2);
        testPrintDayOfWeek("Понедельник", 18, 2, 2);
        testPrintDayOfWeek("Понедельник", 13, 5, 2);
        testPrintDayOfWeek("Понедельник", 30, 9, 2);
        testPrintDayOfWeek("Понедельник", 11, 11, 2);


        testPrintDayOfWeek("Понедельник", 13, 1, 3);
        testPrintDayOfWeek("Понедельник", 3, 2, 3);
        testPrintDayOfWeek("Понедельник", 17, 3, 3);
        testPrintDayOfWeek("Понедельник", 11, 8, 3);
        testPrintDayOfWeek("Понедельник", 17, 11, 3);


        testPrintDayOfWeek("Понедельник", 23, 2, 4);
        testPrintDayOfWeek("Понедельник", 9, 3, 4);
        testPrintDayOfWeek("Понедельник", 15, 6, 4);
        testPrintDayOfWeek("Понедельник", 10, 8, 4);
        testPrintDayOfWeek("Понедельник", 14, 12, 4);


        testPrintDayOfWeek("Понедельник", 11, 1, 5);
        testPrintDayOfWeek("Понедельник", 15, 2, 5);
        testPrintDayOfWeek("Понедельник", 17, 5, 5);
        testPrintDayOfWeek("Понедельник", 14, 6, 5);
        testPrintDayOfWeek("Понедельник", 4, 10, 5);

        testPrintDayOfWeek("Понедельник", 10, 1, 6);
        testPrintDayOfWeek("Понедельник", 21, 2, 6);
        testPrintDayOfWeek("Понедельник", 22, 8, 6);
        testPrintDayOfWeek("Понедельник", 19, 9, 6);
        testPrintDayOfWeek("Понедельник", 28, 11, 6);

        testPrintDayOfWeek("Понедельник", 16, 1, 7);
        testPrintDayOfWeek("Понедельник", 20, 2, 7);
        testPrintDayOfWeek("Понедельник", 27, 3, 7);
        testPrintDayOfWeek("Понедельник", 24, 4, 7);
        testPrintDayOfWeek("Понедельник", 15, 5, 7);

    }

    /**
     * класс эквевалентности Tuesday
     */
    @Test
    void testClassTu() throws DateException {


        testPrintDayOfWeek("Вторник", 2, 1, 1);
        testPrintDayOfWeek("Вторник", 9, 1, 1);

        testPrintDayOfWeek("Вторник", 26, 12, 7);
        testPrintDayOfWeek("Вторник", 19, 12, 7);

        testPrintDayOfWeek("Вторник", 16, 1, 1);
        testPrintDayOfWeek("Вторник", 20, 2, 1);
        testPrintDayOfWeek("Вторник",  12, 6, 1);
        testPrintDayOfWeek("Вторник", 17, 7, 1);
        testPrintDayOfWeek("Вторник", 21, 8, 1);


        testPrintDayOfWeek("Вторник", 12, 2, 2);
        testPrintDayOfWeek("Вторник", 13, 8, 2);
        testPrintDayOfWeek("Вторник", 17, 9, 2);
        testPrintDayOfWeek("Вторник", 12, 11, 2);
        testPrintDayOfWeek("Вторник", 3, 12, 2);


        testPrintDayOfWeek("Вторник", 11, 2, 3);
        testPrintDayOfWeek("Вторник", 15, 7, 3);
        testPrintDayOfWeek("Вторник", 9, 9, 3);
        testPrintDayOfWeek("Вторник", 14, 10, 3);
        testPrintDayOfWeek("Вторник", 11, 11, 3);


        testPrintDayOfWeek("Вторник", 13, 1, 4);
        testPrintDayOfWeek("Вторник", 10, 2, 4);
        testPrintDayOfWeek("Вторник", 9, 6, 4);
        testPrintDayOfWeek("Вторник", 21, 7, 4);
        testPrintDayOfWeek("Вторник", 18, 8, 4);



        testPrintDayOfWeek("Вторник", 16, 2, 5);
        testPrintDayOfWeek("Вторник", 17, 8, 5);
        testPrintDayOfWeek("Вторник", 21, 9, 5);
        testPrintDayOfWeek("Вторник", 16, 11, 5);
        testPrintDayOfWeek("Вторник", 14, 12, 5);

        testPrintDayOfWeek("Вторник", 8, 2, 6);
        testPrintDayOfWeek("Вторник", 12, 7, 6);
        testPrintDayOfWeek("Вторник", 13, 9, 6);
        testPrintDayOfWeek("Вторник", 11, 10, 6);
        testPrintDayOfWeek("Вторник", 15, 11, 6);

        testPrintDayOfWeek("Вторник", 10, 1, 7);
        testPrintDayOfWeek("Вторник", 21, 2, 7);
        testPrintDayOfWeek("Вторник", 28, 3, 7);
        testPrintDayOfWeek("Вторник", 18, 4, 7);
        testPrintDayOfWeek("Вторник", 23, 5, 7);
    }
    /**
     * класс эквевалентности Wednesday
     */
    @Test
    void testClassWe() throws DateException {
        testPrintDayOfWeek("Среда", 3, 1, 1);
        testPrintDayOfWeek("Среда", 10, 1, 1);

        testPrintDayOfWeek("Среда", 20, 12, 7);
        testPrintDayOfWeek("Среда", 27, 12, 7);

        testPrintDayOfWeek("Среда", 7, 2, 1);
        testPrintDayOfWeek("Среда", 18, 7, 1);
        testPrintDayOfWeek("Среда", 19, 9, 1);
        testPrintDayOfWeek("Среда", 31, 10, 1);
        testPrintDayOfWeek("Среда", 14, 11, 1);

        testPrintDayOfWeek("Среда", 23, 1, 2);
        testPrintDayOfWeek("Среда", 20, 2, 2);
        testPrintDayOfWeek("Среда", 6, 3, 2);
        testPrintDayOfWeek("Среда", 17, 4, 2);
        testPrintDayOfWeek("Среда", 8, 5, 2);

        testPrintDayOfWeek("Среда", 19, 2, 3);
        testPrintDayOfWeek("Среда", 20, 8, 3);
        testPrintDayOfWeek("Среда", 17, 9, 3);
        testPrintDayOfWeek("Среда", 12, 11, 3);
        testPrintDayOfWeek("Среда", 3, 12, 3);

        testPrintDayOfWeek("Среда", 14, 1, 4);
        testPrintDayOfWeek("Среда", 11, 2, 4);
        testPrintDayOfWeek("Среда", 10, 6, 4);
        testPrintDayOfWeek("Среда", 22, 7, 4);
        testPrintDayOfWeek("Среда", 12, 8, 4);

        testPrintDayOfWeek("Среда", 17, 2, 5);
        testPrintDayOfWeek("Среда", 14, 7, 5);
        testPrintDayOfWeek("Среда", 29, 9, 5);
        testPrintDayOfWeek("Среда", 27, 10, 5);
        testPrintDayOfWeek("Среда", 3, 11, 5);

        testPrintDayOfWeek("Среда", 19, 1, 6);
        testPrintDayOfWeek("Среда", 23, 2, 6);
        testPrintDayOfWeek("Среда", 18, 5, 6);
        testPrintDayOfWeek("Среда", 17, 8, 6);
        testPrintDayOfWeek("Среда", 26, 10, 6);

        testPrintDayOfWeek("Среда", 1, 2, 7);
        testPrintDayOfWeek("Среда", 19, 4, 7);
        testPrintDayOfWeek("Среда", 24, 5, 7);
        testPrintDayOfWeek("Среда", 14, 6, 7);
        testPrintDayOfWeek("Среда", 19, 7, 7);

    }
    /**
     * класс эквевалентности Thursday
     */
    @Test
    void testClassTh() throws DateException {

        testPrintDayOfWeek("Четверг", 4, 1, 1);
        testPrintDayOfWeek("Четверг", 11, 1, 1);

        testPrintDayOfWeek("Четверг", 28, 12, 7);
        testPrintDayOfWeek("Четверг", 21, 12, 7);

        testPrintDayOfWeek("Четверг", 11, 1, 1);
        testPrintDayOfWeek("Четверг", 15, 2, 1);
        testPrintDayOfWeek("Четверг", 21, 6, 1);
        testPrintDayOfWeek("Четверг", 27, 9, 1);
        testPrintDayOfWeek("Четверг", 18, 10, 1);

        testPrintDayOfWeek("Четверг", 3, 1, 2);
        testPrintDayOfWeek("Четверг", 7, 2, 2);
        testPrintDayOfWeek("Четверг", 9, 5, 2);
        testPrintDayOfWeek("Четверг", 19, 9, 2);
        testPrintDayOfWeek("Четверг", 21, 11, 2);

        testPrintDayOfWeek("Четверг", 9, 1, 3);
        testPrintDayOfWeek("Четверг", 13, 2, 3);
        testPrintDayOfWeek("Четверг", 13, 3, 3);
        testPrintDayOfWeek("Четверг", 14, 8, 3);
        testPrintDayOfWeek("Четверг", 13, 11, 3);

        testPrintDayOfWeek("Четверг", 19, 2, 4);
        testPrintDayOfWeek("Четверг", 19, 3, 4);
        testPrintDayOfWeek("Четверг", 11, 6, 4);
        testPrintDayOfWeek("Четверг", 20, 8, 4);
        testPrintDayOfWeek("Четверг", 12, 11, 4);

        testPrintDayOfWeek("Четверг", 18, 2, 5);
        testPrintDayOfWeek("Четверг", 11, 3, 5);
        testPrintDayOfWeek("Четверг", 24, 6, 5);
        testPrintDayOfWeek("Четверг", 19, 8, 5);
        testPrintDayOfWeek("Четверг", 16, 12, 5);

        testPrintDayOfWeek("Четверг", 20, 1, 6);
        testPrintDayOfWeek("Четверг", 10, 2, 6);
        testPrintDayOfWeek("Четверг", 11, 8, 6);
        testPrintDayOfWeek("Четверг", 22, 9, 6);
        testPrintDayOfWeek("Четверг", 17, 11, 6);

        testPrintDayOfWeek("Четверг", 5, 1, 7);
        testPrintDayOfWeek("Четверг", 16, 2, 7);
        testPrintDayOfWeek("Четверг", 23, 3, 7);
        testPrintDayOfWeek("Четверг", 20, 4, 7);
        testPrintDayOfWeek("Четверг", 18, 5, 7);

    }
    /**
     * класс эквевалентности Friday
     */
    @Test
    void testClassFr() throws DateException {

        testPrintDayOfWeek("Пятница", 5, 1, 1);
        testPrintDayOfWeek("Пятница", 12, 1, 1);

        testPrintDayOfWeek("Пятница", 29, 12, 7);
        testPrintDayOfWeek("Пятница", 22, 12, 7);

        testPrintDayOfWeek("Пятница", 12, 1, 1);
        testPrintDayOfWeek("Пятница", 16, 2, 1);
        testPrintDayOfWeek("Пятница", 15, 6, 1);
        testPrintDayOfWeek("Пятница", 21, 9, 1);
        testPrintDayOfWeek("Пятница", 19, 10, 1);

        testPrintDayOfWeek("Пятница", 11, 1, 2);
        testPrintDayOfWeek("Пятница", 15, 2, 2);
        testPrintDayOfWeek("Пятница", 17, 5, 2);
        testPrintDayOfWeek("Пятница", 13, 9, 2);
        testPrintDayOfWeek("Пятница", 22, 11, 2);

        testPrintDayOfWeek("Пятница", 17, 1, 3);
        testPrintDayOfWeek("Пятница", 21, 2, 3);
        testPrintDayOfWeek("Пятница", 7, 3, 3);
        testPrintDayOfWeek("Пятница", 15, 8, 3);
        testPrintDayOfWeek("Пятница", 19, 12, 3);

        testPrintDayOfWeek("Пятница", 13, 2, 4);
        testPrintDayOfWeek("Пятница", 13, 3, 4);
        testPrintDayOfWeek("Пятница", 12, 6, 4);
        testPrintDayOfWeek("Пятница", 14, 8, 4);
        testPrintDayOfWeek("Пятница", 11, 12, 4);

        testPrintDayOfWeek("Пятница", 29, 1, 5);
        testPrintDayOfWeek("Пятница", 19, 2, 5);
        testPrintDayOfWeek("Пятница", 21, 5, 5);
        testPrintDayOfWeek("Пятница", 11, 6, 5);
        testPrintDayOfWeek("Пятница", 29, 10, 5);

        testPrintDayOfWeek("Пятница", 28, 1, 6);
        testPrintDayOfWeek("Пятница", 11, 2, 6);
        testPrintDayOfWeek("Пятница", 20, 5, 6);
        testPrintDayOfWeek("Пятница", 17, 6, 6);
        testPrintDayOfWeek("Пятница", 21, 10, 6);

        testPrintDayOfWeek("Пятница", 27, 1, 7);
        testPrintDayOfWeek("Пятница", 17, 2, 7);
        testPrintDayOfWeek("Пятница", 17, 3, 7);
        testPrintDayOfWeek("Пятница", 21, 4, 7);
        testPrintDayOfWeek("Пятница", 19, 5, 7);
    }


    /**
     * класс эквевалентности Saturday
     */
    @Test
    void testClassSa() throws DateException {

        testPrintDayOfWeek("Суббота", 6, 1, 1);
        testPrintDayOfWeek("Суббота", 13, 1, 1);

        testPrintDayOfWeek("Суббота", 23, 12, 7);
        testPrintDayOfWeek("Суббота", 30, 12, 7);

        testPrintDayOfWeek("Суббота", 13, 1, 1);
        testPrintDayOfWeek("Суббота", 17, 2, 1);
        testPrintDayOfWeek("Суббота", 23, 6, 1);
        testPrintDayOfWeek("Суббота", 15, 9, 1);
        testPrintDayOfWeek("Суббота", 13, 10, 1);

        testPrintDayOfWeek("Суббота", 12, 1, 2);
        testPrintDayOfWeek("Суббота", 23, 2, 2);
        testPrintDayOfWeek("Суббота", 18, 5, 2);
        testPrintDayOfWeek("Суббота", 21, 9, 2);
        testPrintDayOfWeek("Суббота", 16, 11, 2);

        testPrintDayOfWeek("Суббота", 4, 1, 3);
        testPrintDayOfWeek("Суббота", 15, 2, 3);
        testPrintDayOfWeek("Суббота", 22, 3, 3);
        testPrintDayOfWeek("Суббота", 16, 8, 3);
        testPrintDayOfWeek("Суббота", 13, 12, 3);

        testPrintDayOfWeek("Суббота", 14, 2, 4);
        testPrintDayOfWeek("Суббота", 14, 3, 4);
        testPrintDayOfWeek("Суббота", 13, 6, 4);
        testPrintDayOfWeek("Суббота", 29, 8, 4);
        testPrintDayOfWeek("Суббота", 12, 12, 4);

        testPrintDayOfWeek("Суббота", 9, 1, 5);
        testPrintDayOfWeek("Суббота", 20, 2, 5);
        testPrintDayOfWeek("Суббота", 22, 5, 5);
        testPrintDayOfWeek("Суббота", 12, 6, 5);
        testPrintDayOfWeek("Суббота", 16, 10, 5);

        testPrintDayOfWeek("Суббота", 22, 1, 6);
        testPrintDayOfWeek("Суббота", 19, 2, 6);
        testPrintDayOfWeek("Суббота", 21, 5, 6);
        testPrintDayOfWeek("Суббота", 25, 6, 6);
        testPrintDayOfWeek("Суббота", 29, 10, 6);

        testPrintDayOfWeek("Суббота", 21, 1, 7);
        testPrintDayOfWeek("Суббота", 25, 2, 7);
        testPrintDayOfWeek("Суббота", 25, 3, 7);
        testPrintDayOfWeek("Суббота", 22, 4, 7);
        testPrintDayOfWeek("Суббота", 6, 5, 7);


    }
    /**
     * класс эквевалентности Sunday
     */
    @Test
    void testClassSu() throws DateException {

        testPrintDayOfWeek("Воскресенье", 7, 1, 1);
        testPrintDayOfWeek("Воскресенье", 14, 1, 1);

        testPrintDayOfWeek("Воскресенье", 24, 12, 7);
        testPrintDayOfWeek("Воскресенье", 31, 12, 7);

        testPrintDayOfWeek("Воскресенье", 7, 1, 1);
        testPrintDayOfWeek("Воскресенье", 11, 2, 1);
        testPrintDayOfWeek("Воскресенье", 10, 6, 1);
        testPrintDayOfWeek("Воскресенье", 16, 9, 1);
        testPrintDayOfWeek("Воскресенье", 14, 10, 1);

        testPrintDayOfWeek("Воскресенье", 13, 1, 2);
        testPrintDayOfWeek("Воскресенье", 10, 2, 2);
        testPrintDayOfWeek("Воскресенье", 16, 6, 2);
        testPrintDayOfWeek("Воскресенье", 29, 9, 2);
        testPrintDayOfWeek("Воскресенье", 13, 10, 2);

        testPrintDayOfWeek("Воскресенье", 12, 1, 3);
        testPrintDayOfWeek("Воскресенье", 9, 2, 3);
        testPrintDayOfWeek("Воскресенье", 18, 5, 3);
        testPrintDayOfWeek("Воскресенье", 14, 9, 3);
        testPrintDayOfWeek("Воскресенье", 16, 11, 3);

        testPrintDayOfWeek("Воскресенье", 18, 1, 4);
        testPrintDayOfWeek("Воскресенье", 15, 2, 4);
        testPrintDayOfWeek("Воскресенье", 15, 3, 4);
        testPrintDayOfWeek("Воскресенье", 23, 8, 4);
        testPrintDayOfWeek("Воскресенье", 13, 12, 4);

        testPrintDayOfWeek("Воскресенье", 10, 1, 5);
        testPrintDayOfWeek("Воскресенье", 14, 2, 5);
        testPrintDayOfWeek("Воскресенье", 16, 5, 5);
        testPrintDayOfWeek("Воскресенье", 20, 6, 5);
        testPrintDayOfWeek("Воскресенье", 24, 10, 5);

        testPrintDayOfWeek("Воскресенье", 23, 1, 6);
        testPrintDayOfWeek("Воскресенье", 20, 2, 6);
        testPrintDayOfWeek("Воскресенье", 22, 5, 6);
        testPrintDayOfWeek("Воскресенье", 26, 6, 6);
        testPrintDayOfWeek("Воскресенье", 30, 10, 6);

        testPrintDayOfWeek("Воскресенье", 29, 1, 7);
        testPrintDayOfWeek("Воскресенье", 26, 2, 7);
        testPrintDayOfWeek("Воскресенье", 26, 3, 7);
        testPrintDayOfWeek("Воскресенье", 30, 4, 7);
        testPrintDayOfWeek("Воскресенье", 28, 5, 7);

    }



}