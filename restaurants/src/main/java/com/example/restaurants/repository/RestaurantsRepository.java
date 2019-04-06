package com.example.restaurants.repository;

import com.example.restaurants.to.Restaurants;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "restaurants", path = "restaurants")
public interface RestaurantsRepository extends MongoRepository<Restaurants, String> {

    Restaurants findByName(@Param("name") String name);

}
