public abstract class GeometricShape implements Comparable<GeometricShape> {

    private String name;

    public abstract double area();

    public abstract double perimeter();

    GeometricShape(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + ", Area: " + area() + ", Perimeter: " + perimeter();
    }

    @Override
    public int compareTo(GeometricShape other) {
        return Double.compare(this.area(), other.area());
    }

}
