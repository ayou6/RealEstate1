package com.example.Real.Estate.Repository;

import com.example.Real.Estate.Model.Appraisal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppraisalRepository extends JpaRepository<Appraisal,Long> {
}
