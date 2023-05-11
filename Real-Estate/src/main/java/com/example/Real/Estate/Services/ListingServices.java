package com.example.Real.Estate.Services;

import com.example.Real.Estate.Model.Listing;
import com.example.Real.Estate.Repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

    public class ListingServices {
        @Autowired
        ListingRepository listingRepository;

        public List<Listing> getAllListings(){
            return listingRepository.findAll();
        }
}
