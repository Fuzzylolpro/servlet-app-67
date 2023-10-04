package com.tms.service;

import com.tms.domain.Person;
import com.tms.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyLong;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
    static List<Person> personList = null;
    static Person person = null;
    static Long personID=10L;

    @BeforeAll
    static void beforeAll() {
        personList = new ArrayList<>();
        person = new Person();
        person.setId(personID);
        person.setFirstName("Alex");

        personList.add(person);

    }
    @InjectMocks
    PersonService personService;

    @Mock
    PersonRepository personRepository;

    @Test
    public void getPersonByIdTest(){
        personService.getPersonId(personID);
        Mockito.verify(personRepository,Mockito.times(1)).getPersonById(anyLong());
    }
    @Test
    public void getAllTest(){
        Mockito.when(personRepository.getAll()).thenReturn(personList);
        List<Person> resultList = personService.getAll();
        Mockito.verify(personRepository,Mockito.times(1)).getAll();
        Assertions.assertNotNull(resultList);
    }
}
