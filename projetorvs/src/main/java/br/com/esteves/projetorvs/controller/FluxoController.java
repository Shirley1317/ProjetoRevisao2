package br.com.esteves.projetorvs.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.esteves.projetorvs.dao.FluxoDao;
import br.com.esteves.projetorvs.model.Fluxo;

@RestController

public class FluxoController {
	@Autowired
	private FluxoDao dao;
	
	@GetMapping ("/fluxo")
	public ArrayList<Fluxo> recuperaFluxo() {
		ArrayList<Fluxo> lista = (ArrayList<Fluxo>)dao.findAll();
		return lista;
	}
}
