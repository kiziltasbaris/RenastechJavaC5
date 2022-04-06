package Patika;

public class Switch {

    public static void main(String[] args) {
        //Create a logic that will check the number and print the day name
        //If you have a boolean to check if block will be better option to use
        //if you are going to check equality (==) you can use switch blocks

        int number=5;
        String dayName;

        switch (number){

            case 1:
                dayName="Mon";
                break;

            case 2:
                dayName="Tue";
                break;
            case 3:
                dayName="Wed";
                break;
            case 4:
                dayName="Thu";
                break;
            case 5:
                dayName="Fri";
                break;
            case 6:
                dayName="Sat";
                break;
            case 7:
                dayName="Sun";
                break;

            default:
                dayName="Day isnt exist";
        }

        System.out.println(dayName);


    }
}
