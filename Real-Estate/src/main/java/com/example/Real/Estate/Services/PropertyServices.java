package com.example.Real.Estate.Services;

import com.example.Real.Estate.Model.Property;
import com.example.Real.Estate.Repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PropertyServices {
    @Autowired
    PropertyRepository propertyRepository;

    public List<Property> getAllProperties(){
        return propertyRepository.findAll();
    }
}
