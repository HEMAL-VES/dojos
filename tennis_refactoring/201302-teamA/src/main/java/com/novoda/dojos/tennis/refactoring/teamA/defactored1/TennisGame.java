package com.novoda.dojos.tennis.refactoring.teamA.defactored1;

public class TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;

    public void wonPoint(String playerName) {
        if (playerName == "player1") {
            m_score1 += 1;
        } else {
            m_score2 += 1;
        }
    }

    public String getScore() {
        String score = "";
        int tempScore = 0;
        if (scoresAreEqual()) {
            score = determineDrawScore();
        } else if (eitherScoreOverFourty()) {
            score = determineAdvantageOrWin();
        } else {
            score = determineNonDrawScore(score);
        }
        return score;
    }

    private String determineDrawScore() {
        String score;
        switch (m_score1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    private String determineNonDrawScore(String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = m_score1;
            } else {
                score += "-";
                tempScore = m_score2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private String determineAdvantageOrWin() {
        String score;
        int minusResult = m_score1 - m_score2;
        if (minusResult == 1) {
            score = "Advantage player1";
        } else if (minusResult == -1) {
            score = "Advantage player2";
        } else if (minusResult >= 2) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
        return score;
    }

    private boolean eitherScoreOverFourty() {
        return m_score1 >= 4 || m_score2 >= 4;
    }

    private boolean scoresAreEqual() {
        return m_score1 == m_score2;
    }
}
