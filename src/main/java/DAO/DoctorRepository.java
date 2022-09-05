package DAO;

import java.math.BigInteger;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;

import Model.Doctor;
import Model.DoctorInformation;
import Model.Patient;
import Util.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DoctorRepository {

    Connection conn;

    public DoctorRepository() {
        conn = ConnectionUtil.getConnection();
    }

    public List<Doctor> getAllDoctors() {
        List<Doctor> allDoctors = new ArrayList<>();
        DoctorInformation.logger.info("getting all doctor information");
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("Select * From Doctor");
            while (rs.next()) {
                Doctor loadedDoctor = new Doctor(rs.getInt("id"), rs.getString("doctorName"), String.valueOf(rs.getInt("taxID")));
                allDoctors.add(loadedDoctor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allDoctors;
    }
    public void addDoctor(Doctor d) {
        DoctorInformation.logger.info("adding doctor information");
        try {
                PreparedStatement statement = conn.prepareStatement("insert into Doctor (id, doctorName, taxID) " + "values (?, ?, ?)");
                statement.setInt(1, d.getDoctorID());
                statement.setString(2,d.getDoctorName());
                statement.setString(3, d.getTaxID());
                statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Doctor> getDoctorByName(String Name) {
        DoctorInformation.logger.info("getting doctor by name");
        List<Doctor> allDoctors = new ArrayList<>();
        try {
            PreparedStatement statement = conn.prepareStatement("Select * From Doctor Where Name = ?");
            statement.setString(1, Name);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Doctor loadedDoctor = new Doctor(rs.getInt("id"), rs.getString("doctorName"), String.valueOf(rs.getInt("taxID")));
                allDoctors.add(loadedDoctor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allDoctors;
    }
    public void removeDoctor(int id) {
        DoctorInformation.logger.info("removing doctor information");
        try {
            PreparedStatement statement = conn.prepareStatement("delete from Doctor where id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
