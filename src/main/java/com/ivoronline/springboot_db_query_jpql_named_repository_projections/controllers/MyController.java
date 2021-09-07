package com.ivoronline.springboot_db_query_jpql_named_repository_projections.controllers;

import com.ivoronline.springboot_db_query_jpql_named_repository_projections.entities.Person;
import com.ivoronline.springboot_db_query_jpql_named_repository_projections.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // RETURN ENTITY
  //================================================================
  @RequestMapping("ReturnEntity")
  Person returnEntity() {
    Person person = personRepository.returnEntity("John");
    return person;
  }

  //================================================================
  // RETURN OBJECT ARRAY
  //================================================================
  @RequestMapping("ReturnObjectArray")
  Object[] returnObjectArray() {
    Object[] objectArray = (Object[]) personRepository.returnObjectArray("John");
    return   objectArray;
  }

  //================================================================
  // RETURN STRING
  //================================================================
  @RequestMapping("ReturnString")
  String returnString() {
    String nameAge = personRepository.returnString("John");
    return nameAge;
  }

  //================================================================
  // RETURN SCALAR
  //================================================================
  @RequestMapping("ReturnScalar")
  Integer returnScalar() {
    Integer age = personRepository.returnScalar("John");
    return  age;
  }

}


