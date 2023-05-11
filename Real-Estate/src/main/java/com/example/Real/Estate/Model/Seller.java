package com.example.Real.Estate.Model;
import jakarta.persistence.*;
import lombok.*;


@Data
@Getter
@Setter
@Entity
@Table(name = "sellers")

    public class Seller extends BaseEntity{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;

        int phoneNumber;
        String name;
        String email;
}
