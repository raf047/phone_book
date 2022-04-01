package com.company.screen;

import com.company.enums.PhoneNumberType;

public class StartScreen extends Screen {
    @Override
    public void process() {
        boolean isRunning = true;
        while (isRunning){
            System.out.println("Contacts");
            System.out.println("1. Search");
            System.out.println("2. Add contact");
            System.out.println("3. See contacts");
            int i = 0;
            try {
                i = getIntegerFromUser();
            }catch (Exception e){
                continue;
            }
            switch (i){
                case 1:
                    SearchScreen searchScreen = new SearchScreen();
                    searchScreen.process();
                    isRunning = false;
                    break;
                case 2:
                    AddScreen addScreen = new AddScreen();
                    addScreen.process();
                    isRunning = false;
                    break;
                case 3:
                    ShowContactsScreen showContactsScreen = new ShowContactsScreen();
                    showContactsScreen.process();
                    isRunning = false;
                    break;
                default:
                    System.out.println("Wrong input! Please enter valid number");
            }

        }
    }

    public void alertMessage(String message){
        System.out.println(message);
        process();
    }

    public void test(){
        PhoneNumberType home = PhoneNumberType.HOME;
        System.out.println(home);

    }
}
