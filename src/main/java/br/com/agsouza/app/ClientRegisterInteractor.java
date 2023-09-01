package br.com.agsouza.app;

import java.time.LocalDateTime;

import br.com.agsouza.domain.IClient;
import br.com.agsouza.domain.IClientFactory;

public class ClientRegisterInteractor implements IClientInputBoundary {
	
	final IClientRegisterDsGateway clientDsGateway;
	final IClientPresenter clientPresenter;
	final IClientFactory clientFactory;
	
	public ClientRegisterInteractor(IClientRegisterDsGateway clientDsGateway,
			IClientPresenter clientPresenter,
			IClientFactory clientFactory) {
		this.clientDsGateway=clientDsGateway;
		this.clientPresenter=clientPresenter;
		this.clientFactory=clientFactory;
	}

	@Override
	public ClientResponseModel create(ClientRequestModel requestModel) {
		if (clientDsGateway.existsByName(requestModel.getCpf())) {
			return clientPresenter.prepareFailView("Client already exists.");
		}
		IClient client = clientFactory.create(requestModel.getName(), requestModel.getCpf(), requestModel.getEmail());
		LocalDateTime now = LocalDateTime.now();
		
		ClientDsRequestModel clientDsModel = new ClientDsRequestModel(client.getNome(), client.getCpf(), client.getEmail(), now);
		
		clientDsGateway.save(clientDsModel);
		
		ClientResponseModel response = new ClientResponseModel(client.getNome(), now.toString());
		
		return clientPresenter.prepareSuccessView(response);
	}

}
