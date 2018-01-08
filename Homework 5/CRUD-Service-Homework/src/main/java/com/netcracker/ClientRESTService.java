package com.netcracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientRESTService {

    @Autowired
    ClientDAO clientDAO;

    public void setClientDAO(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    @GetMapping(value = "/buyer", produces = "application/json")
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> clients = clientDAO.getAllClients();
        if(clients.isEmpty()) {
            return new ResponseEntity<List<Client>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Client>>(clients, HttpStatus.OK);
    }

    @GetMapping(value = "/buyer/{id}", produces = "application/json")
    public ResponseEntity<Client> getClientById(@PathVariable("id") int id) {
        Client client = clientDAO.getClientById(id);
        if(client == null) {
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Client>(client, HttpStatus.OK);
    }

    @PostMapping(value = "/buyer", consumes = "application/json")
    public ResponseEntity<Status> addClient(@RequestBody Client client) {
        clientDAO.addClient(client);
        return new ResponseEntity<Status>(new Status("Client added"),HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/buyer")
    public ResponseEntity<Status> deleteAllClients() {
        clientDAO.deleteAllClients();
        boolean result = clientDAO.getAllClients().isEmpty();
        if (!result) {
            return new ResponseEntity<Status>(new Status("Deleting unsuccessful"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Status>(new Status("All clients deleted"), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(value = "/buyer/{id}")
    public ResponseEntity<Status> deleteClientById(@PathVariable("id") int id) {
        Client client = clientDAO.getClientById(id);
        if (client == null)
            return new ResponseEntity<Status>(new Status("Client deleting unsuccessful"), HttpStatus.NOT_FOUND);
        clientDAO.deleteClientById(id);
        return new ResponseEntity<Status>(new Status("Client deleted"), HttpStatus.NO_CONTENT);
    }
}
