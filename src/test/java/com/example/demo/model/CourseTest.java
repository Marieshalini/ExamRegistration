package com.example.demo.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {

    @Test
    public void testCourseId() {
        Course course = new Course();
        course.setCourseId(1L);
        assertEquals(1L, course.getCourseId());
    }

    @Test
    public void testCourseIdNull() {
        Course course = new Course();
        course.setCourseId(null);
        assertNull(course.getCourseId());
    }

    @Test
    public void testCourseCode() {
        Course course = new Course();
        course.setCourseCode("CS101");
        assertEquals("CS101", course.getCourseCode());
    }

    @Test
    public void testCourseCodeNull() {
        Course course = new Course();
        course.setCourseCode(null);
        assertNull(course.getCourseCode());
    }

    @Test
    public void testCourseName() {
        Course course = new Course();
        course.setCourseName("Intro to CS");
        assertEquals("Intro to CS", course.getCourseName());
    }

    @Test
    public void testCourseNameNull() {
        Course course = new Course();
        course.setCourseName(null);
        assertNull(course.getCourseName());
    }

    @Test
    public void testSemester() {
        Course course = new Course();
        course.setSemester(1);
        assertEquals(1, course.getSemester());
    }

    @Test
    public void testSemesterNegative() {
        Course course = new Course();
        course.setSemester(-1);
        assertEquals(-1, course.getSemester());
    }

    @Test
    public void testCredits() {
        Course course = new Course();
        course.setCredits(3);
        assertEquals(3, course.getCredits());
    }

    @Test
    public void testCreditsZero() {
        Course course = new Course();
        course.setCredits(0);
        assertEquals(0, course.getCredits());
    }

    @Test
    public void testExamDate() {
        Course course = new Course();
        course.setExamDate("2026-05-10");
        assertEquals("2026-05-10", course.getExamDate());
    }

    @Test
    public void testExamDateNull() {
        Course course = new Course();
        course.setExamDate(null);
        assertNull(course.getExamDate());
    }

    @Test
    public void testExamSession() {
        Course course = new Course();
        course.setExamSession("Morning");
        assertEquals("Morning", course.getExamSession());
    }

    @Test
    public void testExamSessionNull() {
        Course course = new Course();
        course.setExamSession(null);
        assertNull(course.getExamSession());
    }

    @Test
    public void testCourseType() {
        Course course = new Course();
        course.setCourseType("Core");
        assertEquals("Core", course.getCourseType());
    }

    @Test
    public void testCourseTypeNull() {
        Course course = new Course();
        course.setCourseType(null);
        assertNull(course.getCourseType());
    }

    @Test
    public void testDefaultConstructor() {
        Course course = new Course();
        assertNull(course.getCourseId());
        assertNull(course.getCourseCode());
        assertNull(course.getCourseName());
        assertEquals(0, course.getSemester());
        assertEquals(0, course.getCredits());
        assertNull(course.getExamDate());
        assertNull(course.getExamSession());
        assertNull(course.getCourseType());
    }

    @Test
    public void testCourseIdMultiple() {
        Course course = new Course();
        course.setCourseId(10L);
        course.setCourseId(20L);
        assertEquals(20L, course.getCourseId());
    }

    @Test
    public void testCourseCodeMultiple() {
        Course course = new Course();
        course.setCourseCode("C1");
        course.setCourseCode("C2");
        assertEquals("C2", course.getCourseCode());
    }

    @Test
    public void testObjectCreation() {
        Course course = new Course();
        assertNotNull(course);
    }
}
