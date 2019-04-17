package za.ac.cput.projects.factory.MasterLeagueFactory;

import za.ac.cput.projects.domains.MasterLeagues.PromotePlayers;

public class PromotedPlayerFactory {
    public static PromotePlayers promotePlayers(String promotedPlayer) {
        return new PromotePlayers.Builder()
                .promotedPlayer(promotedPlayer)
                .build();
    }
}
