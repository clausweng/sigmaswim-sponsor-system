package dk.sigmaswim.sponsorsystem.api.controller;

import dk.sigmaswim.sponsorsystem.domain.Athlete;
import dk.sigmaswim.sponsorsystem.repository.AthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "actors")
public class ActorController {

    @Autowired
    AthleteRepository athleteRepository;

    @GetMapping
    public List<Athlete> getActors() {
        return athleteRepository.findAll();
    }
}
