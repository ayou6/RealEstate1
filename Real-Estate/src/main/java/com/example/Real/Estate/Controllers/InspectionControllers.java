package com.example.Real.Estate.Controllers;

import com.example.Real.Estate.Model.Inspection;
import com.example.Real.Estate.Services.InspectionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@RestController
@RequestMapping(value = "inspection")
public class InspectionControllers {
    @Autowired
    InspectionServices inspectionServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    List<Inspection> getAllInspections(){
        return inspectionServices.getAllInspections();

    }

}
