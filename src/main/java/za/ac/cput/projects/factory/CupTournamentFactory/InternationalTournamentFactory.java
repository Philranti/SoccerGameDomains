package za.ac.cput.projects.factory.CupTournamentFactory;

import za.ac.cput.projects.domains.CupTournament.InternationalTournaments;

public class InternationalTournamentFactory {
    public static InternationalTournaments internationalTournaments(String interTournamentName, int numOfInternationalTournaments
            , int numOfNationsParticipating
            , String nationWinner) {
        return new InternationalTournaments.Builder()
                .interTournamentName(interTournamentName)
                .numOfInternationalTournaments(numOfInternationalTournaments)
                .numOfNationsParticipating(numOfNationsParticipating)
                .nationWinner(nationWinner)
                .build();
    }

}
