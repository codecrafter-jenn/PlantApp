package com.codecrafterjenn.PlantApp.dao;

import com.codecrafterjenn.PlantApp.dao.mapper.PlantMapper;
import com.codecrafterjenn.PlantApp.model.Plant;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JDBCPlantDAO implements PlantDAO{

    private final JdbcTemplate jdbcTemplate;
    private final PlantMapper plantMapper = new PlantMapper();

    public JDBCPlantDAO(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Plant> getPlants() {
        return jdbcTemplate.query("SELECT * FROM plant;", plantMapper);
    }

    public Plant getPlantById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM plant WHERE plant_id = ?", plantMapper, id);
    }

    public Plant createPlant(Plant plant) {
        return null;
    }

    public Plant updatePlant(Plant plant) {
        return null;
    }

    public void deletePlant(int id) {

    }
}
