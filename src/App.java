public class App {
    public static void main(String[] args) throws Exception {
        
        // Greet user

        // Instantiate your objects

        ApplicantInfo john = new ApplicantInfo
        (
        "John", 24, "Smart"
        );

        ApplicantResume john1 = new ApplicantResume
        (
        "Worked at restaurant", "High school diploma", 
        "Fluent in Java, Knows 3 languages, Debate team finalist", "Working in a team"
        );

        JobNeeded position = new JobNeeded
        (
        "Programmer Intern", "Experience working in a team", "High school diploma", 
        "Knows Java, able to effectively communicate needs"
        );

        // Print your objects

        System.out.println("\n===== A new applicant has arrived!===== ");
        System.out.println("\n" + john + "\n");

        System.out.println("===== " + john.name + "'s Resume ===== ");
        System.out.println("\n" + john1 + "\n");

        System.out.println("\n===== Position Applicant Applied for: ===== ");
        System.out.println("\n" + position + "\n");


    }   
}
