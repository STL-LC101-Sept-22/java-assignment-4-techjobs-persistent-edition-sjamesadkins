package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    @NotNull(message="Pick at least one skill, or Add Skill.")
    @ManyToMany
    private List<Skill> skills = new ArrayList<>();


//    private String skills;

    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> someSkill) {
        super();
        this.employer = anEmployer;
        this.skills = someSkill;
    }

    // Getters and setters.


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

//    public String getSkills() {
//        return skills;
//    }
//

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> someSkills) {
        this.skills = someSkills;
    }
}
