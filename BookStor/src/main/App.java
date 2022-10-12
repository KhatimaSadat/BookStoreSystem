package main;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("Welcome to our Book Store");
       List<book> books = new ArrayList<book>();
       book b2= new book("CS" , "khan", 100); 
       book b1= new book("Java" , "Ahmad", 60); 
        books.add(b1);
        books.add(b2);
        for(book b:books){
            System.out.println("name "+ b.name + " Author " + b.author+ " Price " + b.Price) ;
        }
        

    }
}
