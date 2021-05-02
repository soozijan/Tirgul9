package com.company.Tirgul9;

import org.junit.Test;

import java.util.ArrayList;
import static junit.framework.TestCase.assertEquals;


public class CellphoneTest {

    @Test
    public void testAddPhoneNumberPositiveToList() {
        ArrayList<String> phonebookExpected = new ArrayList<String>();
        phonebookExpected.add("1");

        CellPhone cellPhone = new CellPhone(new ArrayList<String>());
        cellPhone.addPhoneNumberToList("1");

        assertEquals(phonebookExpected, cellPhone.phoneBook);

    }


    @Test(expected = InvalidNumberExeption.class)
    public void testAddPhoneNumberNullToList() {
        CellPhone cellPhone = new CellPhone(new ArrayList<String>());
        cellPhone.addPhoneNumberToList(null);
    }


    @Test
    public void testAddPhoneNumber2ToList() {
        CellPhone cellPhone = new CellPhone(new ArrayList<String>());
        cellPhone.addPhoneNumberToList("054482576");


    }


    @Test(expected = InvalidNumberExeption.class)
    public void testCallNullNumber() {
        CellPhone cellPhone = new CellPhone(new ArrayList<String>());
        cellPhone.callNumber(null);
    }


}

