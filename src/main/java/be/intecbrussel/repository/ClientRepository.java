package be.intecbrussel.repository;

import be.intecbrussel.Client;


public interface ClientRepository {
    //Create & Update
    Client saveClient(Client client);

    //Read
    Client readClient(Integer id);

    //Delete
    boolean deleteClient(Integer id);

    boolean deleteClient(Client client);

}
