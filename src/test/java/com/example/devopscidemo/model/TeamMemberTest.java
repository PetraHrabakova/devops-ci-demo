package com.example.devopscidemo.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class TeamMemberTest {
    @Test
    public void constructor_TeamMemberWithValidArguments_CorrectAttributes() {
        // Arrange
        String id = "1";
        String name = "John Doe";
        String email = "john.doe@example.com";
        List<Task> tasks = new ArrayList<>();

        // Act
        TeamMember teamMember = new TeamMember(id, name, email, tasks);

        // Assert
        assertEquals(id, teamMember.getId());
        assertEquals(name, teamMember.getName());
        assertEquals(email, teamMember.getEmail());
        assertEquals(tasks, teamMember.getTasks());
    }

    @Test
    public void setId_ValidId_TeamMemberIdUpdated() {
        // Arrange
        TeamMember teamMember = new TeamMember("1", "John Doe", "john.doe@example.com", new ArrayList<>());
        String newId = "2";

        // Act
        teamMember.setId(newId);

        // Assert
        assertEquals(newId, teamMember.getId());
    }

    @Test
    public void setName_ValidName_TeamMemberNameUpdated() {
        // Arrange
        TeamMember teamMember = new TeamMember("1", "John Doe", "john.doe@example.com", new ArrayList<>());
        String newName = "Jane Doe";

        // Act
        teamMember.setName(newName);

        // Assert
        assertEquals(newName, teamMember.getName());
    }

    @Test
    public void setEmail_ValidEmail_TeamMemberEmailUpdated() {
        // Arrange
        TeamMember teamMember = new TeamMember("1", "John Doe", "john.doe@example.com", new ArrayList<>());
        String newEmail = "jane.doe@example.com";

        // Act
        teamMember.setEmail(newEmail);

        // Assert
        assertEquals(newEmail, teamMember.getEmail());
    }

    @Test
    public void setTasks_ValidTasks_TeamMemberTasksUpdated() {
        // Arrange
        TeamMember teamMember = new TeamMember("1", "John Doe", "john.doe@example.com", new ArrayList<>());
        List<Task> newTasks = new ArrayList<>();
        Task task1 = new Task("1", "Task 1", "Description 1");
        Task task2 = new Task("2", "Task 2", "Description 2");
        newTasks.add(task1);
        newTasks.add(task2);

        // Act
        teamMember.setTasks(newTasks);

        // Assert
        assertEquals(newTasks, teamMember.getTasks());
    }

    @Test
    public void toString_ReturnsFormattedString() {
        // Arrange
        TeamMember teamMember = new TeamMember("1", "John Doe", "john.doe@example.com", new ArrayList<>());
        String expectedString = "TeamMember{id='1', name='John Doe', email='john.doe@example.com'}";

        // Act
        String result = teamMember.toString();

        // Assert
        assertEquals(expectedString, result);
    }
}
