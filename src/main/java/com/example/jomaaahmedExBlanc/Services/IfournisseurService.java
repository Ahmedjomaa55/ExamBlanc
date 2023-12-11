package com.example.jomaaahmedExBlanc.Services;

import com.example.jomaaahmedExBlanc.DAO.Entities.Fournisseur;

public interface IfournisseurService {

    public Fournisseur ajouterFournisseur(Fournisseur fournisseur);
    public Fournisseur getFournisseurById(long id);

}
