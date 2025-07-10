package com.ufc.fightiq.fighter;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class FighterService {
    private final FighterRepository fighterRepository;

    @Autowired
    public FighterService(FighterRepository fighterRepository) {
        this.fighterRepository = fighterRepository;
    }

    public List<Fighter> getFighters() {
        return fighterRepository.findAll();
    }

    public List<Fighter> getFightersFromCountry(String country){
        return fighterRepository.findAll().stream().filter(fighter -> country.equalsIgnoreCase(fighter.getCountry())).collect(Collectors.toList());
    }

    public List<Fighter> getFightersFromWeight_class(String weight_class){
        return fighterRepository.findAll().stream().filter(fighter -> weight_class.equalsIgnoreCase(fighter.getWeight_class())).collect(Collectors.toList());
    }

    public List<Fighter> getFightersFromName(String search_text){
        return fighterRepository.findAll().stream().filter(fighter -> fighter.getName().toLowerCase().contains(search_text.toLowerCase())).collect(Collectors.toList());
    }

    public Fighter addFighter(Fighter fighter){
        return fighterRepository.save(fighter);
    }

    public Fighter updateFighter(Fighter updatedFighter){
        Optional<Fighter> existingFighter = fighterRepository.findByName(updatedFighter.getName());
        if(existingFighter.isPresent()){
            Fighter fighterToUpdate = existingFighter.get();
            fighterToUpdate.setName(updatedFighter.getName());
            fighterToUpdate.setCountry(updatedFighter.getCountry());
            fighterToUpdate.setWeight_class(updatedFighter.getWeight_class());
            fighterToUpdate.setWins(updatedFighter.getWins());
            fighterToUpdate.setDraws(updatedFighter.getDraws());
            fighterToUpdate.setLosses(updatedFighter.getLosses());
            //add all later

            fighterRepository.save(fighterToUpdate);
            return fighterToUpdate;
        }
        return null;
    }

    @Transactional
    public void deleteFighter(String fighterName){
        fighterRepository.deleteByName(fighterName);
    }
}
