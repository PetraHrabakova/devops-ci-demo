package com.example.devopscidemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.devopscidemo.services.TeamService;
import com.example.devopscidemo.model.Task;

@RestController
public class TeamController {
    private TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/members/{memberId}/tasks/{taskId}")
    public Task getTaskDetails(@PathVariable String memberId,
                               @PathVariable String taskId) {
        return teamService.getTask(memberId, taskId);
    }
}

