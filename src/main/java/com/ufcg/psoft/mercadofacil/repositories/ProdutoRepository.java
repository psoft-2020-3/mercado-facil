package com.ufcg.psoft.mercadofacil.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufcg.psoft.mercadofacil.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	List<Produto> findByCodigoBarra(String codigoBarra);
}
