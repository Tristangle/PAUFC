package core.datas;

import java.util.Date;
import java.util.List;

public class MeetingData {

    private long id;
    private String nom;
    private Date dateDebut;
    private Date dateFin;
    private UserData organisateur;
    private List<UserData> participants;
    private List<PlanningData> plannings;
    private List<VoteData> votes;

    // Constructors
    public MeetingData() {
    }

    public MeetingData(long id, String nom, Date dateDebut, Date dateFin, UserData organisateur, List<UserData> participants, List<PlanningData> plannings, List<VoteData> votes) {
        this.id = id;
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.organisateur = organisateur;
        this.participants = participants;
        this.plannings = plannings;
        this.votes = votes;
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

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public UserData getOrganisateur() {
        return organisateur;
    }

    public void setOrganisateur(UserData organisateur) {
        this.organisateur = organisateur;
    }

    public List<UserData> getParticipants() {
        return participants;
    }

    public void setParticipants(List<UserData> participants) {
        this.participants = participants;
    }

    public List<PlanningData> getPlannings() {
        return plannings;
    }

    public void setPlannings(List<PlanningData> plannings) {
        this.plannings = plannings;
    }

    public List<VoteData> getVotes() {
        return votes;
    }

    public void setVotes(List<VoteData> votes) {
        this.votes = votes;
    }
}