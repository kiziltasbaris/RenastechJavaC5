package JavaPractice;

public class a1_reverseString {

    public static void main(String[] args) {

        //Reverse a String:
        //diff bw String and StringBuffer
        //Do we have reverse function in String?

    String s = "Selenium";
      String rev="";
      int len= s.length();  //8

      for (int i= len-1; i>=0; i--){
         rev = rev +  s.charAt(i);  //muineleS
      }
         System.out.println(rev);

      //There are 2 ways to solution

        /*using StringBuffer class:

        StringBuffer sf = new StringBuffer("Hello");
        System.out.println(sf.reverse());

*/


    }
}
