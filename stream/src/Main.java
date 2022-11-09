import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {



        List<Employee> employeeList1 = new ArrayList<>();
        Employee emplo1 = new Employee(1, 8500, 3.5, "Mid-dev");
        Employee emplo2 = new Employee(2, 4500, 1.5, "Junior-dev");
        Employee emplo3 = new Employee(3, 15500, 5.0, "Senior-dev");
        Employee emplo4 = new Employee(4, 6500, 4.0, "TL");
        Employee emplo5 = new Employee(5, 9500, 5.5, "PM");
        Employee emplo6 = new Employee(6, 5500, 3.5, "BA");
        Employee emplo7 = new Employee(7, 3500, 2.5, "ManualTester");
        Employee emplo8 = new Employee(8, 5500, 1.0, "AutomationTester");
        Employee emplo9 = new Employee(9, 4500, 1.5, "Junior-dev");
        Employee emplo10 = new Employee(10, 3500, 1.0, "Junior-dev");



        employeeList1.add(emplo1);
        employeeList1.add(emplo2);
        employeeList1.add(emplo3);
        employeeList1.add(emplo4);
        employeeList1.add(emplo5);
        employeeList1.add(emplo6);
        employeeList1.add(emplo7);
        employeeList1.add(emplo8);
        employeeList1.add(emplo9);
        employeeList1.add(emplo10);


        employeeList1.stream()
                .filter(employee -> employee.getSalary() > 1000)
                .peek(employee -> System.out.println(employee.getSalary()))
                        .map(Employee::getPosition).forEach(System.out::println);


                  Employee min = employeeList1.stream().min(Comparator.comparing(Employee::getSalary)).get();
                    System.out.println(min);

                    Map<Integer, Employee> objId = employeeList1.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
                     System.out.println(objId);

        String numbers = "1,3,2,2,5,4";

        System.out.println(Arrays.stream(numbers.split(",")).distinct().sorted()
                .peek(System.out::println).mapToInt(Integer::parseInt).sum());

    }
}

