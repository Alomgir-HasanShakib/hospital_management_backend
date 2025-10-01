package com.shakib.hospital_management.services;

import com.shakib.hospital_management.models.Appoinment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    public List<Appoinment> getAllAppointment(){
        try {
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Appoinment getAppointmentById(Long id){
        try {
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Appoinment createAppoinment(Appoinment appoinment){
        try {
            return appoinment;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Appoinment updateAppoinment(Long id){
        try {
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteAppointment(Long id){
        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
