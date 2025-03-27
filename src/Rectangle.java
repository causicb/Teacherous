public class Rectangle extends GeometricShape{

    private String name;
    private double sideA;
    private double sideB;

    public Rectangle(String name, double sideA, double sideB) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
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

    public double area() {
        return this.sideA * this.sideB;
    }

    public double perimeterRectangle() {
        return 2 * (this.sideA + this.sideB);
    }

    public String toString(){
        return "Rectangle that has name --" + this.name + "-- has area of: " + area();
    }

}
