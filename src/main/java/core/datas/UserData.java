package core.datas;

import java.util.List;

public class UserData {

    private long id;
    private String username;
    private String email;
    private List<TokenData> tokens;
    private RoleData roles;
    private List<MeetingData> meetings;
    private List<PlanningData> plannings;
    private List<TacheData> tachesAssignees;
    private List<TacheData> tachesAttribues;


    public UserData() {
    }

    // Parameterized constructor
    public UserData(long id, String username, String email, List<TokenData> tokens, RoleData roles, List<MeetingData> meetings, List<PlanningData> plannings, List<TacheData> tachesAssignees, List<TacheData> tachesAttribues) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.tokens = tokens;
        this.roles = roles;
        this.meetings = meetings;
        this.plannings = plannings;
        this.tachesAssignees = tachesAssignees;
        this.tachesAttribues = tachesAttribues;
    }

    // Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<TokenData> getTokens() {
        return tokens;
    }

    public void setTokens(List<TokenData> tokens) {
        this.tokens = tokens;
    }

    public RoleData getRoles() {
        return roles;
    }

    public void setRoles(RoleData roles) {
        this.roles = roles;
    }

    public List<MeetingData> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<MeetingData> meetings) {
        this.meetings = meetings;
    }

    public List<PlanningData> getPlannings() {
        return plannings;
    }

    public void setPlannings(List<PlanningData> plannings) {
        this.plannings = plannings;
    }

    public List<TacheData> getTachesAssignees() {
        return tachesAssignees;
    }

    public void setTachesAssignees(List<TacheData> tachesAssignees) {
        this.tachesAssignees = tachesAssignees;
    }

    public List<TacheData> getTachesAttribues() {
        return tachesAttribues;
    }

    public void setTachesAttribues(List<TacheData> tachesAttribues) {
        this.tachesAttribues = tachesAttribues;
    }
}
