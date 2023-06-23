package com.biblioteca.dot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.biblioteca.dot.model.Genere;
import com.biblioteca.dot.model.Libri;
import com.biblioteca.dot.service.GenereService;
import com.biblioteca.dot.service.LibriService;

@Component
public class BibliotecaDataLoder implements CommandLineRunner{

    @Autowired
    LibriService libriService;

    @Autowired
    GenereService genereService;

    @Override
    public void run(String... args) throws Exception {

        Genere gen1 = new Genere("azione");
        Genere gen2 = new Genere("horror");
        Genere gen3 = new Genere("comico");

        genereService.save(gen1);
        genereService.save(gen2);
        genereService.save(gen3);

        Libri lib1 = new Libri("HarryPotter1", "Jnlo", 17.99, 20, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSnjSNP2-Mb4sDSClSZJZuaOChHGt7TmrWV_lbsjl3N1viZJ4SB", gen1);
        Libri lib2 = new Libri("HarryPotter2", "Jnlo", 17.99, 15, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSnjSNP2-Mb4sDSClSZJZuaOChHGt7TmrWV_lbsjl3N1viZJ4SB", gen2);
        Libri lib3 = new Libri("HarryPotter3", "Jnlo", 17.99, 10, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSnjSNP2-Mb4sDSClSZJZuaOChHGt7TmrWV_lbsjl3N1viZJ4SB", gen3 );

        libriService.save(lib1);
        libriService.save(lib2);
        libriService.save(lib3);
        

    }    
    
}
