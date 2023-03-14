package Layouts;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("What do you listen: ");
        CheckBox checkBox1 = new CheckBox("PinkFloyd");
        CheckBox checkBox2 = new CheckBox("Linkinpark");
        CheckBox checkBox3 = new CheckBox("Guns N' Roses");

//        arranges nodes in single row
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);

        Scene scene = new Scene(hBox,700,200);
        hBox.getChildren().addAll(label,checkBox1,checkBox2,checkBox3);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
