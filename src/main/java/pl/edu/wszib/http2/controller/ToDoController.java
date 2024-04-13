package pl.edu.wszib.http2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wszib.http2.service.ToDoService;
import pl.edu.wszib.http2.service.model.ToDo;
import pl.edu.wszib.http2.service.model.ToDoStatus;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todos")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("todos", toDoService.list());
        return "todo/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("newTodo", new ToDo());
        return "todo/create";
    }

    @PostMapping("/create")
    public String createAction(ToDo newTodo, Model model) {
        newTodo.setStatus(ToDoStatus.NEW);
        toDoService.create(newTodo);
        return "redirect:/todos";
    }
}
