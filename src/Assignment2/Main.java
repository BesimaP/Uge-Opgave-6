    package Assignment2;

    import java.util.ArrayList;

    public class Main {

        public static void main(String [] args){
            PaintJob stue = new PaintJob("Stue");

            stue.addSurface(new Rectangle( 4.0,2.5));
            stue.addSurface(new Rectangle( 4.0,2.5));
            stue.addSurface(new Rectangle( 4.0,5.0));

            stue.addDeduction(new Rectangle(1.0, 2.1));
            stue.addDeduction(new Circle(0.4));

            stue.printSummary();

            /*ArrayList<Shape> shapes = new ArrayList<>();
            shapes.add(new Circle(5.5));
            shapes.add(new Rectangle(3.5, 4.5));
            shapes.add(new Triangle(3, 4.5, 7.8));

            double totalArea = 0;

            for(Shape s: shapes){
                totalArea += s.getArea();
            }
            System.out.println("Total area: " + totalArea);

             */
        }
    }
