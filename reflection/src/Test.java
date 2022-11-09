import java.lang.reflect.Field;

public class Test {
    static String color;
    static int age;
    private String address;
    private String home;


    public String getAddress(){
        return address;
    }

    public String getHome() {
        return home;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public static void main(String[] args){
        Test test = new Test();
        Field[] allFields = Test.class.getDeclaredFields();

        for( Field field : allFields){
            System.out.println(field.getName());
        }
    }
}
