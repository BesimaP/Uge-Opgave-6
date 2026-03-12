package Assignment2;

    public class Triangle implements Shape {
        private double a;
        private double b;
        private double c;

        public Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public double getArea() {
            double s = (a+b+c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            return Math.round(area * 100.0) / 100.0;
        }

        @Override
        public double getPerimeter() {
            double perimeter = a + b + c;
            return Math.round(perimeter * 100.0) / 100.0;
        }
    }
