package com.project.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long>{

}
