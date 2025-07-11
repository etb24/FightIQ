package com.ufc.fightiq.fighter;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.TreeSet;

@Component
public class FighterService {
    private final FighterRepository fighterRepository;

    @Autowired
    public FighterService(FighterRepository fighterRepository) {
        this.fighterRepository = fighterRepository;
    }



    public Page<Fighter> getFightersFromName(String name, Pageable pageable) {
        return fighterRepository.findByNameContainingIgnoreCase(name, pageable);
    }

    public Page<Fighter> getFightersByCountryAndWeightClass(String country, String weight_class, Pageable pageable) {
        return fighterRepository.findByCountryIgnoreCaseAndWeightClassIgnoreCase(country, weight_class, pageable);
    }

    public Page<Fighter> getFightersFromWeight_class(String weight_class, Pageable pageable) {
        return fighterRepository.findByWeightClassIgnoreCase(weight_class, pageable);
    }

    public Page<Fighter> getFightersFromCountry(String country, Pageable pageable) {
        return fighterRepository.findByCountryIgnoreCase(country, pageable);
    }

    public Page<Fighter> getFighters(Pageable pageable) {
        return fighterRepository.findAll(pageable);
    }

    public Set<String> getAllCountries() {
        return fighterRepository.findAll().stream()
                .map(Fighter::getCountry)
                .filter(Objects::nonNull)
                .collect(Collectors.toCollection(TreeSet::new));  // TreeSet = sorted unique
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
