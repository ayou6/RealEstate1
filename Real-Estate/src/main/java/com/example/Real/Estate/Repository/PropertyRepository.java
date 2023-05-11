package com.example.Real.Estate.Repository;

import com.example.Real.Estate.Model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property,Long> {
}
