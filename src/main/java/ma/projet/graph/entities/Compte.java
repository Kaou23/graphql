package ma.projet.graph.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double solde;

    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    @Enumerated(EnumType.STRING)
    private TypeCompte type;

    // ==========================================
    // 1. CONSTRUCTEURS
    // ==========================================

    // Constructeur vide (OBLIGATOIRE pour JPA)
    public Compte() {
    }

    // Constructeur avec tous les champs (Equivalent de @AllArgsConstructor)
    public Compte(Long id, double solde, Date dateCreation, TypeCompte type) {
        this.id = id;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.type = type;
    }

    // ==========================================
    // 2. GETTERS ET SETTERS (Equivalent de @Data)
    // C'est ce qui manquait pour que Spring puisse remplir l'objet !
    // ==========================================

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public TypeCompte getType() {
        return type;
    }

    public void setType(TypeCompte type) {
        this.type = type;
    }
}