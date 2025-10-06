module ProjetoPadraoJavaFX {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.eng to javafx.fxml;  // abre seu pacote para o FXMLLoader
    exports br.eng;              // exporta pacotes que outras libs podem usar
}