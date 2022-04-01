package com.company.controller;

import com.company.database.Contact;
import com.company.model.User;

import java.util.HashMap;
import java.util.Map;

public class ContactController {

    public void show(){
        HashMap<String, User> contacts = Contact.contacts;
        for (Map.Entry<String, User> entry : contacts.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }

    public void searchByPhoneNumber(String phoneNumber){

    }

    public void searchByName(String name){

    }
}
