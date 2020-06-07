package rms.domain.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Dossier extends BaseEntity{


    private String name;
    @OneToMany
    private List<Subject> suject;
}
