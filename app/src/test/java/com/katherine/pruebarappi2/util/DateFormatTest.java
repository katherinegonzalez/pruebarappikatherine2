package com.katherine.pruebarappi2.util;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class DateFormatTest {

    @Test
    public void dateFormat() {

        DateFormat dateFormat =  new DateFormat();

        assertFalse(dateFormat.dateFormat(new Date().getTime()).equals(""));
    }
}