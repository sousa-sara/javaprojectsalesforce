package br.com.salesforce.login;

import javax.swing.JOptionPane;

public class LoginUsuario {

	//Visibilidade, tipo de dado e nome da variável
	private String email;
	private String senha;

	//Getters & setters (entradas e saídas)
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
	
	//Verificando se o email possui um formato válido 
    public String validarEmail() {
        while (true) {
            String email = JOptionPane.showInputDialog("Digite o email:");
            if (email == null) {
                return null; //O usuário pressionou Cancelar, retornando null
            }

            email = email.trim(); //Remove espaços em branco no início e no final

            if (!email.isEmpty() && email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}")) {
                //O email não está vazio e está no formato correto (regEx)
                return email;
            }

            if (email.isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo email não pode estar vazio"); //Exibe uma mensagem de erro
            } else {
                JOptionPane.showMessageDialog(null, "O formato do email inserido não é válido"); //Exibe uma mensagem de erro
            }
        }
    }
	 
	//Método para validar o atributo "senha"
    public boolean validarSenha() {
        while (true) {
            String senha = JOptionPane.showInputDialog("Digite a senha (pelo menos 8 caracteres):");
            if (senha == null) {
                return false; //O usuário pressionou Cancelar, retornando false
            }

            senha = senha.trim(); // Remove espaços em branco no início e no final

            if (senha.length() >= 8) {
                // A senha possui pelo menos 8 caracteres, é considerada válida
                return true;
            }

            JOptionPane.showMessageDialog(null, "Senha inválida. Digite uma senha com pelo menos 8 caracteres.");
        }
    }
	 
}
