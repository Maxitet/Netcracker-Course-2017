package com.netcracker;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientMapper  implements RowMapper<Client> {

    public Client mapRow(ResultSet resultSet, int i) throws SQLException {

        Client client = new Client();
        client.setId(resultSet.getInt("id"));
        client.setLastName(resultSet.getString("last_name"));
        client.setDistrict(resultSet.getString("district"));
        client.setDiscount(resultSet.getInt("discount"));
        return client;
    }
}
