package br.com.agsouza.domain;

public class CommonClientFactory implements IClientFactory {

	@Override
	public IClient create(String name, String cpf, String email) {		
		return new CommonClient(name, cpf, email);
	}

}
