public class ApplicantResume {
    
    // Attributes
    private String experience;
    private String education;
    private String skills;
    private String strengths;

    public ApplicantResume(String experience, String education, String skills, String strengths) {
        this.experience = experience;
        this.education = education;
        this.skills = skills;
        this.strengths = strengths;
    }

    @Override

    public String toString() {
        String output = "Experience: " + this.experience;
        output += "\nEducation: " + this.education; 
        output += "\nSkills: " + this.skills; 
        output += "\nStrengths: " + this.strengths; 
        return output;
    }
}
