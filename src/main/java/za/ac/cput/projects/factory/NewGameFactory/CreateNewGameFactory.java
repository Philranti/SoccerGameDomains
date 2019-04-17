package za.ac.cput.projects.factory.NewGameFactory;
import za.ac.cput.projects.domains.CreateNewGame.NewGame;

public class CreateNewGameFactory {
    public static NewGame newGame(String createName, String deleteGameName) {
        return new NewGame.Builder()
                .createName(createName)
                .deleteGameName(deleteGameName)
                .build();
    }

}
