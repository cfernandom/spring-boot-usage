package com.uptc.frw.ferialibroweb.service;

import com.uptc.frw.ferialibroweb.model.Person;
import com.uptc.frw.ferialibroweb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAllPersons() {
        return personRepository.findAll();
    }

    public Person findPersonById(Long id) {
        return personRepository.findById(id).orElse(null);
    }
}
