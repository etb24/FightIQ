package com.ufc.fightiq.fighter;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FighterRepository extends JpaRepository<Fighter, String> {
    void deleteByName(String name);
    Optional<Fighter> findByName(String name);
    Page<Fighter> findByNameContainingIgnoreCase(String name, Pageable pageable);
    Page<Fighter> findByCountryIgnoreCaseAndWeightClassIgnoreCase(String country, String weightClass, Pageable pageable);
    Page<Fighter> findByWeightClassIgnoreCase(String weightClass, Pageable pageable);
    Page<Fighter> findByCountryIgnoreCase(String country, Pageable pageable);
}
