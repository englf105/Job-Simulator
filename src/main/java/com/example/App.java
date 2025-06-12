package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.Scanner;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Job-Simulator");
        scene = new Scene(loadFXML("primaryController"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) throws Exception {
        
        boolean firstHire = true;
        boolean runAgain = true;
        int qualificationSum = 0;
        int peopleHired = 0;

        while (runAgain) {
            
            // Create the info about the applicant
            ApplicantInfo applicant = new ApplicantInfo
            (
                (int)(Math.random() * 12),
                (int)(Math.random() * 44 + 16),
                (int)(Math.random() * 10)
            );
    
            // Create the info about the applicant's resume
            ApplicantResume resume = new ApplicantResume
            (
                (int)(Math.random() * 7),
                (int)(Math.random() * 7),
                ApplicationEvaluation.GenerateNum(28),
                ApplicationEvaluation.GenerateNum(28),
                ApplicationEvaluation.GenerateNum(28),
                (int)(Math.random() * 7)
            );
    
            // Create the info about the job the applicant applied for
            JobNeeded position = new JobNeeded
            (
                (int)(Math.random() * 10 + 1)
            );
            
            // Create a scanner to either hire/reject
            Scanner input = new Scanner(System.in);
            
            // Create an evaluationList to get the hiring information
            EvaluationList evaluationList = new EvaluationList();
            
            // Create an evaluation object to give an efficiency score
            ApplicationEvaluation evaluation = new ApplicationEvaluation();

            if (firstHire == true) {
                System.out.println("\n===== Welcome to Job Simulator! ===== ");
            }
            else {
                System.out.println("\n===== Your average new hire is " + 
                qualificationSum/peopleHired + " ===== ");
            }
    
            // Display info about the new applicant
            System.out.println("\n===== A new applicant has arrived! ===== ");
            System.out.println("\n" + applicant + "\n");
            

            System.out.println("===== " + applicant.name + "'s Resume: ===== ");
            System.out.println("\n" + resume + "\n");
    
            System.out.println("===== Position Applicant Applied for: ===== ");
            System.out.println("\n" + position + "\n");

            String jobText = ("===== Position Applicant Applied for: ===== \n" + "\n" + position + "\\n");
            
            
            
            
            launch();
            
            // Choose whether to hire or reject this applicant
            System.out.println("===== Interviewer Decision: =====");
            System.out.print("\nHire this applicant? (Y/N): ");
            String hired = input.nextLine();
            
            
            // Display whether you hired or fired the applicant
            System.out.println("\n" + evaluation.HiredCheck(hired));
            
            // If hired, evaluate how qualified the applicant is for the job
            if (hired.equals("Y") || hired.equals("y")) 
            {
                // Display how qualified the person is into the console
                System.out.print("\nThis applicant is " +
                evaluation.Evaluate(evaluationList.getInfoSum()) +
                "% qualified.\n");
                firstHire = false;
            }
            
            // If rejected, evaluate how qualified the applicant was for the job
            if (hired.equals("N") || hired.equals("n")) 
            {
                // Display how qualified the person is into the console
                System.out.print("\nThat applicant was " +
                evaluation.Evaluate(evaluationList.getInfoSum()) +
                "% qualified.\n");
            }
            
            System.out.println("\n===== Interviewer Decision: =====");
            System.out.print("\nContinue hiring? (Y/N): ");
            String _continue = input.nextLine();
            if (_continue.equals("N") || _continue.equals("n")) {runAgain = false;}
            if (_continue.equals("Y") || _continue.equals("y")) {
                qualificationSum += evaluation.Evaluate(evaluationList.getInfoSum());
                peopleHired += 1;
                evaluation.clearScreen();
            }
        }
    }   

        
}