public abstract class GeometricShape {

    private String name;

    public abstract double area();

    public abstract double perimeter();

    GeometricShape(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + ", Area: " + area() + ", Perimeter: " + perimeter();
    }

}
