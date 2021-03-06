package com.taskmanagement.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Task {
    private Integer id;
    private String taskName;
    private Boolean isCompleted;
    private Date dueDate;
    private Integer userId;             // ForeignKey
}
