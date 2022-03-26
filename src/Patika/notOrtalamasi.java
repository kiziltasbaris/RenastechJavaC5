package Patika;

import java.util.Scanner;

public class notOrtalamasi {

    public static void main(String[] args) {

        //Degiskenleri olustur

        int math,fizik,kimya,tarih,muzik;

        //Scanner sinifimizi tanimladik
        Scanner scn = new Scanner(System.in);


        System.out.println("Matematik notunuz :");
        math = scn.nextInt();
        System.out.println(math);

        System.out.println("fizik notunuz :");
        fizik = scn.nextInt();
        System.out.println(fizik);

        System.out.println("kimya notunuz :");
        kimya = scn.nextInt();
        System.out.println(kimya);

        System.out.println("tarih notunuz :");
        tarih = scn.nextInt();
        System.out.println(tarih);

        System.out.println("muzik notunuz :");
        muzik = scn.nextInt();
        System.out.println(muzik);

        double toplam = (math+fizik+kimya+tarih+muzik);
        double sonuc = toplam/6;

        System.out.println("Ortalamaniz :" + sonuc);

        if(sonuc>85){

            System.out.println("Iyi");



        }

        else if(sonuc>=70 || sonuc <85){

            System.out.print("Ortalamaniz iyi");


        }

        else if (sonuc >=50 || sonuc <70){

            System.out.print(" iyi ");

        }

        else
        {

            System.out.print("Sinifta kaldiniz");

        }



    }

}
