package com.biblioteca.dot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.dot.model.Libri;
import com.biblioteca.dot.repository.LibriRepository;
@Service

public class LibriService {
    @Autowired
    private LibriRepository libriRepository;

    
    public List<Libri> findAll() {
        return libriRepository.findAll();
    }

    public Libri findByID(Long id) {
        Optional<Libri> appOpt = libriRepository.findById(id);

        if (appOpt.isPresent())
            return appOpt.get();

        return null;
    }

    public Libri save(Libri libri) {
        return libriRepository.save(libri);
    }

    public void deleteByID(Long id) {
        libriRepository.deleteById(id);
    }
    
    
    public Libri update(Long id, Libri newlib) {
        Libri lib = findByID(id);

        if (lib == null)
            return null;

        lib.setName(newlib.getName());
        lib.setAuthor(newlib.getAuthor());
        lib.setPrice(newlib.getPrice());
        lib.setQuantity(newlib.getQuantity());
        lib.setImg(newlib.getImg());
        lib.setGenre(newlib.getGenre());

        return libriRepository.save(lib);
    }


}
