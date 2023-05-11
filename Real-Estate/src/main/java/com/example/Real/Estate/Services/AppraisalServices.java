package com.example.Real.Estate.Services;

import com.example.Real.Estate.Model.Appraisal;
import com.example.Real.Estate.Repository.AppraisalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppraisalServices {


    @Autowired
    AppraisalRepository appraisalRepository;

    public List<Appraisal> getAllAppraisals() {
        return appraisalRepository.findAll();
    }
}
