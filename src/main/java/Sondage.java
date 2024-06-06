import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sondage {
    @Id
    private long id;
    private String nom;
    // À modifier
    private long questions_id;
    private long reponses_id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
