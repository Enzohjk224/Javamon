
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

    public static class Pokemon {
        String nome;
        int vida;
        int ataque;

        public Pokemon(String nome, int vida, int ataque) {
            this.nome = nome;
            this.vida = vida;
            this.ataque = ataque;
        }

        public String toString(){
            return "Nome: " + nome
                    + "\nVida: " + vida
                    + "\nAtaque: " + ataque;
        }
    }



    public static void main(String[] args) {
        launch(args);
    }
}
