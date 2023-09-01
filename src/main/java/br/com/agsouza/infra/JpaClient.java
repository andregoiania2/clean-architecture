package br.com.agsouza.infra;

import br.com.agsouza.app.ClientDsRequestModel;
import br.com.agsouza.app.IClientRegisterDsGateway;

public class JpaClient implements IClientRegisterDsGateway {

	final JpaClientRepository repository;
	
	public JpaClient(JpaClientRepository repository) {
		this.repository=repository;
	}	
	
	@Override
	public boolean existsByName(String identifier) {		
		return repository.existsById(identifier);
	}

	@Override
	public void save(ClientDsRequestModel requestModel) {
		ClientDataMapper clientDataMapper = new ClientDataMapper(requestModel.getNome(), requestModel.getCpf(), requestModel.getEmail(), requestModel.getCreationTime());
		repository.save(clientDataMapper);
	}
}
