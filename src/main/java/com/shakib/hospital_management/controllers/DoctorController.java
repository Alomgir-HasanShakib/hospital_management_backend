package com.shakib.hospital_management.controllers;

import com.shakib.hospital_management.models.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    @GetMapping
    public List<Doctor> getAllDoctors(){
        System.out.println("Fetching All Doctors");
        return null;
    }

    @GetMapping("{/id}")
    public Doctor getDoctorById(@PathVariable Long id){
        System.out.println("Fetching single Doctor Data");
        return null;
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor){
        System.out.println("Creating Doctor data");
        return doctor;
    }
    @PutMapping("{/id}")
    public void updateDoctor(@PathVariable Long id){

    }

    @DeleteMapping("{/id}")
    public void deleteDoctor(@PathVariable Long id){

    }
}
