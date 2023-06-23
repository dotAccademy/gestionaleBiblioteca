package com.biblioteca.dot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.biblioteca.dot.model.Libri;

import com.biblioteca.dot.service.LibriService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/Libri")
@Slf4j
@CrossOrigin
public class LibriController {
 
    @Autowired
    LibriService libriService;

    @GetMapping("/all")
    public ResponseEntity<List<Libri>> findAllLibri() {
        log.info("chiamata al findAllLibri");
        return new ResponseEntity<>(libriService.findAll(), HttpStatus.OK);
    }

    
    @GetMapping("/{appID}")
    public ResponseEntity<Libri> findbyid(@PathVariable Long appID) {
        return new ResponseEntity<>(libriService.findByID(appID), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{appID}")
    public ResponseEntity<String> deleteAppartamentiById(@PathVariable Long appID) {
        log.info("chiamata al findAllAppartamenti");
        libriService.deleteByID(appID);
        return new ResponseEntity<>("Cancellato con successo", HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Libri> createLibri(@RequestBody Libri libri) {

        log.info("Chiamata create libri" + libri.toString());

        Libri a = libriService.save(libri);

        return new ResponseEntity<>(a, HttpStatus.CREATED);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Libri> updateLibri(@PathVariable Long id,
            @RequestBody Libri libri) {
        log.info("chiamata create libri" + libri.toString());

        return new ResponseEntity<>(libriService.update(id, libri), HttpStatus.OK);
    }
}
