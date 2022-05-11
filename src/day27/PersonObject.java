package day27;

public class PersonObject {

    public static void main(String[] args) {
        MalePerson male1=new MalePerson();

        System.out.println("c7_MalePerson.isHuman = " + MalePerson.isHuman);
        System.out.println("c7_MalePerson.gender = " + MalePerson.gender);

        male1.name="OB";
        male1.age=32;

//        c7_MalePerson.ID
        //male1.ID

        if (MalePerson.isHuman && MalePerson.gender == 'M' && male1.age<55 ){
            System.out.println("Person name " +male1.name);
            System.out.println("Age " + male1.age);
            System.out.println("Person is smaller 55");
        }

    }
}
