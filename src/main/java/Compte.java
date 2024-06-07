import jakarta.persistence.*;

import java.util.List;


@Entity
public class Compte {
    @Id
    private long id;
    private String username;
    private String password;
    private String email;
    private boolean DoubleFA;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToMany(mappedBy = "tachesAttribues")
    private List<Tache> tachesAttribues;
    @OneToMany(mappedBy = "tachesAssignees")
    private List<Tache> tachesAssignees;
    @OneToOne
    @JoinColumn(name = "planning_id")
    private Planning planning;
    @ManyToOne
    @JoinColumn(name = "employe_id")
    private Employe employe;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
