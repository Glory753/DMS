import DAO.DoctorRepository;
import DAO.PatientRepository;
import Model.DoctorInformation;
import Model.PatientInformation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       boolean patientInformation = true;
       while (patientInformation) {
           System.out.println("patient/ doctor");
           String line = in.nextLine();
           if (line.equals("patient")){
               PatientInformation.menu(in);
           }else if (line.equals("doctor")){
               DoctorInformation.menu(in);
           }else patientInformation = false;

        }
    }
}
