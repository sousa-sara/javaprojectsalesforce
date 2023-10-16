package br.com.salesforce.entreemcontato;
import javax.swing.JOptionPane;

public class EntreEmContato {

	//Visibilidade, tipo de dado e nome da variável
	private long id;
	private String nome;
	private String email;
	private Telefone telefone;

	//Getters & setters (entradas e saídas)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	//Método para validar o atributo "nome"
		public String validarNome() {
		    while (true) {
		        String nome = JOptionPane.showInputDialog("Digite o nome:");
		        if (nome == null) {
		            return null; // O usuário pressionou Cancelar, retornando null
		        }

		        nome = nome.trim(); // Remove espaços em branco no início e no final

		        if (!nome.isEmpty()) {
		            // O nome não está vazio, então é válido
		            return nome;
		        }

		        JOptionPane.showMessageDialog(null, "O campo nome não pode estar vazio"); // Exibe uma mensagem de erro
		    }
		}
    

    //Verificando se o email possui um formato válido 
	    public String validarEmail() {
	        while (true) {
	            String email = JOptionPane.showInputDialog("Digite o email:");
	            if (email == null) {
	                return null; // O usuário pressionou Cancelar, retornando null
	            }

	            email = email.trim(); // Remove espaços em branco no início e no final

	            if (!email.isEmpty() && email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}")) {
	                // O email não está vazio e está no formato correto
	                return email;
	            }

	            if (email.isEmpty()) {
	                JOptionPane.showMessageDialog(null, "O campo email não pode estar vazio"); // Exibe uma mensagem de erro
	            } else {
	                JOptionPane.showMessageDialog(null, "O email inserido não é válido"); // Exibe uma mensagem de erro
	            }
	        }
	    }
}
