import java.text.ParseException;

public class Main {
    public static void main(String[] args) {

        String ten = "10";
        String twoAndAHalf = "2.5";

//       1. Int value from string

        int intValue = Integer.parseInt(ten);
        System.out.println("Integer value of ten is" + " " + intValue);

//        2. Double value from string "twoAndAHalf"

        double doubleValue = Double.parseDouble(twoAndAHalf);
        System.out.println(doubleValue);

//        3.	Create a String from int value.

        String stringInt = String.valueOf(10);
        System.out.println(stringInt);

//        4.	Create a String from double value.

        String stringDouble = String.valueOf(2.5);
        System.out.println(stringDouble);

    }

    //        In the main method, show an example of working with two static methods from DateFormatter class.
//        dateIntoString

    public void example() throws ParseException {

       DateFormatter.dateIntoString("2022/09/19");
       DateFormatter.stringIntoDate("15/09/2022");

    }

    public void myObjects() {

        Cars cars = new Cars("red", 15, "Volkswagen");
        Cars newCar = new Cars("green", 21, "Audi");
        Cars secondCar = new Cars("blue", 2, "Volvo");

        System.out.println(cars.counter);


        System.out.println(newCar.equals(secondCar));



    }
}
