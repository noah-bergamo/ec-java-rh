package br.com.fiap.rh;

public interface UsuarioAutenticavel{
	
	boolean autenticar(String senha);
	void setSenha(String senha);

}
