package com.example.Real.Estate.Model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Entity
@Table(name = "Listing")

    public class Listing extends BaseEntity{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;
}
