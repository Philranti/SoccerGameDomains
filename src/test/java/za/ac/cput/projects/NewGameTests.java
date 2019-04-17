package za.ac.cput.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.domains.CreateNewGame.NewGame;
import za.ac.cput.projects.domains.ExhibitionMatches.ChooseTeams;
import za.ac.cput.projects.factory.ExhibitionFactory.ChooseTeamFactory;
import za.ac.cput.projects.factory.NewGameFactory.CreateNewGameFactory;

public class NewGameTests {
    private NewGame newGame;
    @Before
    public void setUp() {newGame = CreateNewGameFactory.newGame("PhillipMphelaGame", "PhilGame" );
    }

    @Test
    public void createTeams(){
        Assert.assertEquals(newGame.getCreateName(), newGame.getCreateName());

    }

}
