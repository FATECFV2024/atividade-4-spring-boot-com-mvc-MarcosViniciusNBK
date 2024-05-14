package com.br.mavini.scramble.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.mavini.scramble.model.Aluno;
import com.br.mavini.scramble.model.Nota;

@Repository
public interface NotaRepository extends JpaRepository<Nota, UUID>{
	
	List<Nota> findByDeletedFalseOrderByCreationDate();

	
}
