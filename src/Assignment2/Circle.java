package Assignment2;

    public class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            double area = Math.PI * Math.pow(radius,2);
            return Math.round(area * 100.0) / 100.0;
        }

        @Override
        public double getPerimeter() {
            double perimeter = 2 * Math.PI * radius;
            return Math.round(perimeter * 100.0) / 100.0;
        }
    }
