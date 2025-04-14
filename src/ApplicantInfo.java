public class ApplicantInfo extends App {

    // Attributes
    public String name;
    private int age;
    private String trait;

    public ApplicantInfo(String name, int age, String trait) {
        this.name = name;
        this.age = age;
        this.trait = trait;
    }

    @Override

    public String toString() {
        String output = "Applicant: " + this.name + "\nAge: " + this.age;
        output += "\nQuality: " + this.trait; 
        return output;
    }

}
