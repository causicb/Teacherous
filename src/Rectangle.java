public class Rectangle extends GeometricShape {

    private double sideA;
    private double sideB;

    public Rectangle(String name, double sideA, double sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return this.sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double area() {
        return this.sideA * this.sideB;
    }

    public double perimeter() {
        return 2 * (this.sideA + this.sideB);
    }

    public String toString() {
        return "Rectangle that has name \"" + getName() + "\" \nhas area of: " + area() + "cm, \nand also has perimeter of: " + perimeter() + "cm \n";
    }

}
