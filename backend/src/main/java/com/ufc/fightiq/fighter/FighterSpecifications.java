package com.ufc.fightiq.fighter;

import org.springframework.data.jpa.domain.Specification;

public class FighterSpecifications {

    public static Specification<Fighter> nameContains(String name) {
        return (root, query, cb) ->
                name == null ? null : cb.like(cb.lower(root.get("name")), "%" + name.toLowerCase() + "%");
    }

    public static Specification<Fighter> weightClassEquals(String weightClass) {
        return (root, query, cb) ->
                weightClass == null ? null : cb.equal(cb.lower(root.get("weightClass")), weightClass.toLowerCase());
    }

    public static Specification<Fighter> countryEquals(String country) {
        return (root, query, cb) ->
                country == null ? null : cb.equal(cb.lower(root.get("country")), country.toLowerCase());
    }
}