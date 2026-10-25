import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.awt.*;

public class Menu {

    public Scene criarCena(Stage stage){
        Label titulo = new Label("Bem vindo ao Javamon");
        Button iniciar = new Button("Iniciar");
        Button sair = new Button("Sair");

        iniciar.setOnAction(event -> {
            SelectPokemon selecao = new SelectPokemon();
            stage.setScene(selecao.criarCena(stage));
        });

        sair.setOnAction(event -> {
            stage.close();
        });

        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(titulo, iniciar, sair);
        return new Scene(layout, 800, 600);
    }
}
