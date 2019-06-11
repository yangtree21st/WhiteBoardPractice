public class SOLID {


    public class Customer {

        private String name;

        // getter and setter methods...
    }
    public void storeCustomer(String customerName) {
        // store customer into a database...
    }
    public void generateReport(String customerName) {
        // generate a report...
    }
    public abstract class Shape {
        abstract void draw();
    }
    public class Rectangle extends Shape {

        private int width;
        private int height;

        // getter and setter methods...

        @Override
        public void draw() {
            // Draw the Rectangle...
        }
    }
    public class Square extends Shape {

        private int side;

        // getter and setter methods...

        @Override
        public void draw() {
            // Draw the Square
        }
    }
    public class ShapePrinter {

        public void drawShape(Shape shape) {
            shape.draw();
        }
    }



}
