package com.example.Real.Estate.Controllers;


import com.example.Real.Estate.Model.Listing;
import com.example.Real.Estate.Services.ListingServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "listing")
public class ListingControllers {
    @Autowired
    ListingServices listingServices;

    @GetMapping(value = "getAll")
    public List<Listing> getLists() {
        return listingServices.getAllListings();
    }
}
