package br.com.agsouza.infra;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.agsouza.app.ClientRequestModel;
import br.com.agsouza.app.ClientResponseModel;
import br.com.agsouza.app.IClientInputBoundary;

@RestController
public class ClientRegisterController {

	final IClientInputBoundary clientInput;
	
	ClientRegisterController(IClientInputBoundary clientInput) {
		this.clientInput=clientInput;
	}
	
	@PostMapping("/client")
	ClientResponseModel create(@RequestBody ClientRequestModel requestModel) {
		return clientInput.create(requestModel);
	}
	
}
