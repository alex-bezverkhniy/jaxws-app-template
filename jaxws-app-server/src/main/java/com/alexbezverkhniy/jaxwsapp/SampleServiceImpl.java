package com.alexbezverkhniy.jaxwsapp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Sample service implementation
 *
 * Created by Alex Bezverkhniy on 11/05/2014.
 */
@WebService(endpointInterface = "com.alexbezverkhniy.jaxwsapp.SampleService",
        serviceName = "SampleService",
        targetNamespace = "http://alexbezverkhniy.com/jaxwsapp/SampleService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class SampleServiceImpl implements SampleService {
    /**
     * Sample echo method
     * @param msg echo message
     * @return
     */
    @WebMethod
    @Override
    public String echo(@WebParam String msg) {
        return msg;
    }
}
