public class App {
    public static void main(String[] args) throws Exception {
        circle c = new circle(12);
        double CircleArea = c.CalculateArea();
        System.out.println("Circle area: " + CircleArea);
    }
}

class Shape {
    int width;
    int hight;
    int area;

    // Contractor
    public Shape() {
        System.out.println("Shape class");
    }

    // methods
    public int CalculateArea(int width, int hight) {
        this.hight = hight;
        this.width = width;
        this.area = this.hight * this.width;
        return area;

    }
}

class circle extends Shape {
    int radius;
    double area;

    public circle(int radius) {

        this.radius = radius;
    }

    // Overlouding
    public double CalculateArea() {
        this.area = 3.14 * (this.radius * this.radius);
        return area;
    }
}
