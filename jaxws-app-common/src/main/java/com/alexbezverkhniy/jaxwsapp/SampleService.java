package com.alexbezverkhniy.jaxwsapp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Sample service
 *
 * Created by Alex Bezverkhniy on 11/05/2014.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SampleService {
    /**
     * Sample echo method
     * @param msg echo message
     * @return
     */
    @WebMethod
    public String echo(@WebParam String msg);

}

