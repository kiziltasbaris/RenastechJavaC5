package day12;

import java.util.Scanner;

public class SumNumbers {

    //task
    //write a do-while loop that asks the user to enter two numbers
    //the numbers should be added and the sum displayed.
    //The loop should ask the user whether he or she wishes to perform the operation again.
    //If so,the loop should repeat; otherwise it should terminate
    //If user says y or Y continue
    //if user says n or N stop the loop.


    public static void main(String[] args) {

        //class color is red that means this classs is not added to git
        // class color is green that means this class is added (git add comments done)
        //class color is blue that means this class is committed (git add and git commit comments done)

        Scanner input = new Scanner(System.in);
        char choice;
        int number1 , number2;

        do{
            //ask user to enter numbers
            System.out.println("Enter first Number");
            number1 = input.nextInt();

            System.out.println("Enter second number ");
            number2 = input.nextInt();
            //The numbers should be added and the sum displayed.

            int sum = number1+number2;
            System.out.println("Sum of " + number1 + " + " + number2 + " is " + sum);

            //The loop should ask the user whether he or she wishes to perform the operation again.
            //If so , the loop should repeat :otherwise it should terminate
            //If user says y or Y continue
            //If user says n or N stop the loop

            System.out.println("Do you want to sum 2 new numbers y/n");
            choice = input.next().charAt(0);

        }while (choice == 'y' || choice == 'Y');
    }
}
