package Model;

import DAO.DoctorRepository;
import DAO.PatientRepository;
import org.apache.log4j.Logger;
import java.math.BigInteger;
import java.util.Scanner;

public class DoctorInformation {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(DoctorInformation.class);
        logger.info("info text");

        boolean doctorInformation = true;
        DoctorRepository dr = new DoctorRepository();
        while (doctorInformation) {
            System.out.println("Select options: view all doctors, add doctor, quit");
            Scanner in = new Scanner(System.in);
            String line = in.nextLine();
            if (line.equals("quit")) {
                doctorInformation = false;
            } else if (line.equals("add doctor")) {
                System.out.println(("Doctor ID: "));
                int doctorID = Integer.parseInt(in.nextLine());
                System.out.println(("Doctor Name: "));
                String doctorName = in.nextLine();
                System.out.println(("Tax ID: "));
                String taxID = in.nextLine();
                Doctor newDoctor = new Doctor(doctorID, doctorName, taxID);
                dr.addDoctor(newDoctor);
            } else if (line.equals("view all doctors")){
                System.out.println(dr.getAllDoctors());
            }
        }
    }

}
