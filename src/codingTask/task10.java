package codingTask;

import java.util.Scanner;

public class task10 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter year:");
        int year=input.nextInt();
        String leap=(year%4==0&&year%100!=0)||(year%400==0)?(year+" is leap year."):(year+" is not leap year.");
        System.out.println(leap);
    }
}
