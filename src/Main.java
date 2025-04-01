import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Circle cir1 = new Circle("c1", 10);
        Circle cir2 = new Circle("c2", 5);

        Rectangle rec1 = new Rectangle("r1", 10, 5);
        Rectangle rec2 = new Rectangle("r2", 3, 3);

        Triangle tri1 = new Triangle("tri", 2, 3, 4);
        Triangle tri2 = new Triangle("tri", 5, 6, 7);

        /*
        if(rec1 instanceof Object){
            System.out.println("object");
        }
        */

        Teachable teachable = new Teachable();

        teachable.getShapes().add(cir1);
        teachable.getShapes().add(cir2);

        teachable.getShapes().add(rec1);
        teachable.getShapes().add(rec2);

        teachable.getShapes().add(tri1);
        teachable.getShapes().add(tri2);

        Collections.sort(teachable.getShapes());

        for (GeometricShape gs : teachable.shapes) {
            System.out.println(gs);
        }

    }

}
