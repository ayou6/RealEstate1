package com.example.Real.Estate.Services;

import com.example.Real.Estate.Model.Agent;
import com.example.Real.Estate.Repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentServices {

    @Autowired
    AgentRepository agentRepository;

    public List<Agent> getAllAgents(){
        return agentRepository.findAll();

    }
}
