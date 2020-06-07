package com.sample.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sample.mongo.api.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer>{

}
