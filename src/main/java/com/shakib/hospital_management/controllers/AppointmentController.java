package com.shakib.hospital_management.controllers;

import com.shakib.hospital_management.models.Appoinment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    @GetMapping
    public List<Appoinment> getAllAppointment(){
        System.out.println("Fetching the Appointments");
        return null;
    }

    @PostMapping
    public Appoinment createAppointment(@RequestBody Appoinment appoinment){
        System.out.println("Creating Appointment");
        return appoinment;
    }

    @GetMapping("{/id}")
    public Appoinment getAppointmentById(@PathVariable Long id){
        System.out.println("Fetching appointment by id");
        return null;
    }

    @PutMapping("{/id}")
    public void updateAppointment(@PathVariable Long id){

    }

    @DeleteMapping("{/id}")
    public void deleteAppointment(@PathVariable Long id){

    }
}
