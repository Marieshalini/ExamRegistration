package com.example.demo.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdminTest {

    @Test
    public void testAdminId() {
        Admin admin = new Admin();
        admin.setAdminId(1L);
        assertEquals(1L, admin.getAdminId());
    }

    @Test
    public void testAdminIdNull() {
        Admin admin = new Admin();
        admin.setAdminId(null);
        assertNull(admin.getAdminId());
    }

    @Test
    public void testUsername() {
        Admin admin = new Admin();
        admin.setUsername("admin123");
        assertEquals("admin123", admin.getUsername());
    }

    @Test
    public void testUsernameNull() {
        Admin admin = new Admin();
        admin.setUsername(null);
        assertNull(admin.getUsername());
    }

    @Test
    public void testUsernameEmpty() {
        Admin admin = new Admin();
        admin.setUsername("");
        assertEquals("", admin.getUsername());
    }

    @Test
    public void testPassword() {
        Admin admin = new Admin();
        admin.setPassword("pass");
        assertEquals("pass", admin.getPassword());
    }

    @Test
    public void testPasswordNull() {
        Admin admin = new Admin();
        admin.setPassword(null);
        assertNull(admin.getPassword());
    }

    @Test
    public void testPasswordEmpty() {
        Admin admin = new Admin();
        admin.setPassword("");
        assertEquals("", admin.getPassword());
    }

    @Test
    public void testFullName() {
        Admin admin = new Admin();
        admin.setFullName("Admin Full");
        assertEquals("Admin Full", admin.getFullName());
    }

    @Test
    public void testFullNameNull() {
        Admin admin = new Admin();
        admin.setFullName(null);
        assertNull(admin.getFullName());
    }

    @Test
    public void testFullNameEmpty() {
        Admin admin = new Admin();
        admin.setFullName("");
        assertEquals("", admin.getFullName());
    }
    
    @Test
    public void testDefaultConstructor() {
        Admin admin = new Admin();
        assertNull(admin.getAdminId());
        assertNull(admin.getUsername());
        assertNull(admin.getPassword());
        assertNull(admin.getFullName());
    }

    @Test
    public void testAdminIdMultiple() {
        Admin admin = new Admin();
        admin.setAdminId(100L);
        admin.setAdminId(200L);
        assertEquals(200L, admin.getAdminId());
    }

    @Test
    public void testUsernameMultiple() {
        Admin admin = new Admin();
        admin.setUsername("user1");
        admin.setUsername("user2");
        assertEquals("user2", admin.getUsername());
    }

    @Test
    public void testPasswordMultiple() {
        Admin admin = new Admin();
        admin.setPassword("pass1");
        admin.setPassword("pass2");
        assertEquals("pass2", admin.getPassword());
    }

    @Test
    public void testFullNameMultiple() {
        Admin admin = new Admin();
        admin.setFullName("Name1");
        admin.setFullName("Name2");
        assertEquals("Name2", admin.getFullName());
    }

    @Test
    public void testObjectCreation() {
        Admin admin = new Admin();
        assertNotNull(admin);
    }
}
