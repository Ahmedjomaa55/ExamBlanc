package com.example.jomaaahmedExBlanc.DAO.Repositories;

import com.example.jomaaahmedExBlanc.DAO.Entities.Aeroport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AeroportRepository extends JpaRepository<Aeroport,Integer> {
    Aeroport findByCodeAITA(String codeAITA);




}
