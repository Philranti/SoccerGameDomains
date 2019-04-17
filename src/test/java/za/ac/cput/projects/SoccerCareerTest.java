package za.ac.cput.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.projects.domains.SoccerGame.SoccerCareerLeague;
import za.ac.cput.projects.factory.SoccerGameFactory.CareerFactory;

public class SoccerCareerTest {
    private SoccerCareerLeague career;
    @Before
    public void setUp() {
        career = CareerFactory.createCareer("Coaching Career", "Barcelona" );
    }

    @Test
    public void createCareer(){
        Assert.assertEquals(career.getCareerType(), career.getCareerType());
        Assert.assertEquals(career.getTeamCareerChosen(), career.getTeamCareerChosen());
    }
}
