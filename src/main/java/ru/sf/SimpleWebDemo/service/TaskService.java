package ru.sf.SimpleWebDemo.service;

import ru.sf.SimpleWebDemo.entity.Task;

import java.util.List;

public interface TaskService {
    public List<Task> getAll();
    public Task save(Task task);
    public void delete(int id);
}
