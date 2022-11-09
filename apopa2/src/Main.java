public class Main {
    public static void main(String[] args) {

            Car car = new Car("red", 15, "Volkswagen");

            Car newCar = new Car("green", 21, "Audi");

            Car secondCar = new Car("blue", 2, "Volvo");

            System.out.println(Car.objectCount);
            System.out.println(newCar.equals(secondCar));

        }
    }
