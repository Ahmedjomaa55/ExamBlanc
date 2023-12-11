package com.example.jomaaahmedExBlanc.RestControllers;

import com.example.jomaaahmedExBlanc.DAO.Entities.Fournisseur;
import com.example.jomaaahmedExBlanc.DAO.Entities.Voyageur;
import com.example.jomaaahmedExBlanc.Services.AeportService;
import com.example.jomaaahmedExBlanc.Services.IfournisseurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class FournisseurRestController {

   IfournisseurService ifournisseurService;

   AeportService aeportService;

    @PostMapping("ajouterFourniseur")
    public Fournisseur ajouterFournisseur(@RequestBody Fournisseur fournisseur) {
        return ifournisseurService.ajouterFournisseur(fournisseur);

    }


    @PostMapping("/ajouterVoyageurs")
    public List<Voyageur> ajouterVoyageurs(@RequestBody List<Voyageur> voyageurs) {
        return  aeportService.ajouterVoyageurs(voyageurs);
    }






}
