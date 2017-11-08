
package net.daw.dao.specificimplementation;

import java.sql.Connection;
import net.daw.bean.specificimplementation.UsuarioSpecificBeanImplementation;
import net.daw.dao.genericimplementation.TableGenericDaoImplementation;

public class TipousuarioSpecificDaoImplementation extends TableGenericDaoImplementation {

    public TipousuarioSpecificDaoImplementation(Connection oPooledConnection, UsuarioSpecificBeanImplementation oPuserBean_security, String strWhere) {
        super("tipousuario", oPooledConnection, oPuserBean_security, strWhere);
    }

}
