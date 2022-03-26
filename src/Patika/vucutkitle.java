package Patika;

import java.util.Scanner;

public class vucutkitle {

    public static void main(String[] args) {

        int kg;
        double height;
        double sonuc;

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter  kg :");
        kg = scn.nextInt();

        System.out.println("Please enter height ");
        height = scn.nextDouble();

        sonuc = kg/ (height*height);

        System.out.println("Vucut kitle indeksi sonucunuz :" + sonuc);


    }
}
