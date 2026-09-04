package com.mycompany.examresult;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExamResultDAO {
    private final String jdbcURL = "jdbc:mysql://localhost:3306/examdb?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private final String jdbcUsername = "root";
    private final String jdbcPassword = "";

    public ExamResultDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Log driver loading issues
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }

    public void insertResult(ExamResult result) {
        String sql = "INSERT INTO tbl_examresults (studentname, subject, score, datetaken) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, result.getStudentName());
            stmt.setString(2, result.getSubject());
            stmt.setString(3, result.getScore());
            stmt.setTimestamp(4, result.getDateTaken());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error inserting result:");
            e.printStackTrace();
        }
    }

    public List<ExamResult> getAllResults() {
        List<ExamResult> list = new ArrayList<>();
        String sql = "SELECT * FROM tbl_examresults";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ExamResult result = new ExamResult(
                    rs.getInt("examresultsID"), 
                    rs.getString("studentname"),
                    rs.getString("subject"),
                    rs.getString("score"),
                    rs.getTimestamp("datetaken")
                );
                list.add(result);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching results:");
            e.printStackTrace();
        }
        return list;
    }

    public void updateResult(ExamResult result) {
        String sql = "UPDATE tbl_examresults SET studentname=?, subject=?, score=?, datetaken=? WHERE examresultsID=?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, result.getStudentName());
            stmt.setString(2, result.getSubject());
            stmt.setString(3, result.getScore());
            stmt.setTimestamp(4, result.getDateTaken());
            stmt.setInt(5, result.getId()); 
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error updating result:");
            e.printStackTrace();
        }
    }

    public void deleteResult(int id) {
        String sql = "DELETE FROM tbl_examresults WHERE examresultsID=?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error deleting result:");
            e.printStackTrace();
        }
    }
}
