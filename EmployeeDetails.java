public class EmployeeDetails {
    private int id;
    private String name;
    private double salary;

    public EmployeeDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee id " + id);
        System.out.println("Name " + name);
        System.out.println("Salary " + salary);
    }
}
