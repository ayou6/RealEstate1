package com.example.Real.Estate.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Entity
@Table(name = "agents")

    public class Agent extends BaseEntity{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;

        String name;
        String email;
        int phoneNumber;


}
