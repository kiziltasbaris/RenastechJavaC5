package Patika;

import java.util.Scanner;

public class taksimetre {

    public static void main(String[] args) {

        int km;
        double perKm = 2.20;
        double startPrice = 10;
        double toplam;




        Scanner scn = new Scanner(System.in);

        System.out.println("Km yi giriniz :");
        km = scn.nextInt();

        toplam = (km*perKm);
        toplam += startPrice;

        System.out.println("Toplam tutar" + toplam);


    }
}
