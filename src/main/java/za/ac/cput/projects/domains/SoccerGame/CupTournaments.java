package za.ac.cput.projects.domains.SoccerGame;

import java.util.Objects;

public class CupTournaments {
   private String nameOfTournament;
    private int numberOfTournaments;
    private int numberOfCupTeams;
    private String clubWinner;

    public CupTournaments() {
    }

    private CupTournaments(Builder builder) {
        this.nameOfTournament = builder.nameOfTournament;
        this.numberOfTournaments = builder.numberOfTournaments;
        this.numberOfCupTeams = builder.numberOfCupTeams;
        this.clubWinner = builder.clubWinner;
    }

    public String getNameOfTournament() {
        return nameOfTournament;
    }

    public int getNumberOfTournaments() {
        return numberOfTournaments;
    }

    public int getNumberOfCupTeams() {
        return numberOfCupTeams;
    }

    public String getClubWinner() {
        return clubWinner;
    }

    public static class Builder{

        private String nameOfTournament;
        private int numberOfTournaments;
        private int numberOfCupTeams;
        private String clubWinner;

        public Builder nameOfTournament(String nameOfTournament) {
            this.nameOfTournament = nameOfTournament;
            return this;
        }

        public Builder numberOfTournaments(int numberOfTournaments) {
            this.numberOfTournaments = numberOfTournaments;
            return this;
        }

        public Builder numberOfCupTeams(int numberOfCupTeams) {
            this.numberOfCupTeams = numberOfCupTeams;
            return this;
        }

        public Builder clubWinner(String clubWinner) {
            this.clubWinner = clubWinner;
            return this;
        }

        public CupTournaments build() {
            return new CupTournaments(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CupTournaments that = (CupTournaments) o;
        return getNumberOfTournaments() == that.getNumberOfTournaments() &&
                getNumberOfCupTeams() == that.getNumberOfCupTeams() &&
                Objects.equals(getNameOfTournament(), that.getNameOfTournament()) &&
                Objects.equals(getClubWinner(), that.getClubWinner());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNameOfTournament(), getNumberOfTournaments(), getNumberOfCupTeams(), getClubWinner());
    }

    @Override
    public String toString() {
        return "CupTournaments{" +
                "nameOfTournament='" + nameOfTournament + '\'' +
                ", numberOfTournaments=" + numberOfTournaments +
                ", numberOfCupTeams=" + numberOfCupTeams +
                ", clubWinner='" + clubWinner + '\'' +
                '}';
    }
}
