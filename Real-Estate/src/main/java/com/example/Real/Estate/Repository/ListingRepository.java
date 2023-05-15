package com.example.Real.Estate.Repository;

import com.example.Real.Estate.Model.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListingRepository extends JpaRepository<Listing,Long > {
}
