package com.alexbezverkhniy.jaxwsapp;

import com.alexbezverkhniy.jaxwsapp.client.SampleServiceHelper;
import org.databene.contiperf.PerfTest;
import org.databene.contiperf.Required;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;

/**
 * Created by Alex Bezverkhniy on 11/05/2014.
 */
@RunWith(JUnit4.class)
public class SampleServiceHelperTest {
    private Logger logger = LoggerFactory.getLogger(SampleServiceHelperTest.class);

    private SampleServiceHelper helper;

    @Rule
    public ContiPerfRule i = new ContiPerfRule();

    @Before
    public void init(){

        try {
            helper = new SampleServiceHelper("http://kbl0-dar-1-8559:8080/jaxws-app-server-0.1.0/sampleservice?wsdl", "http://jaxwsapp.alexbezverkhniy.com/");
        } catch (MalformedURLException e) {
            logger.error(e.getMessage());
        }
        logger.info("START");
    }

    @After
    public void destroy() {
        logger.info("END");
    }

    @Test
    @PerfTest(invocations = 10, threads = 5)
    //@Required(average = 2, percentile95 = 1)
    public void echoTest() {
        if (helper != null) {
            logger.info(helper.echo("Hi there!"));
        }
    }

}
