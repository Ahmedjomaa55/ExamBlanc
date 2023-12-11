package com.example.jomaaahmedExBlanc.DAO.Repositories;

import com.example.jomaaahmedExBlanc.DAO.Entities.Voyageur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoyageurRepository extends JpaRepository<Voyageur,Integer> {
    Voyageur findByNom();
}
