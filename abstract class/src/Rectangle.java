public class Rectangle extends Shape {




    public double area(double a, double b) {
        return a * b;
    }

    public double perimeter(double r) {
        return r;
//        return 2 * (d + e);
    }

    @Override
    public String area() {
        return 0;
    }

    @Override
    public String perimeter() {
        return 0;
    }
}
