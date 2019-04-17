package za.ac.cput.projects.factory.MasterLeagueFactory;

import za.ac.cput.projects.domains.MasterLeagues.NewTransfers;

public class NewTransferFactory {
    public static NewTransfers newTransfers(String newPlayerName, double transferFee) {
        return new NewTransfers.Builder()
                .newPlayerName(newPlayerName)
                .transferFee(transferFee)
                .build();
    }
}
