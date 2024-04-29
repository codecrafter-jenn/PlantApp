package com.codecrafterjenn.PlantApp.dao;

import com.codecrafterjenn.PlantApp.model.Plant;

import java.util.List;

public interface PlantDAO {

    List<Plant> getPlants();

    Plant getPlantById(int id);

    Plant createPlant(Plant plant);

    Plant updatePlant(Plant plant);

    void deletePlant(int id);

}
