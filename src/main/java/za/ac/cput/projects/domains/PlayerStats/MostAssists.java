package za.ac.cput.projects.domains.PlayerStats;

import com.sun.org.glassfish.external.statistics.Stats;

import java.util.Objects;

public class MostAssists extends PlayerStats {
   private int numOfAssist;

   public MostAssists() {
   }

   private MostAssists(Builder builder) {
      this.numOfAssist = builder.numOfAssist;

   }

   public int getNumOfAssist() {
      return numOfAssist;
   }

   public static class Builder{

      private int numOfAssist;



      public Builder numOfAssist(int numOfAssist) {
         this.numOfAssist = numOfAssist;
         return this;
      }



      public MostAssists build() {
         return new MostAssists(this);
      }

   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      MostAssists that = (MostAssists) o;
      return getNumOfAssist() == that.getNumOfAssist();
   }

   @Override
   public int hashCode() {

      return Objects.hash(getNumOfAssist());
   }
}
