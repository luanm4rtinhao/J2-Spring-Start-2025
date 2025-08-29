package application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import application.model.Tarefa;

@Controller
@RequestMapping("/tarefas")
public class TarefaController {
    private List<Tarefa> tarefas = new ArrayList<Tarefa>();

    @RequestMapping("/list")
    public String list(Model ui) {
        return "list";
    }
}

