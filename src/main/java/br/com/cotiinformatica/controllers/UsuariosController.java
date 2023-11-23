package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.AutenticarUsuarioReponseDto;
import br.com.cotiinformatica.dtos.AutenticarUsuarioRequestDto;
import br.com.cotiinformatica.dtos.CriarUsuarioReponseDto;
import br.com.cotiinformatica.dtos.CriarUsuarioRequestDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController {
	@PostMapping("criar")
	public CriarUsuarioReponseDto criar(@RequestBody @Valid CriarUsuarioRequestDto request) {
		// TODO
		return null;
	}

	@PostMapping("autenticar")
	public AutenticarUsuarioReponseDto Autenticar(@RequestBody @Valid AutenticarUsuarioRequestDto request) {
		// TODO
		return null;
	}

}
