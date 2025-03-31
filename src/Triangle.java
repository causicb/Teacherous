public class Triangle extends GeometricShape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
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

    public double getSideC() {
        return this.sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double area() {
        return (this.sideA + this.sideB + this.sideC) / 2;
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public String toString() {
        return "Triangle that has name \"" + getName() + "\" \nhas area of: " + area() + "cm, \nand also has perimeter of: " + perimeter() + "cm \n";
    }

}
