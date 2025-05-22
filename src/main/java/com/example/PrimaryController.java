package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.control.TitledPane;

public class PrimaryController {

    @FXML

    Button hireApplicant = new Button();

    Button rejectApplicant = new Button();

    TextArea requestedJobText = new TextArea();

    TextArea applicantResumeText = new TextArea();

    Label applicantName = new Label();
    
    TitledPane viewApplication = new TitledPane();

    ImageView applicantImage = new ImageView();

}
