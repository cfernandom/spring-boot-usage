package com.uptc.frw.ferialibroweb.controller;

import com.uptc.frw.ferialibroweb.model.Bill;
import com.uptc.frw.ferialibroweb.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bills")
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping
    public List<Bill> getAll() {
        return billService.findAllBills();
    }

    @GetMapping("/{id}")
    public Bill getById(@PathVariable Long id) {
        return billService.findBillById(id);
    }

    @PostMapping
    public Bill save(@RequestBody Bill bill) {
        return billService.saveBill(bill);
    }
}
