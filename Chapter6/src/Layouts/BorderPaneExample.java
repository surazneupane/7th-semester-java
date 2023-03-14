package Layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();

        borderPane.setTop(new Label("TOP Label"));
        borderPane.setLeft(new Label("LEFT Label"));
        borderPane.setRight(new Label("RIGHT Label"));
        borderPane.setCenter(new Label("CENTER Label"));
        borderPane.setBottom(new Label("BOTTOM Label"));

        stage.setTitle("BorderPane Example");
        Scene scene = new Scene(borderPane,600,400);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
