package com.shakib.hospital_management.services;

import com.shakib.hospital_management.models.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

   public List<Doctor> getAllDoctor(){
       try {
           return null;
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
   }

   public Doctor getDoctorById(Long id){
       try {
           return null;
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
   }

   public Doctor createDoctor(Doctor doctor){
       try {
           return doctor;
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
   }

   public Doctor updateDoctor(Long id){
       try {
           return null;
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
   }

   public void deleteDoctor(Long id){
       try {

       } catch (Exception e) {
           throw new RuntimeException(e);
       }
   }
}
