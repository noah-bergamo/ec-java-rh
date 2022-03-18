package br.com.fiap.rh;

public class Cliente implements UsuarioAutenticavel{

	private String senha;

	@Override
	public boolean autenticar(String senha) {
		return  this.senha == senha;
	}

	@Override
	public void setSenha(String senha) {
		// TODO Auto-generated method stub
		this.senha = senha;
	}

}
