/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.service.specificimplementation;

import javax.servlet.http.HttpServletRequest;
import net.daw.service.genericimplementation.GenericTableService;

/**
 *
 * @author Inna
 */
public class PedidoSpecificServiceImplementation extends GenericTableService {

    public PedidoSpecificServiceImplementation(HttpServletRequest request) {
        super(request);
    }

}
