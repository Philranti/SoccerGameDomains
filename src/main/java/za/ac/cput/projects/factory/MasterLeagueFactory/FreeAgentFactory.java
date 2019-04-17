package za.ac.cput.projects.factory.MasterLeagueFactory;

import za.ac.cput.projects.domains.MasterLeagues.FreeAgents;

public class FreeAgentFactory {
    public static FreeAgents freeAgents(String freeAgentPlayer) {
        return new FreeAgents.Builder()
                .freeAgentPlayer(freeAgentPlayer)
                .build();
    }
}
