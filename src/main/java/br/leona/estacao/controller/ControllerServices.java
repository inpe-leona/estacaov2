/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.leona.estacao.controller;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Admin_2
 */
@WebService(serviceName = "ControllerServices")
public class ControllerServices {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "MoverEsquerda")
    public int moverEsquerda(@WebParam(name = "graus") String graus) {
        return 1;
    }
    
}