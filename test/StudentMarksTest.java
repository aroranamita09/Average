package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks stuObj;
    @Before
    public void setUp() throws Exception {
        stuObj = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        stuObj = null;
    }

    @Test
    public void grades() {
        int stu[]={34,87,98,65,45};
        int out[];
        assertEquals(0,stuObj.grades(-5,stu));
        assertEquals(34,stuObj.grades(5,stu));
        assertEquals(0,stuObj.grades(120,stu));
    }

}
