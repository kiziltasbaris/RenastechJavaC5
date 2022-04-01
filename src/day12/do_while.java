package day12;

public class do_while {

    public static void main(String[] args) {

        //for loop

        //while loop
        //it will run as long as your condition is true
        //it is going to stop runninh once your condition turns to false

        //do while //it will run once at the beginning no mather your while condition is true or false
        //it will continue to run if while is true

        int number=10;

        while(number<10){ //since condition is false
            // it wont print anything from body of while loop
            System.out.println("while loop");

        }
        do{
            //do while run at least one time no mather condition is true or false
            System.out.println("do while");

        }while (number<10);//false

        do{
            System.out.println("Hello");
        }
        while (number==10);// 10 == 10 true infinitive loop

        int number2=3;

        do{
            System.out.println("number2 =" + number2); // 3  4 5
            number2++;
        }while (number2<10);

        //starting point:3
        //ending point : 9
        //iteration ++

        int number3=5;

        do{
            System.out.println(number3); //5

        }
        while (number3<0);   // 4<0 false condition
        //you are out of your loop

        //printing even numbers from 0-100
        //starting point 0
        //ending point 100
        int number4=0;
        int count = 0;

        do{
            if (number4%2==0){
                count++;
                System.out.println(number4 + " , ");
            }
            number4+=2;

        }
        while (number4<=100);

    }
}
