package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotNull
    @NotBlank
    @Size
    private String description;

    public Skill() {}

    public Skill(String description) {
        this.description = description;
    }

    public @NotNull @NotBlank @Size String getDescription() {
        return description;
    }

    public void setDescription(@NotNull @NotBlank @Size String description) {
        this.description = description;
    }
}
