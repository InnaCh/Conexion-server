
package net.daw.bean.publicinterface;

import net.daw.bean.specificimplementation.UsuarioSpecificBeanImplementation;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface GenericBeanInterface {

    public String getColumns();

    public String getValues();

    public String toPairs();

    public GenericBeanInterface fill(ResultSet oResultSet, Connection pooledConnection, UsuarioSpecificBeanImplementation oPuserBean_security, Integer expand) throws SQLException, Exception;

}
