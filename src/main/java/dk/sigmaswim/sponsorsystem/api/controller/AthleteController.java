package dk.sigmaswim.sponsorsystem.api.controller;

import dk.sigmaswim.sponsorsystem.domain.Athlete;
import dk.sigmaswim.sponsorsystem.repository.AthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "athletes")
public class AthleteController {

    private final AthleteRepository athleteRepository;

    public AthleteController(AthleteRepository athleteRepository) {
        this.athleteRepository = athleteRepository;
    }

    @GetMapping
    public List<Athlete> getActors() {
        return athleteRepository.findAll();
    }
}
