abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius = 3.0;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private int length = 4;
    private int breadth = 3;

    @Override
    public double calculateArea() {
        return length * breadth; // int is implicitly widened to double
    }
}