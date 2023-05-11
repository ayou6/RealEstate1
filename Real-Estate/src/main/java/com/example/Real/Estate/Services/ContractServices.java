package com.example.Real.Estate.Services;

import com.example.Real.Estate.Model.Contract;
import com.example.Real.Estate.Repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServices {
    @Autowired
    ContractRepository contractRepository;

    public List<Contract> getAllContracts(){
        return contractRepository.findAll();
    }
}
