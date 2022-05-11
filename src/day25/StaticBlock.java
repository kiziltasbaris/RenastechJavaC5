package day25;

public class StaticBlock {

    //in java we have class members : class , method , variables
    //optional you can create a block

    int instanceVariable = 10;
    static  int staticVariable=20;

    public static void main(String[] args) {//static method

        System.out.println("This is main method ");

        methodStat();
//        methodInstance()
        StaticBlock obj1=new StaticBlock();
        obj1.methodInstance();

        StaticBlock obj2=new StaticBlock();
        obj2.methodInstance();
    }

    public static void methodStat(){
        System.out.println("Static Method");
    }

    public void methodInstance(){
        System.out.println("Instance method");
    }


    //blocks
    {
        //instance block
        System.out.println("This is instance block");
    }

    static {
        System.out.println("Static Block");
    }

    //instance block : will be executed for any new object
    //static block : will be executed once before everything


}
