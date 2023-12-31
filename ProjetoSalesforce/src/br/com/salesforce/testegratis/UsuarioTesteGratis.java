package br.com.salesforce.testegratis;

public class UsuarioTesteGratis {
	
	//Visibilidade, ipo de dado e nome da variável
	private long id;
    private String nome;
    private String sobrenome;
    private String email;
    private int codigoPais;
    private String ddd;
    private String numero;
    private String nomeEmpresa;
    private int porteEmpresa;
    private String pais;
    private String idioma;
	
    //Método Construtor Vazio
    public UsuarioTesteGratis() {
		super();
	}

  //Método Construtor Cheio
	public UsuarioTesteGratis(long id, String nome, String sobrenome, String email, int codigoPais, String ddd,
			String numero, String nomeEmpresa, int porteEmpresa, String pais, String idioma) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.codigoPais = codigoPais;
		this.ddd = ddd;
		this.numero = numero;
		this.nomeEmpresa = nomeEmpresa;
		this.porteEmpresa = porteEmpresa;
		this.pais = pais;
		this.idioma = idioma;
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
}


