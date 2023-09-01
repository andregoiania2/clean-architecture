package br.com.agsouza.app;

public interface IClientRegisterDsGateway {
	boolean existsByName(String identifier);
    void save(ClientDsRequestModel requestModel);
}
