import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Tache {
    @Id
    private long id;
    private String nom;
    private String description;
    private String status;
    @ManyToOne
    @JoinColumn(name = "tachesAttribues_id")
    private Compte tachesAttribues;
    @ManyToOne
    @JoinColumn(name = "tachesAssignees_id")
    private Compte tachesAssignees;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
