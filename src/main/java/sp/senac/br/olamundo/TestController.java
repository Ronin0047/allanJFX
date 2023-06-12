package sp.senac.br.olamundo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class TestController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField TextoMensagem;


    @FXML
    public void onAbrirButtonClick() throws IOException {
        /*...*/

    welcomeText.setText(TextoMensagem.getText);


        }



    }















