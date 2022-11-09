public class StaticMethod extends Shape {

    public static Object staticMethod(Object obj){
        return obj;
    }

    public static void main(String[] args) {
        StaticMethod obj = new StaticMethod();
        System.out.println(obj.area());
        StaticMethod.staticMethod(obj);
    }

    public String area() {
        return area();
    }

    public String perimeter() {
        return perimeter();
    }
}

