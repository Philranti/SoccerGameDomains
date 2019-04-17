package za.ac.cput.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.domains.CupTournament.ClubTournaments;
import za.ac.cput.projects.domains.SoccerGame.SoccerCareerLeague;
import za.ac.cput.projects.factory.CupTournamentFactory.ClubTournamentFactory;
import za.ac.cput.projects.factory.SoccerGameFactory.CareerFactory;

public class ClubTournamentTest {
    private ClubTournaments club;
    @Before
    public void setUp() {
       club = ClubTournamentFactory.createClubTournament("UEFA CHAMPIONS LEAGUE", 32,"Barcelona" );
    }

    @Test
    public void createClub(){
        Assert.assertEquals(club.getClubTournamentName(), club.getClubTournamentName());

    }
}
