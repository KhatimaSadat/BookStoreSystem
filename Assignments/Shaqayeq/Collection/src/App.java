package Shaqayeq;
import java.util.*;

public class App {
   public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<Integer>();
    a.add(1);
    a.add(99);
    a.add(18);
 System.out.println(a);
 a.remove(2);
 for (int i = 0; i <= a.size() - 1; i++){
    System.out.println(i + "" + a.get(i));
 }
  //Linkedlist
 LinkedList<String> L = new LinkedList<>();
 L.add("USE");
 System.out.println("linkedlist"+ L);
 L.remove(0);
 for (int i = 0; i<= L.size() - 1; i++){
     System.out.print(L.get(i) + " ");

//vector
Vector<Integer> vector = new Vector<>();
for (int index = 0; index <= 10;i++){
       
     vector.add(index);

       }
       System.out.println(vector);
       vector.remove(vector: 3);
       System.out.println(vector);
   }
    
}
//stack
Stack<Integer> s = new Stack<>();
stack.push(item:9854);
stack.push(item:4455);
stack.push(item:2367);
System.ot.println(stack);
Iterator i = stack.iterator();
while(i.hasNext()){
   System.out.println(i.next());
}
stack.pop();
System.out.println("top object" + stack.peek();)


//queue
Queue<String> q = new PriorityQueue<>();
q.add(e:"a");
q.add(e:"b");
q.add(e:"o");
q.add(e:"w");
System.out.println(q.peek());
System.out.println(q.poll());
System.out.println(q);


//arraydequeue
ArrayDeque<Integer> Ad = new ArrayDeque<>();
ArrayDeque.addFirst(e:9);
ArrayDeque.addLast(e:3);
System.out.println(Ad);
Ad.clear();
System.out.println(Ad);



//setinterface
HashSet<Integer> h = new HashSet<>();
h.add(e:"why then?");
h.add(e:"IDK");

}



