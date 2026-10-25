
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Menu menu = new Menu();
        stage.setTitle("JAVAMON");
        stage.setScene(menu.criarCena(stage));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
