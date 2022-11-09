
import java.lang.reflect.Method;

public class Dog {

    public void dogName(String name){
        System.out.println(name);
    }

    public static void main(String[] args) throws Exception {

        Object dog = new Dog();
        Class cls = dog.getClass();
        Method method = cls.getMethod("dogName", String.class);
        method.invoke(dog, "Misha");

    }
}
