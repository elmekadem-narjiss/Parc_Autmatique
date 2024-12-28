package com.example.serviceetudiant.repository;

import com.example.serviceetudiant.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
