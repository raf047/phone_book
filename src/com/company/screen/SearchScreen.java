package com.company.screen;

public class SearchScreen extends Screen {
    @Override
    public void process() {
        while (true){
            System.out.println("Search");
            System.out.println("1. Search by user name");
            System.out.println("2. Search by phone number");
            int i = 0;
            try {
                i = getIntegerFromUser();
            }catch (Exception e){
                continue;
            }

            if (i == 1){
                NameSearchScreen userNameSearchScreen = new NameSearchScreen();
                userNameSearchScreen.process();
                break;
            } else if (i == 2){
                PhoneNumberSearchScreen phoneNumberSearchScreen = new PhoneNumberSearchScreen();
                phoneNumberSearchScreen.process();
                break;
            }else {
                System.out.println("Wrong input! Please enter valid number");
            }
        }
    }
}
