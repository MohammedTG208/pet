package com.example.pet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Visit extends BaseEntity{
    private LocalDate visitDate=LocalDate.now();//will set a Default value

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
