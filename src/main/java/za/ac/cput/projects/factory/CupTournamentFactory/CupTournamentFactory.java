package za.ac.cput.projects.factory.CupTournamentFactory;
import za.ac.cput.projects.domains.SoccerGame.CupTournaments;

public class CupTournamentFactory {
    public static CupTournaments createCupTournament(String nameOfTournament, int numberOfTournaments, int numberOfCupTeams, String clubWinner) {
        return new CupTournaments.Builder()
                .nameOfTournament(nameOfTournament)
                .numberOfTournaments(numberOfTournaments)
                .numberOfCupTeams(numberOfCupTeams)
                .build();
    }
}
