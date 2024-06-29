package core.dto;

import java.util.Date;
import java.util.List;

public class MeetingDTO {

    private long id;
    private String nom;
    private Date dateDebut;
    private Date dateFin;
    private UserDTO organisateur;
    private List<UserDTO> participants;
    private List<PlanningDTO> plannings;
    private List<VoteDTO> votes;

    // Constructors
    public MeetingDTO() {
    }

    public MeetingDTO(long id, String nom, Date dateDebut, Date dateFin, UserDTO organisateur, List<UserDTO> participants, List<PlanningDTO> plannings, List<VoteDTO> votes) {
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

    public UserDTO getOrganisateur() {
        return organisateur;
    }

    public void setOrganisateur(UserDTO organisateur) {
        this.organisateur = organisateur;
    }

    public List<UserDTO> getParticipants() {
        return participants;
    }

    public void setParticipants(List<UserDTO> participants) {
        this.participants = participants;
    }

    public List<PlanningDTO> getPlannings() {
        return plannings;
    }

    public void setPlannings(List<PlanningDTO> plannings) {
        this.plannings = plannings;
    }

    public List<VoteDTO> getVotes() {
        return votes;
    }

    public void setVotes(List<VoteDTO> votes) {
        this.votes = votes;
    }
}