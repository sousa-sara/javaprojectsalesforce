package br.com.salesforce.entreemcontato;

public class EntreEmContato {
	
	//Visibilidade, ipo de dado e nome da variável
	private long id;
    private String nome;
    private String email;
    private Telefone telefone;
	
    //Método Construtor Vazio
    public EntreEmContato() {
		super();
	}

    //Método Construtor Cheio
	public EntreEmContato(long id, String nome, String email, Telefone telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	//Getters & Setters (Entradas e Saídas)
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
	
}
