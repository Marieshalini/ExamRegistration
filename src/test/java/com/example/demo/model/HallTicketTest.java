package com.example.demo.model;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class HallTicketTest {

    @Test
    public void testHallTicketId() {
        HallTicket ht = new HallTicket();
        ht.setHallTicketId(1L);
        assertEquals(1L, ht.getHallTicketId());
    }

    @Test
    public void testHallTicketIdNull() {
        HallTicket ht = new HallTicket();
        ht.setHallTicketId(null);
        assertNull(ht.getHallTicketId());
    }

    @Test
    public void testRegistrationId() {
        HallTicket ht = new HallTicket();
        ht.setRegistrationId(10L);
        assertEquals(10L, ht.getRegistrationId());
    }

    @Test
    public void testRegistrationIdNull() {
        HallTicket ht = new HallTicket();
        ht.setRegistrationId(null);
        assertNull(ht.getRegistrationId());
    }

    @Test
    public void testExamSession() {
        HallTicket ht = new HallTicket();
        ht.setExamSession("APR/MAY 2026");
        assertEquals("APR/MAY 2026", ht.getExamSession());
    }

    @Test
    public void testExamSessionNull() {
        HallTicket ht = new HallTicket();
        ht.setExamSession(null);
        assertNull(ht.getExamSession());
    }

    @Test
    public void testExamCenter() {
        HallTicket ht = new HallTicket();
        ht.setExamCenter("Main Hall");
        assertEquals("Main Hall", ht.getExamCenter());
    }

    @Test
    public void testExamCenterNull() {
        HallTicket ht = new HallTicket();
        ht.setExamCenter(null);
        assertNull(ht.getExamCenter());
    }

    @Test
    public void testIssueDate() {
        HallTicket ht = new HallTicket();
        Date d = new Date();
        ht.setIssueDate(d);
        assertEquals(d, ht.getIssueDate());
    }

    @Test
    public void testIssueDateNull() {
        HallTicket ht = new HallTicket();
        ht.setIssueDate(null);
        assertNull(ht.getIssueDate());
    }

    @Test
    public void testHallTicketStatus() {
        HallTicket ht = new HallTicket();
        ht.setHallTicketStatus("Issued");
        assertEquals("Issued", ht.getHallTicketStatus());
    }

    @Test
    public void testHallTicketStatusNull() {
        HallTicket ht = new HallTicket();
        ht.setHallTicketStatus(null);
        assertNull(ht.getHallTicketStatus());
    }

    @Test
    public void testDefaultConstructor() {
        HallTicket ht = new HallTicket();
        assertNull(ht.getHallTicketId());
        assertNull(ht.getRegistrationId());
        assertNull(ht.getExamSession());
        assertNull(ht.getExamCenter());
        assertNull(ht.getIssueDate());
        assertNull(ht.getHallTicketStatus());
    }

    @Test
    public void testCenterMultiple() {
        HallTicket ht = new HallTicket();
        ht.setExamCenter("A1");
        ht.setExamCenter("B2");
        assertEquals("B2", ht.getExamCenter());
    }

    @Test
    public void testObjectCreation() {
        HallTicket ht = new HallTicket();
        assertNotNull(ht);
    }
}
