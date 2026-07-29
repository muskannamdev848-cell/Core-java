package JavaCollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class queueLinkedList {
    void main(){
        Queue<String> animal1 =  new LinkedList<>();
       // Queue<String> animal2 = new ArrayDeque<>();
       // Queue<String> animal3 = new PriorityQueue<>();

        animal1.add("Lion");
        animal1.add("Tiger");
        animal1.add("Cow");
        animal1.add("Dog");
        animal1.offer("Snake");     //Queue me offerLast ans offerFirst work ni karta he



        System.out.println(animal1);
        System.out.println("size of the list : "+animal1.size());
        //System.out.println("after using remove : "+ animal1.remove(1));
        System.out.println("after using poll : "+ animal1.poll()); // return and remove
        System.out.println("after using peek : "+ animal1.peek());
        System.out.println("list is  : "+ animal1);



    }
}
