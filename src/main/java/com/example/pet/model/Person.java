package com.example.pet.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class Person extends BaseEntity{
    @Column(name = "last_name")
    @NotEmpty(message = "first name can not be empty")
    private String firstName;
    @Column(name = "last_name")
    @NotEmpty(message = "last name can not be empty")
    private String lastName;
}
