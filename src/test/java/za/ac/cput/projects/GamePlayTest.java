package za.ac.cput.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.domains.ExhibitionMatches.GamePlay;
import za.ac.cput.projects.domains.SoccerGame.SoccerCareerLeague;
import za.ac.cput.projects.factory.ExhibitionFactory.GamePlayFactory;
import za.ac.cput.projects.factory.SoccerGameFactory.CareerFactory;

public class GamePlayTest {
    private GamePlay game;
    @Before
    public void setUp() {
        game = GamePlayFactory.createGamePlay("Two Player", 30, true, true, 6, "Old Trafford" );
    }

    @Test
    public void createGamePlay(){
        Assert.assertEquals(game.getPlayerMode(), game.getPlayerMode());

    }
}
