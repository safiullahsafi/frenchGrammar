package rms.domain.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Blank extends BaseEntity{

    private String blank;
}
