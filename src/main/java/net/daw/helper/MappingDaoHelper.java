package net.daw.helper;

import java.sql.Connection;
import net.daw.bean.specificimplementation.UsuarioSpecificBeanImplementation;
import net.daw.dao.publicinterface.ViewDaoInterface;
import net.daw.dao.specificimplementation.LineadepedidoSpecificDaoImplementation;
import net.daw.dao.specificimplementation.PedidoSpecificDaoImplementation;
import net.daw.dao.specificimplementation.ProductoSpecificDaoImplementation;
import net.daw.dao.specificimplementation.TipousuarioSpecificDaoImplementation;
import net.daw.dao.specificimplementation.UsuarioSpecificDaoImplementation;

public class MappingDaoHelper {

    public static ViewDaoInterface getDao(String ob, Connection oConnection, UsuarioSpecificBeanImplementation oPuserBean_security, String strWhere) throws Exception {
        ViewDaoInterface oDao = null;

        switch (ob) {
            case "usuario":
                oDao = (ViewDaoInterface) new UsuarioSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "tipousuario":
                oDao = (ViewDaoInterface) new TipousuarioSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "pedido":
                oDao = (ViewDaoInterface) new PedidoSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "producto":
                oDao = (ViewDaoInterface) new ProductoSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            case "linea_pedido":
                oDao = (ViewDaoInterface) new LineadepedidoSpecificDaoImplementation(oConnection, oPuserBean_security, strWhere);
                break;
            default:
                //oReplyBean = new ReplyBean(500, "Object not found : Please contact your administrator");
                break;
        }
        return oDao;
    }

}
