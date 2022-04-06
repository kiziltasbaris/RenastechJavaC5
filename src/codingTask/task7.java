package codingTask;

import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);


        System.out.println("Enter number :");
        int number1=scn.nextInt();

        if (number1%2==0 ){

            System.out.println("Number is even :" + number1);

        }

        else if(number1 %2==1)
        {
            System.out.println("Number is odd :" + number1);
        }

        else{

          System.out.println("Try again");

        }


    }
}
