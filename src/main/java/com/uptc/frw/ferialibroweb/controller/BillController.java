package com.uptc.frw.ferialibroweb.controller;

import com.uptc.frw.ferialibroweb.model.Bill;
import com.uptc.frw.ferialibroweb.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
