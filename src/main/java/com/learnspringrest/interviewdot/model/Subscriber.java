package com.learnspringrest.interviewdot.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("subscribers")
public class Subscriber {
    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String email;
}
