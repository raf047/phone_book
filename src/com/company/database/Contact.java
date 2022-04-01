package com.company.database;

import com.company.model.User;
import com.company.screen.StartScreen;

import java.util.HashMap;
import java.util.Map;

public class Contact {
    public static HashMap<String, User> contacts = new HashMap<>();



    public void add(User user){
        contacts.put(user.getName(), user);
    }
}
