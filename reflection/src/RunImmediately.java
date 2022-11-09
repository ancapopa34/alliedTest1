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
@Target({ElementType.TYPE,ElementType.FIELD})
@interface ImportantInt{
   int age();
}

//3.

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface RunImmediately1 {

       int  value ();
       double val2() default 0;
       String name();
}
