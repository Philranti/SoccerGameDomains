package za.ac.cput.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.domains.ExhibitionMatches.ChooseTeams;
import za.ac.cput.projects.domains.SoccerGame.SoccerCareerLeague;
import za.ac.cput.projects.factory.ExhibitionFactory.ChooseTeamFactory;
import za.ac.cput.projects.factory.SoccerGameFactory.CareerFactory;

public class ChooseTeamTest{
    private ChooseTeams teams;
    @Before
    public void setUp() {teams = ChooseTeamFactory.createTeams("Barcelona", "Real Madrid" );
    }

    @Test
    public void createTeams(){
        Assert.assertEquals(teams.getChooseTeamA(), teams.getChooseTeamA());

    }
}
