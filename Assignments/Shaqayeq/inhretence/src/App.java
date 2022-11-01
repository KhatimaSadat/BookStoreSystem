

public class App {
    public static void main(String[] args) throws Exception {
        circle c = new circle(9);
        double circleArea = c.calculateArea();
        System.out.println("area is"+ circleArea);

    }
}
class shape{
    int width;
    int hight;
    int area;
    //constrctor
    public shape(){
        System.out.println("shape class");


    }
    public int calculateArea(int width, int hight)
    {
        this.hight=hight;
        this.width=width;
        this.area= this.area*this.width;

    return area; 
    }
}
class circle extends shape{
    int redius;
    double area;
public circle (int redius){
    this.redius = redius;

}
public double calculateArea(){
    this.area = 3.14*(this.redius*this.redius);
    return area;
}
}