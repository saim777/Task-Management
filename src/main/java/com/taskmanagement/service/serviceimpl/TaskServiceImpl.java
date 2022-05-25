package com.taskmanagement.service.serviceimpl;

import com.taskmanagement.model.Task;
import com.taskmanagement.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {


      public List<Task> taskList=null;
      TaskServiceImpl(){
          taskList=new ArrayList<>();
          taskList.add(new Task(1,"Homework",false,new Date(),12));
          taskList.add(new Task(2,"Coding",false,new Date(),13));
          taskList.add(new Task(3,"Sports",false,new Date(),12));
      }


    @Override
    public boolean createTask() {
        return createTaskLogic();
    }

    private boolean createTaskLogic() {
          int initialSize=taskList.size();
          taskList.add(new Task(4,"classwork",false,new Date(),13));
          if(taskList.size()==initialSize+1){
              return true;
          }
          return false;
    }

    @Override
    public List<Task> fetchAllTask() {
        return getAllTask();
    }

    private List<Task> getAllTask() {
        return taskList;
    }

    @Override
    public Task fetchTaskById() {
        return null;
    }
}
