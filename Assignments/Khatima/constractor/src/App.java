import java.lang.constant.Constable;
import java.lang.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Computer obj = new Computer("HP");
        // obj.function();
        // Computer obj2 = new Computer("Dell");
        // Computer obj3 = new Computer("ThinkPad");
        // obj3.change(3);
        // System.out.println(obj.a);
        // System.out.println("obj " + obj.number + " obj2 " + obj2.number);
        // obj3.function(3);
        // obj2.n;
        cat c = new cat();
        c.name = "simaba";
        System.out.println(c.name);
        
        int a= 10;
       
        
    }
}

class cat {
    String name;
}

class Computer {
    String company;
    int model;
    static int a;
    final int number = 12;
    int n;

    public Computer(String companyName) {
        System.out.println("constractor of computer");
        this.company = companyName;
        System.out.println(company);
    }

    // methods
    public static void function(int n) {
        System.out.println("this is function of computer");
        n = n;

    }

    public void change(int num) {
        this.a = num;
    }

}