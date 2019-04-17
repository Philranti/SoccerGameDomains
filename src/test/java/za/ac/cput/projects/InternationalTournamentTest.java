package za.ac.cput.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.domains.CupTournament.InternationalTournaments;
import za.ac.cput.projects.domains.SoccerGame.SoccerCareerLeague;
import za.ac.cput.projects.factory.CupTournamentFactory.InternationalTournamentFactory;
import za.ac.cput.projects.factory.SoccerGameFactory.CareerFactory;

public class InternationalTournamentTest {
    private InternationalTournaments international;
    @Before
    public void setUp() {
        international = InternationalTournamentFactory.internationalTournaments("AFCON ", 2 ,50,"Cameroon");
    }

    @Test
    public void createInternational(){
        Assert.assertEquals(international.getInterTournamentName(), international.getInterTournamentName());

    }
}
