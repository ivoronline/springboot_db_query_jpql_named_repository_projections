package com.ivoronline.springboot_db_query_jpql_named_repository_projections.repositories;

import com.ivoronline.springboot_db_query_jpql_named_repository_projections.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  Person  returnEntity     (String name);
  Object  returnObjectArray(String name);
  String  returnString     (String name);
  Integer returnScalar     (String name);

}


