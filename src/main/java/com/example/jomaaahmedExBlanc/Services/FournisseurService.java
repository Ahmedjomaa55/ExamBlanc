package com.example.jomaaahmedExBlanc.Services;

import com.example.jomaaahmedExBlanc.DAO.Entities.Fournisseur;
import com.example.jomaaahmedExBlanc.DAO.Repositories.FournisseurRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class FournisseurService implements IfournisseurService{


    FournisseurRepository fournisseurRepository;

    @Override
    public Fournisseur ajouterFournisseur(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    @Override
    public Fournisseur getFournisseurById(long id) {
        return fournisseurRepository.findById(id).get();
    }
}
