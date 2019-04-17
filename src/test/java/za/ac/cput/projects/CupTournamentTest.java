package za.ac.cput.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.domains.SoccerGame.CupTournaments;
import za.ac.cput.projects.factory.CupTournamentFactory.CupTournamentFactory;


public class CupTournamentTest {
    private CupTournaments tournaments;
    @Before
    public void setUp() {
        tournaments = CupTournamentFactory.createCupTournament("World Cup", 1, 32, "France");
    }

    @Test
    public void createCupTournament(){
        Assert.assertEquals(tournaments.getNameOfTournament(), tournaments.getNameOfTournament());
        Assert.assertEquals(tournaments.getNumberOfTournaments(), tournaments.getNumberOfTournaments());
        Assert.assertEquals(tournaments.getNumberOfCupTeams(), tournaments.getNumberOfCupTeams());

    }
}
