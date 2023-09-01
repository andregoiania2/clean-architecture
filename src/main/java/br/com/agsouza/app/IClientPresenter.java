package br.com.agsouza.app;

public interface IClientPresenter {
    ClientResponseModel prepareSuccessView(ClientResponseModel client);

    ClientResponseModel prepareFailView(String error);
}
