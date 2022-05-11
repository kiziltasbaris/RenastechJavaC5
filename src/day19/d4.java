package day19;


public class d4 {


    public static void main(String[] args) {

        //Arrays.sort();
        d2.hello();
        d3.ageCategory(14);

        GenericUtils.Hello();

        d4.reverseString("Renastech");
        d4.reverseString("TURKEY");


    }

    //we will create our own library that will reverse any string
    //this method will accept a string so we can reverse it
    //as a result i should see reversed string

    public static void reverseString(String name){

        String reversedResult="";

        for (int i = name.length()-1 ; i>=0 ; i--){
            reversedResult+= name.charAt(i);
        }
        System.out.println("reversedResult = " + reversedResult);
    }

}
