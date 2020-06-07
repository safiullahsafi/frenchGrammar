package rms.domain.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Subject extends BaseEntity{

    private String name;
    private String pageNo;
    private String contextNo;
    private String contextDesc;
    @OneToMany
    private List<A_z> Az;

}
