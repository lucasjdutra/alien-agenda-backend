package com.alienagenda.controller;

import com.alienagenda.model.Compromisso;
import com.alienagenda.service.CompromissoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compromissos")
@CrossOrigin(origins = "*")
public class CompromissoController {

    @Autowired
    private CompromissoService service;

    @GetMapping
    public List<Compromisso> getAllCompromissos() {
        return service.getAllCompromissos();
    }

    @PostMapping
    public Compromisso addCompromisso(@RequestBody Compromisso compromisso) {
        return service.addCompromisso(compromisso);
    }

    @DeleteMapping("/{id}")
    public void removeCompromisso(@PathVariable int id) {
        service.removeCompromisso(id);
    }
}
