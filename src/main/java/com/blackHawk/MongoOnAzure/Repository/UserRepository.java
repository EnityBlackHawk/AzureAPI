package com.blackHawk.MongoOnAzure.Repository;


import com.blackHawk.MongoOnAzure.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
