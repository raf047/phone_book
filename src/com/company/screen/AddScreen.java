package com.company.screen;

import com.company.controller.UserController;
import com.company.database.Contact;
import com.company.enums.PhoneNumberType;
import com.company.model.User;

import java.util.ArrayList;

public class AddScreen extends Screen {
    @Override
    public void process() {
        while (true) {
            System.out.println("Add new contact");
//            System.out.println("Input userName");
//            String userName = getStringFromUser();
            System.out.println("Input name");
            String name = getStringFromUser();

            System.out.println("Input phone number");
            String phoneNumber = getStringFromUser();

            ArrayList<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            enterAnotherNumber(phoneNumbers);

            System.out.println("Input phone number type");
            String phoneNumberType = getScanner().next();

            System.out.println("Input company");
            String company = getStringFromUser();

            System.out.println("Enter email");
            String email = getStringFromUser();
            ArrayList<String> emails = new ArrayList<>();
            emails.add(email);
            enterAnotherEmail(emails);
            UserController userController = new UserController();
//            User newUser = new User(firstName, lastName, phoneNumbers, phoneNumberType, company, emails);
//            Contact contact = new Contact();
//            contact.add(newUser, userName);
            userController.add(name, phoneNumbers, phoneNumberType, company, emails);
            break;
        }
    }

    private void enterAnotherNumber(ArrayList<String> phoneNumbers){
        while (true){
            System.out.println("1. Enter another phone number");
            System.out.println("2. continue");
            int i = getIntegerFromUser();
            if (i == 1){
                System.out.println("Enter number");
                String phoneNumber = getStringFromUser();
                phoneNumbers.add(phoneNumber);
            }else if (i == 2){
                break;
            }else {
                System.out.println("Wrong input! Please enter valid number");
            }
        }
    }

    private void enterAnotherEmail(ArrayList<String> emails){
        while (true){
            System.out.println("1. Enter another email ");
            System.out.println("2. continue");
            int i = 0;
            try {
                i = getIntegerFromUser();
            }catch (Exception e){
                continue;
            }
            if (i == 1){
                System.out.println("Enter email");
                String email = getStringFromUser();
                emails.add(email);
            }else if (i == 2){
                break;
            }else {
                System.out.println("Wrong input! Please enter valid number");
            }
        }
    }
}
