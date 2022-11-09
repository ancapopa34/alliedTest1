public class Employee {

    private int id;
    private int salary;
    private double experience;
    private String position;

    public Employee(int id, int salary, double experience, String position) {
        this.id = id;
        this.salary = salary;
        this.experience = experience;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", salary=" + salary + ", experience=" + experience + ", position='" + position + '\'' + '}';
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
