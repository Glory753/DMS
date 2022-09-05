package Model;

import java.math.BigInteger;

public class Patient {
    public int patientID;
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String emailAddress;
    public int assignedDoctorId;

    public Patient(int patientID, String firstName, String lastName, String phoneNumber, String emailAddress, int assignedDoctorId) {
        this.patientID = patientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.assignedDoctorId = assignedDoctorId;

    }

    @Override
    public String toString() {
        return "Patient {" +
                "patientID=" + patientID + '\'' +
                "firstName=" + firstName + '\'' +
                "lastName=" + lastName + '\'' +
                "phoneNumber=" + phoneNumber + '\'' +
                "emailAddress=" + emailAddress + '\'' +
                "assignedDoctorId=" + assignedDoctorId + '\'' +
                "}\n";
    }
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

    public String getPhoneNumber() {
        return phoneNumber;

    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public int getAssignedDoctorId() {
        return assignedDoctorId;
    }

    public void setAssignedDoctorId(int assignedDoctorId) {
        this.assignedDoctorId = assignedDoctorId;
    }
}


