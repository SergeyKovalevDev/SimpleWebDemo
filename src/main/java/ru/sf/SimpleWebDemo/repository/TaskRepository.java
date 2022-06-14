package ru.sf.SimpleWebDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sf.SimpleWebDemo.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}