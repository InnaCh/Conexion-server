/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.dao.specificimplementation;

import java.sql.Connection;
import net.daw.bean.specificimplementation.UsuarioSpecificBeanImplementation;
import net.daw.dao.genericimplementation.TableGenericDaoImplementation;

/**
 *
 * @author Inna
 */
public class LineadepedidoSpecificDaoImplementation extends TableGenericDaoImplementation {

    public LineadepedidoSpecificDaoImplementation(Connection oPooledConnection, UsuarioSpecificBeanImplementation oPuserBean_security, String strWhere) {
        super("linea_pedido", oPooledConnection, oPuserBean_security, strWhere);
    }
}
