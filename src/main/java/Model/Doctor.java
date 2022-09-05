package Model;

import java.math.BigInteger;

public class Doctor {

    public int doctorID;

    public String doctorName;

    public String taxID;

    public Doctor(int doctorID, String doctorName, String taxID) {
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.taxID = taxID;
    }

    public String toString() {
        return "Doctor {" +
                "doctorID=" + doctorID + '\'' +
                "doctorName=" + doctorName + '\'' +
                "taxID=" + taxID + '\'' +
                "}\n";
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }
}