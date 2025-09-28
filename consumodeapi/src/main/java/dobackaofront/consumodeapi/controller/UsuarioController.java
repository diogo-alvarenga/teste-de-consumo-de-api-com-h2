package dobackaofront.consumodeapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dobackaofront.consumodeapi.entity.Usuario;
import dobackaofront.consumodeapi.service.UsuarioService;

@RestController
@RequestMapping("usuario")//rota do controller
public class UsuarioController {
	
	private UsuarioService usuarioService;
	
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@PostMapping
	public void salvar(@RequestBody Usuario usuario) {
		usuarioService.salvar(usuario);
	}
	
	@GetMapping
	public List<Usuario> buscarTodosOsCadastros() {
		return usuarioService.buscarTodos();
	}
	
	@GetMapping("{id}")
	public Usuario buscarPorId(@PathVariable Integer id) {
		return usuarioService.buscarPorId(id);
	}
}
