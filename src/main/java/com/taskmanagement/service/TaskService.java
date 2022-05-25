package com.taskmanagement.service;

import com.taskmanagement.model.Task;

import java.util.List;

public interface TaskService {
    boolean createTask();
    List<Task> fetchAllTask();
    Task fetchTaskById();

}
