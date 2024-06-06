import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Compte {
    @Id
    private long id;
    private String username;
    private String password;
    private String email;
    private boolean DoubleFA;
    // À modifier
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    private long tache_id;
    private long planning_id;
    private long employe_id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
