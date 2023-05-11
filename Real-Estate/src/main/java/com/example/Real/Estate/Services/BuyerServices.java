package com.example.Real.Estate.Services;

import com.example.Real.Estate.Model.Buyer;
import com.example.Real.Estate.Repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerServices {
    @Autowired
    BuyerRepository buyerRepository;

    public List<Buyer> getAllBuyers(){
        return buyerRepository.findAll();
    }
}
