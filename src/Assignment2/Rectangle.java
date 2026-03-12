package Assignment2;

    public class Rectangle implements Shape {
        private double width;
        private double height;

        public Rectangle(double height, double width){
            this. height = height;
            this.width = width;
        }

        @Override
        public double getArea() {
            double area = height * width;
            return Math.round(area * 100.0) / 100.0;
        }

        @Override
        public double getPerimeter() {
            double perimeter =  (2 * (width + height));
            return Math.round(perimeter * 100.0) / 100.0;
        }

        public String toString(){
            return "Rectangle " + height + " x " + width;
        }
    }
