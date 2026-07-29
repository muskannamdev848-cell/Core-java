
package JavaCollectionFramework;


import java.util.Stack;

public class stack {
    static void main() {

        // Creating Stack
        Stack<Integer> stack = new Stack<>();

        // ===================== push() =====================
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("After push(): " + stack);

        // ===================== pop() =====================
        int removedElement = stack.pop();

        System.out.println("Removed Element : " + removedElement);
        System.out.println("After pop() : " + stack);

        // ===================== peek() =====================
        System.out.println("Top Element : " + stack.peek());

        // ===================== empty() =====================
        System.out.println("Is Stack Empty? " + stack.empty());

        // ===================== search() =====================
        System.out.println("Position of 20 : " + stack.search(20));

        // ===================== size() =====================
        System.out.println("Size : " + stack.size());

        // ===================== contains() =====================
        System.out.println("Contains 30 ? " + stack.contains(30));

        // ===================== get() =====================
        System.out.println("Element at index 1 : " + stack.get(1));

        // ===================== set() =====================
        stack.set(1, 99);

        System.out.println("After set() : " + stack);

        // ===================== add() =====================
        stack.add(50);

        System.out.println("After add() : " + stack);

        // ===================== remove() =====================
        stack.remove(2);

        System.out.println("After remove(index) : " + stack);

        // ===================== clone() =====================
        Stack<Integer> copyStack = (Stack<Integer>) stack.clone();

        System.out.println("Cloned Stack : " + copyStack);

        // ===================== toArray() =====================
        Object[] arr = stack.toArray();

        System.out.print("Array : ");

        for (Object obj : arr) {
            System.out.print(obj + " ");
        }

        System.out.println();

        // ===================== clear() =====================
        stack.clear();

        System.out.println("After clear() : " + stack);

        // ===================== isEmpty() =====================
        System.out.println("Is Empty : " + stack.isEmpty());

    }
}
