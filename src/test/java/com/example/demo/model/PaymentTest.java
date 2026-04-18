package com.example.demo.model;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

    @Test
    public void testPaymentId() {
        Payment p = new Payment();
        p.setPaymentId(1L);
        assertEquals(1L, p.getPaymentId());
    }

    @Test
    public void testPaymentIdNull() {
        Payment p = new Payment();
        p.setPaymentId(null);
        assertNull(p.getPaymentId());
    }

    @Test
    public void testRegistrationId() {
        Payment p = new Payment();
        p.setRegistrationId(20L);
        assertEquals(20L, p.getRegistrationId());
    }

    @Test
    public void testRegistrationIdNull() {
        Payment p = new Payment();
        p.setRegistrationId(null);
        assertNull(p.getRegistrationId());
    }

    @Test
    public void testAmount() {
        Payment p = new Payment();
        p.setAmount(500.0);
        assertEquals(500.0, p.getAmount());
    }

    @Test
    public void testAmountZero() {
        Payment p = new Payment();
        p.setAmount(0.0);
        assertEquals(0.0, p.getAmount());
    }

    @Test
    public void testPaymentDate() {
        Payment p = new Payment();
        Date d = new Date();
        p.setPaymentDate(d);
        assertEquals(d, p.getPaymentDate());
    }

    @Test
    public void testPaymentDateNull() {
        Payment p = new Payment();
        p.setPaymentDate(null);
        assertNull(p.getPaymentDate());
    }

    @Test
    public void testPaymentStatus() {
        Payment p = new Payment();
        p.setPaymentStatus("Success");
        assertEquals("Success", p.getPaymentStatus());
    }

    @Test
    public void testPaymentStatusNull() {
        Payment p = new Payment();
        p.setPaymentStatus(null);
        assertNull(p.getPaymentStatus());
    }

    @Test
    public void testAccountNo() {
        Payment p = new Payment();
        p.setAccountNo("12345");
        assertEquals("12345", p.getAccountNo());
    }

    @Test
    public void testAccountNoNull() {
        Payment p = new Payment();
        p.setAccountNo(null);
        assertNull(p.getAccountNo());
    }

    @Test
    public void testTransactionId() {
        Payment p = new Payment();
        p.setTransactionId("TRX001");
        assertEquals("TRX001", p.getTransactionId());
    }

    @Test
    public void testTransactionIdNull() {
        Payment p = new Payment();
        p.setTransactionId(null);
        assertNull(p.getTransactionId());
    }

    @Test
    public void testDefaultConstructor() {
        Payment p = new Payment();
        assertNull(p.getPaymentId());
        assertNull(p.getRegistrationId());
        assertEquals(0.0, p.getAmount());
        assertNull(p.getPaymentDate());
        assertNull(p.getPaymentStatus());
        assertNull(p.getAccountNo());
        assertNull(p.getTransactionId());
    }

    @Test
    public void testAmountMultiple() {
        Payment p = new Payment();
        p.setAmount(10.0);
        p.setAmount(20.0);
        assertEquals(20.0, p.getAmount());
    }

    @Test
    public void testObjectCreation() {
        Payment p = new Payment();
        assertNotNull(p);
    }
}
