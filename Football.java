/**
 * Football class
 * This class represents a football team with basic football information.
 */
public class Football {

    // Fields football
    private String teamName;
    private int touchdowns;
    private int passingYards;

    // Constructor
    // This constructor creates a Football object with given values
    public Football(String teamName, int touchdowns, int passingYards) {
        this.teamName = teamName;
        this.touchdowns = touchdowns;
        this.passingYards = passingYards;
    }

    // Overloaded constructor
    // This constructor sets all values to default (null or 0)
    public Football() {
        teamName = null;
        touchdowns = 0;
        passingYards = 0;
    }

    // Getter and setter methods

    // Returns the team name
    public String getTeamName() {
        return teamName;
    }

    // Updates the team name
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    // Returns number of touchdowns
    public int getTouchdowns() {
        return touchdowns;
    }

    // Updates number of touchdowns
    public void setTouchdowns(int touchdowns) {
        this.touchdowns = touchdowns;
    }

    // Returns number of passing yards
    public int getPassingYards() {
        return passingYards;
    }

    // Updates number of passing yards
    public void setPassingYards(int passingYards) {
        this.passingYards = passingYards;
    }

    // Custom method unique to football
    // Simulates completing a deep pass
    public void throwDeepPass(int yards) {
        passingYards += yards;
        System.out.println("Deep pass completed for " + yards + " yards.");
    }

    // Prints all football information
    public void printInfo() {
        System.out.println("=== Football Info ===");
        System.out.println("Team Name: " + teamName);
        System.out.println("Touchdowns: " + touchdowns);
        System.out.println("Passing Yards: " + passingYards);
        System.out.println();
    }
}

