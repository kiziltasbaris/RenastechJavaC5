package day11;

public class ornek {


    public static void main(String[] args) {

        String str = "  patika";


        System.out.println(str.charAt(2));
        System.out.println(str.concat("add"));
        System.out.println(str.contains("tika")); // boolean
        System.out.println(str.endsWith("a"));
        System.out.println(str.equals("patiKa"));//boolean
        System.out.println(str.equalsIgnoreCase("patIka"));
        System.out.println(str.indexOf("t"));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.isEmpty()); //boolean
        System.out.println(str.length());
        System.out.println(str.replace("a" , "b"));
        System.out.println(str);
        System.out.println(str.startsWith("a")); //false
        System.out.println(str.substring(1,5));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());






    }
}
