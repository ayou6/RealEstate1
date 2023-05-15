package com.example.Real.Estate.Model;
import jakarta.persistence.*;
import lombok.*;


@Data
@Setter
@Getter
@Entity
@Table(name = "buyer")

    public class Buyer extends BaseEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;

        String name;
        String email;
        int phoneNumber;

}
