package com.codecrafterjenn.PlantApp.service;

import com.codecrafterjenn.PlantApp.dao.PlantDAO;
import com.codecrafterjenn.PlantApp.model.Plant;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlantService {
    private final PlantDAO plantDAO;

    public PlantService(PlantDAO plantDAO){
        this.plantDAO = plantDAO;
    }

    public List<Plant> getPlants(){
        return plantDAO.getPlants();
    }

    public Plant getPlantById(int id){
        return plantDAO.getPlantById(id);
    }
}
