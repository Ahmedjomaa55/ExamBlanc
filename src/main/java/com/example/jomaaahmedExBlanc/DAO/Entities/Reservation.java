package com.example.jomaaahmedExBlanc.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {

    @Id
    String idReservation;

    LocalDate dateReservation;

    @Enumerated(EnumType.STRING)
    EtatReservation etatReservation = EtatReservation.ENCOURS;

    @Enumerated(EnumType.STRING)
    ClassPlace classPlace;

    @ManyToOne
    Vol vol;

    @ManyToOne
    Voyageur voyageur;



}
