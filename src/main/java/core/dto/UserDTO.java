package core.dto;

import java.util.List;

public class UserDTO {

    private long id;
    private String username;
    private String email;
    private TokenDTO token;
    private RoleDTO roles;
    private List<TacheDTO> tachesCreer;
    private List<TacheDTO> tachesExecute;

    // Default constructor
    public UserDTO() {
    }

    // Parameterized constructor
    public UserDTO(long id, String username, String email, TokenDTO token, RoleDTO roles, List<TacheDTO> tachesCreer, List<TacheDTO> tachesExecute) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.token = token;
        this.roles = roles;

        this.tachesCreer = tachesCreer;
        this.tachesExecute = tachesExecute;
    }

    public UserDTO(long id, String username, String email, TokenDTO token, RoleDTO roles) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.token = token;
        this.roles = roles;
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

    public TokenDTO getToken() {
        return token;
    }

    public void setToken(TokenDTO token) {
        this.token = token;
    }

    public RoleDTO getRoles() {
        return roles;
    }

    public void setRoles(RoleDTO roles) {
        this.roles = roles;
    }
    
    public List<TacheDTO> getTachesCreer() {
        return tachesCreer;
    }

    public void setTachesCreer(List<TacheDTO> tachesCreer) {
        this.tachesCreer = tachesCreer;
    }

    public List<TacheDTO> getTachesExecute() {
        return tachesExecute;
    }

    public void setTachesExecute(List<TacheDTO> tachesExecute) {
        this.tachesExecute = tachesExecute;
    }
}
