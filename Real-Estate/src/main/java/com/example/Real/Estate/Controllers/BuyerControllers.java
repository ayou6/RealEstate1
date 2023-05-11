package com.example.Real.Estate.Controllers;

import com.example.Real.Estate.Model.Buyer;
import com.example.Real.Estate.Services.BuyerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Buyer")
public class BuyerControllers {
    @Autowired
    BuyerServices buyerServices;

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<Buyer> getAllBuyers() {
        return buyerServices.getAllBuyers();
        // http://localhost:8080/Buyer/getAll
    }
}
