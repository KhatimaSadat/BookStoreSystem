import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> A=new ArrayList<Integer>();
//        A.add(20);
//        A.add(30);
//        A.add(40);
//        A.add(50);
//        System.out.println(A);
//        A.remove(1);
//        for( int i=0;i<=A.size() -1;i++){
//            System.out.println(i + " " + A.get(i));
//        }
//        //LinkedLst
//        LinkedList<String> link =new LinkedList<>();
//        link.add("kabul");
//        link.add("kandahar");
//        link.add("helmand");
//        link.add("zabul");
//        System.out.println("LinkedList => "+ link);
//        link.remove(0);
//        for( int i=0; i<=link.size() -1; i++)
//        {
//            System.out.println(link.get(i) + " ");
//        }
        //vector
//        Vector<Integer> vector=new Vector<>();
//        for (int i=0; i<=10;i++){
//            vector.add(i);
//        }
//        System.out.println(vector);
//        vector.remove(4);
//        System.out.println(vector);

        //Stack
//        Stack<Integer> stack =new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        System.out.println(stack);
//        Iterator i= stack.iterator();
//        while ( i.hasNext()){
//            System.out.println(i.next());
//        }
//        stack.pop();
//        System.out.println(stack);
//        System.out.println(stack.peek());
          // Queue interface
//          Queue<String> pq = new priorityQueue<>();
//          pq.add("ALI");
//          pq.add("zia");
//          pq.add("Ahmad");
//          pq.add("Reza");
//         System.out.println(pq.peek());
//         System.out.println(pq.poll());
//         System.out.println(pq);
//         pq.remove("Ali");
//         System.out.println(pq);
         //pq.addAll(A);
        // System.out.println(pq);

//        //DeQueue Interface
//        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
//        arrayDeque.addFirst(10);
//        arrayDeque.addLast(20);
//        arrayDeque.addFirst(15);
//        System.out.println(arrayDeque);
//        arrayDeque.clear();
//        System.out.println(arrayDeque);

        //set interface
        HashSet<String> Hs=new HashSet<>();
        Hs.add("it");
        Hs.add("is");
        Hs.add("Hash set");
        Iterator<String> i=Hs.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


    }

}