package br.com.agsouza.infra;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import br.com.agsouza.app.ClientResponseModel;
import br.com.agsouza.app.IClientPresenter;

public class ClientResponseFormatter implements IClientPresenter {

	@Override
	public ClientResponseModel prepareSuccessView(ClientResponseModel client) {
		LocalDateTime responseTime = LocalDateTime.parse(client.getCreationTime());
		client.setCreationTime(responseTime.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
        return client;
	}

	@Override
	public ClientResponseModel prepareFailView(String error) {
		throw new ResponseStatusException(HttpStatus.CONFLICT, error);
	}

}
