import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Planning {
    @Id
    private long id;
    private String nom;
    // À modifier
    private long compte_id;
    private long tache_id;
    private long meeting_id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
