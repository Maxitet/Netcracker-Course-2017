package com.netcracker;

import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

public interface ClientDAO {

    Client getClientById(int id) throws EmptyResultDataAccessException;
    List<Client> getAllClients();
    boolean addClient(Client client);
    boolean deleteAllClients();
    boolean deleteClientById(int id);
}
