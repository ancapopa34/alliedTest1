import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//1.

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RunImmediately {
}

//2.

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface RunImmediately1 {
    int value() default 0;
}

//3.

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface RunImmediately2 {

    int val1();
    double val2();
    String val3();
}
