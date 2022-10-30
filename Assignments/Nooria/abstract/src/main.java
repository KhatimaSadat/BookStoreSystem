public class main {
    public static void main(String[] args) throws Exception{
        Object obj = new Object();
        obj.walk();
        obj.eat();
    }
}
abstract class Human{
    abstract   void walk();
    public  void eat(){
        System.out.println("he is eating , human class");
    }
}
class person extends Human{
    public  void walk(){
        System.out.println("he is walking , person class");
    }
    public void  eat(){
        System.out.println("he is eating , person class");
    }
}