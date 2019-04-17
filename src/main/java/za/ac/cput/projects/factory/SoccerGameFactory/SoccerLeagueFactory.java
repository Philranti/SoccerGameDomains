package za.ac.cput.projects.factory.SoccerGameFactory;
import za.ac.cput.projects.domains.SoccerGame.SoccerLeague;


public class SoccerLeagueFactory {
    public static SoccerLeague createSoccerLeague(String nameOfLeague,int totalGames, int numberOfTeams ) {
        return new SoccerLeague.Builder()
                .nameOfLeague(nameOfLeague)
                .totalGames(totalGames)
                .numberOfTeams(numberOfTeams)
                .build();
    }

}
