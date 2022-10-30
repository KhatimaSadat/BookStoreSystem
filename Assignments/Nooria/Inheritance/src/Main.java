public class Main {
    public static void main(String[] args) {
        circle c = new circle(12);
        double circleArea = c.CalculateArea();
        System.out.println("circle Area is"+ circleArea);

    }
}
class Shape{
    int width;
    int heigt;
    int area;
    public Shape(){
        System.out.println("Shape class");
    }
    public int CalculateArea(int width, int heigt){
        this.heigt=heigt;
        this.width=width;
        this.area = this.heigt * this.width;
        return area;
    }
}
class circle extends  Shape{
    int radius;
    double area;
    public circle(int radius){
        this.radius = radius;
    }
    public  double CalculateArea(){
        this.area = 3.14 *( this.radius * this.radius);
        return area;
    }
}