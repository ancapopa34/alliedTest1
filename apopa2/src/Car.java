public class Car {

    public static int objectCount = 0;

    private String color;
    private int age;
    private
    String name;

    public Car(String color, int age, String name){
        this.color = color;
        this.age = age;
        this.name = name;

        objectCount++;
    }

    public String getColor(){
        return getColor();
    }
    public int getAge(){
        return getAge();
    }

    public String getName(){
        return getName();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
