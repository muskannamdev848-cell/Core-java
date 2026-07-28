package JavaCollectionFramework;

import java.util.*;

public class arrayList {

    static void main() {

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(25);
        list.add(60);
        list.add(30);

        System.out.println("Original List : " + list);

        // Remove element
        list.remove(0);
        System.out.println("After removing index 0 : " + list);

        // -------------------- addAll() --------------------
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(101);
        list2.add(102);

        list.addAll(list2);

        System.out.println("After addAll() : " + list);

        // Size
        System.out.println("Size : " + list.size());

        // removeAll()
        list.removeAll(list2);

        System.out.println("After removeAll() : " + list);

        // clear()
        list2.clear();

        System.out.println("Size of list2 after clear() : " + list2.size());

        // -------------------- Iterator --------------------
        System.out.println("\nTraversing using Iterator:");

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // -------------------- get() & set() --------------------
        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(222);
        list3.add(233);
        list3.add(343);
        list3.add(434);

        System.out.println("\nElement at index 2 : " + list3.get(2));

        System.out.println("Before set() : " + list3);

        list3.set(0, 333);

        System.out.println("After set() : " + list3);

        // -------------------- toArray() --------------------
        Object[] arr = list3.toArray();

        System.out.print("\nArray Elements : ");

        for (Object obj : arr) {
            System.out.print(obj + " ");
        }

        System.out.println();

        // contains()
        System.out.println("Contains 343 ? " + list3.contains(343));

        // -------------------- sort() --------------------
        Collections.sort(list);    //collection ka use kiya kyuki data to collect karne pr hi sort hoga

        System.out.println("Sorted list : " + list);

        // -------------------- clone() --------------------
        ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();

        System.out.println("Cloned List : " + newList);

        //--------------------.ensureCapacity()-------------
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);;
        System.out.println("Printing Entire newList : " + newList);

        //----------------------.isEmpty----------------------
        System.out.println("is newList Empty  : "+newList.isEmpty());
        System.out.println("is marks Empty : "+ marks.isEmpty());
        System.out.println("Index of value 60 is : "+newList.indexOf(60));
        //------------------------.lastIndexOf()------------------------
        System.out.println("Last index of 30 in newList is : "+newList.lastIndexOf(30));


    }
}