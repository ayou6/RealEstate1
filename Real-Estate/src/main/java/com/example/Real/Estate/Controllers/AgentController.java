package com.example.Real.Estate.Controllers;

import com.example.Real.Estate.Model.Agent;
import com.example.Real.Estate.Services.AgentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value = "agent")
public class AgentController {

    @Autowired
    AgentServices agentServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Agent> getAgentList() {
        return agentServices.getAllAgents();

    }
}
