package com.example;

public class ApplicationEvaluation extends App {

    public static int totalScore = EvaluationList.getInfoSum();
    public static int firstNum = 0;
    public static int secondNum = 0;
    
    
    // Function that generates a random number not the same as the previous
    public static int GenerateNum(int range)
    {
        //Generate a random number
        int num = (int)(Math.random() * range);
        
        //check to see if the numbers have already been generated
        if (firstNum == 0) {
            firstNum = num;  //store the first value generated
            return firstNum; //return the first value generated
        }
        else if (secondNum == 0) {
            while (num == firstNum) {
                num = (int)(Math.random() * range);}
            secondNum = num;  //store the second value generated
            return secondNum; //return the second value generated
        }
        else {
            while (num == firstNum || num == secondNum) {
                num = (int)(Math.random() * range);}
            return num; //return the last value generated
        }
    }
    
    // Gets the user input and returns true or false to see if hired
    public static String HiredCheck(String hired)
    {
        // If the player decides to hire them
        if (hired.equals("Y") || hired.equals("y")) {return "This applicant is hired!";}
        
        // If the player decides to fire them
        else if (hired.equals("N") || hired.equals("n")) {return "This applicant has been rejected.";}
        
        // If the player inputs a value not specified
        else {return "Invalid Input.";}
    }
    
    // Method used to clear the console
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public static int Evaluate(double num)
    {
        // Calculate the average qualification score using
        // the infoSum and the amount of numbers added
        double percentage = ((num / 20)*100);
        
        // Round the access
        int percentageRounded = (int) Math.round(percentage);
    
        return percentageRounded;
    }
}
