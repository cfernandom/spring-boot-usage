package com.uptc.frw.ferialibroweb.controller;

import com.uptc.frw.ferialibroweb.model.Person;
import com.uptc.frw.ferialibroweb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAll() {
        return personService.findAllPersons();
    }

    @GetMapping("/{id}")
    public Person getById(@PathVariable Long id) {
        return personService.findPersonById(id);
    }
}
