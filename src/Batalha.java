import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Batalha {
    public Scene criarCena (Stage stage, Main.Pokemon pokemonSelect){
        Main.Pokemon pokemonInimi;

        pokemonInimi = new Main.Pokemon("Ratata", 40, 5);

        Label tituloTela = new Label("Tela de Batalha");
        Button testeBotao = new Button("Testar");
        Label pokemonInimigo = new Label(pokemonInimi.nome);
        ProgressBar vidaInimigo = new ProgressBar(1.0);
        vidaInimigo.setPrefWidth(200);
        vidaInimigo.setPrefHeight(18);
        vidaInimigo.setStyle("-fx-accent: #43b96a;");
        Button atacar = new Button("Atacar");

        testeBotao.setOnAction(event -> {
//            System.out.println(toString(pokemonSelect));
            System.out.println(pokemonSelect.toString());
        });

        atacar.setOnAction(event -> {
            vidaInimigo.setProgress((double) pokemonInimi.vida / pokemonInimi.ataque);
            System.out.println("Vida inimiga: " + pokemonInimi.vida);
        });

        if(pokemonInimi.vida == 0){
            System.out.println("Voce ganhou");
        }

        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(tituloTela, testeBotao,pokemonInimigo, vidaInimigo, atacar);
        return new Scene(layout, 800, 600);
    }
}
