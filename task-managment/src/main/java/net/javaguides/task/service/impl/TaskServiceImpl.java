package net.javaguides.task.service.impl;

import net.javaguides.task.dto.TaskDto;
import net.javaguides.task.entity.Task;
import net.javaguides.task.repository.TaskRepository;
import net.javaguides.task.service.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public TaskDto addtask(TaskDto taskDto) {
        Task task=new Task();
        task.setTitle(taskDto.getTitle());
        task.setDescription((taskDto.getDescription()));
        task.setCompleted((taskDto.isCompleted()));
        Task saveTask=taskRepository.save(task);

        TaskDto saveTaskDto=new TaskDto();
        saveTaskDto.setId(saveTask.getId());
        saveTaskDto.setTitle(saveTaskDto.getTitle());
        saveTaskDto.setDescription(saveTaskDto.getDescription());
        saveTaskDto.setCompleted(saveTask.isCompleted());
        return saveTaskDto;



    }
}
