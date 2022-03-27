package br.com.caelum.vraptor.controller;

import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.interceptor.IncludeParameters;
import br.com.caelum.vraptor.model.Usuario;

@Path("login")
@Controller
public class LoginController {

	@Get("")
	public void login() {
		
	}
	
	@IncludeParameters
	@Post("logar")
	public void logarUsuario(@Valid Usuario usuario, String confirmaSenha) {
		
	}
	
}
