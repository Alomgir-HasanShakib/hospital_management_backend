package com.shakib.hospital_management.services;

import com.shakib.hospital_management.models.Bill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    public List<Bill> getAllBills(){
        try {
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Bill getBillById(Long id){
        try {
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Bill createBill(Bill bill){
        try {
            return bill;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Bill updateBill(Long id){
        try {
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteBill(Long id){
        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
