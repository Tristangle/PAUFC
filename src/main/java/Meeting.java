import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class Meeting {

    @Id
    private long id;
    private String nom;
    private Date date;
    // À modifier
    private long compte_id;
    private long planning_id;
    private long sondage_id;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
