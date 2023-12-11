package com.example.jomaaahmedExBlanc.DAO.Schedulars;

import com.example.jomaaahmedExBlanc.DAO.Entities.Reservation;
import com.example.jomaaahmedExBlanc.DAO.Repositories.AeroportRepository;
import com.example.jomaaahmedExBlanc.DAO.Repositories.ReservationRepository;
import com.example.jomaaahmedExBlanc.Services.AeportService;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import tn.esprit.spring.Services.IExamenService;

@Component
@AllArgsConstructor
public class ExamenSchedular {
    AeportService aeportService;

    AeroportRepository aeroportRepository;

    ReservationRepository reservationRepository;

    @Scheduled(fixedRate = 60000)
    public void method(Reservation idReservation){

        if(reservationRepository.findByEtatReservation("ENCOURS"){
            aeportService.annulerReservation(idReservation);
        }


    }

}
