package br.com.agsouza.app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class ClientResponseModel {
	String name;
	@Setter
    String creationTime;
}
