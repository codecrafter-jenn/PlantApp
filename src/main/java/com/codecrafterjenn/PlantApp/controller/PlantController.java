package com.codecrafterjenn.PlantApp.controller;

import com.codecrafterjenn.PlantApp.model.Plant;
import com.codecrafterjenn.PlantApp.service.PlantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plants")
public class PlantController {
    private final PlantService plantService;

    public PlantController(PlantService plantService){
        this.plantService = plantService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Plant> list() {
        return plantService.getPlants();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Plant getPlantById(@PathVariable Integer id){
        return plantService.getPlantById(id);
    }

}
