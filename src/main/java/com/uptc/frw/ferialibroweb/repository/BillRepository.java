package com.uptc.frw.ferialibroweb.repository;

import com.uptc.frw.ferialibroweb.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
