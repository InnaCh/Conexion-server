/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.bean;

import net.daw.bean.specificimplementation.ProductoSpecificBeanImplementation;
import com.google.gson.annotations.Expose;

/**
 *
 * @author Inna
 */
public class CarritoBean {

    @Expose
    private Integer cantidad;
    @Expose
    private ProductoSpecificBeanImplementation oBean;

    public CarritoBean() {
    }

    public CarritoBean(Integer cantidad, ProductoSpecificBeanImplementation oBean) {
        this.cantidad = cantidad;
        this.oBean = oBean;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public ProductoSpecificBeanImplementation getoBean() {
        return oBean;
    }

    public void setoBean(ProductoSpecificBeanImplementation oBean) {
        this.oBean = oBean;
    }

}
