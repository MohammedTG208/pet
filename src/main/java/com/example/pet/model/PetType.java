package com.example.pet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pet types")
public class PetType extends NamedEntity{
}
