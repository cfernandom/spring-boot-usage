package com.uptc.frw.ferialibroweb.service;

import com.uptc.frw.ferialibroweb.model.Edition;
import com.uptc.frw.ferialibroweb.repository.EditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditionService {

    @Autowired
    private EditionRepository editionRepository;

    public List<Edition> findAllEditions() {
        return editionRepository.findAll();
    }

    public Edition findEditionById(Long id) {
        return editionRepository.findById(id).orElse(null);
    }
}
