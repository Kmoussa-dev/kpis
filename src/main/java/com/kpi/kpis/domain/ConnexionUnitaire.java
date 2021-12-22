package com.kpi.kpis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class ConnexionUnitaire {

    @Id
    @GeneratedValue
    private Integer idConnexionUnitaire;
    private Timestamp dateConnexion;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;



}
