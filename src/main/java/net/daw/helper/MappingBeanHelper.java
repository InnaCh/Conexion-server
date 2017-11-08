package net.daw.helper;

import net.daw.bean.publicinterface.GenericBeanInterface;
import net.daw.bean.specificimplementation.LineadepedidoSpecificBeanImplementation;
import net.daw.bean.specificimplementation.PedidoSpecificBeanImplementation;
import net.daw.bean.specificimplementation.ProductoSpecificBeanImplementation;
import net.daw.bean.specificimplementation.TipousuarioSpecificBeanImplementation;
import net.daw.bean.specificimplementation.UsuarioSpecificBeanImplementation;

/**
 *
 * @author raznara
 */
public class MappingBeanHelper {

    public static GenericBeanInterface getBean(String ob) {
        GenericBeanInterface oBean = null;

        switch (ob) {
            case "usuario":
                oBean = new UsuarioSpecificBeanImplementation();
                break;
            case "tipousuario":
                oBean = new TipousuarioSpecificBeanImplementation();
                break;
            case "pedido":
                oBean = new PedidoSpecificBeanImplementation();
                break;
            case "producto":
                oBean = new ProductoSpecificBeanImplementation();
                break;
            case "linea_pedido":
                oBean = new LineadepedidoSpecificBeanImplementation();
                break;
            default:
                //oReplyBean = new ReplyBean(500, "Object not found : Please contact your administrator");
                break;
        }
        return oBean;

    }
}