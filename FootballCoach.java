package com.company.Tirgul9;

import java.util.ArrayList;

public class FootballCoach {
    private static ArrayList<String> m_activePlayers;
    private static ArrayList<String> m_benchPlayers;
    private static String m_playersFormation;


    public FootballCoach(ArrayList<String> m_activePlayers, ArrayList<String> m_benchPlayers, String m_playersFormation) {
        this.m_activePlayers = m_activePlayers;
        this.m_benchPlayers = m_benchPlayers;
        this.m_playersFormation = m_playersFormation;
    }

    public void sendPlayerToBench(String player) {
        if (player == null) {
            throw new InvalidPlayerException();
        }
        if (m_activePlayers.contains(player) == false) {
            throw new InvalidCoachAction();
        }
        m_activePlayers.remove(player);
        m_benchPlayers.add(player);
    }

    public void sendPlayerToField (String player)  {

        if (player == null) {
            throw new InvalidPlayerException();
        }
        if (m_benchPlayers.contains(player) == false) {
            throw new InvalidCoachAction();
        }
        m_benchPlayers.remove(player);
        m_activePlayers.add(player);
    }
    //הפונקציה תבדוק האם
    //יש לא פחות מ-11 שחקנים במגרש )היא תבדוק ב- activePlayers_m ,)אם כן - היא תכניס את המבנה שהתקבל ל -
    //playersFormation_m .אם לא - היא תזרוק Exception מסוג NotEnougthPlayersException( עליך לייצר אותו(.

    public void changePlayersFormation (String formation)  {
        if (m_activePlayers.size() >= 11 )  {
            m_playersFormation = formation;
        }
        else {
            throw new NotEnoughPlayersException();
        }
    }

    }
