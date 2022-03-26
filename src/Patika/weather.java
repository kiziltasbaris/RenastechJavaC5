package Patika;

import java.util.Scanner;

public class weather {

    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter to temperature :");
        heat = input.nextInt();

        if (heat<5){

            System.out.println("Dont go outside");


        }

        else if (heat>=5 && heat<= 25){
            if(heat<=15){
              System.out.println("You can go Cinema");
            }
            if(heat>=10){
                System.out.println("You can travel to forest");
            }
            else {

                System.out.println("You can go beach");
            }





        }



    }




}
