package com.example.Real.Estate.Services;

import com.example.Real.Estate.Model.Inspection;
import com.example.Real.Estate.Repository.InspectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InspectionServices {
    @Autowired
    InspectionRepository inspectionRepository;

    public List<Inspection> getAllInspections(){
        return inspectionRepository.findAll();
    }
}
