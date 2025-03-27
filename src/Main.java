import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Circle cir = new Circle("cir", 5.5);
        Rectangle rec = new Rectangle("rect", 3.4, 5.25);
        Triangle tri = new Triangle("tri", 2, 3, 4);

        System.out.println(cir.area());
        System.out.println(rec.area());
        System.out.println(tri.area());

        System.out.println(cir.perimeter());

        List<GeometricShape> shape = new ArrayList<>();
        shape.add(cir);
        shape.add(rec);
        shape.add(tri);

        shape.sort(Comparator.comparingDouble(GeometricShape::area));

        for (GeometricShape gs : shape) {
            System.out.println(gs);
        }

    }

}
