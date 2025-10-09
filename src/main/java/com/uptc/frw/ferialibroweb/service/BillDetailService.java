package com.uptc.frw.ferialibroweb.service;

import com.uptc.frw.ferialibroweb.model.BillDetail;
import com.uptc.frw.ferialibroweb.repository.BillDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillDetailService {

    @Autowired
    private BillDetailRepository billDetailRepository;

    public List<BillDetail> findAllBillDetails() {
        return billDetailRepository.findAll();
    }

    public BillDetail findBillDetailById(Long id) {
        return billDetailRepository.findById(id).orElse(null);
    }
}
