package com.shakib.hospital_management.services;

import com.shakib.hospital_management.models.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    public List<Patient> getAllPatients(){
        try{
            System.out.println("Into service layer");
            return null;
        }catch (Exception e){
            System.out.println("Error message is : "+ e.getMessage());
            return null;
        }
    }

    public Patient getPatientById(Long id){
        try {
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Patient createPatient(Patient patient){
        try {
            return patient;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public Patient updatePatient(Long id){
        try {
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deletePatient(Long id){
        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
