public class Triangle extends GeometricShape {

    private String name;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Triangle that has name \"" + this.name + "\" \nhas area of: " + area() + "cm, \nand also has perimeter of: " + perimeter() + "cm \n";
    }

}
