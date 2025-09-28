package dobackaofront.consumodeapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dobackaofront.consumodeapi.entity.Usuario;
import dobackaofront.consumodeapi.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	private UsuarioRepository usuarioRepository;
	
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	public void salvar(Usuario usuario) {
		usuarioRepository.save(usuario);	
	}
	
	public Usuario buscarPorId(Integer id) {
		return usuarioRepository.findById(id).orElse(null);
	}
	
	public List<Usuario> buscarTodos(){
		return usuarioRepository.findAll();
	}
	
	
}
