/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.bean.specificimplementation;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.daw.bean.genericimplementation.TableGenericBeanImplementation;
import net.daw.bean.publicinterface.GenericBeanInterface;
import net.daw.dao.specificimplementation.PedidoSpecificDaoImplementation;
import net.daw.dao.specificimplementation.ProductoSpecificDaoImplementation;

/**
 *
 * @author a0y3770325h
 */
public class LineadepedidoSpecificBeanImplementation extends TableGenericBeanImplementation {

    @Expose
    private Integer cantidad;
    @Expose(serialize = false)
    private Integer id_pedido = 0;
    @Expose(deserialize = false)
    private PedidoSpecificBeanImplementation obj_pedido = null;
    @Expose(serialize = false)
    private Integer id_producto = 0;
    @Expose(deserialize = false)
    private ProductoSpecificBeanImplementation obj_producto = null;

    public LineadepedidoSpecificBeanImplementation() {
    }

    public LineadepedidoSpecificBeanImplementation(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Integer id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public PedidoSpecificBeanImplementation getObj_pedido() {
        return obj_pedido;
    }

    public void setObj_pedido(PedidoSpecificBeanImplementation obj_pedido) {
        this.obj_pedido = obj_pedido;
    }

    public ProductoSpecificBeanImplementation getObj_producto() {
        return obj_producto;
    }

    public void setObj_producto(ProductoSpecificBeanImplementation obj_producto) {
        this.obj_producto = obj_producto;
    }

    @Override
    public String getColumns() {
        String strColumns = "";
        strColumns += "id,";
        strColumns += "cantidad,";
        strColumns += "id_pedido,";
        strColumns += "id_producto";
        return strColumns;
    }

    @Override
    public String getValues() {
        String strColumns = "";
        strColumns += id + ",";
        strColumns += cantidad + ",";
        strColumns += id_pedido + ",";
        strColumns += id_producto;
        return strColumns;
    }

    @Override
    public String toPairs() {
        String strPairs = "";
        strPairs += "cantidad=" + cantidad + ",";
        strPairs += "id_pedido=" + id_pedido + ",";
        strPairs += "id_producto=" + id_producto;
        return strPairs;
    }

    @Override
    public GenericBeanInterface fill(ResultSet oResultSet, Connection oConnection, UsuarioSpecificBeanImplementation oPuserBean_security, Integer expand) throws SQLException, Exception {
        this.setId(oResultSet.getInt("id"));
        this.setId(oResultSet.getInt("cantidad"));
        this.setId(oResultSet.getInt("id_pedido"));
        this.setId(oResultSet.getInt("id_producto"));

        if (expand > 0) {
            PedidoSpecificBeanImplementation oPedidoBean = new PedidoSpecificBeanImplementation();
            PedidoSpecificDaoImplementation oPedidoDao = new PedidoSpecificDaoImplementation(oConnection, oPuserBean_security, null);
            oPedidoBean = (PedidoSpecificBeanImplementation) oPedidoDao.get(oResultSet.getInt("id_pedido"), expand - 1);
            this.setObj_pedido(oPedidoBean);
            ProductoSpecificBeanImplementation oProductoBean = new ProductoSpecificBeanImplementation();
            ProductoSpecificDaoImplementation oProductoDao = new ProductoSpecificDaoImplementation(oConnection, oPuserBean_security, null);
            oProductoBean = (ProductoSpecificBeanImplementation) oProductoDao.get(oResultSet.getInt("id_producto"), expand - 1);
            this.setObj_producto(oProductoBean);

        } else {
            this.setId_pedido(oResultSet.getInt("id_pedido"));
            this.setId_producto(oResultSet.getInt("id_producto"));

        }

        return this;
    }

}
