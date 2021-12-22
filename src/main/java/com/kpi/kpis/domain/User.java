package com.kpi.kpis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class User {

    @Id
    private Integer idUser;
    private String nomComplet;
    private String prenom;
    private String nom;
    private String mail;
    private String num;

    @OneToMany(mappedBy = "user",cascade = {CascadeType.ALL})
    private List<ConnexionUnitaire> connexionUnitaires;

}
