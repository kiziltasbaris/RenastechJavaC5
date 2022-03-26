package Day3;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        int n1,n2,select;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        n1 = myObj.nextInt();

        System.out.println("Enter second number");
        n2 = myObj.nextInt();

        System.out.println("1-Addition , 2-Subtraction , 3-Multiplication , 4-Division");
        System.out.print("Select to number ");
        select=myObj.nextInt();

        System.out.println(select);

        switch (select){

            case 1:

                System.out.println("Addition : " +  (n1+n2) );

                break;

            case 2:
                System.out.println("Subtraction : " + (n1-n2) );

                break;

            case 3:
                System.out.println("Multiplication : " + (n1*n2));

                break;

            case 4:

                System.out.println("Division : " + n1/n2);

                break;










        }





    }



}
