package com.ufcg.psoft.estoquefacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufcg.psoft.estoquefacil.model.Lote;

public interface LoteRepository extends JpaRepository<Lote, Long>{
}