package com.example.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String str) {
        System.out.println(str);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
