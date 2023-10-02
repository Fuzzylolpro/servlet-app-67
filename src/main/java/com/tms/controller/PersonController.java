package com.tms.controller;

import com.tms.domain.Person;
import com.tms.service.PersonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/person")
public class PersonController {
    public final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    //@RequestMapping(value = "/getAll", method = RequestMethod.GET)

    @GetMapping // отдает информацию
    public ResponseEntity<List<Person>> getAll() {
        log.info("Метод работает");
        List<Person> resultList = personService.getAll();
        return new ResponseEntity<>(resultList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonId(@PathVariable("id") Long id) {
        Optional<Person> person =personService.getPersonId(id);
        if(person.isPresent()){
            return new ResponseEntity<>(person.get(),HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
    @Tag(name ="create-tag")
    @PostMapping // создает
    public ResponseEntity<HttpStatus> create(@RequestBody Person person){
       return new ResponseEntity<>( personService.createPerson(person)?HttpStatus.CREATED : HttpStatus.CONFLICT);
    }

    @PutMapping
    public ResponseEntity<HttpStatus> update(@RequestBody Person person){
        return new ResponseEntity<>(personService.updatePerson(person)?HttpStatus.NO_CONTENT:HttpStatus.CONFLICT);
    }
    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Неверный ид"),
            @ApiResponse(responseCode = "404", description = "ИД не найден")})
    @Operation(summary = "удаляет пользователя из бд",description = "Берет ид, ищет пользователя и удаляет")
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@Parameter(description = "Это id persona который хотим удалять") @PathVariable("id") Long id){
        return new ResponseEntity<>(personService.deleteUserById(id)?HttpStatus.NO_CONTENT:HttpStatus.CONFLICT);
    }


    // @PutMapping изменяет информацию
    //@DeleteMapping удалить чтото
}
