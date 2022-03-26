package Patika;

import java.util.Scanner;

public class teksayibulmaloop {

    public static void main(String[] args) {

        int n ;
        int total=0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Sayi giriniz :");

        do{

            n = scn.nextInt();

            if (n %2 == 1){
                total = total+ n;


            }



        }

        while (n>0);

        System.out.println("Toplam : " + total);
    }
}
