package br.com.caelum.vraptor.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Usuario extends Model{

	@NotEmpty(message = "{usuario.nome.embranco}") @Size(min = 4, max = 20, message = "{usuario.nome.size}")
	private String nome;
	
	@NotEmpty(message = "{usuario.email.embranco}") @Email
	private String email;
	
	@NotEmpty(message = "{usuario.senha.embranco}") @Size(min = 6, max = 20, message="{usuario.senha.size}")
	private String senha;
	
	@NotNull(message = "{usuario.confirmaSenha.embranco}") @Size(min = 6, max = 20, message="{usuario.confirmaSenha.size}")
	private String confirmaSenha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getConfirmaSenha() {
		return confirmaSenha;
	}
	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}
	
	public boolean vericaSenhas(){
		
		boolean verifica = this.confirmaSenha.equals(this.senha);
		if(verifica == true) {
			return true;
		}
		else {
			return false;
		}
	}

}
