package Hospital;

import java.util.*;

public class HospitalMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Doctor> doctors = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Hospital Management ---");
            System.out.println("1. Add Doctor");
            System.out.println("2. Add Patient");
            System.out.println("3. View Doctors");
            System.out.println("4. View Patients");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // buffer clear

            switch (choice) {

                case 1:
                    System.out.print("Enter Doctor ID: ");
                    int did = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Doctor Name: ");
                    String dname = sc.nextLine();

                    System.out.print("Enter Specialization: ");
                    String spec = sc.nextLine();

                    doctors.add(new Doctor(did, dname, spec));
                    System.out.println("Doctor added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Patient ID: ");
                    int pid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String pname = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Disease: ");
                    String dis = sc.nextLine();

                    patients.add(new Patient(pid, pname, age, dis));
                    System.out.println("Patient added successfully!");
                    break;

                case 3:
                    System.out.println("\n--- Doctor List ---");
                    for (Doctor d : doctors) {
                        d.displayDoctor();
                    }
                    break;

                case 4:
                    System.out.println("\n--- Patient List ---");
                    for (Patient p : patients) {
                        p.displayPatient();
                    }
                    break;

                case 5:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
