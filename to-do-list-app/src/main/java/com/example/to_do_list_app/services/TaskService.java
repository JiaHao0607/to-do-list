package com.example.to_do_list_app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.to_do_list_app.models.Task;
import com.example.to_do_list_app.repositories.TaskRepository;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    //Create new task
    public Task createNewTask(Task task){
        return taskRepository.save(task);
    }
    
    //Get all tasks
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    //Find task by ID
    public Task findTaskById(Long id){
        return taskRepository.getById(id);
    }

    //Find all completed task
    public List<Task> findAllCompletedTask(){
        return taskRepository.findByCompletedTrue();
    }

    //Find all incomplete task
    public List<Task> findAllIncompleteTask(){
        return taskRepository.findByCompletedFalse();
    }

    //Update task
    public Task updateTask(Task task){
        return taskRepository.save(task);
    }
    
    //Delete task
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }

}
