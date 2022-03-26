package Patika;

public class Arrays {

    public static void main(String[] args) {

       String student1= "Baris";
       String student2= "Omer";
       String student3="Ezgi";

        String [] students =  new String[3];
        students [0]="Baris";
        students[1]="Omer";
        students[2]="Ezgi";

        for(int i=0;i<students.length;i++){
          System.out.println(students[i]);

        }
        
        System.out.println("/////////// UZUNLUK HESAPLAMA/////////////");



        String [] cars = {"Volvo","Ford","Opel"};

        System.out.println(cars.length);

        System.out.println("/////////VERILERIN YERINI DEGISTIRME//////////");

        cars[0]="Opel";
        System.out.println(cars[0]);


        System.out.println("/////////////////////////");


        String [] fruits = {"Orange","Banana","Strawberry"};

        for(int i =0 ; i< fruits.length ; i++ ){

            System.out.println(fruits[i]);
        }

        String [] studentss = {"Omer","Baris","Taylan"};

        for(String student : studentss){
            System.out.println(student);

        }






    }




}
