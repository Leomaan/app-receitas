package org.example.appreceitas.Controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.example.appreceitas.App;
import org.example.appreceitas.model.Receita;
import org.example.appreceitas.model.ReceitasDao;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class AplicativoController implements Initializable {
    @FXML
    private ComboBox<String> tCombo;
    private String[] tipo = {"Carne", "Frango", "Bolo"};
    private Stage stage;
    @FXML
    private Label preparoReceita;
    @FXML
    private Label preparoReceita1;
    @FXML
    private Label preparoReceita2;
    @FXML
    private Label preparoReceita3;
    @FXML
    private Label nomeReceita;
    @FXML
    private Label nomeReceita1;
    @FXML
    private Label nomeReceita2;
    @FXML
    private Label nomeReceita3;
    @FXML
    private Label ingredienteReceita;
    @FXML
    private Label ingredienteReceita1;
    @FXML
    private Label ingredienteReceita2;
    @FXML
    private Label ingredienteReceita3;
    @FXML
    private Button fav;
    @FXML
    private Button fav1;
    @FXML
    private Button fav2;
    @FXML
    private Button go;
    @FXML
    private Button att;
    @FXML
    private Button perfil;
    @FXML
    private Button modal;
    @FXML
    private Label labelIngrediente;
    @FXML
    private Label labelPreparo;
    private ReceitasDao receitasDao;
    private NovaReceitaController novaReceitaController;
    private List<Receita> receitas = new ArrayList<>();
    private PerfilController perfilController;

    public void setPerfilController(PerfilController perfilController) {
        this.perfilController = perfilController;
    }
    @FXML
    private void setDados(ActionEvent e){
        Receita receita1 = new Receita();
        receita1.setNome("Bolo de laranja");
        receita1.setPassos("Bata no liquidificador os ovos, o açúcar, o óleo, o suco e a casca da laranja - Passe para uma tigela e acrescente a farinha de trigo e o fermento - Leve para assar em uma forma com furo central, untada e enfarinhada, por mais ou menos 30 minutos - Desenforme o bolo e molhe com suco de laranja\n");
        receita1.setIngredientes("4 ovos - 1 xícara (chá) de óleo - casca de 1 laranja - 1 colher (sopa) de fermento - 2 xícaras (chá) de açúcar - suco de 2 laranjas - 2 xícaras (chá) de farinha de trigo\n");
        receitas.add(receita1);
        nomeReceita.setText(receita1.getNome());
        preparoReceita.setText(receita1.getPassos());
        ingredienteReceita.setText(receita1.getIngredientes());

        Receita receita2 = new Receita();
        receita2.setNome("File a parmegiana");
        receita2.setPassos("Tempere os filés com o alho, orégano, sal, pimenta e vinagre -> Passe pela farinha de rosca, nos ovos batidos e novamente pela farinha de rosca -> Frite em óleo quente ->  Escorra sobre papel absorvente -> Acomode os filés em um refratário regado com um pouco de molho -> Coloque fatias de mussarela sobre os filés -> Regue com o molho -> Polvilhe o queijo parmesão ralado -> Leve ao forno pré-aquecido para derreter a mussarela -> Sirva com arroz ou purê e uma salada\n" + "\n");
        receita2.setIngredientes("500 g de alcatra ou contra filé em bifes - orégano - vinagre a gosto - farinha de rosca, o suficiente - 250 g de mussarela em fatias - Pimenta-do-reino a gosto - 2 dentes de alho amassados - sal a gosto - 2 ovos batidos com 1 pitada de sal - 1/2 litro de molho de tomate pronto - queijo parmesão ralado para polvilhar.\n");
        receitas.add(receita2);
        nomeReceita1.setText(receita2.getNome());
        preparoReceita1.setText(receita2.getPassos());
        ingredienteReceita1.setText(receita2.getIngredientes());

        Receita receita3 = new Receita();
        receita3.setNome("Strogonoff de frango");
        receita3.setPassos("Em uma panela média, coloque o Azeite TERRANO® e leve ao fogo alto para aquecer. Junte o alho e a cebola, e refogue por 1 minuto, ou até o alho começar a dourar. Acrescente o frango, o Tempero SAZÓN® e o sal, e frite por 6 minutos, mexendo de vez em quando, ou até dourar o frango por todos os lados -> Adicione o ketchup, a mostarda, a polpa de tomate e o cogumelo, e misture. Junte o creme de leite, mexa e cozinhe por 2 minutos, ou até começar a levantar fervura -> agora sirva!");
        receita3.setIngredientes("1 colher (sopa) de Azeite de Oliva Extra Virgem TERRANO® - 1 dente de alho espremido - 1 cebola pequena picada (100 g) - 1 peito de frango pequeno, cortado em iscas (400 g) - 1 sachê de Tempero SAZÓN® Verde - 1 pitada de sal - 1 colher (sopa) de ketchup - 1 colher (sopa) de mostarda - 1 xícara (chá) de polpa de tomate (200 g) - 1 vidro pequeno de cogumelos em conserva, em lâminas, escorrido (100 g) - 1 lata de creme de leite (300 g)");
        receitas.add(receita3);
        nomeReceita2.setText(receita3.getNome());
        preparoReceita2.setText(receita3.getPassos());
        ingredienteReceita2.setText(receita3.getIngredientes());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tCombo.getItems().addAll(tipo);
    }
    @FXML
    protected void entrarPerfil(ActionEvent e) throws IOException {
        stage.setScene(App.getPerfilScene());
        stage.setTitle("Seu perfil");
        stage.show();
    }

    @FXML
    protected void modal(ActionEvent e) throws IOException{
        stage.setScene(App.getAddScene());
        stage.setTitle("Agora crie uma receita");
        stage.show();
    }
    @FXML
    public void updateNovaReceita(String nome, String ingredientes, String passos) {
        nomeReceita3.setText(nome);
        ingredienteReceita3.setText(ingredientes);
        preparoReceita3.setText(passos);
        labelIngrediente.setText("Ingredientes:");
        labelPreparo.setText("Preparo:");
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public void setNovaReceitaController(NovaReceitaController novaReceitaController) {
        this.novaReceitaController = novaReceitaController;
        novaReceitaController.setAplicativoController(this);
    }
    @FXML
    private void favoritarReceita(ActionEvent e) { //Tem logica, mas foi a unica forma que consegui
        Object source = e.getSource();
        if (source == fav) {
            Receita receita = receitas.getFirst();
            receita.setFavorito(true);
            perfilController.addReceitaFavorita(receita);
        } else if (source == fav1) {
            Receita receita = receitas.get(1);
            receita.setFavorito(true);
            perfilController.addReceitaFavorita(receita);
        } else if (source == fav2) {
            Receita receita = receitas.get(2);
            receita.setFavorito(true);
            perfilController.addReceitaFavorita(receita);
        }

    }
}
