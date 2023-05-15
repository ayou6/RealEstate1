package com.example.Real.Estate.Repository;

import com.example.Real.Estate.Model.Inspection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InspectionRepository extends JpaRepository<Inspection,Long> {
}
