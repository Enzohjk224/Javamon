import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Batalha {
    public Scene criarCena (Stage stage){

        Label tituloTela = new Label("Tela de Batalha");

        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(tituloTela);
        return new Scene(layout, 800, 600);
    }
}
