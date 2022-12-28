package Students.Retrive.JDBCRowSet;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class JdbcRowSets {
    private static final String userName="root";
    private  static final String password="password";
    private static final String databaseUrl="jdbc:mysql://localhost:3306/sevensem";

    public static void main(String[] args) throws SQLException {

        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();

        jdbcRowSet.setUrl(databaseUrl);
        jdbcRowSet.setUsername(userName);
        jdbcRowSet.setPassword(password);

        jdbcRowSet.setCommand("SELECT * FROM students");
        jdbcRowSet.execute();

        while (jdbcRowSet.next())
        {
            System.out.println("Name =>"+ jdbcRowSet.getString("name"));
            System.out.println("Age =>"+ jdbcRowSet.getInt("age"));
            System.out.println("Batch =>"+ jdbcRowSet.getInt("batch"));
            System.out.println("------------------------");
        }
    }
}
