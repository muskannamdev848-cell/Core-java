package JavaCollectionFramework;

import java.util.LinkedList;

public class linkedList {
    void main(){
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(11);
        l1.add(56);
        l1.add(23);
        l1.add(54);

        System.out.println(l1);
        l1.addFirst(1);
        System.out.println("add first "+l1);
        l1.addLast(101);
        System.out.println("add last "+l1);

        l1.removeFirst();
        System.out.println("remove first "+l1);
        l1.removeLast();
        System.out.println("remove last "+l1);

        System.out.println("get first "+l1.getFirst());
        System.out.println("get last "+l1.getLast());
        System.out.println("peek element  "+l1.peek());

        //return and remove the first element from the poll
        System.out.println("pool the element "+l1.poll());
        System.out.println("After poll the list is "+l1);

        //add the specified element at the end of the linkedlist
        l1.offer(43);
        System.out.println("after offer "+l1);
    }
}
