package core.datas;

import java.util.List;

public class PlanningData {
    private long id;
    private String nom;
    private UserData user;
    private List<MeetingData> meetings;
    private List<TacheData> taches;

    public PlanningData() {
    }

    public PlanningData(long id, String nom, UserData user, List<MeetingData> meetings, List<TacheData> taches) {
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

    public UserData getUser() {
        return user;
    }

    public void setUser(UserData user) {
        this.user = user;
    }

    public List<MeetingData> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<MeetingData> meetings) {
        this.meetings = meetings;
    }

    public List<TacheData> getTaches() {
        return taches;
    }

    public void setTaches(List<TacheData> taches) {
        this.taches = taches;
    }
}
