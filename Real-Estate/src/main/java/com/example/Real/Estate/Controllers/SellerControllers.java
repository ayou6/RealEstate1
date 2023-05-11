package com.example.Real.Estate.Controllers;
import com.example.Real.Estate.Model.Seller;
import com.example.Real.Estate.Services.SellerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "Seller")
    public class SellerControllers {

        @Autowired
        SellerServices sellerServices;

        @RequestMapping(value = "getAll",method = RequestMethod.GET)
        public List<Seller> getAllSellers(){
            return sellerServices.getAllSellers();

        }

}
