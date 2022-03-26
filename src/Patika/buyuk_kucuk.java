package Patika;

import java.util.Scanner;

public class buyuk_kucuk {

    public static void main(String[] args) {

        int a,b,c;

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first number");
        a = scn.nextInt();

        System.out.println("Enter second number");
        b = scn.nextInt();

        System.out.println("Enter third number");
        c = scn.nextInt();

        if (a>b && a>c){

            System.out.println("The biggest number is A");


        }
        else if(b>a && b>c){
            System.out.println("The biggest number is B");

        }

        else {

            System.out.println("The biggest number is C");
        }



    }
}
