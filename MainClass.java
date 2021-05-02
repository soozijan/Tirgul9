package com.company.Tirgul9;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        //1ג:
        String s = null;
        System.out.println(s.length());



        try {
            countChar(null);
        }
        catch (Exception NullPointerExeption) {
            System.out.println("I know it's null");
        }
        System.out.println("Hello there");




        // שאלה 7 ב.

        Person person = new Person("Moshe");

        ArrayList<String> m_name = null; // m_items
        Field privateStringField = null;

        try {
            privateStringField = Person.class.getDeclaredField("name");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        privateStringField.setAccessible(true);
        try {
            m_name = (ArrayList<String>) privateStringField.get(person);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("******");

    }

    // 4:
    //exeption NullPointerExeption קיבלנו
    public static int countChar(String string) {

        return string.length();
    }


}
