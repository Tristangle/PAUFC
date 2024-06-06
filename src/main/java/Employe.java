import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employe {

    @Id
    private long id;
    private String nom;
    private String prenom;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    // Many to one au niveau des comptes, un employé peut avoir plusieurs compte ( admin, test, normal)
}
