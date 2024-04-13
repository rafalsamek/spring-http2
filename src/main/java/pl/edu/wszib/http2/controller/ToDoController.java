package pl.edu.wszib.http2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.edu.wszib.http2.service.ToDoService;
import pl.edu.wszib.http2.service.model.ToDo;
import pl.edu.wszib.http2.service.model.ToDoStatus;

@Controller
@RequestMapping("/todo")
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
        return "redirect:/todo";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam Integer id) {
        toDoService.delete(id);
        return "redirect:/todo";
    }

    @GetMapping("/update")
    public String update(@RequestParam Integer id, Model model) {
        model.addAttribute("todo", toDoService.get(id));
        model.addAttribute("statusList", ToDoStatus.values());
        return "todo/update";
    }

    @PostMapping("/update")
    public String updateAction(ToDo todo, Model model) {
        toDoService.update(todo);
        return "redirect:/todo";
    }
}
