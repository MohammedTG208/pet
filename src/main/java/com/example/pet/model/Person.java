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
public class Person extends BaseEntity{
    @Column(name = "last_name")
    @NotEmpty(message = "first name can not be empty")
    private String firstName;
    @Column(name = "last_name")
    @NotEmpty(message = "last name can not be empty")
    private String lastName;
}
