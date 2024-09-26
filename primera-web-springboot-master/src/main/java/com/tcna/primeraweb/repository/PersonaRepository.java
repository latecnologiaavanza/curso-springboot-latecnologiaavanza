package com.tcna.primeraweb.repository;

import com.tcna.primeraweb.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository //estereotipos
public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
