package com.example.Real.Estate.Repository;

import com.example.Real.Estate.Model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository extends JpaRepository<Agent,Long> {



}
