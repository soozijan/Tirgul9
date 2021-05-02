package com.company.Tirgul9;

import java.util.ArrayList;

public class CellPhone {
    public ArrayList<String> phoneBook;

    public CellPhone(ArrayList<String> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void addPhoneNumberToList(String phone_number) {
        phoneBook.add(phone_number);
        if (phone_number == null) {
            throw new InvalidNumberExeption(phone_number);
        }
            if (phoneBook.size()>10)  {
                throw new PhoneBookIsFullExeption();


        }

    }

    public  void callNumber(String phone_number) {
        System.out.println("Calling to the.......");
        System.out.println(phone_number);
        if (phone_number == null) {
            throw new InvalidNumberExeption(phone_number);

        }


    }

}
