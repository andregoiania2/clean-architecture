package br.com.agsouza.domain;

public interface IClientFactory {
	IClient create(String name, String cpf, String email);
}
