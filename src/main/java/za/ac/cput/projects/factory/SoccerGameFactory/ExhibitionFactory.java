package za.ac.cput.projects.factory.SoccerGameFactory;

import za.ac.cput.projects.domains.SoccerGame.ExhibitionMatch;

public class ExhibitionFactory {
    public static ExhibitionMatch createExhibition(String scoreResult, String playerWon, boolean homeAway) {
        return new ExhibitionMatch.Builder()
                .scoreResult(scoreResult)
                .playerWon(playerWon)
                .homeAway(homeAway)
                .build();
    }
}
