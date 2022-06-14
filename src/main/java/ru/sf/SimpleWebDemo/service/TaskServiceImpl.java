package ru.sf.SimpleWebDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.sf.SimpleWebDemo.entity.Task;
import ru.sf.SimpleWebDemo.repository.TaskRepository;

import javax.persistence.Table;
import java.util.List;

@Service
//@Table(name = "TASKS")
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void delete(int id) {
        taskRepository.deleteById(id);
    }
}