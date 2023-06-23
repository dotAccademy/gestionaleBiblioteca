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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.dot.model.Genere;
import com.biblioteca.dot.service.GenereService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/Genere")
@Slf4j
@CrossOrigin
public class GenereController {

    
    @Autowired
    GenereService genereService;

    
    @GetMapping("/{appID}")
    public ResponseEntity<Genere> findbyid(@PathVariable Long appID) {
        return new ResponseEntity<>(genereService.findByID(appID), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{appID}")
    public ResponseEntity<String> deleteAppartamentiById(@PathVariable Long appID) {
        log.info("chiamata al findAllAppartamenti");
        genereService.deleteByID(appID);
        return new ResponseEntity<>("Cancellato con successo", HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Genere> createGenere(@RequestBody Genere genere) {

        log.info("Chiamata create genere" + genere.toString());

        Genere a = genereService.save(genere);

        return new ResponseEntity<>(a, HttpStatus.CREATED);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Genere> updateGenere(@PathVariable Long id,
            @RequestBody Genere genere) {
        log.info("chiamata create genere" + genere.toString());

        return new ResponseEntity<>(genereService.update(id, genere), HttpStatus.OK);
    }
    
}
