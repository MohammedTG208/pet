package com.example.pet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Vet extends Person {
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialty",joinColumns = @JoinColumn(name = "vet_id")
            , inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    Set<Specialty> specialties=new HashSet<>();
}
