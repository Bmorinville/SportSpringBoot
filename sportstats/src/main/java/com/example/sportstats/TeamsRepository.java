package com.example.sportstats;

import org.springframework.data.repository.CrudRepository;
//repository works with Customer entities and Integer IDs. also declares the findCustomerById() method.
public interface TeamsRepository extends CrudRepository<Team, Integer> {

    Team findTeamsById(Integer id);
}
