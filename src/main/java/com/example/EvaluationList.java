package com.example;
import java.util.HashMap;

public class EvaluationList extends ApplicationEvaluation
{
    public static int infoSum = 0;

     // Age Arrays
    int[] ageAdult =            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    int[] ageTeen =             {1, 0, 0, 0, 0, 1, 0, 0, 1, 0};
    
    // Quality Arrays
    int[] qualityWeak =         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] qualityStrict =       {0, 1, 0, 0, 0, 1, 0, 0, 0, 1};
    int[] qualityClumsy =       {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] qualityTalkative =    {0, 0, 1, 0, 1, 0, 0, 0, 0, 1};
    int[] qualityLazy =         {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] qualityKnowledge =    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    int[] qualityStudious =     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    int[] qualityStrong =       {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    int[] qualityPunctual =     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    int[] qualitySmart =        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    
     // Experience Array
    int[] experienceNone =      {0, 0, 0, 0, 0, 0, 0, 0, 2, 0};
    int[] experienceDiner =     {1, 2, 1, 1, 1, 1, 1, 1, 3, 1};
    int[] experienceRetail =    {1, 2, 1, 1, 1, 2, 1, 1, 3, 1};
    int[] experienceSmallBuis = {3, 3, 3, 2, 3, 3, 3, 2, 3, 2};
    int[] experiencePrivCo =    {3, 3, 3, 3, 2, 3, 3, 3, 3, 2};
    int[] experienceManager =   {3, 3, 3, 2, 3, 3, 3, 3, 3, 3};
    int[] experienceStartBuis = {1, 3, 3, 3, 2, 2, 3, 2, 3, 2};
    
    // Education Array
    int[] educationNone =       {0, 0, 0, 0, 0, 0, 0, 0, 2, 0};
    int[] educationHigh =       {1, 1, 0, 0, 0, 1, 0, 0, 3, 1};
    int[] educationAssoicate =  {3, 2, 2, 2, 1, 3, 2, 1, 3, 2};
    int[] educationBachlor =    {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
    int[] educationGraduate =   {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
    int[] educationMaster =     {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
    int[] educationDoctor =     {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
    
    // Skills Array
    int[] skillsProgramLang =   {3, 1, 1, 1, 3, 2, 1, 3, 3, 3};
    int[] skillsDebugging =     {3, 3, 1, 2, 3, 3, 3, 3, 3, 3};
    int[] skillsCleanCode =     {3, 1, 1, 1, 3, 2, 1, 3, 2, 2};
    int[] skillsCommunicate =   {3, 3, 3, 3, 2, 3, 3, 3, 3, 3};
    int[] skillsStakeholder =   {1, 3, 3, 3, 1, 1, 3, 2, 3, 3};
    int[] skillsRoadmap =       {3, 3, 2, 2, 3, 3, 3, 3, 3, 3};
    int[] skillsNegotiation =   {2, 2, 3, 3, 2, 2, 2, 3, 3, 3};
    int[] skillsListen =        {3, 2, 3, 3, 3, 3, 3, 3, 3, 2};
    int[] skillsPresent =       {3, 3, 3, 3, 3, 2, 3, 3, 3, 3};
    int[] skillsBudgeting =     {2, 3, 3, 3, 2, 3, 3, 3, 3, 3};
    int[] skillsDetail =        {3, 3, 3, 3, 2, 3, 3, 3, 3, 3};
    int[] skillsFinancial =     {3, 3, 3, 3, 2, 2, 3, 3, 3, 2};
    int[] skillsClear =         {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
    int[] skillsExplaining =    {3, 2, 3, 2, 3, 3, 3, 3, 3, 3};
    int[] skillsCurriculum =    {1, 2, 1, 1, 3, 1, 1, 2, 3, 2};
    int[] skillsDiagram =       {3, 3, 1, 2, 2, 3, 1, 3, 3, 2};
    int[] skillsRepair =        {3, 2, 1, 1, 2, 3, 1, 3, 3, 2};
    int[] skillsSafety =        {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
    int[] skillsWrangling =     {3, 2, 1, 2, 2, 1, 3, 3, 3, 3};
    int[] skillsStatistical =   {2, 2, 3, 2, 1, 2, 3, 3, 3, 1};
    int[] skillsVisualize =     {3, 2, 3, 3, 2, 2, 3, 3, 3, 3};
    int[] skillsSystem =        {3, 2, 2, 2, 3, 2, 3, 3, 3, 2};
    int[] skillsMaterial =      {3, 3, 1, 2, 2, 3, 2, 3, 3, 3};
    int[] skillsProject =       {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
    int[] skillsTime =          {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
    int[] skillsCoordination =  {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
    int[] skillsStamina =       {1, 1, 2, 1, 1, 3, 1, 2, 3, 1};
    int[] skillsLeadership =    {3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
    int[] skillsCostManage =    {3, 3, 1, 1, 3, 3, 2, 3, 3, 3};
    int[] skillsNetwork =       {3, 3, 3, 3, 3, 1, 3, 2, 3, 3};
    
    // Strengths Array
    int[] strengthsTeam =       {3, 2, 3, 3, 3, 2, 2, 3, 3, 3};
    int[] strengthsLearn =      {3, 3, 2, 2, 3, 3, 3, 3, 3, 3};
    int[] strengthsSpeak =      {2, 2, 3, 2, 3, 2, 2, 3, 3, 3};
    int[] strengthsLeader =     {2, 3, 3, 2, 3, 2, 2, 3, 3, 3};
    int[] strengthsPatient =    {3, 2, 3, 3, 3, 3, 2, 3, 3, 3};
    int[] strengthsAdaptable =  {3, 2, 3, 2, 3, 3, 3, 3, 3, 3};
    int[] strengthsAtentive =   {3, 3, 3, 3, 2, 3, 3, 3, 3, 3};
        
        
    public EvaluationList()
    {
        // List of the ages put into a list of arrays
        HashMap<String, int[]> ages = new HashMap<String, int[]>();
        ages.put("Adult", ageAdult);
        ages.put("Teen", ageTeen);
        
        // List of the qualities put into a list of arrays
        HashMap<String, int[]> qualities = new HashMap<String, int[]>();
        qualities.put("Weak", qualityWeak);
        qualities.put("Strict", qualityStrict);
        qualities.put("Clumsy", qualityClumsy);
        qualities.put("Talkative", qualityTalkative);
        qualities.put("Lazy", qualityLazy);
        qualities.put("Knowledgeable", qualityKnowledge);
        qualities.put("Studious", qualityStudious);
        qualities.put("Strong", qualityStrong);
        qualities.put("Punctual", qualityPunctual);
        qualities.put("Smart", qualitySmart);
        
        // List of the experiences put into a list of arrays
        HashMap<String, int[]> experiences = new HashMap<String, int[]>();
        experiences.put("Never worked before", experienceNone);
        experiences.put("Worked at restaurant", experienceDiner);
        experiences.put("Worked at a retail store", experienceRetail);
        experiences.put("Worked for a small buisness", experienceSmallBuis);
        experiences.put("Worked for a private company", experiencePrivCo);
        experiences.put("Managed people at a company", experienceManager);
        experiences.put("Started own buisness", experienceStartBuis);

        // List of the educations put into a list of arrays
        HashMap<String, int[]> educations = new HashMap<String, int[]>();
        educations.put("No formal education", educationNone);
        educations.put("High school diploma", educationHigh);
        educations.put("Associate's Degree", educationAssoicate);
        educations.put("Bachelor's Degree", educationBachlor);
        educations.put("Graduate Certificate", educationGraduate);
        educations.put("Master's Degree", educationMaster);
        educations.put("Doctorate Degree", educationDoctor);
        
        // List of the skills put into a list of arrays
        HashMap<String, int[]> skills = new HashMap<String, int[]>();
        skills.put("Knows multiple programming languages", skillsProgramLang);
        skills.put("Debugging and problem-solving", skillsDebugging);
        skills.put("Writing clean and maintainable code", skillsCleanCode);
        skills.put("Communication with cross-functional teams", skillsCommunicate);
        skills.put("Stakeholder management", skillsStakeholder);
        skills.put("Roadmap and feature prioritization", skillsRoadmap);
        skills.put("Negotiation and closing techniques", skillsNegotiation);
        skills.put("Active listening and customer empathy", skillsListen);
        skills.put("Presentation and demo skills", skillsPresent);
        skills.put("Budgeting and forecasting", skillsBudgeting);
        skills.put("Attention to detail and accuracy", skillsDetail);
        skills.put("Financial reporting and statement preparation", skillsFinancial);
        skills.put("Clear and engaging communication", skillsClear);
        skills.put("Explaining abstract concepts simply", skillsExplaining);
        skills.put("Curriculum and lesson planning", skillsCurriculum);
        skills.put("Reading schematics or technical diagrams", skillsDiagram);
        skills.put("Time-efficient repair execution", skillsRepair);
        skills.put("Safety compliance and procedures", skillsSafety);
        skills.put("Data wrangling and cleaning", skillsWrangling);
        skills.put("Statistical analysis and hypothesis testing", skillsStatistical);
        skills.put("Data visualization using tools", skillsVisualize);
        skills.put("System design and testing", skillsSystem);
        skills.put("Materials and manufacturing knowledge", skillsMaterial);
        skills.put("Project planning and time estimation", skillsProject);
        skills.put("Time management", skillsTime);
        skills.put("Team communication and coordination", skillsCoordination);
        skills.put("Physical stamina and endurance", skillsStamina);
        skills.put("Team leadership and project delegation", skillsLeadership);
        skills.put("IT budgeting and cost management", skillsCostManage);
        skills.put("Network and system administration knowledge", skillsNetwork);
        
        // List of the strengths put into a list of arrays
        HashMap<String, int[]> strengths = new HashMap<String, int[]>();
        strengths.put("Working in a team", strengthsTeam);
        strengths.put("Fast learner", strengthsLearn);
        strengths.put("Great public speaker", strengthsSpeak);
        strengths.put("Great leader", strengthsLeader);
        strengths.put("Very patient", strengthsPatient);
        strengths.put("Adaptable", strengthsAdaptable);
        strengths.put("Atentive", strengthsAtentive);
        
        int age = ages.get(ApplicantInfo.ageType)[JobNeeded.JobNum - 1];
        int quality = qualities.get(ApplicantInfo.quality)[JobNeeded.JobNum - 1];
        int experience = experiences.get(ApplicantResume.experience)[JobNeeded.JobNum - 1];
        int education = educations.get(ApplicantResume.education)[JobNeeded.JobNum - 1];
        int skill1 = skills.get(ApplicantResume.skill1)[JobNeeded.JobNum - 1];
        int skill2 = skills.get(ApplicantResume.skill2)[JobNeeded.JobNum - 1];
        int skill3 = skills.get(ApplicantResume.skill3)[JobNeeded.JobNum - 1];
        int strength = strengths.get(ApplicantResume.strength)[JobNeeded.JobNum - 1];
        
        infoSum = age + quality + experience + education + skill1 + skill2 + skill3 + strength;
        
        //System.out.println("total point value is: " + infoSum);
    }
    
    public static int getInfoSum()
    {
        return infoSum;
    }
        
}
