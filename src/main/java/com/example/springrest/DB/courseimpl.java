package com.example.springrest.DB;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface courseimpl extends MongoRepository<Course, String>{
    
}

