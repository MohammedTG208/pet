package com.example.pet.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class NamedEntity extends BaseEntity {
    @Column(name = "name")
    @NotEmpty(message = "Name can not be empty")
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
