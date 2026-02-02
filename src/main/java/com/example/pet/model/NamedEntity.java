package com.example.pet.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class NamedEntity extends BaseEntity {
    @Column(name = "name")
    @NotEmpty(message = "Name can not be empty")
    private String name;

    @Override
    public String toString() {
        return name
    }
}
