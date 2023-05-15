package com.example.Real.Estate.Services;

import com.example.Real.Estate.Model.Listing;
import com.example.Real.Estate.Repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListingServices {
    @Autowired
    ListingRepository listingRepository;

    public List<Listing> getAllListings() {
        return listingRepository.findAll();
    }
}
