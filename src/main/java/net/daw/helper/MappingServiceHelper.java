/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.helper;

import javax.servlet.http.HttpServletRequest;
import net.daw.bean.ReplyBean;
import net.daw.service.specificimplementation.CarritoSpecificServiceImplementation;
import net.daw.service.specificimplementation.LineadepedidoSpecificServiceImplementation;
import net.daw.service.specificimplementation.PedidoSpecificServiceImplementation;
import net.daw.service.specificimplementation.ProductoSpecificServiceImplementation;
import net.daw.service.specificimplementation.TipousuarioSpecificServiceImplementation;
import net.daw.service.specificimplementation.UsuarioSpecificServiceImplementation;


/**
 *
 * @author a0y3770325h
 */
public class MappingServiceHelper {

    public static ReplyBean executeMethodService(HttpServletRequest oRequest) throws Exception {
        String ob = oRequest.getParameter("ob");
        String op = oRequest.getParameter("op");
        ReplyBean oReplyBean = null;
        switch (ob) {
            case "usuario":
                UsuarioSpecificServiceImplementation oUsuarioService = new UsuarioSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "get":
                        oReplyBean = oUsuarioService.get();
                        break;
                    case "set":
                        oReplyBean = oUsuarioService.set();
                        break;
                    case "remove":
                        oReplyBean = oUsuarioService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oUsuarioService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oUsuarioService.getCount();
                        break;
                    case "login":
                        oReplyBean = oUsuarioService.login();
                        break;
                    case "logout":
                        oReplyBean = oUsuarioService.logout();
                        break;
                    case "check":
                        oReplyBean = oUsuarioService.getSessionStatus();
                        break;
                    case "getcountxtipousuario":
                        oReplyBean = oUsuarioService.getCountX();
                        break;
                    case "getpagextipousuario":
                        oReplyBean = oUsuarioService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBean(500, "Operation not found : Please contact your administrator");
                        break;
                }
                break;
            case "tipousuario":
                TipousuarioSpecificServiceImplementation oTipousuarioService = new TipousuarioSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "get":
                        oReplyBean = oTipousuarioService.get();
                        break;
                    case "set":
                        oReplyBean = oTipousuarioService.set();
                        break;
                    case "remove":
                        oReplyBean = oTipousuarioService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oTipousuarioService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oTipousuarioService.getCount();
                        break;
                    default:
                        oReplyBean = new ReplyBean(500, "Operation not found : Please contact your administrator");
                        break;
                }
                break;
            case "pedido":
                PedidoSpecificServiceImplementation oPedidoService = new PedidoSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "get":
                        oReplyBean = oPedidoService.get();
                        break;
                    case "set":
                        oReplyBean = oPedidoService.set();
                        break;
                    case "remove":
                        oReplyBean = oPedidoService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oPedidoService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oPedidoService.getCount();
                        break;
                    case "getcountxusuario":
                        oReplyBean = oPedidoService.getCountX();
                        break;
                    case "getpagexusuario":
                        oReplyBean = oPedidoService.getPageX();
                        break;
                    default:
                        oReplyBean = new ReplyBean(500, "Operation not found : Please contact your administrator");
                        break;
                }
                break;
            case "producto":
                ProductoSpecificServiceImplementation oProductoService = new ProductoSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "get":
                        oReplyBean = oProductoService.get();
                        break;
                    case "set":
                        oReplyBean = oProductoService.set();
                        break;
                    case "remove":
                        oReplyBean = oProductoService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oProductoService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oProductoService.getCount();
                        break;

                    default:
                        oReplyBean = new ReplyBean(500, "Operation not found : Please contact your administrator");
                        break;
                }
                break;
            case "lineadepedido":
                LineadepedidoSpecificServiceImplementation oLineadepedidoService = new LineadepedidoSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "get":
                        oReplyBean = oLineadepedidoService.get();
                        break;
                    case "set":
                        oReplyBean = oLineadepedidoService.set();
                        break;
                    case "remove":
                        oReplyBean = oLineadepedidoService.remove();
                        break;
                    case "getpage":
                        oReplyBean = oLineadepedidoService.getPage();
                        break;
                    case "getcount":
                        oReplyBean = oLineadepedidoService.getCount();
                        break;
                    case "getpagexpedido":
                        oReplyBean = oLineadepedidoService.getPageX();
                        break;
                    case "getcountxpedido":
                        oReplyBean = oLineadepedidoService.getCountX();
                        break;
                    case "getpagexproducto":
                        oReplyBean = oLineadepedidoService.getPageX();
                        break;
                    case "getcountxproducto":
                        oReplyBean = oLineadepedidoService.getCountX();
                        break;
                    default:
                        oReplyBean = new ReplyBean(500, "Operation not found : Please contact your administrator");
                        break;
                }
                break;

            case "carrito":
                CarritoSpecificServiceImplementation oCarritoService = new CarritoSpecificServiceImplementation(oRequest);
                switch (op) {
                    case "add":
                        oReplyBean = oCarritoService.add();
                        break;
                    case "list":
                        oReplyBean = oCarritoService.list();
                        break;
                    case "remove":
                        oReplyBean = oCarritoService.remove();
                        break;
                    case "empty":
                        oReplyBean = oCarritoService.empty();
                        break;
                    case "buy":
                        oReplyBean = oCarritoService.buy();
                        break;

                    default:
                        oReplyBean = new ReplyBean(500, "Operation not found : Please contact your administrator");
                        break;
                }
                break;

        }
        return oReplyBean;
    }

}