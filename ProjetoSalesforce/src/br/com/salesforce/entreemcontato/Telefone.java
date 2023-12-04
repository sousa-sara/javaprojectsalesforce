package br.com.salesforce.entreemcontato;

public class Telefone {
	
	//Visibilidade, ipo de dado e nome da variável
	private int codigoPais;
    private String ddd;
    private String numero;
	
    //Método Construtor Vazio
    public Telefone() {
		super();
	}

    //Método Construtor Cheio
	public Telefone(int codigoPais, String ddd, String numero) {
		super();
		this.codigoPais = codigoPais;
		this.ddd = ddd;
		this.numero = numero;
	}

	//Getters & Setters (Entradas e Saídas)
	public int getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(int codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
