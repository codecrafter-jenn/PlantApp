package com.codecrafterjenn.PlantApp.dao.mapper;

import com.codecrafterjenn.PlantApp.model.Plant;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlantMapper implements RowMapper<Plant> {

    @Override
    public Plant mapRow(ResultSet rs, int rowNum) throws SQLException {
        Plant plant = new Plant();
        plant.setId(rs.getInt("plant_id"));
        plant.setName(rs.getString("name"));
        plant.setFamily(rs.getString("family"));
        plant.setMoisture(rs.getString("moisture"));
        plant.setHumidity(rs.getString("humidity"));
        plant.setLight(rs.getString("light"));

        return plant;
    }
}
