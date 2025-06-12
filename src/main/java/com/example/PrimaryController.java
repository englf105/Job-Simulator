package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.TitledPane;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;


public class PrimaryController{

    
    @FXML
    Button hireApplicant = new Button();
    
    @FXML
    Button rejectApplicant = new Button();

    @FXML
    TextArea requestedJobText = new TextArea();

    @FXML
    TextArea applicantResumeText = new TextArea();

    @FXML
    Label applicantName = new Label();
    
    @FXML
    TitledPane viewApplication = new TitledPane();
    
    @FXML
    ImageView applicantImage = new ImageView();

}
