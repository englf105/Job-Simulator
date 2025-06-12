package com.example;

public class ApplicantInfo {
    // Attributes
    public String name;
    public int age;
    public static String quality;
    public static String ageType;


    // An array with a list of possible names
    private String[] names = {
        "John", "Jane", "Johnson", "Alex", "Logan", "Margot",
        "Adam", "Laura", "Ben", "Mark", "Katie", "Connor", "Tayn",
        "Lucy", "Chris", "Finn", "Evan", "Chad", "Kathryn", "Dory"};
    
    // An array with a list of possible qualities
    private String[] qualities = {
        "Smart", "Punctual", "Strict", "Clumsy", "Talkative",
        "Lazy", "Knowledgeable", "Studious", "Strong", "Weak" };


    public String infoGenerator(String type, int num)
    {
        // returns an name from the array
        if (type.equals("name")) {return names[num];}
        
        // returns a quality from the array
        if (type.equals("quality")) {return qualities[num];}
        
        // if any of the inputs are wrong
        return "WRONG VALUE";
    }

    public ApplicantInfo(int nameNum, int age, int qualityNum)
    {
        if (age >= 18) {ageType = "Adult";}
        if (age < 18) {ageType = "Teen";}
        
        name = infoGenerator("name", nameNum);
        quality = infoGenerator("quality", qualityNum);
        
        this.name = name;
        this.age = age;
        this.quality = quality;
    }

    public String toString()
    {
        String output = "Applicant: " + this.name + "\nAge: " + this.age;
        output += "\nQuality: " + this.quality;
        return output;
    }
}
