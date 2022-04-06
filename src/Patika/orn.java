package Patika;

public class orn {

    public static void main(String[] args) {

        String firstName = "    Baris";
        String lastName = "Kiziltas";
        String otherName = "Baris";

        System.out.println(firstName.concat( " " + lastName));
        System.out.println(firstName.contains("B"));
        System.out.println(lastName.contains("L"));
        System.out.println(lastName.contains("z"));

        System.out.println(lastName.endsWith("k"));

        System.out.println(firstName.equals(lastName));
        System.out.println(firstName.equalsIgnoreCase(lastName));
        System.out.println(firstName.equals(otherName));

        System.out.println(firstName.isEmpty());

        System.out.println(firstName.startsWith("B"));
        System.out.println(firstName.trim());
        System.out.println(lastName.length());
        System.out.println(lastName.substring(1,2));
    }
}
