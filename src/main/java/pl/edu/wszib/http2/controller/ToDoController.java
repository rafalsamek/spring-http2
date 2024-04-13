package pl.edu.wszib.http2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
        List<ToDo> toDoList = new ArrayList<>();
        for (ToDoStatus status : ToDoStatus.values()) {
            ToDo toDo = new ToDo();
            toDo.setId(status.ordinal());
            toDo.setTermin("2024-05-30");
            toDo.setStatus(status);
            toDo.setZadanie(String.format("Test Todo for status : %s", status));
            toDoList.add(toDo);
        }

        model.addAttribute("todos", toDoList);
        return "todo/list";
    }
}
