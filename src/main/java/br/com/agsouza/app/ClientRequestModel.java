package br.com.agsouza.app;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ClientRequestModel {
	String name;
	String cpf;
	String email;
}
