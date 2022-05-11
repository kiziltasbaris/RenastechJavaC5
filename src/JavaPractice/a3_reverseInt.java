package JavaPractice;

public class a3_reverseInt {

    public static void main(String[] args) {

        //We want to find reverseInt
        //to us target 54321


        int num = 12345;
        int reverse=0;

       while (num!=0){
           reverse=reverse*10+num%10;
           num=num/10;
       }

       System.out.println("Reverse num is :" + reverse);


       /*
       2. using StringBuffer method

        int num=123456;
       System.out.println(new StringBuffer(String.valueOf(num1)).reverse());  //Output: 54321




        */

    }
}
