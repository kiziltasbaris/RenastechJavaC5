package day21;

import java.time.LocalDate;

public class c6 {

    public static void main(String[] args) {

        LocalDate obj1 = LocalDate.of(2002,02,06);

        System.out.println(obj1);

        LocalDate localDate2= LocalDate.of(1999,03,26);
        System.out.println("Local date2 = " +  localDate2);

        boolean b1= localDate2.isAfter(obj1); //false
        boolean b2= localDate2.isBefore(obj1); //true
        boolean b3= localDate2.isEqual(obj1); //false

        System.out.println(b1  + " /" + b2 + "/"+ b3);

        LocalDate todayDate = LocalDate.now();
        System.out.println(todayDate);

            String todayDateString = todayDate.toString();
            todayDateString=todayDateString.replace("-",".");

            System.out.println(todayDateString);
    }
}
