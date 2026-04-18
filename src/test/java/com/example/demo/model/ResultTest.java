package com.example.demo.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ResultTest {

    @Test
    public void testResultId() {
        Result r = new Result();
        r.setResultId(1L);
        assertEquals(1L, r.getResultId());
    }

    @Test
    public void testResultIdNull() {
        Result r = new Result();
        r.setResultId(null);
        assertNull(r.getResultId());
    }

    @Test
    public void testStudentId() {
        Result r = new Result();
        r.setStudentId(10L);
        assertEquals(10L, r.getStudentId());
    }

    @Test
    public void testStudentIdNull() {
        Result r = new Result();
        r.setStudentId(null);
        assertNull(r.getStudentId());
    }

    @Test
    public void testCourseName() {
        Result r = new Result();
        r.setCourseName("Java");
        assertEquals("Java", r.getCourseName());
    }

    @Test
    public void testCourseNameNull() {
        Result r = new Result();
        r.setCourseName(null);
        assertNull(r.getCourseName());
    }

    @Test
    public void testSemester() {
        Result r = new Result();
        r.setSemester(4);
        assertEquals(4, r.getSemester());
    }

    @Test
    public void testMarksPass() {
        Result r = new Result();
        r.setMarks(75);
        assertEquals(75, r.getMarks());
        assertEquals("PASS", r.getStatus());
    }

    @Test
    public void testMarksFail() {
        Result r = new Result();
        r.setMarks(40);
        assertEquals(40, r.getMarks());
        assertEquals("FAIL", r.getStatus());
    }

    @Test
    public void testMarksBoundary() {
        Result r = new Result();
        r.setMarks(50);
        assertEquals("PASS", r.getStatus());
    }

    @Test
    public void testStatusSetter() {
        Result r = new Result();
        r.setStatus("PENDING");
        assertEquals("PENDING", r.getStatus());
    }

    @Test
    public void testDefaultConstructor() {
        Result r = new Result();
        assertNull(r.getResultId());
        assertNull(r.getStudentId());
        assertNull(r.getCourseName());
        assertEquals(0, r.getSemester());
        assertEquals(0, r.getMarks());
        assertNull(r.getStatus());
    }
    
    @Test
    public void testMarksMultiple() {
        Result r = new Result();
        r.setMarks(30);
        assertEquals("FAIL", r.getStatus());
        r.setMarks(80);
        assertEquals("PASS", r.getStatus());
    }

    @Test
    public void testObjectCreation() {
        Result r = new Result();
        assertNotNull(r);
    }
}
