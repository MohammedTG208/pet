package com.example.pet.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Owner extends Person{
    @NotEmpty(message = "address can not be empty")
    private String address;
    @NotEmpty(message = "city can not be empty")
    private String city;
    @NotEmpty(message = "telephone can not be empty")
    @Digits(integer = 10, fraction = 0)
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id")
    Set<Pet> pets=new HashSet<>();

}
