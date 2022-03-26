package Patika;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String message = "The weather is awesome today.";

        System.out.println(message);

        System.out.println("Eleman sayisi " + message.length());

        System.out.println(message.toUpperCase(Locale.ROOT));

        System.out.println(message.toLowerCase(Locale.ROOT));

        System.out.println("5.eleman :" + message.charAt(5));

        System.out.println(message.concat(" Yasasin"));


        //Eger b ile basliyorsa false dondurur.
        System.out.println(message.startsWith("B"));

        //Sondaki harf noktayla bitiyorsa true dondurur.
        System.out.println(message.endsWith("."));


        //Kacinci eleman oldgunu gosterir.
        System.out.println(message.indexOf('a'));

        System.out.println(message.lastIndexOf('t'));





    }
}
