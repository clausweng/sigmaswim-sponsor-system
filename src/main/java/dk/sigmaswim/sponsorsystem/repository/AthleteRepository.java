package dk.sigmaswim.sponsorsystem.repository;

import dk.sigmaswim.sponsorsystem.domain.Athlete;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AthleteRepository extends CrudRepository<Athlete, Long> {
    @Override
    public List<Athlete> findAll();
}
