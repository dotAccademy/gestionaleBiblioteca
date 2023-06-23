package com.biblioteca.dot.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.biblioteca.dot.model.Genere;
import com.biblioteca.dot.repository.GenereRepository;


public class GenereService {
    @Autowired
    private GenereRepository genereRepository;

    
    public List<Genere> findAll() {
        return genereRepository.findAll();
    }

    public Genere findByID(Long id) {
        Optional<Genere> appOpt = genereRepository.findById(id);

        if (appOpt.isPresent())
            return appOpt.get();

        return null;
    }

    public Genere save(Genere genere) {
        return genereRepository.save(genere);
    }

    public void deleteByID(Long id) {
        genereRepository.deleteById(id);
    }
    
    
    public Genere update(Long id, Genere newlib) {
        Genere lib = findByID(id);

        if (lib == null)
            return null;

        lib.setName(newlib.getName());
        return genereRepository.save(lib);
    }


}
