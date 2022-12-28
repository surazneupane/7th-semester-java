package Students.Retrive.CachedRow;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class CachedRowSets {
    private static final String userName="root";
    private static final String password="password";
    private static final String databaseUrl="jdbc:mysql://localhost:3306/sevensem";

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
            System.out.println(cachedRowSet.getString("name"));
        }


    }

    public static void main(String[] args) throws SQLException{
        CachedRowSets cachedRowSets=new CachedRowSets();
        cachedRowSets.getCached();
    }

}
