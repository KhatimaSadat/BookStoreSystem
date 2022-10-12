package main;
import java.util.*;
public class book {
  // variables
    String name;
    String author;
    double Price;
    Fields obj = new Fields();
    int Fields_id= obj.id;
  //constractor
    public book(String name, String author, float price){
      this.name =name;
      this.author=author;
      this.Price=price;
    }
    public void showBook(){
      System.out.println(this.name +" is a book whose author is " + this.author + "  price  " + this.Price);
    }
}
