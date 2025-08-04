package com.ufc.fightiq.fighter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FighterRepository extends JpaRepository<Fighter, String>, JpaSpecificationExecutor<Fighter> {
    void deleteByName(String name);

    Optional<Fighter> findByName(String name);

    Page<Fighter> findByNameContainingIgnoreCaseAndCountryIgnoreCaseAndWeightClassIgnoreCase(
            String name, String country, String weightClass, Pageable pageable
    );

    Page<Fighter> findByNameContainingIgnoreCaseAndCountryIgnoreCase(
            String name, String country, Pageable pageable
    );

    Page<Fighter> findByNameContainingIgnoreCaseAndWeightClassIgnoreCase(
            String name, String weightClass, Pageable pageable
    );

    Page<Fighter> findByCountryIgnoreCaseAndWeightClassIgnoreCase(
            String country, String weightClass, Pageable pageable
    );
    Page<Fighter> findByNameContainingIgnoreCase(String name, Pageable pageable);

    Page<Fighter> findByCountryIgnoreCase(String country, Pageable pageable);

    Page<Fighter> findByWeightClassIgnoreCase(String weightClass, Pageable pageable);

}

