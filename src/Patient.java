package Hospital_Management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Patient {
    private Connection connection;
    private Scanner scanner;

    public Patient(Connection connection, Scanner scanner) {
        this.connection = connection;
        this.scanner = scanner;
    }

    public void addPatient() {
        System.out.println("Enter the Name of the Patient : ");
        String name = scanner.next();
        System.out.println("Enter the Age of the Patient : ");
        int age = scanner.nextInt();
        System.out.println("Patient Gender : ");
        String gender = scanner.next();

        try {
            String query = "INSERT INTO patients(Name,Age,Gender)" +
                    "Values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, gender);

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Data Inserted Successfully");
            } else {
                System.out.println("Failed to add");
            }
        } catch (SQLException x) {
            x.printStackTrace();
        }
    }

    public void viewPatient() {
        String query = "Select * from patients";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Patients : ");
            System.out.println("----------------+--------------------+------------+------------");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");

                System.out.println("|%-12s|%-20s|%-10s|%-12s");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean getPatientById(int id)
    {
        String query = "SELECT * FROM patients WHERE id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                return true;
            }
            else{
                return false;
            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }
}



























