package com.company.controller;

import com.company.database.Contact;
import com.company.model.User;
import com.company.screen.StartScreen;

import java.util.ArrayList;

public class UserController {

    public void add(String name, ArrayList<String> phoneNumbers, String phoneNumberType, String company, ArrayList<String> emails){
        User user = create(name, phoneNumbers, phoneNumberType, company, emails);
        Contact contact = new Contact();
        contact.add(user);
        StartScreen startScreen = new StartScreen();
        startScreen.alertMessage("/New contact successfully added/");

    }

    public User create(String name, ArrayList<String> phoneNumbers, String phoneNumberType, String company, ArrayList<String> emails){
//        return new User(name, phoneNumbers, phoneNumberType, company, emails);
        return null;
    }
}
