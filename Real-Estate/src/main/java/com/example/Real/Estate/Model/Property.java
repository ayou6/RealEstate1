package com.example.Real.Estate.Model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Entity
@Table(name = "Properties")

    public class Property extends BaseEntity{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;

        String name;
        String address;
        String description;
        Double price;
        Double area;

}
