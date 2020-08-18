package com.ufcg.psoft.estoquefacil.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufcg.psoft.estoquefacil.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	List<Produto> findByCodigoBarra(String codigoBarra);
}
