package com.app.ToDoApp.controller;

import com.app.ToDoApp.model.Task;
import com.app.ToDoApp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String welcome(){

        return "welcome";
    }


    @GetMapping("tasks")
    public String getAllTasks(Model model){
        List<Task> taskList = taskService.getAllTasks();
        model.addAttribute("tasks",taskList);
        return "allTasks";
    }



    @PostMapping("tasks")
    public String createTask(@RequestParam String title){
        taskService.createTask(title);
        return "redirect:/tasks";
    }


    @GetMapping("tasks/{id}/delete")
    public String deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
        return "redirect:/tasks";
    }


    @GetMapping("tasks/{id}/toggle")
    public String toggleTask(@PathVariable Long id){
        taskService.toggleTask(id);
        return "redirect:/tasks";
    }

}
