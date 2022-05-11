package JavaPractice;

public class a2_removeJunk {

    public static void main(String[] args) {


        String  s = "@#$%^&* baris kiziltas 01293448";

        //Regular Expression : [^a-zA-Z0-9]

        s= s.replaceAll("[^a-zA-z0-9]","");
        System.out.println(s);
    }
}
