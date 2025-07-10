package com.ufc.fightiq.fighter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FighterRepository extends JpaRepository<Fighter, String> {
    void deleteByName(String name);
    Optional<Fighter> findByName(String name);
}
