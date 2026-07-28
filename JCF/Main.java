package JavaCollectionFramework;

import java.util.*;

public class Main {
    public static void main(String [] args){

        Integer arr[] = {5,2,5,6,2,8,6,3,9};
        //when do not use of other class
        //Arrays.sort(arr);
        //when uses new comparator class
        Arrays.sort(arr ,new ReverseCmp());
        for(int a : arr){
            System.out.print(a+" ");
        }



















      /*  List<Stud> st = new ArrayList<>();

        st.add(new Stud("Shruti", 21, 50));
        st.add(new Stud("Krishna", 18, 48));
        st.add(new Stud("Raksha", 16, 51));
        st.add(new Stud("Ruhii", 10, 30));
        st.add(new Stud("Karan", 10, 31));

        System.out.println("Before Sorting");
        System.out.println(st);

        // Collections.sort() first checks whether the objects
        // implement Comparable.
        // Then it calls compareTo() for each object.
        // compareTo() compares the age, so the list is sorted by age.

        // Collections.sort(st);

        //or agr hm chahe to yahi pr hi comparator ka use kar sakte he or sorting kar sakte he jese mene yaha weight ke basis par ki he
        Collections.sort(st,new Comparator<Stud>(){

            @Override
            public int compare(Stud o1, Stud o2) {
                return o1.weight - o2.weight;
            }
        });
*//*

       *//* // or hm new class bnakar comperator ka use baarr baar kar sakte he
        Collections.sort(st, new WeightComparator());*//*

        //Use lambda expression

        Collections.sort(st,(o1,o2) -> o1.weight - o2.weight);
        System.out.println(st);

        //comparing
        //thencomparing these are the fancy */





















       /* List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(66);
        list.add(93);
        list.add(86);
        list.add(42);

        Collections.sort(list);
        System.out.println(list);*/
    }
}
