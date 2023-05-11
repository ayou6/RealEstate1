package com.example.Real.Estate.Controllers;

import com.example.Real.Estate.Model.Appraisal;
import com.example.Real.Estate.Services.AppraisalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Appraisal")
    public class AppraisalControllers {


        @Autowired
        AppraisalServices appraisalServices;

        @RequestMapping(value = "getAll", method = RequestMethod.GET)
        public List<Appraisal> getAllAppraisals() {
            return appraisalServices.getAllAppraisals();
            // http://localhost:8080/Appraisal/getAll

        }
}
