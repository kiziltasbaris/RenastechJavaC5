package JavaPractice;

import java.util.HashSet;
import java.util.Set;

public class a5_findDuplicateElements {

    //  How to find duplicate elements

    public static void main(String[] args) {

        String names[]={"Java","Javascript","Ruby","C","Python","Java"};

        //1.Compare each element:
        
        for (int i=0;i< names.length;i++){
            for (int j=i+1;j<names.length ;j++){
                if (names[i].equals(names[j])){
                    System.out.println("duplicate element is : " + names[i]);
                }

            }
        }

        //2.Using hashSet : Java collection : it stores unique values;  //This is better solution

        Set<String>store = new HashSet<String>();
        for (String name : names){

            if (store.add(name)==false){
                System.out.println("duplicate element is ::" + name);
            }
        }




    }
}
