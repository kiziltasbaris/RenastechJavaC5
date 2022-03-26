package day4;

public class nestedIfPractice {

    public static void main(String[] args) {




        String personName="Baris";
        int age = 22;
        double weight=180;
        String result;

        if (age>18){
            if(weight>50.0){
                result= personName + " is eligible to give blood";
            } else{
                result=personName + "is not eligible to give blood";
            }

        }
         else if (age>0 && age <=18){
            result = personName + "is needs to be older 18";

        } else{

             result = "invalid age you entered " + age;


        }
         System.out.println(result);



    }
}
