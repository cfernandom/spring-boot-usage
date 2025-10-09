package com.uptc.frw.ferialibroweb.controller;

import com.uptc.frw.ferialibroweb.model.BillDetail;
import com.uptc.frw.ferialibroweb.service.BillDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("bill-details")
public class BillDetailController {

    @Autowired
    private BillDetailService billDetailService;

    @GetMapping
    public List<BillDetail> getAll() {
        return billDetailService.findAllBillDetails();
    }

    @GetMapping("/{id}")
    public BillDetail getById(@PathVariable Long id) {
        return  billDetailService.findBillDetailById(id);
    }
}
