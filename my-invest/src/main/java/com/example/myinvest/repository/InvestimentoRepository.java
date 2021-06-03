package com.example.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myinvest.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {

}
