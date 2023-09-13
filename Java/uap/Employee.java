import java.util.Random;

public class Employee {
    public String name, designation;
    public double salary;
    Random rand = new Random();
    String id = "" + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);

    public Employee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double newSal) {
        salary = newSal;
    }

    public void promote(String newDesignation, double newSal) {
        designation = newDesignation;
        salary = newSal;
    }

    public String toString() {
        return String.format("Name : %s  ID : %s  designation : %s salary : %f", name, id, designation, salary);
    }

}