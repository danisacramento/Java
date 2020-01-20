package br.org.generation.webmotors.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.webmotors.bd.BDVeiculo;
import br.org.generation.webmotors.model.Cliente;
import br.org.generation.webmotors.model.Veiculo;

@RestController
public class VeiculoController {

//@GetMapping("/veiculo/teste")
//	public Veiculo testeVeiculo() {
//		Veiculo v = new Veiculo();
//		v.setId(123);
//		v.setMarca("Fiat");
//		v.setModelo("Uno");
//		v.setCor("Vermelho");
//		v.setAno(2020);
//		v.setTipo("esportivo");
//		v.setPreco(11000);
//		v.setDetalhes("Veículo enferrujado" 
//				+ "Motor turbo");
//		
//		return v; 

	private BDVeiculo bd = new BDVeiculo();

	@PostMapping("/veiculo/novo")
	public ResponseEntity<Veiculo> novoVeiculo(@RequestBody Veiculo veiculo) {
		bd.gravar(veiculo);
		return ResponseEntity.ok(veiculo);

	}

	@GetMapping("/veiculo/{id}")
	public ResponseEntity<Veiculo> getVeiculo(@PathVariable int id) {
		Veiculo veic = bd.buscar(id);
		if (veic != null) {// encontrei um veiculo com o ID especificado
			return ResponseEntity.ok(veic);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/veiculo/todos")
	public ResponseEntity<ArrayList<Veiculo>> getTodos() {
		return ResponseEntity.ok(bd.buscarTodos());
	}

	@PutMapping("/veiculo")
	public ResponseEntity<String> alteraVeiculo(@RequestBody Veiculo veiculo){
			bd.atualizar(veiculo);
			return ResponseEntity.ok("Sucess");
	}
	@DeleteMapping("/veiculo/{id}")
	public ResponseEntity<String> removeVeiculo(@PathVariable int id){
		if (bd.apagar(id)) {
			return ResponseEntity.ok("DELETED");
		}
	else {
		return ResponseEntity.notFound().build();
	}
	
}

	}