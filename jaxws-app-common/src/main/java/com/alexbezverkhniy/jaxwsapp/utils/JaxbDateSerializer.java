package com.alexbezverkhniy.jaxwsapp.utils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class - adaptor for marshaling unmarshaling date
 * Created by Alex Bezverkhniy on 07/05/2014.
 */
public class JaxbDateSerializer extends XmlAdapter<String, Date> {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * Marshal date to string.
     *
     * @param date java.util.Date
     * @return String in format - yyyy-MM-dd HH:mm:ss
     * @throws Exception
     */
    @Override
    public String marshal(Date date) throws Exception {
        return dateFormat.format(date);
    }

    /**
     * Unmarshal string to date
     *
     * @param date String in format - yyyy-MM-dd HH:mm:ss
     * @return java.util.Date
     * @throws Exception
     */
    @Override
    public Date unmarshal(String date) throws Exception {
        return dateFormat.parse(date);
    }
}
