package fr.pe.IHMGestionDesCles.model;

import java.util.Date;

public class CleEntity {
    private Long id;
    private String code_cle_chiffrement;
    private String valeur_cle_chiffrement;
    private String horodatage_creation;
    private String horodatage_modification;
    private String horodatage_debut_validite;
    private String horodatage_fin_validite;
    private String horodatage_revocation_planifiee;

    public CleEntity(String code_cle_chiffrement, String valeur_cle_chiffrement, String horodatage_creation, String horodatage_modification, String horodatage_debut_validite, String horodatage_fin_validite, String horodatage_revocation_planifiee ) {
        this.code_cle_chiffrement = code_cle_chiffrement;
        this.valeur_cle_chiffrement = valeur_cle_chiffrement;
        this.horodatage_creation = horodatage_creation;
        this.horodatage_modification = horodatage_modification;
        this.horodatage_debut_validite = horodatage_debut_validite;
        this.horodatage_fin_validite = horodatage_fin_validite;
        this.horodatage_revocation_planifiee = horodatage_revocation_planifiee;
    }

    public CleEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode_cle_chiffrement() {
        return code_cle_chiffrement;
    }

    public void setCode_cle_chiffrement(String code_cle_chiffrement) {
        this.code_cle_chiffrement = code_cle_chiffrement;
    }

    public String getValeur_cle_chiffrement() {
        return valeur_cle_chiffrement;
    }

    public void setValeur_cle_chiffrement(String valeur_cle_chiffrement) {
        this.valeur_cle_chiffrement = valeur_cle_chiffrement;
    }

    public String getHorodatage_creation() {
        return horodatage_creation;
    }

    public void setHorodatage_creation(String horodatage_creation) {
        this.horodatage_creation = horodatage_creation;
    }

    public String getHorodatage_modification() {
        return horodatage_modification;
    }

    public void setHorodatage_modification(String horodatage_modification) {
        this.horodatage_modification = horodatage_modification;
    }

    public String getHorodatage_debut_validite() {
        return horodatage_debut_validite;
    }

    public void setHorodatage_debut_validite(String horodatage_debut_validite) {
        this.horodatage_debut_validite = horodatage_debut_validite;
    }

    public String getHorodatage_fin_validite() {
        return horodatage_fin_validite;
    }

    public void setHorodatage_fin_validite(String horodatage_fin_validite) {
        this.horodatage_fin_validite = horodatage_fin_validite;
    }

    public String getHorodatage_revocation_planifiee() {
        return horodatage_revocation_planifiee;
    }

    public void setHorodatage_revocation_planifiee(String horodatage_revocation_planifiee) {
        this.horodatage_revocation_planifiee = horodatage_revocation_planifiee;
    }
}

