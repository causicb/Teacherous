public class Circle extends GeometricShape {

    private String name;
    private double r;

    public Circle(String name, double r) {
        this.name = name;
        this.r = r;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getR() {
        return this.r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * (r * r);
    }

    public double perimeter() {
        return 2 * Math.PI * this.r;
    }

    public String toString() {
        return "Circle that has name \"" + this.name + "\" \nhas area of: " + area() + "cm, \nand also has perimeter of: " + perimeter() + "cm \n";
    }

}
