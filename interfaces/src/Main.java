public class Main {

    public static void main(String[] args) {
        Animal a1 = OneStaticMethod.staticMethod(21);
        Animal a2 = OneStaticMethod.staticMethod(29);
        a1.eat();
        a2.eat();
        System.out.println(a2);
        System.out.println(a1);


    }
}

