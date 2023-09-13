
import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Employee> employees;

    public Company(String companyName) {
        this.companyName = companyName;
        this.employees = new ArrayList<Employee>();
    }

    public void addNewEmployee(String name, String designation, double salary) {
        employees.add(new Employee(name, designation, salary));
    }

    public Employee findEmployee(String id) {
        for (Employee E : employees) {
            if (E.id.equals(id)) {
                return E;
            }
        }
        return null;
    }

    public void updateSalary(String id, double salary) {
        Employee E = findEmployee(id);
        if (E != null) {
            updateSalary(id, salary);
        }
    }

    public void promote(String id, String newDesignation, double newSalary) {
        Employee E = findEmployee(id);
        if (E != null) {
            promote(id, newDesignation, newSalary);
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}
