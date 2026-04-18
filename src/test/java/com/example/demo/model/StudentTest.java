package com.example.demo.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testStudentId() {
        Student s = new Student();
        s.setStudentId(1L);
        assertEquals(1L, s.getStudentId());
    }

    @Test
    public void testStudentIdNull() {
        Student s = new Student();
        s.setStudentId(null);
        assertNull(s.getStudentId());
    }

    @Test
    public void testRegisterNo() {
        Student s = new Student();
        s.setRegisterNo("REG123");
        assertEquals("REG123", s.getRegisterNo());
    }

    @Test
    public void testRegisterNoNull() {
        Student s = new Student();
        s.setRegisterNo(null);
        assertNull(s.getRegisterNo());
    }

    @Test
    public void testName() {
        Student s = new Student();
        s.setName("John Doe");
        assertEquals("John Doe", s.getName());
    }

    @Test
    public void testNameNull() {
        Student s = new Student();
        s.setName(null);
        assertNull(s.getName());
    }

    @Test
    public void testDepartment() {
        Student s = new Student();
        s.setDepartment("CS");
        assertEquals("CS", s.getDepartment());
    }

    @Test
    public void testDepartmentNull() {
        Student s = new Student();
        s.setDepartment(null);
        assertNull(s.getDepartment());
    }

    @Test
    public void testDegree() {
        Student s = new Student();
        s.setDegree("BTech");
        assertEquals("BTech", s.getDegree());
    }

    @Test
    public void testDegreeNull() {
        Student s = new Student();
        s.setDegree(null);
        assertNull(s.getDegree());
    }

    @Test
    public void testSemester() {
        Student s = new Student();
        s.setSemester(5);
        assertEquals(5, s.getSemester());
    }

    @Test
    public void testSemesterNegative() {
        Student s = new Student();
        s.setSemester(-1);
        assertEquals(-1, s.getSemester());
    }

    @Test
    public void testYear() {
        Student s = new Student();
        s.setYear(3);
        assertEquals(3, s.getYear());
    }

    @Test
    public void testYearZero() {
        Student s = new Student();
        s.setYear(0);
        assertEquals(0, s.getYear());
    }

    @Test
    public void testPassword() {
        Student s = new Student();
        s.setPassword("secret");
        assertEquals("secret", s.getPassword());
    }

    @Test
    public void testPasswordNull() {
        Student s = new Student();
        s.setPassword(null);
        assertNull(s.getPassword());
    }

    @Test
    public void testPhone() {
        Student s = new Student();
        s.setPhone("9876543210");
        assertEquals("9876543210", s.getPhone());
    }

    @Test
    public void testPhoneNull() {
        Student s = new Student();
        s.setPhone(null);
        assertNull(s.getPhone());
    }

    @Test
    public void testEmail() {
        Student s = new Student();
        s.setEmail("test@test.com");
        assertEquals("test@test.com", s.getEmail());
    }

    @Test
    public void testEmailNull() {
        Student s = new Student();
        s.setEmail(null);
        assertNull(s.getEmail());
    }

    @Test
    public void testProfilePhoto() {
        Student s = new Student();
        s.setProfilePhoto("url");
        assertEquals("url", s.getProfilePhoto());
    }

    @Test
    public void testProfilePhotoNull() {
        Student s = new Student();
        s.setProfilePhoto(null);
        assertNull(s.getProfilePhoto());
    }

    @Test
    public void testDefaultConstructor() {
        Student s = new Student();
        assertNull(s.getStudentId());
        assertNull(s.getRegisterNo());
        assertNull(s.getName());
        assertNull(s.getDepartment());
        assertNull(s.getDegree());
        assertEquals(0, s.getSemester());
        assertEquals(0, s.getYear());
        assertNull(s.getPassword());
        assertNull(s.getPhone());
        assertNull(s.getEmail());
        assertNull(s.getProfilePhoto());
    }

    @Test
    public void testObjectCreation() {
        Student s = new Student();
        assertNotNull(s);
    }
}
