package com.company.screen;

import com.company.controller.ContactController;

public class NameSearchScreen extends Screen {
    @Override
    public void process() {
        System.out.println("Search by name");
        while (true) {
            System.out.println("Enter name");
            String name = getStringFromUser();
            ContactController contactController = new ContactController();
            contactController.searchByName(name);
            break;
        }

    }
}
