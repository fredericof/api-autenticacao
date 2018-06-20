package com.frederico.api.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frederico.api.model.Autenticacao;

@RestController
@RequestMapping("/v1/public/autenticacao")
public class AutenticacaoResource {

	@PostMapping()
	public ResponseEntity<Boolean> buscarLivros(@RequestBody Autenticacao autenticacao) {
		
		if (autenticacao.getUsuario().equals("frederico") &&
				autenticacao.getSenha().equals("123")) {
			return ResponseEntity.status(HttpStatus.OK)
					.body(new Boolean(true));
		} else {
			return ResponseEntity.status(HttpStatus.OK)
					.body(new Boolean(false)); 
		}
	}
	
}
