package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement sellerStatement = null;
        PreparedStatement departmentStatement = null;
        try {
            conn = DB.getConnection();

            // Inserção de um vendedor
            sellerStatement = conn.prepareStatement(
                    "INSERT INTO seller "
                            + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                            + "VALUES "
                            + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            sellerStatement.setString(1, "John Deniels");
            sellerStatement.setString(2, "john@gmail.com");
            sellerStatement.setDate(3, new java.sql.Date(sdf.parse("12/09/2001").getTime()));
            sellerStatement.setDouble(4, 1500.0);
            sellerStatement.setInt(5, 2);

            int rowsAffectedSellers = sellerStatement.executeUpdate();

            if (rowsAffectedSellers > 0) {
                ResultSet rs = sellerStatement.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Vendedor inserido! Id: " + id);
                }
            } else {
                System.out.println("Nenhuma linha afetada para vendedores!");
            }

            departmentStatement = conn.prepareStatement(
                    "INSERT INTO department (Name) VALUES (?)",
                    Statement.RETURN_GENERATED_KEYS);

            departmentStatement.setString(1, "Sports");

            int rowsAffectedDepartments = departmentStatement.executeUpdate();

            if (rowsAffectedDepartments > 0) {
                ResultSet rs = departmentStatement.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Departamento inserido! Id: " + id);
                }
            } else {
                System.out.println("Nenhuma linha afetada para departamentos!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(sellerStatement);
            DB.closeStatement(departmentStatement);
            DB.closeConnection();
        }
    }
}
