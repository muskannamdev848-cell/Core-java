package JavaCollectionFramework;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Deque;

public class stackBasics {
    void main(){
        //stack ko implement karne ke liye arraydeque ka bhi use kar skate the
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(3);
        stack.push(4);
        stack.push(6);

        System.out.println(stack);

        stack.pop();    // work on LIFO
        System.out.println(stack);
        System.out.println(stack.peek());  //peek work for first element according to the nature of stack

    }
}
