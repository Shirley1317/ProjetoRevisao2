package br.com.esteves.projetorvs.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.esteves.projetorvs.dao.CorrentistaDao;
import br.com.esteves.projetorvs.model.Correntista;

@RestController

public class CorrentistaController {

	@Autowired
	private CorrentistaDao dao;
	
	@GetMapping ("/correntista")
	
	public ArrayList<Correntista> recuperaCorrentista() {
		ArrayList<Correntista> lista = (ArrayList<Correntista>)dao.findAll();
		return lista;
	}
	
	
}
