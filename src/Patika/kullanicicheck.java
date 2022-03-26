package Patika;


import java.util.Scanner;

public class kullanicicheck {

    public static void main(String[] args) {

        String name , surName;
        int id;

        Scanner scn = new Scanner(System.in);


        System.out.println("Enter name :");
        name = scn.nextLine();

        System.out.println("Enter lastName :");
        surName = scn.nextLine();

        System.out.println("Enter Id : ");
        id = scn.nextInt();

        if (name.equals("Baris") && surName.equals("Kiziltas") && id==11 ){

            System.out.println("Ok");

        }

        else {
            System.out.println("Try");
        }






        }




    }

