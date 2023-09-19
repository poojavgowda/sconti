package com.pooja.twitter.repository;

import com.pooja.twitter.model.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;


import java.util.Collection;
import java.util.List;

public interface UserRepository extends Neo4jRepository<User, Long> {
@Query("MATCH (u:User)-[r:Rated]->(m:Movie) RETURN u,r,m")
List<User> getAllUsers();

@Query("MATCH (u:User)")
boolean createRelation(Long userId, String movie);
}
