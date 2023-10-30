package com.idearefinery.demo.Controller;
import com.idearefinery.demo.Model.Task;
import com.idearefinery.demo.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @RequestMapping("/tasks")
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @RequestMapping("/tasks/{id}")
    public Task getTaskByID(@PathVariable int id){
        return taskService.getTaskByID(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/tasks")
    public void addTask(@RequestBody Task task){
        taskService.addTask(task);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/tasks/{id}")
    public void updateTask(@RequestBody Task task, @PathVariable int id){
        taskService.updateTask(task, id);
    }
}

