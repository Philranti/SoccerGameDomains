package za.ac.cput.projects.domains.PlayerStats;

import java.util.Objects;

public class MostCleanSheets extends PlayerStats {
    private int numOfCleansheets;
    private int numOfGoalsConceded;

    public MostCleanSheets() {
    }

    private MostCleanSheets(Builder builder) {
        this.numOfGoalsConceded = builder.numOfGoalsConceded;
        this.numOfCleansheets = builder.numOfCleansheets;
    }

    public int getNumOfCleansheets() {
        return numOfCleansheets;
    }

    public int getNumOfGoalsConceded() {
        return numOfGoalsConceded;
    }


    public static class Builder {

        private int numOfCleansheets;
        private int numOfGoalsConceded;

        public Builder numOfCleansheets(int numOfCleansheets) {
            this.numOfCleansheets = numOfCleansheets;
            return this;
        }

        public Builder numOfGoalsConceded(int numOfGoalsConceded) {
            this.numOfGoalsConceded = numOfGoalsConceded;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MostCleanSheets that = (MostCleanSheets) o;
            return numOfCleansheets == that.numOfCleansheets &&
                    numOfGoalsConceded == that.numOfGoalsConceded;
        }

        @Override
        public int hashCode() {

            return Objects.hash(numOfCleansheets, numOfGoalsConceded);
        }

        public int getNumOfCleansheets() {
            return numOfCleansheets;
        }

        public int getNumOfGoalsConceded() {
            return numOfGoalsConceded;
        }

        @Override
        public String toString() {
            return "MostCleanSheets{" +
                    "numOfCleansheets=" + numOfCleansheets +
                    ", numOfGoalsConceded=" + numOfGoalsConceded +
                    '}';
        }
    }
}
