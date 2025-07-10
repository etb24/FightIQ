package com.ufc.fightiq.fighter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "fighters")
public class FighterController {
    private final FighterService fighterService;

    @Autowired
    public FighterController(FighterService fighterService) {
        this.fighterService = fighterService;
    }

    @GetMapping
    public List<Fighter> getFighters(
        @RequestParam(required = false) String name,
        @RequestParam(required = false) String weight_class,
        @RequestParam(required = false) String country){
        if(name != null){
            return fighterService.getFightersFromName(name);
        } else if(weight_class != null){
            return fighterService.getFightersFromWeight_class(weight_class);
        } else if(country != null){
            return fighterService.getFightersFromCountry(country);
        } else return fighterService.getFighters();
    }

    @PostMapping
    public ResponseEntity<Fighter> addFighter(@RequestBody Fighter fighter){
        Fighter createdFighter = fighterService.addFighter(fighter);
        return new ResponseEntity<>(createdFighter,  HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Fighter> updateFighter(@RequestBody Fighter fighter){
        Fighter resultFighter = fighterService.updateFighter(fighter);
        if (resultFighter != null){
            return new ResponseEntity<>(resultFighter,  HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{fighterName}")
    public ResponseEntity<String> deleteFighter(@RequestParam String fighterName){
        fighterService.deleteFighter(fighterName);
        return new ResponseEntity<>("DELETED",HttpStatus.OK);
    }
}
