package Students.Retrive.CachedRowSet;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class CachedRowSets {
    private  final String userName="root";
    private  final String password="password";
    private  final String databaseUrl="jdbc:mysql://localhost:3306/sevensem";

    public void getCached() throws SQLException
    {

        CachedRowSet cachedRowSet= RowSetProvider.newFactory().createCachedRowSet();
        cachedRowSet.setUrl(databaseUrl);
        cachedRowSet.setUsername(userName);
        cachedRowSet.setPassword(password);
        cachedRowSet.setCommand("SELECT * from students");
        cachedRowSet.execute();
        while (cachedRowSet.next())
        {
            System.out.println("Name =>"+ cachedRowSet.getString("name"));
            System.out.println("Age =>"+ cachedRowSet.getInt("age"));
            System.out.println("Batch =>"+ cachedRowSet.getInt("batch"));
            System.out.println("------------------------");
        }


    }

    public static void main(String[] args) throws SQLException{
        CachedRowSets cachedRowSets=new CachedRowSets();
        cachedRowSets.getCached();
    }

}
