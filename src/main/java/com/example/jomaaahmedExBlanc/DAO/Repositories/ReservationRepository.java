package com.example.jomaaahmedExBlanc.DAO.Repositories;

import com.example.jomaaahmedExBlanc.DAO.Entities.ClassPlace;
import com.example.jomaaahmedExBlanc.DAO.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
    ClassPlace findByClassPlace(String classPlace);

    Reservation findByEtatReservation(String etatReservation);
}
