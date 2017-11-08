/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.service.publicinterface;

import net.daw.bean.ReplyBean;

/**
 *
 * @author Inna
 */
public interface ViewCarritoServiceInterface {

    public ReplyBean list() throws Exception;

    public ReplyBean buy() throws Exception;

    public ReplyBean empty() throws Exception;
}
