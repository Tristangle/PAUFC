package core.datas;

import java.util.Date;
import java.util.List;

public class TacheData {

    private long id;
    private String nom;
    private String description;
    private String status;
    private Date date_debut;
    private Date date_fin;
    private UserData tachesAttribues;
    private UserData tachesAssignees;
    private List<PlanningData> plannings;

    public TacheData() {
    }

    public TacheData(long id, String nom, String description, String status, Date date_debut, Date date_fin, UserData tachesAttribues, UserData tachesAssignees, List<PlanningData> plannings) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.status = status;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.tachesAttribues = tachesAttribues;
        this.tachesAssignees = tachesAssignees;
        this.plannings = plannings;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public UserData getTachesAttribues() {
        return tachesAttribues;
    }

    public void setTachesAttribues(UserData tachesAttribues) {
        this.tachesAttribues = tachesAttribues;
    }

    public UserData getTachesAssignees() {
        return tachesAssignees;
    }

    public void setTachesAssignees(UserData tachesAssignees) {
        this.tachesAssignees = tachesAssignees;
    }

    public List<PlanningData> getPlannings() {
        return plannings;
    }

    public void setPlannings(List<PlanningData> plannings) {
        this.plannings = plannings;
    }
}
