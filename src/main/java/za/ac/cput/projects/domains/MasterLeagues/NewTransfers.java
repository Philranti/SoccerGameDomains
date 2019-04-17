package za.ac.cput.projects.domains.MasterLeagues;

import java.util.Objects;

public class NewTransfers  extends Transfers{
    private String newPlayerName;
    private double transferFee;

    public NewTransfers() {
    }

    private NewTransfers(Builder builder) {
        this.newPlayerName = builder.newPlayerName;
        this.transferFee = builder.transferFee;
    }

    public String getNewPlayerName() {
        return newPlayerName;
    }

    public double getTransferFee() {
        return transferFee;
    }

    public static class Builder{

        private String newPlayerName;
        private double transferFee;

        public Builder newPlayerName(String newPlayerName) {
            this.newPlayerName = newPlayerName;
            return this;
        }

        public Builder transferFee(double transferFee) {
            this.transferFee = transferFee;
            return this;
        }

        public NewTransfers build() {
            return new NewTransfers(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return Double.compare(builder.transferFee, transferFee) == 0 &&
                    Objects.equals(newPlayerName, builder.newPlayerName);
        }

        @Override
        public int hashCode() {

            return Objects.hash(newPlayerName, transferFee);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "newPlayerName='" + newPlayerName + '\'' +
                    ", transferFee=" + transferFee +
                    '}';
        }
    }
    }
