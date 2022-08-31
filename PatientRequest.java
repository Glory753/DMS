import java.util.Scanner;

public class PatientRequest{
    public PatientRequest(){

    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        PatientRepository repository = new PatientRepository();
        boolean patientInformation = true;

        while (patientInformation){
            System.out.println("input command (no, yes, view)");
            String userInput = in.nextLine();
            if(userInput.equals("no")){
                patientInformation = false;
            } else if(userInput.equals("yes")){
                System.out.println(("First Name: "));
                String firstName = in.nextLine();
                System.out.println(("Last Name: "));
                String lastName = in.nextLine();
                System.out.println(("Phone Number: "));
                String phoneNumber = in.nextLine();
                System.out.println(("Email Address: "));
                String emailAddress = in.nextLine();
                System.out.println(("What kind of appoint are you requesting?"));
                System.out.println("input command (Emergency Exam, Check-Up, Treatment)");
                String appointmentType = in.nextLine();
                repository.addPatient(firstName, lastName, Integer.parseInt(phoneNumber), emailAddress, appointmentType);
            } else if(userInput.equals("view")){
                System.out.println(repository.getPatient());
            }
        }
    }
}