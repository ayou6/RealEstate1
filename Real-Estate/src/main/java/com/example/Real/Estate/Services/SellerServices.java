package com.example.Real.Estate.Services;

import com.example.Real.Estate.Model.Seller;
import com.example.Real.Estate.Repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
public class SellerServices {

    @Autowired
    SellerRepository sellerRepository;
    public List<Seller> getAllSellers() {
        return sellerRepository.findAll();
    }
}
