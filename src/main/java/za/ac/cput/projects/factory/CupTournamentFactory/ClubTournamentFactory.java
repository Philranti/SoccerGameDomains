package za.ac.cput.projects.factory.CupTournamentFactory;

import za.ac.cput.projects.domains.CupTournament.ClubTournaments;

public class ClubTournamentFactory {
    public static ClubTournaments createClubTournament(String clubTournamentName, int teamsParticipating, String clubWinner) {
        return new ClubTournaments.Builder()
                .clubTournament(clubTournamentName)
                .teamsParticipating(teamsParticipating)
                .clubWinner(clubWinner)
                .build();
    }
}
