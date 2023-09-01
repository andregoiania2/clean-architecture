package br.com.agsouza.domain;

public class CommonClient implements IClient {

	private String nome;
	private String cpf;
	private String email;
	
	public CommonClient() {
		
	}
	
	public CommonClient(String nome, String cpf, String email) {
		super();
		this.nome = nome;
		setCpf(cpf);
		setEmail(email);		
	}

	@Override
	public String getNome() {		
		return this.nome;
	}

	@Override
	public String getCpf() {
		return this.cpf;
	}

	@Override
	public String getEmail() {
		return this.email;
	}
	
	private void setCpf(String cpf) {
		if (cpf == null || 
				!cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
			throw new IllegalArgumentException("CPF invalido!");
		}
		this.cpf = cpf;
	}
	
	private void setEmail(String email) {
		if (email == null || 
				!email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("E-mail invalido!");
		}

		this.email = email;
	}

}
