package br.com.agsouza.infra;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaClientRepository extends JpaRepository<ClientDataMapper, String> {

}
