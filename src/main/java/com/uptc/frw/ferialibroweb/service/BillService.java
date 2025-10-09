package com.uptc.frw.ferialibroweb.service;

import com.uptc.frw.ferialibroweb.model.Bill;
import com.uptc.frw.ferialibroweb.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    @Autowired
    private BillRepository billRepository;

    public List<Bill> findAllBills() {
        return billRepository.findAll();
    }

    public Bill findBillById(Long id) {
        return billRepository.findById(id).orElse(null);
    }
}
