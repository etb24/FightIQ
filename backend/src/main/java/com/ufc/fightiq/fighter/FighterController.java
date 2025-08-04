package com.ufc.fightiq.fighter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
            @RequestParam(name = "weight_class", required = false) String weightClass,
            @RequestParam(required = false) String country,
            @PageableDefault(sort = "name", direction = Sort.Direction.ASC) Pageable pageable
    ) {
        return fighterService.getFilteredFighters(name, weightClass, country, pageable);
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
