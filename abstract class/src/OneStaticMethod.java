public class OneStaticMethod extends Shape {

    public static Object staticMethod(Object o){
        return o;
    }

    public static void main(String[] args) {
        OneStaticMethod obj = new OneStaticMethod();
        System.out.println(obj.area());
        OneStaticMethod.staticMethod(obj);
    }

    @Override
    public String area() {
        return null;
    }

    @Override
    public String perimeter() {
        return null;
    }


//    public int speed(int a) {return a;};



}




