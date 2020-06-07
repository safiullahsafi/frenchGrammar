package rms.domain.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class A_z extends BaseEntity{

    @OneToMany
    private List<Letter> letters;

}
