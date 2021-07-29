package com.learnspringrest.interviewdot.repository;

import com.learnspringrest.interviewdot.model.Subscriber;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubscriberRepository  extends MongoRepository<Subscriber, String> {
}
