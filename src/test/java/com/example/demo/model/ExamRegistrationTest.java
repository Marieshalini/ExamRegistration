package com.example.demo.model;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class ExamRegistrationTest {

    @Test
    public void testRegistrationId() {
        ExamRegistration reg = new ExamRegistration();
        reg.setRegistrationId(1L);
        assertEquals(1L, reg.getRegistrationId());
    }

    @Test
    public void testRegistrationIdNull() {
        ExamRegistration reg = new ExamRegistration();
        reg.setRegistrationId(null);
        assertNull(reg.getRegistrationId());
    }

    @Test
    public void testStudentId() {
        ExamRegistration reg = new ExamRegistration();
        reg.setStudentId(10L);
        assertEquals(10L, reg.getStudentId());
    }

    @Test
    public void testStudentIdNull() {
        ExamRegistration reg = new ExamRegistration();
        reg.setStudentId(null);
        assertNull(reg.getStudentId());
    }

    @Test
    public void testExamType() {
        ExamRegistration reg = new ExamRegistration();
        reg.setExamType("Final");
        assertEquals("Final", reg.getExamType());
    }

    @Test
    public void testExamTypeNull() {
        ExamRegistration reg = new ExamRegistration();
        reg.setExamType(null);
        assertNull(reg.getExamType());
    }

    @Test
    public void testRegistrationStatus() {
        ExamRegistration reg = new ExamRegistration();
        reg.setRegistrationStatus("Confirmed");
        assertEquals("Confirmed", reg.getRegistrationStatus());
    }

    @Test
    public void testRegistrationStatusNull() {
        ExamRegistration reg = new ExamRegistration();
        reg.setRegistrationStatus(null);
        assertNull(reg.getRegistrationStatus());
    }

    @Test
    public void testRegisteredCourses() {
        ExamRegistration reg = new ExamRegistration();
        reg.setRegisteredCourses("CS1,CS2");
        assertEquals("CS1,CS2", reg.getRegisteredCourses());
    }

    @Test
    public void testRegisteredCoursesNull() {
        ExamRegistration reg = new ExamRegistration();
        reg.setRegisteredCourses(null);
        assertNull(reg.getRegisteredCourses());
    }

    @Test
    public void testArrearCourses() {
        ExamRegistration reg = new ExamRegistration();
        reg.setArrearCourses("M1");
        assertEquals("M1", reg.getArrearCourses());
    }

    @Test
    public void testArrearCoursesNull() {
        ExamRegistration reg = new ExamRegistration();
        reg.setArrearCourses(null);
        assertNull(reg.getArrearCourses());
    }

    @Test
    public void testTotalFee() {
        ExamRegistration reg = new ExamRegistration();
        reg.setTotalFee(1500.50);
        assertEquals(1500.50, reg.getTotalFee());
    }

    @Test
    public void testTotalFeeZero() {
        ExamRegistration reg = new ExamRegistration();
        reg.setTotalFee(0.0);
        assertEquals(0.0, reg.getTotalFee());
    }

    @Test
    public void testRegistrationDate() {
        ExamRegistration reg = new ExamRegistration();
        Date d = new Date();
        reg.setRegistrationDate(d);
        assertEquals(d, reg.getRegistrationDate());
    }

    @Test
    public void testRegistrationDateNull() {
        ExamRegistration reg = new ExamRegistration();
        reg.setRegistrationDate(null);
        assertNull(reg.getRegistrationDate());
    }

    @Test
    public void testDefaultConstructor() {
        ExamRegistration reg = new ExamRegistration();
        assertNull(reg.getRegistrationId());
        assertNull(reg.getStudentId());
        assertNull(reg.getExamType());
        assertNull(reg.getRegistrationStatus());
        assertNull(reg.getRegisteredCourses());
        assertNull(reg.getArrearCourses());
        assertEquals(0.0, reg.getTotalFee());
        assertNull(reg.getRegistrationDate());
    }

    @Test
    public void testStatusMultiple() {
        ExamRegistration reg = new ExamRegistration();
        reg.setRegistrationStatus("Pending");
        reg.setRegistrationStatus("Approved");
        assertEquals("Approved", reg.getRegistrationStatus());
    }

    @Test
    public void testObjectCreation() {
        ExamRegistration reg = new ExamRegistration();
        assertNotNull(reg);
    }
}
