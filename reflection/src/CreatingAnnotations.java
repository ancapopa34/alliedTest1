
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CreatingAnnotations {


    @ImportantInt(age = 3)
    private int tage = 0;
    public void MyAge() {
        System.out.println(tage);


    }


    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {

        CreatingAnnotations ann = new CreatingAnnotations();
        Method method = ann.getClass().getDeclaredMethod("MyAge");
        Field field = ann.getClass().getDeclaredField("tage");
        ann.tage = field.getAnnotation(ImportantInt.class).age();

        try {
            method.invoke(ann);
        } catch (Exception e) {

        }
    }
}











