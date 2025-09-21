import java.util.*;
class Patient {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    Patient(String name) { this.name = name; }
}
class Doctor {
    String name;
    List<Patient> patients = new ArrayList<>();
    Doctor(String name) { this.name = name; }
    void consult(Patient p) {
        if (!patients.contains(p)) patients.add(p);
        if (!p.doctors.contains(this)) p.doctors.add(this);
        System.out.println("Doctor " + name + " consulted patient " + p.name);
    }
    void showPatients() {
        System.out.println("Patients of Dr. " + name + ":");
        for (Patient p : patients) System.out.println("- " + p.name);
    }
}
class Hospital {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();
    Hospital(String name) { this.name = name; }
    void addDoctor(Doctor d) { doctors.add(d); }
    void addPatient(Patient p) { patients.add(p); }
}
public class Problem3 {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");
        Doctor d1 = new Doctor("Dr. Brown");
        Doctor d2 = new Doctor("Dr. Green");
        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");
        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);
        d1.consult(p1);
        d2.consult(p1);
        d2.consult(p2);
        d2.showPatients();
    }
}
