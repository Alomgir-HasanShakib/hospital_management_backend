package com.shakib.hospital_management.controllers;

import com.shakib.hospital_management.models.Appoinment;
import com.shakib.hospital_management.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping
    public List<Appoinment> getAllAppointment(){
        System.out.println("Fetching the Appointments");
        return appointmentService.getAllAppointment();
    }

    @PostMapping
    public Appoinment createAppointment(@RequestBody Appoinment appoinment){
        System.out.println("Creating Appointment");
        return appointmentService.createAppoinment(appoinment);
    }

    @GetMapping("/{id}")
    public Appoinment getAppointmentById(@PathVariable Long id){
        System.out.println("Fetching appointment by id");
        return appointmentService.getAppointmentById(id);
    }

    @PutMapping("/{id}")
    public Appoinment updateAppointment(@PathVariable Long id){
        return appointmentService.updateAppoinment(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id){
        appointmentService.deleteAppointment(id);
    }
}
