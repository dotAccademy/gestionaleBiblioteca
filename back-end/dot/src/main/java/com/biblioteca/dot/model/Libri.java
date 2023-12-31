package com.biblioteca.dot.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor

public class Libri {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String author;
    private Double price;
    private int quantity;
    private String img;
    
    @OneToOne
    @JsonIncludeProperties("id")
    private Genere genre;

    public Libri(String name, String author, Double price, int quantity, String img, Genere genre) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.img = img;
        this.genre = genre;
    }

    



    

    
}
