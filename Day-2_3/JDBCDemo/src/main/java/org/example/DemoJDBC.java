package org.example;
import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {

        /*
        Import Package
        Load & Register Driver
        Create Connection
        Create & Execute Statement
        Close Connection
     */
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String key = "postgres";
        String val = "Newworld@123456";

        Integer sid = 5;
        String sname = "Abinash";
        Integer marks = 89;

        String fetchQuery = "select * from student;";
        String insertQuery = "insert into student values (?, ?, ?)";
        String updateQuery = "update student set sname='Ajay A D' where sid = 14";
        String deleteQuery = "delete from student where sid = 5";

        Connection connection = DriverManager.getConnection(url, key, val);

        System.out.println("!--------CONNECTION ESTABLISHED--------!");

        Statement statement = connection.createStatement();

        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

        preparedStatement.setInt(1, sid);
        preparedStatement.setString(2, sname);
        preparedStatement.setInt(3, marks);

        ResultSet resultSet = statement.executeQuery(fetchQuery);
        System.out.println("!--------FETCH QUERY EXECUTED--------!");

        while(resultSet.next()) {
            String name = resultSet.getString("sname");
            Integer registerNo = resultSet.getInt("sid");
            Integer mark = resultSet.getInt("marks");

            String formattedName = name.substring(0, 1).toUpperCase() + name.substring(1);
            String formattedRegisterNo = "312318104" + (registerNo < 10 ? "0" : "") + registerNo.toString();
            String formattedMarks = mark.toString();

            System.out.println(formattedName + " (" + formattedRegisterNo + ") " + " has secured " + formattedMarks + " marks!");
        }

        preparedStatement.execute();
        System.out.println("!--------INSERT QUERY EXECUTED--------!");

        statement.execute(updateQuery);
        System.out.println("!--------UPDATE QUERY EXECUTED--------!");

        statement.execute(deleteQuery);
        System.out.println("!--------DELETE QUERY EXECUTED--------!");

        connection.close();
        System.out.println("!--------CONNECTION CLOSED--------!");
    }
}
