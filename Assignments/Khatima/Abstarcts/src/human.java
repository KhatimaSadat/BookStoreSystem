 abstract public class human{
    
    abstract public void walk();
    public void eat(){
        System.out.println("He is eating , human class");
    }
}
class person extends human{
    public void walk()
    {
        System.out.println("he is walking");
    }
    public void eat(){
        System.out.println("He is eating , person class");

    }
    
    

}