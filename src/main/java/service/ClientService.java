package service;

import model.Client;
import org.springframework.stereotype.Service;
import repository.ClientRepository;

@Service
public class ClientService {

    public void saveClient(Client client) {
        validateClient(client);
        ClientRepository clientRepository = new ClientRepository();
        clientRepository.persist(client);
    }

    public void validateClient(Client client) {

    }


}
