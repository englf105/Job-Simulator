package com.example;

public class ApplicantResume {
    // Attributes
    public static String experience;
    public static String education;
    public static String skill1;
    public static String skill2;
    public static String skill3;
    public static String strength;


    // An array with a list of experiences
    private String[] experiences = {
        "Never worked before", "Worked at restaurant",
        "Worked at a retail store", "Worked for a small buisness",
        "Worked for a private company", "Managed people at a company",
        "Started own buisness" };
    
    // An array with a list of possible educations
    private String[] educations = {
        "No formal education", "High school diploma",
        "Associate's Degree", "Bachelor's Degree",
        "Graduate Certificate", "Master's Degree", "Doctorate Degree" };

    // An array with a list of possible skills
    private String[] skills = {
        "Knows multiple programming languages",
        "Debugging and problem-solving",
        "Writing clean and maintainable code",
        "Communication with cross-functional teams",
        "Stakeholder management",
        "Roadmap and feature prioritization",
        "Negotiation and closing techniques",
        "Active listening and customer empathy",
        "Presentation and demo skills",
        "Budgeting and forecasting",
        "Attention to detail and accuracy",
        "Financial reporting and statement preparation",
        "Clear and engaging communication",
        "Explaining abstract concepts simply",
        "Curriculum and lesson planning",
        "Reading schematics or technical diagrams",
        "Time-efficient repair execution",
        "Safety compliance and procedures",
        "Data wrangling and cleaning",
        "Statistical analysis and hypothesis testing",
        "Data visualization using tools",
        "System design and testing",
        "Materials and manufacturing knowledge",
        "Project planning and time estimation",
        "Time management",
        "Team communication and coordination",
        "Physical stamina and endurance",
        "Team leadership and project delegation",
        "IT budgeting and cost management",
        "Network and system administration knowledge" };
    
    // An array with a list of possible strengths
    private String[] strengths = {
        "Working in a team", "Fast learner", "Great public speaker",
        "Great leader", "Very patient", "Adaptable", "Atentive" };

    public String infoGenerator(String type, int num)
    {
        // returns an experience from the array
        if (type.equals("experience")) {return experiences[num];}
        
        // returns an education from the array
        if (type.equals("education")) {return educations[num];}
        
        // returns a skill from the array
        if (type.equals("skills")) {return skills[num];}
        
        // returns a strength from the array
        if (type.equals("strengths")) {return strengths[num];}
        
        // if any of the inputs are wrong
        return "WRONG VALUE";
    }

    public ApplicantResume
    (
        int experienceNum, int educationNum, int skillsNum1,
        int skillsNum2, int skillsNum3, int strengthsNum
    )
    {
        experience = infoGenerator("experience", experienceNum);
        education = infoGenerator("education", educationNum);
        skill1 = infoGenerator("skills", skillsNum1);
        skill2 = infoGenerator("skills", skillsNum2);
        skill3 = infoGenerator("skills", skillsNum3);
        strength = infoGenerator("strengths", strengthsNum);

        this.experience = experience;
        this.education = education;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.skill3 = skill3;
        this.strength = strength;
    }

    public String toString()
    {
        String output = "Experience: " + this.experience;
        output += "\nEducation: " + this.education;
        output += "\nSkills: " + this.skill1 + ", " + this.skill2 + ", " + this.skill3;
        output += "\nStrengths: " + this.strength;
        return output;
    }
}
