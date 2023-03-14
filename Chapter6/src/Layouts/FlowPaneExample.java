package Layouts;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Flow Pane Example");

        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10);
        flowPane.setVgap(10);
        flowPane.setAlignment(Pos.CENTER);

        flowPane.getChildren().add(new Button("Button 1"));
        flowPane.getChildren().add(new Button("Button 2"));
        flowPane.getChildren().add(new Button("Button 3"));
        flowPane.getChildren().add(new Button("Button 4"));
        flowPane.getChildren().add(new Button("Button 5"));
        flowPane.getChildren().add(new Button("Button 6"));
        flowPane.getChildren().add(new Button("Button 7"));
        flowPane.getChildren().add(new Button("Button 8"));

        Scene scene = new Scene(flowPane,300,200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
       launch(args);
    }
}
