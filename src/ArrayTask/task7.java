package ArrayTask;

import java.time.LocalDate;
import java.util.ArrayList;


/*
 1. create an array of string, store five of your friends names in it
  2. create Array of localdates and store their birthdays in the same order
  3. use for loop to print out your friends' names and their birthdays
 */

public class task7 {

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<String>();
        name.add("Baris");
        name.add("Ezgi");
        name.add("Rohat");
        name.add("Mahmut");
        name.add("Suna");



        ArrayList<LocalDate>birthdays=new ArrayList<>();
        birthdays.add(LocalDate.of(1999,3,26));
        birthdays.add(LocalDate.of(2002,2,10));
        birthdays.add(LocalDate.of(1999,7,01));
        birthdays.add(LocalDate.of(1999,8,27));
        birthdays.add(LocalDate.of(1982,4,13));

        for (int i=0;i<=name.size()-1;i++){

            System.out.println(name.get(i) + " " + birthdays.get(i));


        }












    }
}
