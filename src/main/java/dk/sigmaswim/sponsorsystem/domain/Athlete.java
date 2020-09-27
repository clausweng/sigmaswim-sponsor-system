package dk.sigmaswim.sponsorsystem.domain;


import javax.persistence.*;

@Entity
public class Athlete {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)private Long id;
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

    public Long getId() {
        return id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getTeamRef() {
        return teamRef;
    }

    public void setTeamRef(String teamRef) {
        this.teamRef = teamRef;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
