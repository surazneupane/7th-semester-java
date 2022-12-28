package Students.UpdateableResultSet;

import DBConnection.DBConnection;
import Students.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateResult {
    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();

        try {
            Connection connection = dbConnection.getConnection();

            String query = "SELECT * FROM students";
//            https://www.javamadesoeasy.com/2015/11/what-is-difference-between.html  for type scroll refrence
            Statement statement = connection.
                    createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next())
            {
                if(resultSet.getInt("id") == 1 )
                {
                    resultSet.updateString("name","Karan");
                    resultSet.updateInt("age",25);
                    resultSet.updateInt("batch",2012);
                    resultSet.updateRow();

                }
            }
            resultSet.beforeFirst();
            System.out.println("Results After Update");
            while (resultSet.next())
            {
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("age"));
                System.out.println(resultSet.getInt("batch"));
                System.out.println("-------------------------------");
            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
