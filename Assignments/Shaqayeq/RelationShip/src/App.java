public class App {
    public static void main(String[] args) throws Exception {
        Address obj = new Address();
        obj.city= "Herat";
        obj.street= 12;
        Students S1 = new Students("Ali", obj);
        S1.show();
    }
}
//Association
//composition
class Address{
    String city ;
    int street;
}
class Students{
    String name;
    Address a ;
    Students (String n, Address add){
        this.name =n;
        this.a= add;
    }
    void show(){
        System.out.println(name + " lives in " + a.city + " street "+ a.street);
    }
}