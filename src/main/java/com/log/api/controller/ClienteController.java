package com.log.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.log.api.domain.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente c1 = new Cliente();
		c1.setId(1L);
		c1.setNome("Higor");
		c1.setTelefone("21 9719596936");
		c1.setEmail("teste@teste.com.br");

		Cliente c2 = new Cliente();
		c2.setId(2L);
		c2.setNome("Yuri3");
		c2.setTelefone("21 97192112");
		c2.setEmail("teste2@teste.com.br");

		return Arrays.asList(c1, c2);

	}
}
