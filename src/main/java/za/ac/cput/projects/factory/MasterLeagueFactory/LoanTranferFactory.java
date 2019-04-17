package za.ac.cput.projects.factory.MasterLeagueFactory;

import za.ac.cput.projects.domains.MasterLeagues.LoanTransfers;

public class LoanTranferFactory {
    public static LoanTransfers loanTransfers(String loanedPlayer, double loanFee, int loanDuration) {
        return new LoanTransfers.Builder()
                .loanedPlayer(loanedPlayer)
                .loanFee(loanFee)
                .loanDuration(loanDuration)
                .build();
    }
}
