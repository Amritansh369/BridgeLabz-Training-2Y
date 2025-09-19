class Employee {
    private static String companyName = "Tech Solutions Pvt Ltd";
    private static int totalEmployees = 0;
    private String name;
    private final int id;
    private String designation;
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
            System.out.println("-------------------------");
        } else {
            System.out.println("Not a valid Employee object!");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit Sharma", 101, "Software Engineer");
        Employee e2 = new Employee("Neha Verma", 102, "Project Manager");
        e1.displayDetails();
        e2.displayDetails();
        Employee.displayTotalEmployees();
    }
}
