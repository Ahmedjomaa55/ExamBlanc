package com.example.jomaaahmedExBlanc.Services;

import com.example.jomaaahmedExBlanc.DAO.Entities.*;
import com.example.jomaaahmedExBlanc.DAO.Repositories.AeroportRepository;
import com.example.jomaaahmedExBlanc.DAO.Repositories.VoyageurRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class AeportService implements IAeportService {

    AeroportRepository aeroportRepository;

    VoyageurRepository voyageurRepository;

    @Override
    public String ajouterVolEtAeroport(Vol vol) {
        if (aeroportRepository.findByCodeAITA(vol.getAeroport().getCodeAITA()).equals(vol.getAeroport().getCodeAITA())) {
            return "verifier les aeroport saisie";
        } else {
            aeroportRepository.save(vol.getAeroport());
            return "le vol ajouter avec succes";
        }
    }

    @Override
    public List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs) {
        return voyageurRepository.saveAll(voyageurs);
    }

    @Override
    public String reserverVol(int voyageurId, int volId, ClassPlace classPlace) {
        String idReservation = classPlace.toString().substring(0, 3) + volId + voyageurId;
        String Date = LocalDate.now().toString();
        if (classPlace.equals(ClassPlace.BUSINESS)) {

        }
        return idReservation;
    }

    @Override
    public EtatReservation confirmerReservation(String reservationId) {
        if(voyageurRepository.findByNom().equals("Triki Donia")){
            return EtatReservation.CONFIRMEE;
        }
        return null;
    }

    @Override
    public void annulerReservation() {

    }


}