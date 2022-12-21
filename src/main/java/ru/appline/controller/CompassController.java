package ru.appline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.appline.logic.Compass;
import ru.appline.logic.CompassModel;

import java.util.Map;

@RestController
public class CompassController {

    private static final CompassModel compassModel = CompassModel.getInstance();


    @PostMapping(value = "/createComp", consumes = "application/json")
    public void createComp(@RequestBody Compass compass) {
        compassModel.add(compass);
    }

    @GetMapping(value = "/getComp", produces = "application/json")
    public Map<String, Compass> getComp() {
        return compassModel.getFromList();
    }
    @GetMapping(value = "/getSide", consumes = "application/json", produces = "application/json")
    public Map<String,String> getSide(@RequestBody Map<String, Integer> degree) {
        return compassModel.getSide(degree.get("degree"));
    }
}


/*
{
    "north": "338-23",
    "northEast" : "24-67",
    "east":  "68-112",
    "southEast" : "113-157",
    "south": "158-202",
    "southWest" : "203-247",
    "west": "248-292",
    "northWest": "293-337"
}

*/