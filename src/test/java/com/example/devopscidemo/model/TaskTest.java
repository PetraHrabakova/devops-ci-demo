package com.example.devopscidemo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    public void testConstructorAndGetters() {
        Task task = new Task("1", "Test Task", "Description");
        assertEquals("1", task.getId());
        assertEquals("Test Task", task.getName());
        assertEquals("Description", task.getDescription());
    }

    @Test
    public void testSetterMethods() {
        Task task = new Task("1", "Test Task", "Description");
        task.setId("2");
        task.setName("New Task");
        task.setDescription("New Description");

        assertEquals("2", task.getId());
        assertEquals("New Task", task.getName());
        assertEquals("New Description", task.getDescription());
    }

    @Test
    public void testEqualsAndHashCode() {
        Task task1 = new Task("1", "Test Task", "Description");
        Task task2 = new Task("1", "Test Task", "Description");
        Task task3 = new Task("2", "Another Task", "Another Description");

        // Test equality between two tasks with the same ID
        assertTrue(task1.equals(task2));
        assertEquals(task1.hashCode(), task2.hashCode());

        // Test inequality between two tasks with different IDs
        assertFalse(task1.equals(task3));
    }
}
