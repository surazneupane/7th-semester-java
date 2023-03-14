package Layouts;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class GridPaneExample extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Label firstName=new Label("First Name");
        Label lastName=new Label("Last Name");
        Label gender=new Label("Gender");

        TextField textField1=new TextField();
        TextField textField2=new TextField();

//        creating radio button
        ToggleGroup toggleGroup = new ToggleGroup();
        RadioButton button1 = new RadioButton("Male");
        RadioButton button2 = new RadioButton("Female");
        button1.setToggleGroup(toggleGroup);
        button2.setToggleGroup(toggleGroup);


        Button submitButton=new Button ("Submit");

        GridPane gridPane=new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.addRow(0, firstName,textField1);
        gridPane.addRow(1, lastName,textField2);
        gridPane.addRow(2,gender);
        gridPane.add(button1,1,2);
        gridPane.add(button2,1,3);


        gridPane.addRow(4, submitButton);

        Scene scene = new Scene(gridPane,400,200);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}