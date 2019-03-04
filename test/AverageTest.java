package com.stackroute;
import org.junit.Test;

import static org.junit.Assert.*;

public class AverageTest {
    @Test
    public void testReverseString() throws Exception{
        String expectedValue = "The average is:81.50";
        Average data=new Average();
        String actualValue=data.findAverage("4");
        assertEquals(expectedValue, actualValue);

}}
