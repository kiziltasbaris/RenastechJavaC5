package codingTask;

import java.util.Scanner;

public class task11 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number");
        double number = scn.nextDouble();

        if (number>0){
            System.out.println("Number is positive");

        }

        else if(number<0) {
            System.out.println("Number is negative");
        }

        else{

            if (number==0){
                System.out.println("Number is notr");
            }

        }

    }
}
