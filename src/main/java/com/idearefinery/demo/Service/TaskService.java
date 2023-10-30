package com.idearefinery.demo.Service;

import com.idearefinery.demo.Model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


@Service
public class TaskService {
    private List<Task> tasks = new ArrayList<>(Arrays.asList(
            new Task("Math", "Math Assignment", false, new Date(), null, 1),
            new Task("English", "English Assignment", false, new Date(), null, 2 )));

    public List<Task> getAllTasks(){
        return tasks;
    }

    public Task getTaskByID(int id){
        return tasks.stream().filter(a -> a.getId() == id).findFirst().get();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void updateTask(Task task, int id) {
        for(int i = 0; i < tasks.size(); i++){
            Task a = tasks.get(i);
            if(a.getId() == id){
                tasks.set(i, task);
                return;
            }
        }
    }
}
