package com.example.jomaaahmedExBlanc.DAO.Entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idVol;

    LocalDate dateDepart;

    LocalDate dateArrivee;

    @ManyToOne
    Aeroport aeport;

    @OneToMany(mappedBy = "vol")
    Set<Reservation> listReservation;

    @ManyToOne
    Aeroport aeroport;

}
