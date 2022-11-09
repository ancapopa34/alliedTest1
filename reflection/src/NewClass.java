import java.lang.reflect.Method;

public class NewClass {

    public static void method1(){
        System.out.println("Hello");
    }
    public static void method2() {
        System.out.println("World");
    }
    public void sing(){
        System.out.println("We are singing");
    }
    public void walk(){
        System.out.println("We are walking");
    }

    public static void main(String[] args){
        NewClass edu = new NewClass();

        Method[] methods = NewClass.class.getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method.getName());
        }
    }
}
