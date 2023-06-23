package com.biblioteca.dot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.dot.model.Libri;

public interface LibriRepository extends JpaRepository<Libri, Long> {
    
}
