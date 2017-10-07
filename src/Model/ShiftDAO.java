package Model;

import javax.sql.RowSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*public class ShiftDAO {

    public static void insert() {

        Connection connection = null;
        Statement statement = null;

        try {
            //STEP 2: Register JDBC driver
            Class.forName(DatabaseConnection.JDBC_DRIVER);

            //STEP 3: Open a connection
            connection = DriverManager.getConnection(DatabaseConnection.connectionUrl, DatabaseConnection.connectionUsername, DatabaseConnection.connectionPassword);

            //STEP 4: Execute a query
            statement = connection.createStatement();


            String sql = "INSERT into shifts (start_time, end_time, date_date)" +
                         "VALUES ( '" + Shift.getStartTime() + "', '")";









        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
}

}

*/