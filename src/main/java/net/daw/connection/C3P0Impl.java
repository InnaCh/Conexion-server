/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.connection;


import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import net.daw.helper.ConnectionClassHelper;
import net.daw.helper.Log4jConfigurationHelper;

/**
 *
 * @author Inna
 */
public class C3P0Impl implements ConnectionInterface{
//    private ComboPooledDataSource connectionPool = null;
    private Connection oConnection = null;
//
    public Connection newConnection() throws Exception {
//        try {
//            connectionPool = new ComboPooledDataSource();
//            connectionPool.setDriverClass("com.mysql.jdbc.Driver");
//            connectionPool.setJdbcUrl(ConnectionClassHelper.getConnectionChain());
//            connectionPool.setUser(ConnectionClassHelper.getDatabaseLogin());
//            connectionPool.setPassword(ConnectionClassHelper.getDatabasePassword());
//            connectionPool.setMaxStatements(180);
//            oConnection = connectionPool.getConnection();
//        } catch (PropertyVetoException | SQLException ex) {
//            String msg = this.getClass().getName() + ":" + (ex.getStackTrace()[0]).getMethodName();
//            Log4j.errorLog(msg, ex);
//            throw new Exception(msg, ex);
//        }
        return oConnection;
    }
//
    public void disposeConnection() throws Exception {
//        try {
//            if (oConnection != null) {
//                oConnection.close();
//            }
//            if (connectionPool != null) {
//                connectionPool.close();
//            }
//        } catch (SQLException ex) {
//            String msg = this.getClass().getName() + ":" + (ex.getStackTrace()[0]).getMethodName();
//            Log4j.errorLog(msg, ex);
//            throw new Exception(msg, ex);
//        }
    }
    
}
