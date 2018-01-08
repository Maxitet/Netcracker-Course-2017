package com.netcracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class ClientDAOImpl implements ClientDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Client getClientById(int id) throws EmptyResultDataAccessException {
        String sql = "SELECT * FROM clients WHERE id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{id}, new ClientMapper());
        }
        catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    public List<Client> getAllClients() {
        String sql = "SELECT * FROM clients";
        return namedParameterJdbcTemplate.query(sql, new ClientMapper());
    }

    public boolean addClient(Client client) {
        String lastName = client.getLastName();
        String district = client.getDistrict();
        Integer discount = client.getDiscount();

        String sql = "INSERT INTO clients (last_name, district, discount) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, lastName, district, discount);
        return true;
        //return new Status("Client added");
    }

    public boolean deleteAllClients() {
        String sql = "DELETE FROM clients";
        jdbcTemplate.update(sql);
        return true;
        //return new Status("ALL CLIENTS DELETED!");
    }

    public boolean deleteClientById(int id) {
        String sql = "DELETE FROM clients WHERE id = ?";
        jdbcTemplate.update(sql, id);
        return true;
        //return new Status("Client deleted");
    }
}


