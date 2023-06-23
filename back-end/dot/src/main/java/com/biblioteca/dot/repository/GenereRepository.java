package com.biblioteca.dot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.dot.model.Genere;

public interface GenereRepository extends JpaRepository<Genere, Long>  {
    
}
