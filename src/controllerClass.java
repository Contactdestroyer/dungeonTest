import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.geometry.Insets;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class controllerClass {

    @FXML
    private Button upB;

    @FXML
    private Button downB;

    @FXML
    private Rectangle fred;

    private int playLength = (int)fred.getWidth();

    @FXML
    public void moveUp(javafx.event.ActionEvent event){
        System.out.println("weeeeeee");
        fred.setTranslateY(fred.getTranslateX()+playLength);
    }
    @FXML
    public void moveDown(javafx.event.ActionEvent event){
        fred.setTranslateY(fred.getTranslateX()-playLength);
    }


}
