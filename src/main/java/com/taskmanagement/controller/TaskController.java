package com.taskmanagement.controller;

import com.taskmanagement.model.Task;
import com.taskmanagement.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {


    @Autowired
    TaskService taskService;

    @PostMapping("/create")
    public ResponseEntity createTask(){
        var isCreated=taskService.createTask();
        if(isCreated)
            return new ResponseEntity("task created" , HttpStatus.OK);
        return new ResponseEntity("Not Created",HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/fetchAllTask")
    public ResponseEntity<List<Task>> fetchAllTask(){
        var taskList=taskService.fetchAllTask();
        return new ResponseEntity(taskList, HttpStatus.OK);
    }

    @GetMapping("/fetchTask/{taskId}")
    public ResponseEntity fetchAllTask(@PathVariable Integer taskId){

        return null;
    }


}
//http://localhost:8080/task/fetchTask/2


