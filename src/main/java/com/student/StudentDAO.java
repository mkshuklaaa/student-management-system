package com.student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDAO {
    Connection con = DBConnection.getConnection();

    public void addStudent(Student s) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO students(name, age, course) VALUES(?,?,?)");
            ps.setString(1, s.name);
            ps.setInt(2, s.age);
            ps.setString(3, s.course);
            ps.executeUpdate();
            System.out.println("✅ Student added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudents() {
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM students");
            System.out.println("\nID | NAME | AGE | COURSE");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getInt(3) + " | " + rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int id, String name, int age, String course) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE students SET name=?, age=?, course=? WHERE id=?");
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, course);
            ps.setInt(4, id);
            ps.executeUpdate();
            System.out.println("✅ Student updated!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM students WHERE id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("🗑️ Student deleted!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
