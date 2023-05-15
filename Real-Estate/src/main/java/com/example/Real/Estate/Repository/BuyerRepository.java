package com.example.Real.Estate.Repository;

import com.example.Real.Estate.Model.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer,Long> {
}
