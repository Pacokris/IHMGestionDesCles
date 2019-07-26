package fr.pe.IHMGestionDesCles.model;

import java.util.Date;

public class GroupEntity {
    private Long id;
    private String intitule;
    private String description;
    private String horodatage_creation;
    private String horodatage_modification;

    public GroupEntity(String intitule, String description, String horodatage_creation, String horodatage_modification) {
        this.intitule = intitule;
        this.description = description;
        this.horodatage_creation = horodatage_creation;
        this.horodatage_modification = horodatage_modification;
    }

    public GroupEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}
