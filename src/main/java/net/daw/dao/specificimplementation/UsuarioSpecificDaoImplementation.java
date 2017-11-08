
package net.daw.dao.specificimplementation;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.daw.bean.specificimplementation.UsuarioSpecificBeanImplementation;
import net.daw.dao.genericimplementation.TableGenericDaoImplementation;
import net.daw.helper.AppConfigurationHelper;
import net.daw.helper.Log4jConfigurationHelper;

public class UsuarioSpecificDaoImplementation extends TableGenericDaoImplementation {

    public UsuarioSpecificDaoImplementation(Connection oPooledConnection, UsuarioSpecificBeanImplementation oPuserBean_security, String strWhere) {
        super("usuario", oPooledConnection, oPuserBean_security, strWhere);
    }

    public UsuarioSpecificBeanImplementation getFromLoginAndPass(UsuarioSpecificBeanImplementation oUsuarioBean) throws Exception {
        PreparedStatement oPreparedStatement = null;
        ResultSet oResultSet = null;

        strSQL += " AND login='" + oUsuarioBean.getLogin() + "'";
        strSQL += " AND password='" + oUsuarioBean.getPassword() + "'";
        try {
            oPreparedStatement = oConnection.prepareStatement(strSQL);
            oResultSet = oPreparedStatement.executeQuery();
            if (oResultSet.next()) {
                oUsuarioBean.fill(oResultSet, oConnection, oPuserSecurity, AppConfigurationHelper.getJsonMsgDepth());
            } else {
                throw new Exception("UsuarioDao getFromLoginAndPass error");
            }
        } catch (Exception ex) {
            String msg = this.getClass().getName() + ":" + (ex.getStackTrace()[0]).getMethodName();
            Log4jConfigurationHelper.errorLog(msg, ex);
            throw new Exception(msg, ex);
        } finally {
            if (oResultSet != null) {
                oResultSet.close();
            }
            if (oPreparedStatement != null) {
                oPreparedStatement.close();
            }
        }
        return oUsuarioBean;
    }

}
