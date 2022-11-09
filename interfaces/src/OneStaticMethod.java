public class OneStaticMethod {

    static Animal staticMethod ( int speed){
        if(speed > 25) {
            return new Cat();
        }
            {
                return new Dog();
            }
    }






//
//    public static Object staticMethod(Object o){
//        return o;
//    }
//
//    public static void main(String[] args) {
//        OneStaticMethod obj = new OneStaticMethod();
//        OneStaticMethod.staticMethod(obj);
//    }
//
//
//    public void eat() {};
//    public void makeNoise() {};
//    public void animalBehavior() {}
//
//    @Override
//    public int speed(int a) {
//        return 0;
//    }

}
