package net.javaguides.task.controller;

import net.javaguides.task.dto.TaskDto;
import net.javaguides.task.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @PostMapping
    public ResponseEntity<TaskDto> addTask(@RequestBody TaskDto taskDto){
        TaskDto savedTask = taskService.addtask(taskDto);
        return new ResponseEntity<>(savedTask, HttpStatus.CREATED);
    }
}
