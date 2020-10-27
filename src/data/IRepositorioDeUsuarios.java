package data;

import model.Usuario;

public interface IRepositorioDeUsuarios {

	void incluirUsuario(Usuario user);

	void procurarUsuario(String cpf);

	void excluirUsuario(String cpf);

	void listarUsuarios();

	boolean editarUsuario(String nome, String sobrenome, String cpf, int telefone);
}
