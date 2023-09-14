package com.tms.JDBS;

import com.tms.domain.Person;
import com.tms.domain.Role;
import com.tms.repository.PersonRepository;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Tolia");
        person.setSecondName("karpov");
        person.setAge(68);
        person.setIsMarried(true);
        person.setCreated(null);

        PersonRepository personRepository = new PersonRepository();
        System.out.println(personRepository.create(person));
    }
}
