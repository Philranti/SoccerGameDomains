package za.ac.cput.projects.factory.ExhibitionFactory;

import za.ac.cput.projects.domains.ExhibitionMatches.ChooseTeams;

public class ChooseTeamFactory {
    public static ChooseTeams createTeams(String chooseTeamA, String chooseTeamB) {
        return new ChooseTeams.Builder()
                .chooseTeamA(chooseTeamA)
                .chooseTeamB(chooseTeamB)
                .build();
    }
}
