package net.javaguides.task.dto;

public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private boolean completed;

    public TaskDto(Long id, String description, String title, boolean completed) {
        this.id = id;
        this.description = description;
        this.title = title;
        this.completed = completed;
    }

    public TaskDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
