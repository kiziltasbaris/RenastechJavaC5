package Patika;

public class NestedIf {

    public static void main(String[] args) {

        //create a condition to check if person is eligible to vote
        //Conditions for a person to be eligible
        //Person has to be citizen
        //person has to be older then 18

        boolean personCitizen=true;
        int personAge = 34;

        if (personCitizen==true){
            System.out.println("Person is citizen");
            if(personAge>18){
                System.out.println("Person is eligible to  vote");

            }
            else{
                System.out.println("Person is not eligible to  vote");
            }

        }
        else{

            System.out.println("Person isnt citizen no need to check  age");
        }
    }
}
