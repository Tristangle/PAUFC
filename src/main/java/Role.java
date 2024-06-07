import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Role {
    @Id
    private long id;
    private String nom;
    private boolean acces_temporaire;
    // À modifier
    @OneToMany(mappedBy = "role")
    private List<Compte> comptes;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
