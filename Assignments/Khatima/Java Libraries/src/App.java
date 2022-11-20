
import java.net.SocketImpl;
import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
import java.lang.*;

public class App {

    public static void main(String[] args) throws Exception {
        ArrayList<Character> obj = new ArrayList<>();
        obj.add('a');
        obj.add('f');
        obj.add('g');
        obj.add('h');
        obj.add('a');
        obj.add('n');
        int b = 12; // primitive
        Integer a = new Integer(12); // object
        andishe sh = new andishe();
        sh.setAge(22);
        sh.getAge();
        test t = new test();
        t.method2();
        // t.method(sh);
        // andishe[] array = new andishe[5];
        // array[0] = new andishe();
        // array[1] = new andishe();
        // array[2] = new andishe();
        // array[3] = new andishe();
        // array[4] = new andishe();

        // array[0].setAge(30);
        // array[1].setAge(19);
        // array[2].setAge(20);
        // array[3].setAge(22);
        // array[4].setAge(24);
        // for (int i = 0; i < array.length; i++) {
        // array[i].getAge();
        // }

    }
}

class andishe {
    int age;
    private String name;

    public void setAge(int a) {
        this.age = a;
    }

    public void getAge() {
        System.out.println("age " + this.age);
    }
}

class test {
    int a = 12;

    public void method(andishe obj) {
        if ((obj.age) >= 18) {
            System.out.println("andishe can vote");
        } else {
            System.out.println("andishe can not vote ");
        }

    }

    public void method2() {
        System.out.println(this);
    }
}