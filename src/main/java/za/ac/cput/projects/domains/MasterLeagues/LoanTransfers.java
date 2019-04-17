package za.ac.cput.projects.domains.MasterLeagues;

import java.util.Objects;

public class LoanTransfers extends Transfers{
    private String loanedPlayer;
    private double loanFee;
    private int loanDuration;

    public LoanTransfers() {
    }

    private LoanTransfers(Builder builder) {
        this.loanedPlayer = builder.loanedPlayer;
        this.loanFee = builder.loanFee;
        this.loanDuration = builder.loanDuration;
    }

    public String getLoanedPlayer() {
        return loanedPlayer;
    }

    public double getLoanFee() {
        return loanFee;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    public static class Builder{

        private String loanedPlayer;
        private double loanFee;
        private int loanDuration;


        public Builder loanedPlayer(String loanedPlayer) {
            this.loanedPlayer = loanedPlayer;
            return this;
        }

        public Builder loanFee(double loanFee) {
            this.loanFee = loanFee;
            return this;
        }

        public Builder loanDuration(int loanDuration) {
            this.loanDuration = loanDuration;
            return this;
        }

        public LoanTransfers build()
        {
            return new LoanTransfers(this);
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LoanTransfers that = (LoanTransfers) o;
        return Double.compare(that.loanFee, loanFee) == 0 &&
                loanDuration == that.loanDuration &&
                Objects.equals(loanedPlayer, that.loanedPlayer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), loanedPlayer, loanFee, loanDuration);
    }

    @Override
    public String toString() {
        return "LoanTransfers{" +
                "loanedPlayer='" + loanedPlayer + '\'' +
                ", loanFee=" + loanFee +
                ", loanDuration=" + loanDuration +
                '}';
    }
}
