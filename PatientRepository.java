import java.util.ArrayList;
public class PatientRepository {
    ArrayList<Patient>PatientInformation= new ArrayList<>();
    public PatientRepository() {

    }

    public void addPatient(String firstName, String lastName, int phoneNumber, String emailAddress, String appointmentType){
        Patient patient = new Patient(firstName, lastName, phoneNumber, emailAddress, appointmentType);
        PatientInformation.add(patient);
    }

    public ArrayList<Patient> getPatient() {

        return PatientInformation;
    }
}




