package com.shakib.hospital_management.controllers;

import com.shakib.hospital_management.models.Bill;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bills")
public class BillController {

    @GetMapping
    public List<Bill> getAllBIlls(){
        System.out.println("Fetching all bills");
        return null;
    }

    @GetMapping("{/id}")
    public Bill getBillById(@PathVariable Long id){
        System.out.println("Fetching single bill");
        return null;
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill){
        System.out.println("Creating bill");
        return bill;
    }

    @PutMapping("{/id}")
    public void updateBill(@PathVariable Long id){
        System.out.println("Updating bill");
        return;
    }

    @DeleteMapping("{/id}")
    public void deleteBill(@PathVariable Long id){
        System.out.println("Deleting Bill");
        return;
    }
}
