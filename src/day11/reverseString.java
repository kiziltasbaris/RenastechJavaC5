package day11;

public class reverseString {

    public static void main(String[] args) {

        /*
       String name = "Baris";
       String nme = "";

       for (int i = (name.length()-1) ; i>=0 ; i--){

           nme += name.charAt(i);

       }

       System.out.println(name);
       System.out.println(nme);

       */

        //INTERVIEW QUESTIONS
        StringBuffer sbf = new StringBuffer("12345!");
        System.out.println("String buffer = " + sbf);

        // Here it reverses the string buffer
        sbf.reverse();
        System.out.println("String buffer after reversing = " + sbf);

    }




}
