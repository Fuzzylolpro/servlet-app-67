package com.tms.service;

import com.tms.domain.Person;
import com.tms.domain.Role;
import com.tms.repository.PersonRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public Boolean createUser(HttpServletRequest request) {
        Person person = new Person();
        person.setFirstName(request.getParameter("first-name"));
        person.setSecondName(request.getParameter("second-name"));
        person.setAge(Integer.parseInt(request.getParameter("age")));
        person.setIsMarried(Boolean.parseBoolean(request.getParameter("is-married")));
        Boolean isCreated = personRepository.create(person);
        request.setAttribute("result", isCreated);
        return isCreated;
    }

    public Person getPersonId(long id){
        return personRepository.getPersonById(id);
    }

    public Boolean updateUser(HttpServletRequest request) {
        return false;
    }

    public Boolean deleteUser(HttpServletRequest request) {
        return false;
    }


}
