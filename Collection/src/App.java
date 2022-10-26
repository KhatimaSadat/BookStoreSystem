import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        // List Interface
        // ArrayList
        // System.out.println("Array List");
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(10);
        A.add(12);
        A.add(14);
        A.add(16);
        // System.out.println(A);
        // A.remove(1);
        // for (int i = 0; i <= A.size() - 1; i++) {
        // System.out.println(i + " " + A.get(i));
        // }
        // //LinkedList
        // System.out.println("LinkedList");
        // LinkedList<String> link = new LinkedList<>();
        // link.add("Kandahar");
        // link.add("University");
        // link.add("Afganistan");
        // link.add("Kabul");
        // System.out.println("LinkedList => " + link);
        // link.remove(3);
        // for (int i = 0; i <= link.size() - 1; i++) {
        // System.out.print(link.get(i) + " ");
        // }
        // // vector
        // System.out.println("Vector");
        // Vector<Integer> vector = new Vector<>();
        // for (int index = 0; index <= 10; index++) {

        // vector.add(index);
        // }
        // System.out.println(vector);
        // vector.remove(3);
        // System.out.println(vector);
        // //stack
        // System.out.println("Stak");
        // Stack<Integer> stack = new Stack<>();
        // stack.push(1234);
        // stack.push(5678);
        // stack.push(91011);
        // System.out.println(stack);
        // Iterator i = stack.iterator();
        // while (i.hasNext()) {
        // System.out.println(i.next());
        // }
        // stack.pop();
        // System.out.println("top object " + stack.peek());
        // Queue Interface
        // Queue<String> Pq = new PriorityQueue<>();
        // Pq.add("A");
        // Pq.add("B");
        // Pq.add("c");
        // Pq.add("F");
        // Pq.add("D");
        // System.out.println(Pq.peek());
        // System.out.println(Pq.poll());
        // System.out.println(Pq);
        // Pq.remove("c");
        // System.out.println(Pq);
        // // Pq.addAll(A);
        // // System.out.println(Pq);
        // // DeQueue Interface
        // ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        // arrayDeque.addFirst(10);
        // arrayDeque.addLast(20);
        // arrayDeque.addFirst(15);
        // System.out.println(arrayDeque);
        // arrayDeque.clear();
        // System.out.println(arrayDeque);
        // // set interface
        // HashSet<String> HS = new HashSet<>();
        // HS.add("It");
        // HS.add("Is");
        // HS.add("HashSet");
        // Iterator<String> i = HS.iterator();
        // while (i.hasNext()) {
        // System.out.println(i.next());
        // }
        // Linked HashSet
        LinkedHashSet<String> LL = new LinkedHashSet<>();
        LL.add("Ahmad");
        LL.add("Mohammad");
        LL.add("Ekram");
        Iterator it = LL.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
