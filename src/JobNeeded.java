public class JobNeeded {

    // Attributes
    private String jobName;
    private String requiredExperience;
    private String requiredEducation;
    private String neededSkills;


    public JobNeeded(String jobName, String requiredExperience, String requiredEducation, String neededSkills) {
        this.jobName = jobName;
        this.requiredExperience = requiredExperience;
        this.requiredEducation = requiredEducation;
        this.neededSkills = neededSkills;
    }

    @Override

    public String toString() {
        String output = "Job Name: " + this.jobName;
        output += "\nRequired Education: " + this.requiredExperience; 
        output += "\nRequired Education: " + this.requiredEducation; 
        output += "\nRequired Skills: " + this.neededSkills; 
        return output;
    }
}