package JavaCollectionFramework;

import java.util.Vector;

public class vector {
    void main(){

        Vector<Integer> v1 = new Vector<>(); //isme se work kar raha he
        //List<Integer> v1 = new Vector<>(); //isme bhi set work kar raha he
       // Collection<Integer> v1 = new Vector<>(); // isme set work ni kar raha he
        v1.add(43);
        v1.add(66);
        v1.add(76);
        v1.add(23);
        System.out.println(v1);
        System.out.println(v1.set(0,43));
        System.out.println(v1.size());
        System.out.println(v1.contains(2));

        //toArray
        //toString
    }
}
