package com.example.uRegandLog.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test (String s){
        // todo: REGEX to validate email
        return true;
    }
}
