package dk.sigmaswim.sponsorsystem.domain;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter @NoArgsConstructor
public class Athlete {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Setter(AccessLevel.PRIVATE)
    private Long id;
    private String ref;
    private String teamRef;
    private String firstName;
    private String lastName;
    private Integer year;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToOne(targetEntity = Team.class)
    @JoinColumn(name = "team_id")
    private Team team;
}
