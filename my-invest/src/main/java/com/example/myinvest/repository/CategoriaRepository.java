package com.example.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myinvest.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
