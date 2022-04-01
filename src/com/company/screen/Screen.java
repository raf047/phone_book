package com.company.screen;

import com.company.database.Contact;
import com.company.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class Screen {
    private static Scanner scanner = new Scanner(System.in);

    protected int getIntegerFromUser() {
        return scanner.nextInt();
    }

    protected String getStringFromUser() {
        return scanner.next();
    }

    public static Scanner getScanner() {
        return scanner;
    }

//    protected void showContacts(){
//        Contact contacts = new Contact();
//        contacts.show();
//    }

    public abstract void process();
}
