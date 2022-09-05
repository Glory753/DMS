package Model;

import DAO.PatientRepository;
import Model.Patient;
import org.apache.log4j.Logger;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;


public class PatientInformation {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(PatientInformation.class);
        logger.info("info text");

        boolean patientInformation = true;
        PatientRepository pr = new PatientRepository();
        while (patientInformation) {
            System.out.println("Select options: view all patients, add patient, quit");
            Scanner in = new Scanner(System.in);
            String line = in.nextLine();
            if (line.equals("quit")) {
                patientInformation = false;
            } else if (line.equals("add patient")) {
                System.out.println(("First Name: "));
                String firstName = in.nextLine();
                System.out.println(("Last Name: "));
                String lastName = in.nextLine();
                System.out.println(("Phone Number: "));
                String phoneNumber = in.nextLine();
                System.out.println(("Email Address: "));
                String emailAddress = in.nextLine();
                System.out.println(("patientID: "));
                int id = Integer.parseInt(in.nextLine());
                System.out.println(("Assigned Doctor ID: "));
                int assignedDoctorId = Integer.parseInt(in.nextLine());
                Patient newPatient = new Patient(id, firstName, lastName, phoneNumber, emailAddress, assignedDoctorId);
                pr.addPatient(newPatient);
            } else if (line.equals("view all patients")){
                System.out.println(pr.getAllPatients());
            }
        }
    }
}
