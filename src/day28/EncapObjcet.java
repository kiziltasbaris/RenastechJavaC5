package day28;

public class EncapObjcet {

    public static void main(String[] args) {

        EncapsulationIntro obj1=new EncapsulationIntro();
        // obj1.name="Hello world";
        //name is not accesible beacuse it is priavate
        obj1.setName("Hello");
//        System.out.println(obj1.name);
        System.out.println(obj1.getName());
        obj1.setIdNum(1234234);
        System.out.println(obj1.getIdNum());

        obj1.setAge(35);
        System.out.println(obj1.getAge());

    }


}
