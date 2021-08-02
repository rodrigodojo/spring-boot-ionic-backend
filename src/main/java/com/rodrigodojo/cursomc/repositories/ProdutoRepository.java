package com.rodrigodojo.cursomc.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigodojo.cursomc.domain.Produto;
import com.rodrigodojo.cursomc.domain.Categoria;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	Page<Produto> search(String nome ,List<Categoria> categorias , Pageable pageRequest);
}
