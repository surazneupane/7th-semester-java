package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private final String userName = "root";
    private final String password = "password";
    private final String dbNameAndHost = "localhost:3306/javaservlet";

    public Connection getConnection() throws SQLException {

        try {
            //Registering the Driver
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://" + dbNameAndHost, userName, password);
        return connection;
    }


}
