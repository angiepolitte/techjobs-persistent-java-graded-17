package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.launchcode.techjobs.persistent.models.data.EmployerRepository;
//import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Employer extends AbstractEntity {

//    @Autowired
//    private EmployerRepository employerRepository;


    @NotNull
    @NotBlank
    @Size
    private String location;

    public Employer() {}

    public Employer(String location) {
        this.location = location;
    }

    public @NotNull @NotBlank @Size String getLocation() {
        return location;
    }

    public void setLocation(@NotNull @NotBlank @Size String location) {
        this.location = location;
    }
}
