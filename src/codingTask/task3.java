package codingTask;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first Number :");
        float number1 = scn.nextFloat();

        System.out.println("Enter Second Number");
        float number2 = scn.nextFloat();

        float result=number1*number2;

        System.out.println(result);
    }
}
