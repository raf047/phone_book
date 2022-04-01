package com.company.screen;

import com.company.controller.ContactController;

public class PhoneNumberSearchScreen extends Screen {
    @Override
    public void process() {
        System.out.println("Search by phone number");
        while (true) {
            System.out.println("Enter phone number");
            String phoneNumber = getStringFromUser();
            ContactController contactController = new ContactController();
            contactController.searchByPhoneNumber(phoneNumber);
        }
    }
}
