package com.example.Real.Estate.Controllers;

import com.example.Real.Estate.Model.Contract;
import com.example.Real.Estate.Services.ContractServices;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "contract")
public class ContractControllers {
    @Autowired
    ContractServices contractServices;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Contract> getAllContracts() {
        return contractServices.getAllContracts();

    }
}
