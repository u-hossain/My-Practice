package utillities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

public class sqlconnector {
    private static final String Url = "jdbc:postgresql://localhost:5432/mortgage_calculator";
    private static final String User = "postgres";
    private static final String Password = "<add your password>";

    private static final Logger LOGGER = LogManager.getLogger(SqlConnector.class);

    /**
     * Connect to the postgreSQL database
     * @return a connection object
     */
    private static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(Url,User,Password);
        } catch (SQLException e) {
            LOGGER.error("SQL Connection Exeption" + e.getMessage());
        }
        return conn;
    }

    public static ResultSet readdata(String SQL) {
        ResultSet rs = null;
        Connection com = null;
        try {
            conn = connect();
            LOGGER.debug("Connection object value: " + conn);
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);

        } catch (SQLException e) {
            LOGGER.error("SQL ResultSet Exception" + e.getMessage());
        } finally {
            conn.close();
        }
        return rs;
    }
}
