package com.company.Tirgul9;


import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FootballCoachTest {

    @Test(expected = InvalidPlayerException.class)
    public void testSendPlayerNullToBench() {
        ArrayList<String> activePlayers = new ArrayList<>();
        activePlayers.add("Moshe");
        activePlayers.add("Faruk");
        activePlayers.add("Motti");
        ArrayList<String> benchPlayers = new ArrayList<>();
        activePlayers.add("Yehuda");
        activePlayers.add("Tamar");
        activePlayers.add("Shalom");
        String formation = "4-4-3";
        FootballCoach footballCoach = new FootballCoach(activePlayers, benchPlayers, formation);
        footballCoach.sendPlayerToBench(null);
    }

    @Test(expected = InvalidCoachAction.class)
    public void testFalseActivePlayer() {
        ArrayList<String> activePlayers = new ArrayList<>();
        activePlayers.add("Moshe");
        activePlayers.add("Faruk");
        activePlayers.add("Motti");
        ArrayList<String> benchPlayers = new ArrayList<>();
        activePlayers.add("Yehuda");
        activePlayers.add("Tamar");
        activePlayers.add("Shalom");
        String formation = "4-4-3";
        FootballCoach footballCoach = new FootballCoach(activePlayers, benchPlayers, formation);
        footballCoach.sendPlayerToBench("suzan");

    }

    @Test
    public void testRemoveActivePlayer() {
        ArrayList<String> activePlayers = new ArrayList<>();
        activePlayers.add("Moshe");
        activePlayers.add("Faruk");
        activePlayers.add("Motti");
        ArrayList<String> benchPlayers = new ArrayList<>();
        benchPlayers.add("Yehuda");
        benchPlayers.add("Tamar");
        benchPlayers.add("Shalom");
        String formation = "4-4-3";
        FootballCoach footballCoach = new FootballCoach(activePlayers, benchPlayers, formation);
        footballCoach.sendPlayerToBench("Moshe");

        // Reflection 1

        ArrayList<String> m_activePlayers = null;
        Field privateStringField = null;
        try {
            privateStringField = FootballCoach.class.
                    getDeclaredField("m_activePlayers");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        privateStringField.setAccessible(true);
        try {
            m_activePlayers = (ArrayList<String>) privateStringField.get(footballCoach);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        // Reflection 2

        ArrayList<String> m_benchPlayers = null;
        Field privateField = null;
        try {
            privateField = FootballCoach.class.
                    getDeclaredField("m_benchPlayers");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        privateField.setAccessible(true);
        try {
            m_benchPlayers = (ArrayList<String>) privateField.get(footballCoach);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        assertEquals(m_activePlayers.contains("Moshe"), false);
        assertEquals(m_benchPlayers.contains("Moshe"), true);
    }

    @Test(expected = InvalidCoachAction.class)
    public void testSendPlayerNullToField() {
        ArrayList<String> activePlayers = new ArrayList<>();
        activePlayers.add("Moshe");
        activePlayers.add("Faruk");
        activePlayers.add("Motti");
        ArrayList<String> benchPlayers = new ArrayList<>();
        activePlayers.add("Yehuda");
        activePlayers.add("Tamar");
        activePlayers.add("Shalom");
        String formation = "4-4-3";
        FootballCoach footballCoach = new FootballCoach(activePlayers, benchPlayers, formation);
        footballCoach.sendPlayerToField(null);

    }

    @Test(expected = InvalidCoachAction.class)
    public void testFalseBenchPlayer() {
        ArrayList<String> activePlayers = new ArrayList<>();
        activePlayers.add("Moshe");
        activePlayers.add("Faruk");
        activePlayers.add("Motti");
        ArrayList<String> benchPlayers = new ArrayList<>();
        activePlayers.add("Yehuda");
        activePlayers.add("Tamar");
        activePlayers.add("Shalom");
        String formation = "4-4-3";
        FootballCoach footballCoach = new FootballCoach(activePlayers, benchPlayers, formation);
        footballCoach.sendPlayerToField("Yehuda");
    }

    @Test
    public void testRemoveBenchPlayer() {
        ArrayList<String> activePlayers = new ArrayList<>();
        activePlayers.add("Moshe");
        activePlayers.add("Faruk");
        activePlayers.add("Motti");
        ArrayList<String> benchPlayers = new ArrayList<>();
        benchPlayers.add("Yehuda");
        benchPlayers.add("Tamar");
        benchPlayers.add("Shalom");
        String formation = "4-4-3";
        FootballCoach footballCoach = new FootballCoach(activePlayers, benchPlayers, formation);
        footballCoach.sendPlayerToField("Tamar");

        // Reflection 1

        ArrayList<String> m_benchPlayers = null;
        Field privateStringField = null;
        try {
            privateStringField = FootballCoach.class.
                    getDeclaredField("m_benchPlayers");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        privateStringField.setAccessible(true);
        try {
            m_benchPlayers = (ArrayList<String>) privateStringField.get(footballCoach);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        // Reflection 2

        ArrayList<String> m_activePlayers = null;
        Field privateField = null;
        try {
            privateField = FootballCoach.class.
                    getDeclaredField("m_activePlayers");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        privateField.setAccessible(true);
        try {
            m_activePlayers = (ArrayList<String>) privateField.get(footballCoach);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        assertEquals(m_benchPlayers.contains("Tamar"), false);
        assertEquals(m_activePlayers.contains("Tamar"), true);


    }

    @Test(expected = NotEnoughPlayersException.class)
    public void testMinusActivePlayersFormation() {
        ArrayList<String> activePlayers = new ArrayList<>();
        activePlayers.add("Moshe");
        activePlayers.add("Faruk");
        activePlayers.add("Motti");
        ArrayList<String> benchPlayers = new ArrayList<>();
        benchPlayers.add("Yehuda");
        benchPlayers.add("Tamar");
        benchPlayers.add("Shalom");
        String formation = "4-4-3";
        FootballCoach footballCoach = new FootballCoach(activePlayers, benchPlayers, formation);
        footballCoach.changePlayersFormation("2-2-5");

    }

    @Test
    public void testPlusActivePlayersFormation() {
        ArrayList<String> activePlayers = new ArrayList<>();
        activePlayers.add("Moshe");
        activePlayers.add("Faruk");
        activePlayers.add("Motti");
        ArrayList<String> benchPlayers = new ArrayList<>();
        benchPlayers.add("Yehuda");
        benchPlayers.add("Tamar");
        benchPlayers.add("Shalom");
        String formation = "4-4-3";
        FootballCoach footballCoach = new FootballCoach(activePlayers, benchPlayers, formation);
        footballCoach.changePlayersFormation("5-5-3");

        // Reflection 1
        ArrayList<String> m_playersFormation = null;
        Field privateStringField = null;
        try {
            privateStringField = FootballCoach.class.
                    getDeclaredField("m_benchPlayers");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        privateStringField.setAccessible(true);
        try {
            m_playersFormation = (ArrayList<String>) privateStringField.get(footballCoach);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        // Reflection 2

        ArrayList<String> m_activePlayers = null;
        Field privateField = null;
        try {
            privateField = FootballCoach.class.
                    getDeclaredField("m_activePlayers");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        privateField.setAccessible(true);
        try {
            m_activePlayers = (ArrayList<String>) privateField.get(footballCoach);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
     //   assertEquals(m_activePlayers.contains("Tamar"), false);
     //   assertEquals(m_playersFormation.contains("Tamar"), true);


    }
}

