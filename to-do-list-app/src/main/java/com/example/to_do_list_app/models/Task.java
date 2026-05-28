package com.example.to_do_list_app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Task {
    //Create columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Primary key generated
    
    @NotBlank(message = "Task description cannot be empty")
    @Size(max = 16, message = "Task description total length cannot exceed 16 characters")
    private String task;
    private boolean completed;

    //Create default constructor
    public Task(){
        
    }

    //Create constructor
    public Task(String task, boolean completed){
        this.task = task;
        this.completed = completed;
    }

    //Set ID
    public void setId(Long id){
        this.id = id;
    }

    //Get ID
    public Long getId(){
        return id;
    }

    //Set task
    public void setTask(String task){
        this.task = task;
    }

    //Get task
    public String getTask(){
        return task;
    }

    //Set completion status of task
    public void setCompleted(boolean completed){
        this.completed = completed;
    }

    //Return task completion status
    public boolean isCompleted(){
        return completed;
    }

}
