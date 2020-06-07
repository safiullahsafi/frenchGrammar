package rms.infrastructure.jpa;

import org.springframework.stereotype.Component;
import port.UnitRepository;
import rms.domain.model.Unit;

import java.util.List;
import java.util.Optional;

@Component
public class UnitService implements UnitRepository {

    private UnitJpaRepository releaseJpaRepository;

    public UnitService(UnitJpaRepository releaseJpaRepository) {
        this.releaseJpaRepository = releaseJpaRepository;
    }

    public Unit saveOrUpdate(Unit release) {
       return releaseJpaRepository.save(release);
    }

    public List<Unit> getUnits() {
        return releaseJpaRepository.findAll();
    }


    @Override
    public Optional<Unit> findById(Long releaseId) {
        return releaseJpaRepository.findById(releaseId);
    }

    @Override
    public void delete(Long releaseId) {
         releaseJpaRepository.deleteById(releaseId);
    }


}
