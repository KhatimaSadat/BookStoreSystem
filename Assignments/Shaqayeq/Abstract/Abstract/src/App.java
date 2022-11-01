public class App {
    public static void main(String[] args) throws Exception {
        cat a = new cat ();
        a.eat();
        a.walk();
    }
}
abstract class Animals {
    abstract public void walk();
    abstract public void eat();
}
class cat extends Animals{
    public void walk(){
System.out.println("the cat walk");
    }
    public void eat(){
        System.out.println("the cat eat");

    }
}