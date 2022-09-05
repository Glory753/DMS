package DAO;

import java.math.BigInteger;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;

import Model.Patient;
import Model.PatientInformation;
import Util.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientRepository {
    Connection conn;

    public PatientRepository() {
        conn = ConnectionUtil.getConnection();
    }

    public List<Patient> getAllPatients() {
        List<Patient> allPatients = new ArrayList<>();
        PatientInformation.logger.info("getting all patient information");
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("Select * From Patient");
            while (rs.next()) {
                Patient loadedPatient = new Patient(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), String.valueOf(rs.getInt("phoneNumber")), rs.getString("emailAddress"), rs.getInt("assignedDoctorId"));
                allPatients.add(loadedPatient);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allPatients;
    }

    public void addPatient(Patient p) {
        PatientInformation.logger.info("adding patient information");
        try {
            PatientRepository pr = new PatientRepository();
                PreparedStatement statement = conn.prepareStatement("insert into Patient (id, firstName, lastName, phoneNumber, emailAddress, assignedDoctorId) " + "values (?, ?, ?, ?, ?, ?)");
                statement.setInt(1, p.getPatientID());
                statement.setString(2,p.getFirstName());
                statement.setString(3,p.getLastName());
                statement.setString(4,p.getPhoneNumber());
                statement.setString(5, p.getEmailAddress());
                statement.setInt(6,p.getAssignedDoctorId());
                statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Patient> getPatientByLastName(String LastName) {
        PatientInformation.logger.info("getting patient by last name");
        List<Patient> allPatients = new ArrayList<>();
        try {
            PreparedStatement statement = conn.prepareStatement("Select * From Patient Where lastName = ?");
            statement.setString(1, LastName);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Patient loadedPatient = new Patient(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), String.valueOf(rs.getInt("phoneNumber")), rs.getString("emailAddress"), rs.getInt("assignedDoctorId"));
                allPatients.add(loadedPatient);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allPatients;
    }

    public List<Patient> getPatientByPatientID(int id) {
        PatientInformation.logger.info("getting patient by ID");

        List<Patient> allPatients = new ArrayList<>();
        try {
            PreparedStatement statement = conn.prepareStatement("Select * From Patient Where id = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Patient loadedPatient = new Patient(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), String.valueOf(rs.getInt("phoneNumber")), rs.getString("emailAddress"), rs.getInt("assignedDoctorId"));
                allPatients.add(loadedPatient);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allPatients;
    }
    public List<Patient> getPatientByAssignedDoctorID(int id) {
        PatientInformation.logger.info("getting patient by Assigned Doctor ID");

        List<Patient> allPatients = new ArrayList<>();
        try {
            PreparedStatement statement = conn.prepareStatement("Select * From Patient inner join doctor on patient.assignedDoctorID = doctor.id");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Patient loadedPatient = new Patient(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), String.valueOf(rs.getInt("phoneNumber")), rs.getString("emailAddress"), rs.getInt("assignedDoctorId"));
                allPatients.add(loadedPatient);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allPatients;
    }
    public void removePatient(int id) {
        PatientInformation.logger.info("removing patient information");
        try {
            PreparedStatement statement = conn.prepareStatement("delete from Patient where id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}