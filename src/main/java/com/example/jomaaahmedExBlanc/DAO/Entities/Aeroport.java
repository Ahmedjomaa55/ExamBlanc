package com.example.jomaaahmedExBlanc.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Aeroport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idAeroport;

    @Column(nullable = false)
    String nom;

    @Column(length = 3)
    String codeAITA;
    long telephone;

    @OneToMany(mappedBy = "aeroport")
    Set<Vol> listVols;

    @OneToMany(mappedBy = "aeport")
    Set<Vol> listVol;




}
