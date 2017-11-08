
package net.daw.connection;


import java.sql.Connection;
import java.sql.SQLException;
import net.daw.helper.ConnectionClassHelper;
import net.daw.helper.Log4jConfigurationHelper;

public class DriverManagerConnection implements ConnectionInterface {

    private Connection oConnection;

    @Override
    public Connection newConnection() throws Exception {
        oConnection = null;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            String urlOdbc = ConnectionClassHelper.getConnectionChain();
            oConnection = (java.sql.DriverManager.getConnection(urlOdbc, ConnectionClassHelper.getDatabaseLogin(), ConnectionClassHelper.getDatabasePassword()));
            return oConnection;
        } catch (Exception ex) {
            String msg = this.getClass().getName() + ":" + (ex.getStackTrace()[0]).getMethodName();
            Log4jConfigurationHelper.errorLog(msg, ex);
            throw new Exception(msg, ex);
        }
    }

    @Override
    public void disposeConnection() throws Exception {
        try {
            if (oConnection != null) {
                oConnection.close();
            }
        } catch (SQLException ex) {
            String msg = this.getClass().getName() + ":" + (ex.getStackTrace()[0]).getMethodName();
            Log4jConfigurationHelper.errorLog(msg, ex);
            throw new Exception(msg, ex);
        }
    }

}
