package com.felipelleal.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipelleal.cursomc.domain.Endereco;
import com.felipelleal.cursomc.repositories.EnderecoRepository;
import com.felipelleal.cursomc.services.exception.ObjectNotFoundException;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository repo;
	
	public Endereco find(Integer id) {
		Optional<Endereco> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + id + ", Tipo: "+ Endereco.class.getName()));
	}
}
