package com.example.pet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "Pet types")
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PetType extends NamedEntity{
}
