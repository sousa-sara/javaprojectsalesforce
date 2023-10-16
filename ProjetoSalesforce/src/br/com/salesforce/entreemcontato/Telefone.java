package br.com.salesforce.entreemcontato;
import javax.swing.JOptionPane;

public class Telefone {

	//Visibilidade, tipo de dado e nome da variável
	private int codigoPais;
	private int ddd;
	private String numero;

	//Getters & setters (entradas e saídas)
	public int getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(int codigoPais) {
		this.codigoPais = codigoPais;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	//Método para validar o atributo "codigoPais"
		public int validarCodigoPais() {
		    while (true) {
		        String input = JOptionPane.showInputDialog("Digite o código do país (entre 1 e 999):");
		        if (input == null) {
		            return -1; //O usuário pressionou Cancelar, retornando -1 ou outro valor que indique cancelamento
		        }

		        try {
		            int codigoPais = Integer.parseInt(input);

		            if (codigoPais >= 1 && codigoPais <= 999) {
		                // O código do país está dentro do intervalo válido
		                return codigoPais;
		            } else {
		                JOptionPane.showMessageDialog(null, "Código do país fora do intervalo válido (1 a 999).");
		            }
		        } catch (NumberFormatException e) {
		            JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.");
		        }
		    }
		}
	    
	    //Método para validar o atributo "ddd"
		public String validarDDD() {
		    while (true) {
		        String input = JOptionPane.showInputDialog("Digite o DDD (três dígitos):");
		        if (input == null) {
		            return null; //O usuário pressionou Cancelar, retornando null
		        }

		        input = input.trim(); //Remove espaços em branco no início e no final

		        if (input.length() == 3 && input.matches("\\d+")) {
		            //O DDD possui três dígitos e são todos dígitos numéricos
		            return input;
		        }

		        JOptionPane.showMessageDialog(null, "Formato inválido. Digite um DDD com três dígitos numéricos.");
		    }
		}
	    
	    //Método para validar o atributo "numero"
		public String validarNumero() {
		    while (true) {
		        String input = JOptionPane.showInputDialog("Digite o número (pelo menos 8 dígitos):");
		        if (input == null) {
		            return null; //O usuário pressionou Cancelar, retornando null
		        }

		        input = input.trim(); //Remove espaços em branco no início e no final

		        if (input.length() >= 8 && input.matches("\\d+")) {
		            //O número possui pelo menos 8 dígitos e são todos dígitos numéricos
		            return input;
		        }

		        JOptionPane.showMessageDialog(null, "Formato inválido. Digite um número com pelo menos 8 dígitos numéricos.");
		    }
		}
	    
	}