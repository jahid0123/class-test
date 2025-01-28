import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL1 = "jdbc:oracle:thin:@//localhost:1521/ORCLPDB";
    private static final String USER1 = "orclpdbuser";
    private static final String PASSWORD1 = "isdb62";

    private static final String URL2 = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER2 = "postgres";
    private static final String PASSWORD2 = "isdb62";

    public static Connection orclConnection() throws SQLException {

        return DriverManager.getConnection(URL1, USER1, PASSWORD1);
    }

    public static Connection postConnection() throws SQLException {

        return DriverManager.getConnection(URL2, USER2, PASSWORD2);
    }
}
