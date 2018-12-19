package me.robbie.services.demo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class User {
    private long userId;
    private String userName;
    private int age;
}
