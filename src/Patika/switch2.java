package Patika;

public class switch2 {
    public static void main(String[] args) {


        int day =1;

        if(day==1){

            System.out.println("Monday");

        }

        else if(day==2){
            System.out.println("Tuesday");

        }

        else if(day==3){

            System.out.println("Wednesday");

        }
        else if(day==4){

            System.out.println("Thursday");
        }
        else if (day==5){

            System.out.println("Friday");
        }
        else if(day==6){
            System.out.println("Saturday");
        }
        else
        {

            System.out.println("Sunday");
        }

        switch (day){
            case 1:
                System.out.println("Today is monday");
                System.out.println("System is completed");
                break;
            case 2:
                System.out.println("Today is tuesday");
                break;

            case 3:
                System.out.println("Today is wednesday");
                break;

            default:
                System.out.println("Hatali girs yaptiniz.");
        }








    }



}
