package com.shakib.hospital_management.controllers;

import com.shakib.hospital_management.models.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @GetMapping
    public List<Patient> getAllPatients(){
        System.out.println("Fetching the patients");
        return  null;
    };

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){
        System.out.println("Creating patient");
        return patient;
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id){
        System.out.println("Fetching Patient by Id");
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id){

    }

    @PutMapping("/{id}")
    public void updatePatient(@PathVariable Long id){

    }
}
