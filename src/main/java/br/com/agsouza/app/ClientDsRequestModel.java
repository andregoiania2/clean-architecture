package br.com.agsouza.app;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ClientDsRequestModel {
	String nome;
	String cpf;
	String email;
	LocalDateTime creationTime;
}
