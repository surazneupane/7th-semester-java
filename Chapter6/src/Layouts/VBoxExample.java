package Layouts;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");

        Hyperlink hyperlink = new Hyperlink();
        hyperlink.setText("Open Facebook");

//        Vbox Layout Pane arranges the nodes in a single vertical column.
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER_LEFT);
        vBox.setSpacing(10);
        vBox.getChildren().addAll(button1,hyperlink,button2);

        Scene scene = new Scene(vBox,200,200);
        stage.setTitle("VBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
