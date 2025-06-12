package com.example;

public class JobNeeded {
    // Attributes
    public static int JobNum;
    public String jobName;
    public String requiredExperience;
    public String requiredEducation;
    public String neededSkills;
    public String neededStrengths;

    public String jobGenerator(int job, String requirement)
    {
        // creates a new array to copy a job from the list below
        String[] jobDetails = new String[5];
        
        // varying jobs with arrays detailing their requirements
        String[] a = {
            "Software Developer",
            "Some level of working involving tech would be ideal",
            "Associate's degree (does take interns)",
            "Knows multiple programming languages, debugging and problem-solving, and writing clean and maintainable code",
            "Patient and adaptable" };
        
        String[] b = {
            "Product Manager",
            "Any job experience",
            "Bachlor's degree would be preferred",
            "Communication with cross-functional teams, Stakeholder management, Roadmap and feature prioritization",
            "Good leader and Atentive" };
        
        String[] c = {
            "Sales Representative",
            "Being professional while making buisness deals",
            "Some level of post-secondary education",
            "Negotiation and closing techniques", "Active listening and customer empathy", "Presentation and demo skills",
            "Punctal and talkative" };
        
        String[] d = {
            "Accountant",
            "Experience handling money and working with people",
            "Some level of post-secondary education",
            "Financial reporting and statement preparation", "Budgeting and forecasting", "Attention to detail and accuracy",
            "Knowledgable and smart" };
        
        String[] e = {
            "Programming Teacher",
            "Working with people younger than you, Some level of minimum wage job",
            "At least a 4 year college degree",
            "Clear and engaging communication", "Explaining abstract concepts simply", "Curriculum and lesson planning",
            "Studious and knowledgeable" };
        
        String[] f = {
            "Technician",
            "Jobs that require the applicant to memorize where things go",
            "High School Diploma, but will teach",
            "Reading schematics or technical diagrams", "Time-efficient repair execution", "Safety compliance and procedures",
            "Smart andknowledgeable" };
        
        String[] g = {
            "Data Scientist",
            "No experience required",
            "Some level of post-secondary education",
            "Data wrangling and cleaning", "Statistical analysis and hypothesis testing", "Data visualization using tools",
            "Studious and punctual" };
        
        String[] h = {
            "Engineer",
            "No or little experience required ",
            "Graduate's would be most preferable",
            "System design and testing", "Materials and manufacturing knowledge", "Project planning and time estimation",
            "Knowledgeable and smart" };
        
        String[] i = {
            "Restaurant Dishwasher",
            "No experience required",
            "No formal education needed",
            "Time management", "Team communication and coordination", "Physical stamina and endurance",
            "Punctual and Talkative" };
        
        String[] j = {
            "IT Manager",
            "Experince working in a team and managing inventory",
            "High school diploma or higher",
            "Team leadership and project delegation", "IT budgeting and cost management", "Network and system administration knowledge",
            "Strict and Punctual" };
        
        // depending on the random number, set the array to that job
        if (job == 1) {jobDetails = a;}
        if (job == 2) {jobDetails = b;}
        if (job == 3) {jobDetails = c;}
        if (job == 4) {jobDetails = d;}
        if (job == 5) {jobDetails = e;}
        if (job == 6) {jobDetails = f;}
        if (job == 7) {jobDetails = g;}
        if (job == 8) {jobDetails = h;}
        if (job == 9) {jobDetails = i;}
        if (job == 10) {jobDetails = j;}
        
        // get the asked for detail about that job and return it
        if (requirement.equals("name")) {return jobDetails[0];}
        if (requirement.equals("experience")) {return jobDetails[1];}
        if (requirement.equals("education")) {return jobDetails[2];}
        if (requirement.equals("skills")) {return jobDetails[3];}
        if (requirement.equals("strengths")) {return jobDetails[4];}
        
        // if any of the inputs are wrong
        return "WRONG VALUE";
    }

    public JobNeeded (int jobNum)
    {
        JobNum = jobNum;
        jobName = jobGenerator(jobNum, "name");
        requiredExperience = jobGenerator(jobNum, "experience");
        requiredEducation = jobGenerator(jobNum, "education");
        neededSkills = jobGenerator(jobNum, "skills");
        neededStrengths = jobGenerator(jobNum, "strengths");
        
        this.jobName = jobName;
        this.requiredExperience = requiredExperience;
        this.requiredEducation = requiredEducation;
        this.neededSkills = neededSkills;
        this.neededStrengths = neededStrengths;
    }

    public String toString()
    {
        String output = "Job Name: " + this.jobName;
        output += "\nRequired Experience: " + this.requiredExperience;
        output += "\nRequired Education: " + this.requiredEducation;
        output += "\nRequired Skills: " + this.neededSkills;
        output += "\nNeeded Strengths: " + this.neededStrengths;
        return output;
    }
}
