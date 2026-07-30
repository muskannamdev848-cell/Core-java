package JavaCollectionFramework;

import java.util.*;

public class HashMapBasics {
    public static void main(String args[]){

        //they both perform all the method following
       // Map<String,String> mapping = new HashMap<>();
        Map<String,String> mapping = new LinkedHashMap<>();


        //insertion
        mapping.put("in" ,"India");
        mapping.put("en" , "England");
        mapping.put("us", "United States");

        System.out.println(mapping);

        mapping.get("en");
        System.out.println("getting : "+mapping);


        System.out.println("is contains Key in : " + mapping.containsKey("in"));


        System.out.println("contains value which is India : "+mapping.containsValue("India"));


        System.out.println("Default me none print kar do agr key matched na ho to : "+mapping.getOrDefault("usa" , "NONE "));

        //-----------------------newMap------------------------

        Map<String , String> table = new HashMap<>();
        table.put("br", "brazil");

        System.out.println("Before: " + table);
        table.putAll(mapping);
        System.out.println("After: " +table);

        //deletion
        table.remove("en");
        System.out.println(table);

        System.out.println("table size is : "+table.size());

        table.put("es","spain");
        System.out.println("table after put : "+table);

        table.putIfAbsent("is" , "India3"); //"in" to India3 print ni hoga lekin key ko different kar dege jest "is" to print hi jayega
        System.out.println("put if absent : "+ table);

        System.out.println(table);

        table.replace("is" , "India3" ," India");
        System.out.println("replace with old to new value : "+table);

        table.replace("in" , "Indonasia");//key,value
        System.out.println("replce India to Indonasia : "+table);

        table.putAll(mapping);
        System.out.println("put all : "+ table);

        //use of keySet to store
        Set<String> keySet= table.keySet();
        System.out.println("all keyset is : "+keySet);

        //valueSet
        Collection<String> valueSet = table.values();
        System.out.println("all values are : "+valueSet);

        //getAll the Entry of a set
        Set<Map.Entry<String, String>> entrySet = table.entrySet();
        System.out.println("Entry set is : "+entrySet);

        //----------------iteration over a map-----------------------------------
        Map<Integer , String> map = new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");

        for(Map.Entry<Integer , String> entry : map.entrySet()){
            System.out.println("Key : "+ entry.getKey()+" , value: " + entry.getValue());
        }
        //table.clear();
       // System.out.println("after clear the size is : "+table.size());
    }
}
