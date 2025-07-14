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

    public Page<Fighter> getFilteredFighters(String name, String weightClass, String country, Pageable pageable) {
        if (name != null && weightClass != null && country != null)
            return fighterRepository.findByNameContainingIgnoreCaseAndWeightClassIgnoreCaseAndCountryIgnoreCase(name, weightClass, country, pageable);
        else if (name != null && weightClass != null)
            return fighterRepository.findByNameContainingIgnoreCaseAndWeightClassIgnoreCase(name, weightClass, pageable);
        else if (name != null && country != null)
            return fighterRepository.findByNameContainingIgnoreCaseAndCountryIgnoreCase(name, country, pageable);
        else if (weightClass != null && country != null)
            return fighterRepository.findByCountryIgnoreCaseAndWeightClassIgnoreCase(country, weightClass, pageable);
        else if (name != null)
            return fighterRepository.findByNameContainingIgnoreCase(name, pageable);
        else if (weightClass != null)
            return fighterRepository.findByWeightClassIgnoreCase(weightClass, pageable);
        else if (country != null)
            return fighterRepository.findByCountryIgnoreCase(country, pageable);
        else
            return fighterRepository.findAll(pageable);
    }

    public Page<Fighter> getFightersByNameAndWeight_ClassAndCountry(String name, String weightClass, String country, Pageable pageable) {
        return fighterRepository.findByNameContainingIgnoreCaseAndWeightClassIgnoreCaseAndCountryIgnoreCase(name, weightClass, country, pageable);
    }

    public Page<Fighter> getFightersByNameAndWeight_Class(String name, String weightClass, Pageable pageable) {
        return fighterRepository.findByNameContainingIgnoreCaseAndWeightClassIgnoreCase(name, weightClass, pageable);
    }

    public Page<Fighter> getFightersByNameAndCountry(String name, String country, Pageable pageable) {
        return fighterRepository.findByNameContainingIgnoreCaseAndCountryIgnoreCase(name, country, pageable);
    }

    public Page<Fighter> getFightersFromName(String name, Pageable pageable) {
        return fighterRepository.findByNameContainingIgnoreCase(name, pageable);
    }

    public Page<Fighter> getFightersByCountryAndWeight_Class(String country, String weightClass, Pageable pageable) {
        return fighterRepository.findByCountryIgnoreCaseAndWeightClassIgnoreCase(country, weightClass, pageable);
    }

    public Page<Fighter> getFightersFromWeight_Class(String weightClass, Pageable pageable) {
        return fighterRepository.findByWeightClassIgnoreCase(weightClass, pageable);
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
            fighterToUpdate.setWeightClass(updatedFighter.getWeightClass());
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
