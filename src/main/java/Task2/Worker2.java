package Task2;


public class Worker2 {


    /**
     * The method implements the search for the floor on which the apartment is located
     *
     * @param countFloor number of floors in the house
     * @param countApartments number of apartments on the site
     * @param numberApartments apartment number
     * @return floor
     */
    public int floorSearch(int countFloor, int countApartments, int numberApartments) {

        int floor;
        int floor1 = numberApartments/countApartments;
        int floor2 = numberApartments%countApartments;

        if(numberApartments <= countApartments) {
            floor = 1;
        } else if(floor1 <= countFloor && floor2 == 0){
            floor = floor1;

        }else if(floor1 <= countFloor){
            floor = floor1 % countFloor + 1;
        }else {
            floor = 1 + ((numberApartments - 1) % (countFloor * countApartments)/countApartments);
        }

        return floor;

    }


    /**
     * @param countFloor
     * @param countApartments
     * @param numberApartments
     * @return
     */
    public boolean correctDate(int countFloor, int countApartments, int numberApartments) {
        boolean b = false;

        if (countApartments > 0 && countFloor > 0 && numberApartments > 0) {
            b = true;
        }

        return b;
    }

    /**
     * The method implements the search for the entrance in which the apartment is located
     *
     * @param countFloor        number of floors in the house
     * @param countApartments   number of apartments on the site
     * @param numberApartments apartment number
     * @return entrance
     */
    public int entrance(int countFloor, int countApartments, int numberApartments) {

        int entrance = 0;
        int e = numberApartments % (countFloor * countApartments);

        if(e == 0){
            entrance = numberApartments / countApartments/ countFloor;
        } else if(e != 0){
            entrance = (numberApartments / countApartments/ countFloor) + 1;
        }

      return entrance;
    }


    /**
     * The method displays the apartment number, floor and entrance
     *
     * @param countFloor        number of floors in the house
     * @param countApartments   number of apartments on the site
     * @param numberApartments apartment number
     * @return apartment information
     */
    public String print(int countFloor, int countApartments, int numberApartments) {

        String result = "";

        if (correctDate(countFloor, countApartments, numberApartments)) {
            result = result + numberApartments + " "
                    + floorSearch(countFloor, countApartments, numberApartments) + " " + entrance(countFloor,  countApartments,  numberApartments);

        } else {
            result = result + "Incorrect data";
        }

        return result;
    }

}
