package com.example.jomaaahmedExBlanc.Services;

import com.example.jomaaahmedExBlanc.DAO.Entities.*;

import java.util.List;

public interface IAeportService {

    String ajouterVolEtAeroport(Vol vol);

    List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs);

    String reserverVol(int voyageurId, int volId, ClassPlace classPlace);

    EtatReservation confirmerReservation(String reservationId);

    void annulerReservation();
}
