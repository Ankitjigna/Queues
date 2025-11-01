import java.util.*;
public class DequeOperation{
    public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);  // 1
        deque.addFirst(2);  // 2,1
        deque.addLast(3);  // 2,1,3
        deque.addFirst(4); // 4,2,1,3
        
        //print
        System.out.println(deque);
        deque.removeFirst(); // 2,1,3
        System.out.println(deque);
        deque.removeLast(); // 2,1,
        System.out.println(deque);

        System.out.println(deque.getFirst()); // 2
        System.out.println(deque.getLast()); // 1
    }
}