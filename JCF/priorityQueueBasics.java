package JavaCollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueueBasics {
    void main(){
        Queue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);   //((a,b)-> b-a) high value ko priority rakhne ke liye ye compretor use karna padega

        //in case of integers
        //default behaviour ->integers -> less value -> high priority -> minHeap
        //maxHeap -> Integer -> high value -> high priority
        //default behaviour of priority queue is ki jiski value sabse kam hogi uski priority jyada hogi
        pq.offer(84);
        pq.offer(65);
        pq.offer(83);
        pq.offer(97);

        System.out.println(pq);
        System.out.println(pq.poll());   // store and remove
        System.out.println(pq);
        System.out.println(pq.poll());


    }
}
