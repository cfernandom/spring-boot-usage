package com.uptc.frw.ferialibroweb.controller;

import com.uptc.frw.ferialibroweb.model.Edition;
import com.uptc.frw.ferialibroweb.service.EditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("editions")
public class EditionController {

    @Autowired
    private EditionService editionService;

    @GetMapping
    public List<Edition> getAll() {
        return editionService.findAllEditions();
    }
}
