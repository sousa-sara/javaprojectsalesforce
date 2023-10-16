package br.com.salesforce.main;
import br.com.salesforce.entreemcontato.EntreEmContato;
import br.com.salesforce.entreemcontato.Telefone;
import br.com.salesforce.login.LoginUsuario;
import br.com.salesforce.testegratis.TelefoneTesteGratis;
import br.com.salesforce.testegratis.UsuarioTesteGratis;

public class TesteSistema {

	public static void main(String[] args) {
		
		//Instanciar objetos
		LoginUsuario objLoginUsuario = new LoginUsuario();
		
		UsuarioTesteGratis objUsuarioTesteGratis = new UsuarioTesteGratis();
		
		TelefoneTesteGratis objTelefoneTesteGratis = new TelefoneTesteGratis();
		
		EntreEmContato objEntreEmContato = new EntreEmContato();
		
		Telefone objTelefone = new Telefone();
		
		//Saídas
		System.out.println(
				//LoginUsuario:
				"LOGIN:\n\nE-mail: " + objLoginUsuario.validarEmail() + "\nSenha: " + objLoginUsuario.validarSenha() +
				//UsuarioTesteGratis
				"\n\nTESTE GRÁTIS:\n\nID: " + objUsuarioTesteGratis.getId() + "\nNome: " + objUsuarioTesteGratis.validarNome() + 
				"\nSobrenome: " + objUsuarioTesteGratis.validarSobrenome() + "\nE-mail: " + objUsuarioTesteGratis.validarEmail() +
				"\nNome da empresa: " + objUsuarioTesteGratis.validarNomeEmpresa() + 
				"\nPorte da empresa: " + objUsuarioTesteGratis.validarPorteEmpresa() +
				"\nPaís: " + objUsuarioTesteGratis.validarPais() + "\nIdioma: " + objUsuarioTesteGratis.validarIdioma() +
				//TelefoneTesteGratis
				"\n\nINFORMAÇÕES DE CONTATO:\n\nCódigo do país: " + objTelefoneTesteGratis.validarCodigoPais() + "\nDDD: " + objTelefoneTesteGratis.validarDDD() +
				"\nNúmero de telefone: " + objTelefoneTesteGratis.validarNumero() +
				//EntreEmContato
				"\n\nENTRE EM CONTATO:\n\nID: " + objEntreEmContato.getId() + "\nNome: " + objEntreEmContato.validarNome() + "\nE-mail: " + objEntreEmContato.validarEmail() +
				//Telefone
				"\n\nINFORMAÇÕES DE CONTATO:\n\nCódigo do país: " + objTelefone.validarCodigoPais() + "\nDDD: " + objTelefone.validarDDD() +
				"\nNúmero de telefone: " + objTelefone.validarNumero()
				);
	}
	
}