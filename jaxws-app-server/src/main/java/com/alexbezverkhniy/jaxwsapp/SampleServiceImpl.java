package com.alexbezverkhniy.jaxwsapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    private Logger logger = LoggerFactory.getLogger(SampleServiceImpl.class);
    /**
     * Sample echo method
     * @param msg echo message
     * @return
     */
    @WebMethod
    @Override
    public String echo(@WebParam String msg) {
        logger.info(msg);
        return msg;
    }
}
