package com.alexbezverkhniy.jaxwsapp.client;

import com.alexbezverkhniy.jaxwsapp.SampleService;

import javax.jws.WebParam;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Class-helper for calling service methods
 *
 * Created by Alex Bezverkhniy on 11/05/2014.
 */
public class SampleServiceHelper implements Serializable, SampleService {
    private static long serialVersionUID = 201405111204L;

    private URL url;

    private QName qName;

    private Service service;

    private SampleService port;

    public SampleServiceHelper(String url, String tns) throws MalformedURLException {
        this(new URL(url),  new QName("http://alexbezverkhniy.com/jaxwsapp/SampleService", "SampleService"));
    }

    public SampleServiceHelper(URL url, QName qName) {
        this.url = url;
        this.qName = qName;
        this.service = Service.create(this.url, this.qName);
        this.port = service.getPort(SampleService.class);
    }

    @Override
    public String echo(@WebParam String msg) {
        return port.echo(msg);
    }
}
