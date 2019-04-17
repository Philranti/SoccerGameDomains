package za.ac.cput.projects.domains.CupTournament;

import za.ac.cput.projects.domains.SoccerGame.CupTournaments;

import java.util.Objects;

public class ClubTournaments extends CupTournaments {
    private String clubTournamentName;
    private int teamsParticipating;
    private String clubWinner;


    public ClubTournaments() {
    }

    private ClubTournaments(Builder builder) {
        this.clubTournamentName = builder.clubTournamentName;
        this.teamsParticipating = builder.teamsParticipating;
        this.clubWinner = builder.clubWinner;
    }

    public String getClubTournamentName() {
        return clubTournamentName;
    }

    public int getTeamsParticipating() {
        return teamsParticipating;
    }

    public String getClubWinner() {
        return clubWinner;
    }


    public static class Builder{

        private String clubTournamentName;
        private int teamsParticipating;
        private String clubWinner;


        public Builder clubTournament(String clubTournamentName) {
            this.clubTournamentName = clubTournamentName;
            return this;
        }

        public Builder teamsParticipating(int teamsParticipating) {
            this.teamsParticipating = teamsParticipating;
            return this;
        }

        public Builder clubWinner(String clubWinner) {
            this.clubWinner = clubWinner;
            return this;
        }

        public ClubTournaments build()
        {
            return new ClubTournaments(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClubTournaments that = (ClubTournaments) o;
        return getTeamsParticipating() == that.getTeamsParticipating() &&
                Objects.equals(getClubTournamentName(), that.getClubTournamentName()) &&
                Objects.equals(getClubWinner(), that.getClubWinner());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getClubTournamentName(), getTeamsParticipating(), getClubWinner());
    }

    @Override
    public String toString() {
        return "ClubTournaments{" +
                "clubTournamentName='" + clubTournamentName + '\'' +
                ", teamsParticipating=" + teamsParticipating +
                ", clubWinner='" + clubWinner + '\'' +
                '}';
    }
}
