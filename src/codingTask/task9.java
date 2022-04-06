package codingTask;

import java.util.Scanner;

public class task9 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first number :");
        int number1 = scn.nextInt();

        System.out.println("Enter second number :");
        int number2 = scn.nextInt();

        System.out.println("Enter third number :");
        int number3= scn.nextInt();

        if (number1>number2 && number1>number3){
            System.out.println(number1  +" number1 is big " );

        }
        else if (number2>number1 && number2>number3){
            System.out.println(number2 + " number 2 is big");


        }
        else
        {
            System.out.println(number3 + "number 3 is big");

        }

    }
}
