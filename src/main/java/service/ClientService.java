package service;

import model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClientRepository;

@Service
public class ClientService {

    private ClientRepository repository;

    @Autowired
    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public void saveClient(Client client) {
        validateClient(client);
        this.repository.persist(client);
    }

    public void validateClient(Client client) {

    }



}
