/**
 * Basketball class
 * This class represents a basketball team with basic basketball information.
 */
public class Basketball {

    // Fields basketball
    private String teamName;
    private int threePointersMade;
    private int fouls;

    // Constructor
    // This constructor creates a Basketball object with given values
    public Basketball(String teamName, int threePointersMade, int fouls) {
        this.teamName = teamName;
        this.threePointersMade = threePointersMade;
        this.fouls = fouls;
    }

    // Overloaded constructor
    // This constructor sets all values to default (null or 0)
    public Basketball() {
        teamName = null;
        threePointersMade = 0;
        fouls = 0;
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

    // Returns number of three-pointers made
    public int getThreePointersMade() {
        return threePointersMade;
    }

    // Updates number of three-pointers made
    public void setThreePointersMade(int threePointersMade) {
        this.threePointersMade = threePointersMade;
    }

    // Returns number of fouls
    public int getFouls() {
        return fouls;
    }

    // Updates number of fouls
    public void setFouls(int fouls) {
        this.fouls = fouls;
    }

    // Custom method
    // Simulates making a three-point shot
    public void drainThree() {
        threePointersMade++;
        System.out.println("Swish! A three-point shot was made.");
    }

    // Prints all basketball information
    public void printInfo() {
        System.out.println("=== Basketball Info ===");
        System.out.println("Team Name: " + teamName);
        System.out.println("Three-Pointers Made: " + threePointersMade);
        System.out.println("Fouls: " + fouls);
        System.out.println();
    }
}

