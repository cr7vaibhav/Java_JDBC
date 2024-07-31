import java.sql.*;

public class MYJDBC {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3369/jdbc_prac";
    String username = "root";
    String password = "sewy";

    try {
      // Load the MySQL JDBC driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      // Establish the connection
      Connection connection = DriverManager.getConnection(url, username, password);

      Statement statement = connection.createStatement();

      ResultSet resultSet = statement.executeQuery("select * from people");

      while (resultSet.next()) {
        System.out.println(resultSet.getString("firstname"));
      }

      // Close the connection
      connection.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
