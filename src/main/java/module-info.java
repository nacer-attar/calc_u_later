module front.calculater {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens front.calculater to javafx.fxml;
    exports front.calculater;
}