package Day3;

import java.util.Scanner;

public class exxx {

    public static void main(String[] args) {


        int n1,n2,select;


        Scanner myObj=new Scanner(System.in);

        System.out.println("Ilk sayiyi giriniz :");
        n1= myObj.nextInt();

        System.out.println("Ikinci sayiyi giriniz :");
        n2 = myObj.nextInt();

        System.out.println("1-toplama , 2-cikarma , 3-carpma , 4-bolme");
        System.out.println("Bir sayi seciniz :");
        select = myObj.nextInt();
        System.out.println(select);




        if(select== 1){
            System.out.println("Toplama islemi : " +  (n1+n2));


        }
        else if(select==2){

            System.out.println("Cikarma islemi : " + (n1-n2));
        }
        else if (select==3){

            System.out.println("Carpma islemi :" + (n1*n2));
        }

        else {

            System.out.println("Bolme islemi :" + (n1/n2));
        }
    }
}
