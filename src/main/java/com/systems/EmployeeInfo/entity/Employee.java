package com.systems.EmployeeInfo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.validation.annotation.Validated;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String desinition;
    @NumberFormat
    int yearOfExperience;

    public Employee(String name, String desinition, int yearOfExperience) {
        this.name = name;
        desinition = desinition;
        this.yearOfExperience = yearOfExperience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desinition='" + desinition + '\'' +
                ", yearOfExperience=" + yearOfExperience +
                '}';
    }
}
