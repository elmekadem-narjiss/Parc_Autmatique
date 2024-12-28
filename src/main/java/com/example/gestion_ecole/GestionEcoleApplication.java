package com.example.gestion_ecole;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.example.serviceetudiant.service.EtudiantService;
import com.example.servicefiliere.service.FiliereService;


@SpringBootApplication

public class GestionEcoleApplication {

  public static void main(String[] args) {
    SpringApplication.run(GestionEcoleApplication.class, args);
  }

}
