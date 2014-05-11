package com.alexbezverkhniy.jaxwsapp;

import com.alexbezverkhniy.jaxwsapp.client.SampleServiceHelper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.net.MalformedURLException;

/**
 * Created by Alex Bezverkhniy on 11/05/2014.
 */
@RunWith(JUnit4.class)
public class SampleServiceHelperTest {

    private SampleServiceHelper helper;

    @Before
    public void init(){

        try {
            helper = new SampleServiceHelper("http://kbl0-dar-1-8559:8080/jaxws-app-server-0.1.0/sampleservice?wsdl", "http://jaxwsapp.alexbezverkhniy.com/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void echoTest() {
        if (helper != null) {
            System.out.println(helper.echo("Hi there!"));
        }
    }

}
