package rms.infrastructure.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rms.domain.model.Unit;

@Repository
public interface UnitJpaRepository extends JpaRepository<Unit, Long> {

}
