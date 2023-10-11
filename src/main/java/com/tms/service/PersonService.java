package com.tms.service;

import com.tms.domain.Person;
import com.tms.domain.Role;
import com.tms.repository.PersonRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAll() {
        return personRepository.getAll();

    }

    public Person getById(HttpServletRequest request) {
        //Logic to find

        return new Person();
    }

    public Boolean createPerson(Person person) {
        person.setCreated(Timestamp.valueOf(LocalDateTime.now()));
        person.setRole(Role.USER);
        return personRepository.create(person);
    }

    public Boolean updatePerson(Person person) {
        return personRepository.update(person);
    }

    public Optional<Person> getPersonId(long id) {
        return personRepository.getPersonById(id);
    }

    public Boolean updateUser(HttpServletRequest request) {
        return false;
    }

    public Boolean deleteUser(HttpServletRequest request) {
        return false;
    }

    public void deleteUserById(Long id) {
        personRepository.deleteById(id);
    }


}
