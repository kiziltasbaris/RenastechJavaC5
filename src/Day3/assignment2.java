package Day3;

import java.util.Scanner;

public class assignment2 {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the temperature :");

        double fDegree =  myObj.nextDouble();

        fDegree = (fDegree-32)/1.8;

        if (fDegree<-10){

            System.out.println("Its  too cold");

        }

        else if(fDegree<=-10 && fDegree==0 ) {

            System.out.println("Its cold");


        }

        else if(fDegree>0 && fDegree<=15){

            System.out.println("Its not cold");

        }

        else if(fDegree==15 && fDegree<=40){

            System.out.println("Its warm");

        }

        else if(fDegree>40 && fDegree<=60){
            System.out.println("Extremely hot!");


        }

        else {

            System.out.println("Welcome to Hell!!!");
        }

    }
}
