public class Dog implements Animal {

    public String eat(String a) {
        System.out.println("Dogs eat" + " " + a + ".");
        return a;

    }

    public String makeNoise(String b) {
        System.out.println("Dogs make" + " " + b +  ".");
        return b;

    }

    public String animalBehavior(String c ) {
        System.out.println("Dogs like to " + " " + c + ".");
        return c;

    }
    public int speed(int a, int b) {
        System.out.println(a*b);
        return a;
    }

    @Override
    public void eat() {

    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void animalBehavior() {

    }

    @Override
    public int speed(int a) {
        return 0;
    }


}

