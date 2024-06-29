package core.dto;

import java.util.List;

public class UserDTO {

    private long id;
    private String username;
    private String email;
    private List<TokenDTO> tokens;
    private RoleDTO roles;
    private List<MeetingDTO> meetings;
    private List<PlanningDTO> plannings;
    private List<TacheDTO> tachesAssignees;
    private List<TacheDTO> tachesAttribues;

    // Default constructor
    public UserDTO() {
    }

    // Parameterized constructor
    public UserDTO(long id, String username, String email, List<TokenDTO> tokens, RoleDTO roles, List<MeetingDTO> meetings, List<PlanningDTO> plannings, List<TacheDTO> tachesAssignees, List<TacheDTO> tachesAttribues) {
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

    public List<TokenDTO> getTokens() {
        return tokens;
    }

    public void setTokens(List<TokenDTO> tokens) {
        this.tokens = tokens;
    }

    public RoleDTO getRoles() {
        return roles;
    }

    public void setRoles(RoleDTO roles) {
        this.roles = roles;
    }

    public List<MeetingDTO> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<MeetingDTO> meetings) {
        this.meetings = meetings;
    }

    public List<PlanningDTO> getPlannings() {
        return plannings;
    }

    public void setPlannings(List<PlanningDTO> plannings) {
        this.plannings = plannings;
    }

    public List<TacheDTO> getTachesAssignees() {
        return tachesAssignees;
    }

    public void setTachesAssignees(List<TacheDTO> tachesAssignees) {
        this.tachesAssignees = tachesAssignees;
    }

    public List<TacheDTO> getTachesAttribues() {
        return tachesAttribues;
    }

    public void setTachesAttribues(List<TacheDTO> tachesAttribues) {
        this.tachesAttribues = tachesAttribues;
    }
}
