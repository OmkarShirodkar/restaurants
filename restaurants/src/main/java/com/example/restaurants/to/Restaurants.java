package com.example.restaurants.to;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Restaurants {

    @Id
    private ObjectId id;
    private String name;
    private String cuisine;
    private int stars;
    private Address address;
}
