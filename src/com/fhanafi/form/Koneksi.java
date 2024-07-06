package com.fhanafi.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;


public class Koneksi {
    private static Connection conn;
    private static final Logger logger = Logger.getLogger(Koneksi.class.getName());

    public static Connection getConnection() {
        try {
            String db = "mahasiswa";
            String url = "jdbc:mysql://localhost:3306/"+ db;  // Corrected JDBC URL
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Failed to create the database connection.", e);
        }
        return conn;
    }

    public static void insertData(String nim, String nama, String jurusan, String alamat, String phone) {
        Connection conn = getConnection();
        String query = "INSERT INTO mhs1 (nim, nama, jurusan, alamat, phone) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nim);
            stmt.setString(2, nama);
            stmt.setString(3, jurusan);
            stmt.setString(4, alamat);
            stmt.setString(5, phone);
            stmt.executeUpdate();
            System.out.println("Data inserted successfully.");
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Failed to insert data.", e);
        }
    }

    public static void deleteData(String nim){
        Connection conn = getConnection();
        String query = "DELETE FROM mhs1 WHERE nim = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nim);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data deleted successfully.");
            } else {
                System.out.println("No data found with the given NIM.");
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Failed to delete data.", e);
        }
    }

    public static ArrayList<String[]> getAllData() {
        Connection conn = getConnection();
        String query = "SELECT nim, nama, jurusan, alamat, phone FROM mhs1";
        ArrayList<String[]> dataList = new ArrayList<>();
        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String[] data = new String[5];
                data[0] = rs.getString("nim");
                data[1] = rs.getString("nama");
                data[2] = rs.getString("jurusan");
                data[3] = rs.getString("alamat");
                data[4] = rs.getString("phone");
                dataList.add(data);
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Failed to retrieve data.", e);
        }
        return dataList;
    }
}
