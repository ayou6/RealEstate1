package com.example.Real.Estate.Controllers;

import com.example.Real.Estate.Model.Property;
import com.example.Real.Estate.Services.PropertyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "Property")
@RestController
    public class PropertyControllers {
        @Autowired
        PropertyServices propertyServices;

        @RequestMapping(value = "getAll", method = RequestMethod.GET)
        public List<Property> getAllProperties(){
            return propertyServices.getAllProperties();

        }
}
