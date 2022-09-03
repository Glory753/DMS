package Model;

public class Patient {
    public int patientID;
    public String firstName;
    public String lastName;
    public int phoneNumber;
    public String emailAddress;

    public Patient(int patientID, String firstName, String lastName, int phoneNumber, String emailAddress) {
        this.patientID = patientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;

    }

    @Override
    public String toString() { return patientID + ": patient id" + firstName + ": firstName" + lastName + ": lastName" + phoneNumber + ":phoneNumber" + emailAddress + ": emailAddress"; }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {return firstName; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}