package br.eng;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class HelloController {

    @FXML
    protected void onOkClicked() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Mensagem");
        alert.setHeaderText(null);
        alert.setContentText("Aplicação JavaFX funcionando! 🚀");
        alert.showAndWait();
    }
}
