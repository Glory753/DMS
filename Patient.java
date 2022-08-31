public class Patient {

    String firstName;

    String lastName;

    int phoneNumber;

    String emailAddress;

    String appointmentType;

    public Patient(String firstName, String lastName, int phoneNumber, String emailAddress, String appointmentType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.appointmentType = appointmentType;
    }

    @Override
    public String toString() {
        return "Patient {" +
                "firstName='" + firstName + '\'' +
                "lastName=" + lastName + '\'' +
                "phoneNumber=" + phoneNumber + '\'' +
                "emailAddress=" + emailAddress + '\'' +
                "appointmentType=" + appointmentType + '\'' +
                '}';
    }
}
