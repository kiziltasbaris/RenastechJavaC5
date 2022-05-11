package day27;

public class AccessTestInSamePackage {


    public static void main(String[] args) {
        //to be able to call instance variable we need to create ann object

        AccessModifiers obj1=new AccessModifiers();
        //we crete an object from class with help of constroctor

        // System.out.println("obj1.privateVariable = " + obj1.privateVariable);
        System.out.println("obj1.publicVariable = " + obj1.publicVariable);
        System.out.println("obj1.protectedVariable = " + obj1.protectedVariable);
        System.out.println("obj1.defaultVariable = " + obj1.defaultVariable);

        //priavete will have access only in same class
    }

}
