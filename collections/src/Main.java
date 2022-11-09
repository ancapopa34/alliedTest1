import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");
        list.add("C++");
        list.add("PHP");

        for (String item : list) {
            System.out.println(item);
        }


        List<Integer> bestMoviesYears = new ArrayList<Integer>();

        bestMoviesYears.add(1976);
        bestMoviesYears.add(2019);
        bestMoviesYears.add(2012);

        List<Integer> bestSongsYears = new ArrayList<Integer>();

        bestSongsYears.add(1983);
        bestSongsYears.add(2015);
        bestSongsYears.add(2021);

        Map<String, List<Integer>> bestSongsAndMovies = new HashMap<>();

        bestSongsAndMovies.put("albums", bestSongsYears);
        bestSongsAndMovies.put("myMovies", bestMoviesYears);


        Set<String> cities = new HashSet<>();
        cities.add("Guatemala");
        cities.add("Colorado");
        cities.add("Sanchi ");
        cities.add("Troy");
        cities.add("Pompeii");
        cities.add("Helike");
        cities.add("Caral");


        for (String value : cities) {
            System.out.println(value);
//            System.out.println(cities[3]);

//            set is on unordered collection of Objects and it cannot  contain duplicates.
//            We cannot access/insert elements at a specific index.
        }


        List<String> disneyMovies = new ArrayList<String>();
        disneyMovies.add("Maleficent");
        disneyMovies.add("Cinderella");
        disneyMovies.add("The Jungle Book");
        disneyMovies.add("Beauty and the Beast");
        disneyMovies.add("Dumbo");
        disneyMovies.add("Aladdin");

        Collections.sort(disneyMovies);
        System.out.println(disneyMovies);

        List<String> l1 = Arrays.asList("Hello", "World");
        List<Double> l2 = Arrays.asList(2.3, 2.2, 4.5);
        List<Integer> l3 = Arrays.asList(1, 2, 3);

        List<Double> myNumbers = new ArrayList<>();
        myNumbers.add(2.3);
        myNumbers.add(5.6);
        myNumbers.add(69.3);
        myNumbers.add(56.3);
        myNumbers.add(1.5);
        myNumbers.add(4.6);

        Object[] objects = myNumbers.toArray();

        for (Object obj : objects) {
            System.out.println(obj);
        }

//
//        for (Double value  : myNumbers) {
//            System.out.println(value.toString());
//        }

        Map<String, Integer> otherMap = new HashMap<>();
        otherMap.put("January", 1);
        otherMap.put("February", 2);
        otherMap.put("March", 3);
        otherMap.put("April", 4);
        otherMap.put("May", 5);

        for (Map.Entry<String, Integer> entry : otherMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + " " + entry.getValue());
        }

        System.out.println("Is the key March present?" + " " + otherMap.containsKey("March"));
        System.out.println("Is the value 5  present?" + " " + otherMap.containsValue(5));

    }
}




