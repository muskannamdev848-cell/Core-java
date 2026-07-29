package JavaCollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class arrayDeque {
    void main(){
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(12);
        System.out.println(q);
        q.offerFirst(13);
        q.offerLast(43);
        System.out.println(q);

        q.pollFirst();    //poll AND remove works same
        q.removeLast();
        System.out.println(q);
        q.offer(67);
        q.offer(89);
        System.out.println(q);
        System.out.println("peek last is  "+q.peekLast());
        System.out.println("peek first is  "+q.peekFirst());
        System.out.println("size is  "+ q.size());


    }
}
