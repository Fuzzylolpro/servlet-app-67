package com.tms.service;

import com.tms.domain.Person;
import com.tms.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Slf4j
@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAll() {
        return personRepository.findAll();

    }
    public Optional<Person> getPersonId(long id) {
        return personRepository.findById(id);
    }

    public Boolean createPerson(Person person) {
        try {
            person.setCreated(Timestamp.valueOf(LocalDateTime.now()));
            personRepository.save(person);
            log.info(String.format("person created"+person.getFirstName()));
        }catch (Exception e){
            log.warn(String.format("error",person.getFirstName()));
            return false;
        }
        return true;
    }

    public Boolean updatePerson(Person person) {
        try {
            personRepository.saveAndFlush(person);
            log.info(String.format("person update"+person.getId()));
        }catch (Exception e){
            log.warn(String.format("error",person.getId(),e));
            return false;
        }
        return true;
    }

    public void deletePersonById(Long id){
        personRepository.deleteById(id);
    }
 /*   public Person updateAge(Integer age){
       return personRepository.updateByAge(age);
    }*/
}
