package com.example.Real.Estate.Services;

import com.example.Real.Estate.Model.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class SellerServices {

    @Autowired
    SellerServices sellerServices;

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<Seller> getAllSellers(){
        return sellerServices.getAllSellers();
    }
}
