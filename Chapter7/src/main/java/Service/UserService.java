package Service;

import Model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserService {
    private DBConnection dbConnection = new DBConnection();

    public boolean insert(User user) throws SQLException {
        String query = "INSERT INTO users(name,email,password) values (?,?,?)";
        Connection connection = dbConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getEmail());
        preparedStatement.setString(3, user.getPassword());

        if ((preparedStatement.executeUpdate() > 0)) {
            return true;
        }
        return false;
    }

}
