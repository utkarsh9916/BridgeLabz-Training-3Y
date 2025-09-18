
/*

Description:
Create a hospital patient management system:

1. Define an abstract class Patient with fields like patientId, name, and age.
2. Add abstract method calculateBill() and concrete method getPatientDetails().
3. Extend it into classes InPatient and OutPatient.
   - InPatient: Has additional fields like roomCharges, daysAdmitted.
   - OutPatient: Has fields like consultationFee.
4. Use an interface Billable with methods generateBill() and getBillSummary().
5. Demonstrate encapsulation to protect patient data.
6. Use polymorphism to handle billing for different patient types in a unified way.
*/

import java.util.*;

// Interface
interface Billable {
    double generateBill();
    String getBillSummary();
}

// Abstract class
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Encapsulation (getters/setters)
    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void setAge(int age) {
        if(age > 0) this.age = age;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

// Subclass: InPatient
class InPatient extends Patient implements Billable {
    private double roomCharges;
    private int daysAdmitted;

    public InPatient(int id, String name, int age, double roomCharges, int daysAdmitted) {
        super(id, name, age);
        this.roomCharges = roomCharges;
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return roomCharges * daysAdmitted;
    }

    @Override
    public double generateBill() {
        return calculateBill();
    }

    @Override
    public String getBillSummary() {
        return "In-Patient Bill (Room Charges × Days): " + roomCharges + " × " + daysAdmitted;
    }
}

// Subclass: OutPatient
class OutPatient extends Patient implements Billable {
    private double consultationFee;

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public double generateBill() {
        return calculateBill();
    }

    @Override
    public String getBillSummary() {
        return "Out-Patient Bill (Consultation Fee): " + consultationFee;
    }
}

// Main class
public class HospitalPatientManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        patients.add(new InPatient(101, "Ravi Kumar", 45, 2000, 3));
        patients.add(new OutPatient(102, "Sita Sharma", 30, 500));

        double totalRevenue = 0;

        // Polymorphism
        for(Patient p : patients) {
            p.getPatientDetails();
            double bill = p.calculateBill();

            if(p instanceof Billable) {
                Billable b = (Billable) p;
                System.out.println(b.getBillSummary());
                System.out.println("Bill Amount: " + b.generateBill());
                totalRevenue += b.generateBill();
            }
            System.out.println("----------------------------");
        }

        System.out.println("Total Revenue Collected: " + totalRevenue);
    }
}

