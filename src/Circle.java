public class Circle extends GeometricShape {

    private double r;

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * (r * r);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.r;
    }

    @Override
    public String toString() {
        return "Circle that has name \"" + getName() + "\" \nhas area of: " + area() + "cm, \nand also has perimeter of: " + perimeter() + "cm \n";
    }

}
