public class Main {

    public static void main(String[] args) {
//        double width = 2, length = 3;
        Shape rectangle = new Rectangle(;
//        System.out.println("Rectangle width: " + width + " and length: " + length
//                + "\nArea = " + rectangle.area()
//                + "\nPerimeter = " + rectangle.perimeter() + "\n");
//        System.out.println(rectangle.sum(2*width + 2*length));

//        double a = 2, b = 7, c = 5;
        Shape triangle = new Triangle();
//        System.out.println("Triangle lengths: " + a + ", " + b + ", " + c
//                + "\nArea = " + triangle.area()
//                + "\nPerimeter = " + triangle.perimeter() + "\n");
//        System.out.println(triangle.sum(a+b+c));

        StaticMethod.staticMethod(triangle.area());
        StaticMethod.staticMethod(triangle.perimeter());
        StaticMethod.staticMethod(rectangle.area());
	    StaticMethod.staticMethod(rectangle.perimeter());
        StaticMethod.staticMethod(triangle.sum(2+3+5));
        StaticMethod.staticMethod(rectangle.sum(5+6+8+10));
    }
//
//
}

