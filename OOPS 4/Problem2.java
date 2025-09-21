import java.util.*;
class Department {
    String name;
    Department(String name) { this.name = name; }
}
class Faculty {
    String name;
    Faculty(String name) { this.name = name; }
}
class University {
    String name;
    List<Department> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();
    University(String name) { this.name = name; }
    void addDepartment(String deptName) { departments.add(new Department(deptName)); }
    void addFaculty(Faculty f) { faculties.add(f); }
    void deleteUniversity() {
        departments.clear();
        System.out.println("University " + name + " deleted along with all its departments.");
    }
}
public class Problem2 {
    public static void main(String[] args) {
        University uni = new University("Tech University");
        uni.addDepartment("Computer Science");
        uni.addDepartment("Physics");
        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Johnson");
        uni.addFaculty(f1);
        uni.addFaculty(f2);
        System.out.println("Faculty " + f1.name + " still exists even if University is deleted.");
        uni.deleteUniversity();
    }
}
