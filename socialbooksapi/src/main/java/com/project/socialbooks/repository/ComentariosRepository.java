package com.project.socialbooks.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.socialbooks.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long>{

}
