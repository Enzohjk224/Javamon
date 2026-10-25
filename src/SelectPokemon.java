import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SelectPokemon{

    private boolean selectPokemon = false;
    public Scene criarCena(Stage stage) {
        Label tituloTela = new Label("Selecione seu pokemon");
        Button select = new Button("Exemplo de seleção");
        Button iniciar = new Button("Inicar a batalha");
        Button voltar = new Button("Voltar");

        select.setOnAction(event ->{
            selectPokemon = true;
        });

        iniciar.setOnAction(event -> {
            if (selectPokemon == false) {
                System.out.println("Selecione um pokemon");
            }else {
                Batalha batalha = new Batalha();
                stage.setScene(batalha.criarCena(stage));
            }
        });

        voltar.setOnAction(event -> {
            Menu menu = new Menu();
            stage.setScene(menu.criarCena(stage));
        });

        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(tituloTela, select, iniciar, voltar);
        return new Scene(layout, 800, 600);
    }
}