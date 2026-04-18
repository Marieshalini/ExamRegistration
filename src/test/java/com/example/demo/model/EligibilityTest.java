package com.example.demo.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EligibilityTest {

    @Test
    public void testEligibilityId() {
        Eligibility el = new Eligibility();
        el.setEligibilityId(1L);
        assertEquals(1L, el.getEligibilityId());
    }

    @Test
    public void testEligibilityIdNull() {
        Eligibility el = new Eligibility();
        el.setEligibilityId(null);
        assertNull(el.getEligibilityId());
    }

    @Test
    public void testStudentId() {
        Eligibility el = new Eligibility();
        el.setStudentId(100L);
        assertEquals(100L, el.getStudentId());
    }

    @Test
    public void testStudentIdNull() {
        Eligibility el = new Eligibility();
        el.setStudentId(null);
        assertNull(el.getStudentId());
    }

    @Test
    public void testArrearCount() {
        Eligibility el = new Eligibility();
        el.setArrearCount(2);
        assertEquals(2, el.getArrearCount());
    }

    @Test
    public void testArrearCountZero() {
        Eligibility el = new Eligibility();
        el.setArrearCount(0);
        assertEquals(0, el.getArrearCount());
    }

    @Test
    public void testArrearSubjects() {
        Eligibility el = new Eligibility();
        el.setArrearSubjects("Math, Physics");
        assertEquals("Math, Physics", el.getArrearSubjects());
    }

    @Test
    public void testArrearSubjectsNull() {
        Eligibility el = new Eligibility();
        el.setArrearSubjects(null);
        assertNull(el.getArrearSubjects());
    }

    @Test
    public void testEligibilityStatus() {
        Eligibility el = new Eligibility();
        el.setEligibilityStatus("Eligible");
        assertEquals("Eligible", el.getEligibilityStatus());
    }

    @Test
    public void testEligibilityStatusNull() {
        Eligibility el = new Eligibility();
        el.setEligibilityStatus(null);
        assertNull(el.getEligibilityStatus());
    }

    @Test
    public void testMaxCoursesAllowed() {
        Eligibility el = new Eligibility();
        el.setMaxCoursesAllowed(5);
        assertEquals(5, el.getMaxCoursesAllowed());
    }

    @Test
    public void testMaxCoursesAllowedZero() {
        Eligibility el = new Eligibility();
        el.setMaxCoursesAllowed(0);
        assertEquals(0, el.getMaxCoursesAllowed());
    }

    @Test
    public void testDefaultConstructor() {
        Eligibility el = new Eligibility();
        assertNull(el.getEligibilityId());
        assertNull(el.getStudentId());
        assertEquals(0, el.getArrearCount());
        assertNull(el.getArrearSubjects());
        assertNull(el.getEligibilityStatus());
        assertEquals(0, el.getMaxCoursesAllowed());
    }

    @Test
    public void testArrearCountMultiple() {
        Eligibility el = new Eligibility();
        el.setArrearCount(1);
        el.setArrearCount(3);
        assertEquals(3, el.getArrearCount());
    }

    @Test
    public void testEligibilityStatusMultiple() {
        Eligibility el = new Eligibility();
        el.setEligibilityStatus("No");
        el.setEligibilityStatus("Yes");
        assertEquals("Yes", el.getEligibilityStatus());
    }

    @Test
    public void testObjectCreation() {
        Eligibility el = new Eligibility();
        assertNotNull(el);
    }
}
