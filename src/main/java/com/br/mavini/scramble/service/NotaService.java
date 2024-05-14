package com.br.mavini.scramble.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.mavini.scramble.model.Nota;
import com.br.mavini.scramble.repository.NotaRepository;

@Service
public class NotaService {

	@Autowired
	NotaRepository notaRepository;
	
	public Nota save(Nota nota) {
		return notaRepository.save(nota);
	}
	
}
