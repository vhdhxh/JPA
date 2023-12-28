package entitiy;

import javax.persistence.*;


@Entity
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private int Id;
    @JoinColumn(name = "Team_Id")
    @ManyToOne
    private Team team;
    private String name;

    public int getId() {
        return Id;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setId(int id) {
        Id = id;
    }


}
