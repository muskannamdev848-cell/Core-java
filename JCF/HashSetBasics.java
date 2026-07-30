package JavaCollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasics {
     void main(){
         HashSet<Student> set = new HashSet<>();

         Student s1 = new Student(1,"Muskan");
         Student s2 = new Student(1,"Muskan");
         Student s3 = new Student(1,"Muskan");

         set.add(s1);
         set.add(s2);
         set.add(s3);
         System.out.println(set);




/*

         Set<Integer> set = new HashSet<>();
         set.add(65);
         set.add(54);
         set.add(65);
         set.add(45);
         set.add(32);
         set.add(45);
         set.add(24);
         set.add(53);
         System.out.println("set is : "+set);  //isme element ka order kuchh bhi ho sakta he work on randomly


         Set<Integer> set2 = new HashSet<>();
         set2.add(65);
         set2.add(54);
         set2.add(65);
         set2.add(45);
         set2.add(88);
         System.out.println("set2 is : "+set2);

         System.out.println("set2 size is : "+set2.size());

         set2.contains(24);
         System.out.println("set2 is contains 24 : "+ set2);

         set2.containsAll(set);
         System.out.println("containsall : "+set);

         set2.addAll(set);
         System.out.println("addAll is : "+set);

         set2.retainAll(set);
         System.out.println("After retainAll : "+ set);


         set2.clear();
         System.out.println("Use clear : " +set2);

         //-------------------------LinkedHashSet------------------------------

         //LinkedHashSet hame random values return ni karta balki ham jese value insert karte he usi ke according values return karta he
         Set<Integer> s = new LinkedHashSet<>();
         s.add(78);
         s.add(45);
         s.add(68);
         s.add(24);
         System.out.println("set by use of LinkedHashSet : "+s);

         //--------------------TreeSet---------------------------------

         //TreeSet ke use se array hamesha sorted milega
         Set<Integer> st = new TreeSet<>();
         st.add(57);
         st.add(56);
         st.add(65);
         st.add(32);
         st.add(88);
         st.add(57);
         System.out.println("set by use of TreeSet is always is sorted form : "+ st);


         //--------------------complexity is---------------------
         //HashSet -> O(1)
         //LinkedHashSet -> O(n)
         //TreeSet -> O(logn)



*/

     }
}
