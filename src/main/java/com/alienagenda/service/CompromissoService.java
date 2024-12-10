package com.alienagenda.service;

import com.alienagenda.model.Compromisso;
import com.alienagenda.repository.CompromissoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompromissoService {

    @Autowired
    private CompromissoRepository repository;

    public List<Compromisso> getAllCompromissos() {
        return repository.findAll();
    }

    public Compromisso addCompromisso(Compromisso compromisso) {
        return repository.save(compromisso);
    }

    public void removeCompromisso(int id) {
        repository.deleteById(id);
    }
}
