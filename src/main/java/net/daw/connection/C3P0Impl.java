/*
 * Copyright (c) 2017 by Rafael Angel Aznar Aparici (rafaaznar at gmail dot com)
 * 
 * carrito-server: Helps you to develop easily AJAX web applications 
 *               by copying and modifying this Java Server.
 *
 * Sources at https://github.com/rafaelaznar/carrito-server
 * 
 * carrito-server is distributed under the MIT License (MIT)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
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
