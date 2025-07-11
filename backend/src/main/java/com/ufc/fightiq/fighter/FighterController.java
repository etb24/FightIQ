package com.ufc.fightiq.fighter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path = "fighters")
public class FighterController {
    private final FighterService fighterService;

    @Autowired
    public FighterController(FighterService fighterService) {
        this.fighterService = fighterService;
    }

    @GetMapping
    public Page<Fighter> getFighters(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String weight_class,
            @RequestParam(required = false) String country,
            @RequestParam int page,
            @RequestParam int size) {

        Pageable pageable = PageRequest.of(page, size);

        if (name != null) {
            return fighterService.getFightersFromName(name, pageable);
        } else if (country != null && weight_class != null) {
            return fighterService.getFightersByCountryAndWeightClass(country, weight_class, pageable);
        } else if (weight_class != null) {
            return fighterService.getFightersFromWeight_class(weight_class, pageable);
        } else if (country != null) {
            return fighterService.getFightersFromCountry(country, pageable);
        } else {
            return fighterService.getFighters(pageable);
        }
    }

    @GetMapping("/countries")
    public Set<String> getAllCountries() {
        return fighterService.getAllCountries();
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
