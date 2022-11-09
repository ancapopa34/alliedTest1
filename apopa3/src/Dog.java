import java.util.Objects;

public class Dog {

    public int age;
    public String color;
    public String name;

    public Dog(int age, String color, String Name){};

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(color, dog.color) && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color, name);

    }

}

