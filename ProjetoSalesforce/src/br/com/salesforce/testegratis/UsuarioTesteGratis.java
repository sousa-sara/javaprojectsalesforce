package br.com.salesforce.testegratis;
import javax.swing.JOptionPane;


public class UsuarioTesteGratis {
	
	//Visibilidade, tipo de dado e nome da variável
	private long id;
	private String nome;
	private String sobrenome;
	private String email;
	private TelefoneTesteGratis telefone;
	private String nomeEmpresa;
	private int porteEmpresa;
	private String pais;
	private String idioma;
	
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TelefoneTesteGratis getTelefone() {
		return telefone;
	}

	public void setTelefone(TelefoneTesteGratis telefone) {
		this.telefone = telefone;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public int getPorteEmpresa() {
		return porteEmpresa;
	}

	public void setPorteEmpresa(int porteEmpresa) {
		this.porteEmpresa = porteEmpresa;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
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
	
	//Método para validar o atributo "sobrenome" (não obrigatório)
	public String validarSobrenome() {
	        String sobrenome = JOptionPane.showInputDialog("Digite o sobrenome:");
	        if (sobrenome == null) {
	            return null; // O usuário pressionou Cancelar, retornando null
	        }

	        sobrenome = sobrenome.trim(); // Remove espaços em branco no início e no final

			return sobrenome;
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
                // O email não está vazio e está no formato correto (regEx)
                return email;
            }

            if (email.isEmpty()) {
                JOptionPane.showMessageDialog(null, "O campo email não pode estar vazio"); // Exibe uma mensagem de erro
            } else {
                JOptionPane.showMessageDialog(null, "O formato do email inserido não é válido"); // Exibe uma mensagem de erro
            }
        }
    }
    
  //Método para validar o atributo "nomeEmpresa" (não obrigatório)
  	public String validarNomeEmpresa() {
  	        String nomeEmpresa = JOptionPane.showInputDialog("Digite o nome da empresa:");
  	        if (nomeEmpresa == null) {
  	            return null; // O usuário pressionou Cancelar, retornando null
  	        } 

  	        nomeEmpresa = nomeEmpresa.trim(); //Remove espaços em branco no início e no final

  	        return nomeEmpresa; // Retorna o nome da empresa
  	     }
  	    

  	
  	 //Método para validar o atributo "porteEmpresa"
    public String validarPorteEmpresa() {
        while (true) {
            String input = JOptionPane.showInputDialog("Digite o porte da empresa (número de funcionários):");
            if (input == null) {
                return null; // O usuário pressionou Cancelar, retornando null
            }

            try {
                int porteEmpresa = Integer.parseInt(input);

                if (porteEmpresa >= 1 && porteEmpresa <= 50) {
                    return "1-50 funcionários"; // Retorna a faixa de porte correspondente
                } else if (porteEmpresa >= 51 && porteEmpresa <= 300) {
                    return "51-300 funcionários"; // Retorna a faixa de porte correspondente
                } else if (porteEmpresa >= 301 && porteEmpresa <= 1000) {
                    return "301-1000 funcionários"; // Retorna a faixa de porte correspondente
                } else if (porteEmpresa >= 1001 && porteEmpresa <= 2000) {
                    return "1001-2000 funcionários"; // Retorna a faixa de porte correspondente
                } else if (porteEmpresa > 2000) {
                    return "2001+ funcionários"; // Retorna a faixa de porte correspondente
                } else {
                    // Exibe uma mensagem de erro se o valor não estiver dentro das faixas especificadas
                    JOptionPane.showMessageDialog(null, "Porte inválido. Digite um número dentro das faixas especificadas.");
                }
            } catch (NumberFormatException e) {
                // Exibe uma mensagem de erro se o usuário não digitou um número válido
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.");
            }
        }
    }
  	 
     //Método para validar o atributo "pais"
    public String validarPais() {
        String pais = null;
        while (true) {
            pais = JOptionPane.showInputDialog("Digite o país:");
            if (pais == null) {
                return null; // O usuário pressionou Cancelar, retornando null
            }

            pais = pais.trim(); // Remove espaços em branco no início e no final

            if (!pais.isEmpty()) {
                // O país não está vazio, então é válido
                return pais;
            }

            JOptionPane.showMessageDialog(null, "O campo país não pode estar vazio"); // Exibe uma mensagem de erro
        }
    }
     
     //Método para validar o atributo "idioma"
    public String validarIdioma() {
        while (true) {
            String idioma = JOptionPane.showInputDialog("Digite o idioma:");
            if (idioma == null) {
                return null; // O usuário pressionou Cancelar, retornando null
            }

            idioma = idioma.trim(); // Remove espaços em branco no início e no final

            if (!idioma.isEmpty()) {
                // O idioma não está vazio, então é válido
                return idioma;
            }

            JOptionPane.showMessageDialog(null, "O campo idioma não pode estar vazio"); //Exibe uma mensagem de erro
        }
    }
     
}
