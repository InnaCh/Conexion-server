package net.daw.connection;

import java.sql.Connection;
import java.sql.SQLException;

public class ViburConnection implements ConnectionInterface {

    // private ViburDBCPDataSource dataSource = null;
    private Connection oConnection = null;

    @Override
    public Connection newConnection() throws Exception {

//        try {
//
//            dataSource = new ViburDBCPDataSource();
//
//            dataSource.setJdbcUrl(ConnectionClassHelper.getConnectionChain());
//            dataSource.setUsername(ConnectionClassHelper.getDatabaseLogin());
//            dataSource.setPassword(ConnectionClassHelper.getDatabasePassword());
//
//            dataSource.setPoolInitialSize(10);
//            dataSource.setPoolMaxSize(100);
//
//            dataSource.setConnectionIdleLimitInSeconds(30);
//            dataSource.setTestConnectionQuery("isValid");
//
//            dataSource.setLogQueryExecutionLongerThanMs(500);
//            dataSource.setLogStackTraceForLongQueryExecution(true);
//
//            dataSource.start();
//            oConnection = dataSource.getConnection();
//
//        } catch (SQLException | ViburDBCPException ex) {
//            String msg = this.getClass().getName() + ":" + (ex.getStackTrace()[0]).getMethodName();
//            Log4j.errorLog(msg, ex);
//            throw new Exception(msg, ex);
//        }
        return oConnection;
    }

    @Override
    public void disposeConnection() throws Exception {
//        try {
//            if (oConnection != null) {
//                oConnection.close();
//            }
//            if (dataSource != null) {
//                dataSource.close();
//            }
//        } catch (SQLException ex) {
//            String msg = this.getClass().getName() + ":" + (ex.getStackTrace()[0]).getMethodName();
//            Log4j.errorLog(msg, ex);
//            throw new Exception(msg, ex);
    }
}
