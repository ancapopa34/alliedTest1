public class Cat implements Animal {
    public Cat() {
    }

    public String eat(String d) {
        System.out.println("Cats eat" + " " + d + ".");
        return d;
    }

    public String makeNoise(String e) {
        System.out.println("Cats make" + e +  ".");
        return e;
    }

    public String animalBehavior(String f) {
        System.out.println( "Cats run very"+ " " + f +  ".");
        return f;
    }


    public int speed(int a, int b) {
        System.out.println(a*b);
        return a*b;
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
