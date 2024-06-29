package core.dto;

import java.util.List;

public class PlanningDTO {
    private long id;
    private String nom;
    private UserDTO user;
    private List<MeetingDTO> meetings;
    private List<TacheDTO> taches;

    public PlanningDTO() {
    }

    public PlanningDTO(long id, String nom, UserDTO user, List<MeetingDTO> meetings, List<TacheDTO> taches) {
        this.id = id;
        this.nom = nom;
        this.user = user;
        this.meetings = meetings;
        this.taches = taches;
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

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public List<MeetingDTO> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<MeetingDTO> meetings) {
        this.meetings = meetings;
    }

    public List<TacheDTO> getTaches() {
        return taches;
    }

    public void setTaches(List<TacheDTO> taches) {
        this.taches = taches;
    }
}
