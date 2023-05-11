package com.example.Real.Estate.Controllers;
import com.example.Real.Estate.Model.Listing;
import com.example.Real.Estate.Services.ListingServices;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "Listing")
public class ListingControllers {

    @Autowired
    ListingServices listingServices;
    @RequestMapping(value = "getAll" , method = RequestMethod.GET)
    public List<Listing> getAllListings(){
        return listingServices.getAllListings();

    }
}
