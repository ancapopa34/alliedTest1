import java.util.*;

public class Main {
    public static void main(String[] args) {

        Dog kaya = new Dog(2, "white","Kaya");
        Dog luna = new Dog(2, "white", "Kaya");
        Dog max  = new Dog(4, "black", "Max");

        System.out.println(kaya.equals(luna));
        System.out.println(kaya.hashCode() == luna.hashCode());
        System.out.println(kaya.equals(max));
        System.out.println(kaya.hashCode() == max.hashCode());


        List<Dog> myList = new ArrayList<Dog>();
        myList.add(new Dog(2,"white", "Kaya"));
        System.out.println(myList.size());

        Dog sameObject1 = new Dog(2,"white", "Kaya");
        System.out.println(myList.contains(sameObject1));

        HashMap<Dog, String> myMap = new HashMap<Dog, String >();

        myMap.put(luna,"myDog");
        myMap.put(max, "yourDog");
        myMap.put(kaya, "otherDog");

        System.out.println(myMap.get("Kaya"));




    }
}